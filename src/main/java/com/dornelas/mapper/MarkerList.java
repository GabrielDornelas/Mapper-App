package com.dornelas.mapper;

import java.util.LinkedList;
import java.util.List;

public class MarkerList
{
    Conection conection = new Conection();
    List<Marker> markers = new LinkedList<Marker>();

    public void getMarkers() {
        try {
            markers = conection.sendGet();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<String> AllMarkers() {
        List<String> MarkersCapi = new LinkedList<String>();
        for (Marker m : markers) {
            MarkersCapi.add(m.getCapital());
        }
        return MarkersCapi;
    }

    public Marker findMarkers(String capitalName) {
        for (Marker m : markers) {
            if (m.getCapital().equals(capitalName)) {
                return m;
            }
        }
        return markers.get(0);
    }
}
