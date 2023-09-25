package com.mongodemo.sampledemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class CombinedDataController {
    @Autowired
    private CombinedDataService combinedDataService;

    @PostMapping("/check")
    public ResponseEntity<CombinedDataDTO> getCombinedData(@RequestBody SerialIdRequestDTO request) {
        String serialid = request.getSerialid();
        CombinedDataDTO combinedData = combinedDataService.getCombinedData(serialid);

        if (combinedData != null) {
            return ResponseEntity.ok(combinedData);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}


