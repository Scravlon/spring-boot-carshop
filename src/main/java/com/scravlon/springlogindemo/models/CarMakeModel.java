package com.scravlon.springlogindemo.models;

import javax.persistence.*;

@Entity
@Table(name="carmakes")
public class CarMakeModel {
    @Id
    int id;
    String carmake;

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
}
