package com.example.bmcsoft.fueltracker.objects;

/**
 * Created by bmCSoft on 2016-05-02.
 */
public class Vehicle {
    public void setId(String id) {
        this.id = id;
    }

    public void setVclass(String vclass) {
        this.vclass = vclass;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setLplate(String lplate) {
        this.lplate = lplate;
    }

    private String id;
    private String vclass;
    private String make;
    private String model;
    private String year;
    private String fuelType;

    public String getLplate() {
        return lplate;
    }

    private String lplate;

    public String getVclass() {
        return vclass;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getId() {
        return id;
    }

    public Vehicle(String id,String lplate,String vClass,String make,String model,String year,String fType){
        this.id =id;
        this.lplate=lplate;
        this.vclass=vClass;
        this.make=make;
        this.model=model;
        this.year=year;
        this.fuelType=fType;
    }

    public Vehicle(){

    }

}
