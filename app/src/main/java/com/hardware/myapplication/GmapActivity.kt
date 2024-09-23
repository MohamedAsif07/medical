package com.hardware.myapplication



import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class GmapActivity : AppCompatActivity() {


    lateinit var mapFragment : SupportMapFragment
    lateinit var googleMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gmap)

        mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(OnMapReadyCallback {
            googleMap = it
            if (ActivityCompat.checkSelfPermission(
                    this,
                    Manifest.permission.ACCESS_FINE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                    this,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.

            }
            googleMap.isMyLocationEnabled = true
            val location1 = LatLng(12.9802,80.1265)
            googleMap.addMarker(MarkerOptions().position(location1).title("Ragul Prasana"))
            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location1,5f))

            val location2 = LatLng(13.0227,80.2230)
            googleMap.addMarker(MarkerOptions().position(location2).title("Nithiswar"))


            val location3 = LatLng(12.9213,80.2399)
            googleMap.addMarker(MarkerOptions().position(location3).title("Kcg-College-Of-Techonology"))

            val location4 = LatLng(13.0750,80.2698)
            googleMap.addMarker(MarkerOptions().position(location4).title("Ram Silpy"))


            val location5 = LatLng(12.952474,80.153712)
            googleMap.addMarker(MarkerOptions().position(location5).title("Mohamed Fazil"))

        })
    }
}