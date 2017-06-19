package com.dornelas.mapper;


public class Marker
{
    private String pais;
    private String capital;
    private Double lat;
    private Double lon;


    public Marker( String pais, String capital, Double lat, Double lon)
    {
        this.lat = lat;
        this.lon = lon;
        this.pais = pais;
        this.capital = capital;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {this.pais = pais;}

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Double getLat() { return lat; }

    public void setLat(Double lat) { this.lat = lat; }

    public Double getLon() { return lon; }

    public void setLon(Double lon) { this.lon = lon; }
}