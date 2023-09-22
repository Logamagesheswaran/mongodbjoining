package com.demo.apidemo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="order")
public class Student{
    private int id;
    private String avaible;
    private String status;
    private String serialid;

    public Student(int id, String avaible, String status,String serialid) {
        this.id = id;
        this.avaible = avaible;
        this.status = status;
        this.serialid=serialid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAvaible() {
        return avaible;
    }

    public void setAvaible(String avaible) {
        this.avaible = avaible;
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
}
