package com.scravlon.springlogindemo.models;

import javax.persistence.*;

@Entity
@Table(name = "carlists")
public class CarListingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String carmake;
    private String carmodel;
    private float enginecc;
    private int horsepower;
    private int torque;
    private String variant;
    private int year;
    private String color;
    private String mileage;
    private boolean transmission;
    private int seatcapacity;
    private String imgurl;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarmake() {
        return carmake;
    }

    public void setCarmake(String carmake) {
        this.carmake = carmake;
    }

    public String getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

    public float getEnginecc() {
        return enginecc;
    }

    public void setEnginecc(float enginecc) {
        this.enginecc = enginecc;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public boolean isTransmission() {
        return transmission;
    }

    public void setTransmission(boolean transmission) {
        this.transmission = transmission;
    }

    public int getSeatcapacity() {
        return seatcapacity;
    }

    public void setSeatcapacity(int seatcapacity) {
        this.seatcapacity = seatcapacity;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
