package com.example.gurjitc96.menucrooze;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.BitmapDrawable;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.location.LocationListener;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import static com.example.gurjitc96.menucrooze.R.drawable.crooz_login;

public class HomeActivity extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap mMap;

    private LocationManager locationManager;
    private LocationListener locationListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);
        final TextView _tab = (TextView)findViewById(R.id._tab);
        _tab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openWeather = new Intent(HomeActivity.this,WeatherActivity.class);
                HomeActivity.this.startActivity(openWeather);
            }
        });
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng merced = new LatLng(37.3, -120);
        mMap.addMarker(new MarkerOptions().position(merced).title("Marker in Merced"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(merced));





    }


}

