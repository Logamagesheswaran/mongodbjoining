package com.mongodemo.sampledemo.Controller;

public class CombinedData {
    private String avaible;
    private String lotsize;

    public String getAvaiable() {
        return avaible;
    }

    public CombinedData(String avaiable, String lotsize) {
        this.avaible = avaiable;
        this.lotsize = lotsize;
    }

    public void setAvaiable(String avaiable) {
        this.avaible = avaiable;
    }

    public String getLotsize() {
        return lotsize;
    }

    public void setLotsize(String lotsize) {
        this.lotsize = lotsize;
    }
}
