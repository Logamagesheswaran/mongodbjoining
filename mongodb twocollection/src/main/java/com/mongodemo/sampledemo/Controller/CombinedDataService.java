package com.mongodemo.sampledemo.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.LookupOperation;
import org.springframework.data.mongodb.core.aggregation.MatchOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CombinedDataService {
    @Autowired
    private MongoTemplate mongoTemplate;

    public CombinedDataDTO getCombinedData(String serialid) {
        MatchOperation matchOperation = Aggregation.match(Criteria.where("serialid").is(serialid));
        LookupOperation lookupOperation = LookupOperation.newLookup()
                .from("serial")
                .localField("serialid")
                .foreignField("serialid")
                .as("serialData");

        Aggregation aggregation = Aggregation.newAggregation(matchOperation, lookupOperation,
                Aggregation.project()
                        .and("serialData.lotsize").as("lotsize")
                        .and("avaible").as("avaible"));

        AggregationResults<CombinedDataDTO> results = mongoTemplate.aggregate(aggregation, "order", CombinedDataDTO.class);

        List<CombinedDataDTO> combinedDataList = results.getMappedResults();

        if (!combinedDataList.isEmpty()) {
            return combinedDataList.get(0);
        }

        return null;
    }
}
