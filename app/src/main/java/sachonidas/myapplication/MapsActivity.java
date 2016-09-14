package sachonidas.myapplication;

import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private LatLngBounds alicanteInicio = new LatLngBounds(
            new LatLng(-44, 113), new LatLng(-10, 154));
    private static final LatLng inicio = new LatLng(38.344256, -0.479812);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        // Add a marker in Sydney and move the camera
        LatLng alicante = new LatLng(38.346, -.4907);
        //mMap.addMarker(new MarkerOptions().position(alicante).title("Alicante"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(inicio, 15));

        LatLng parkingPuerto = new LatLng(38.3427, -0.479308);
        mMap.addMarker(new MarkerOptions().position(parkingPuerto).title("Parking Puerto").icon(BitmapDescriptorFactory.fromResource(R.drawable.parking)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(parkingPuerto));

        LatLng paradaTaxi = new LatLng(38.344561, -0.480248);
        mMap.addMarker(new MarkerOptions().position(paradaTaxi).title("Parada Taxi").icon(BitmapDescriptorFactory.fromResource(R.drawable.taxi)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(paradaTaxi));

        LatLng ayuntamiento = new LatLng(38.34510201253228, -0.4811789095401764);
        mMap.addMarker(new MarkerOptions().position(ayuntamiento).title("Ayuntamiento").icon(BitmapDescriptorFactory.fromResource(R.drawable.ayuntamiento)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ayuntamiento));

        LatLng turismo = new LatLng(38.346833275229635, -0.48459604382514954);
        mMap.addMarker(new MarkerOptions().position(turismo).title("Oficina de Turismo").icon(BitmapDescriptorFactory.fromResource(R.drawable.turismo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(turismo));

        LatLng hotelLucentum = new LatLng(38.34751272668177, -0.4862375557422638);
        mMap.addMarker(new MarkerOptions().position(hotelLucentum).title("Hotel Lucentum").icon(BitmapDescriptorFactory.fromResource(R.drawable.hotel)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hotelLucentum));

        LatLng hotelMaya = new LatLng(38.3521045, -0.4745212000000265);
        mMap.addMarker(new MarkerOptions().position(hotelMaya).title("Hotel Maya").icon(BitmapDescriptorFactory.fromResource(R.drawable.hotel)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hotelMaya));

        LatLng ereta = new LatLng(38.348365 , -0.481659);
        mMap.addMarker(new MarkerOptions().position(ereta).title("Restaurante La Ereta").icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurante)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ereta));


    }
}
