package com.mongodemo.sampledemo.Datas;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="order")

public class Order {
    @Id
    private String id;
    private String status;
    private String serialid;
    private String avaible;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSerialid() {
        return serialid;
    }

    public void setSerialid(String serialid) {
        this.serialid = serialid;
    }

    public String getAvaible() {
        return avaible;
    }

    public void setAvaible(String avaible) {
        this.avaible = avaible;
    }
}
