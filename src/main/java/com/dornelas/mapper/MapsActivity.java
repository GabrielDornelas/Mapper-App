package com.dornelas.mapper;

import android.support.v4.app.BundleCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.LinkedList;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    MarkerList ml;
    List<String> allMarkers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_maps);
    SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
            .findFragmentById(R.id.map);
    mapFragment.getMapAsync(this);


    }
    @Override
    public void onMapReady(GoogleMap googleMap)
    {

        mMap = googleMap;

        allMarkers = new LinkedList<String>();

        ml = new MarkerList();
        ml.getMarkers();

        allMarkers = ml.AllMarkers();

        for(String m : allMarkers){
            Marker m2 = ml.findMarkers(m);
            LatLng ll = new LatLng(m2.getLat(),m2.getLon());
            mMap.addMarker(new MarkerOptions().position(ll).title(m2.getPais()+" - "+m2.getCapital()));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ll, 4));
        }
    }
}