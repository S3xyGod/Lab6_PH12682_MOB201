package com.s3xygod.lab6_ph12682;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MyMapFragment extends SupportMapFragment implements OnMapReadyCallback {
    private GoogleMap googleMap;

    public MyMapFragment()  {
        getMapAsync(this);
    }

    @Override
    public void onMapReady(final GoogleMap gmap) {
        this.googleMap = gmap;

        // Set default position
        // Add a marker in Sydney and move the camera
        LatLng FPolyHN = new LatLng(21.038089, 105.746699); // 14.0583° N, 108.2772° E
        this.googleMap.addMarker(new MarkerOptions().position(FPolyHN).title("FPT Polytechnic Ha Noi"));
        CameraPosition cp = new CameraPosition.Builder().target(FPolyHN).zoom(20).build();
        this.googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cp));



    }
}
