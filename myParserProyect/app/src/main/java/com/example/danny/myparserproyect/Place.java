package com.example.danny.myparserproyect;

/**
 * Created by Danny on 03/11/2015.
 */
public class Place {
    private String lat;
    private String longi;

    @Override
    public String toString() {
        return super.toString();

    }

    private String plac;

    public void setLat(String lat) {
        this.lat = lat;
    }

    public void setLongi(String longi) {
        this.longi = longi;
    }

    public void setPlac(String plac) {
        this.plac = plac;
    }

    public String getLat() {
        return lat;
    }

    public String getLongi() {
        return longi;
    }

    public String getPlac() {
        return plac;
    }
}
