package nightout.damian.v002;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsFragment extends Fragment {

    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        @Override
        public void onMapReady(GoogleMap googleMap) {

            googleMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(getContext(), R.raw.style));

            LatLng toronto = new LatLng(43.6486, -79.3738);
            //googleMap.addMarker(new MarkerOptions().position(toronto).title("Toronto Marker"));
            LatLng hothouse = new LatLng(43.6486, -79.3738);
            googleMap.addMarker(new MarkerOptions().position(hothouse).title("HOTHOUSE").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)).snippet("American Classics | Pizzas, Pastas & Assorted Dishes")).showInfoWindow();
            LatLng cestwhat = new LatLng(43.648, -79.3738);
            googleMap.addMarker(new MarkerOptions().position(cestwhat).title("C'est What").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)).snippet("French Cuisine")).showInfoWindow();
            LatLng SukhoTHAI = new LatLng(43.6485, -79.3743);
            googleMap.addMarker(new MarkerOptions().position(SukhoTHAI).title("SukhoTHAI").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)).snippet("Thai")).showInfoWindow();
            LatLng LePapillonOnFront = new LatLng(43.648, -79.374);
            googleMap.addMarker(new MarkerOptions().position(LePapillonOnFront).title("Le Papillon On Front").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)).snippet("French Cuisine")).showInfoWindow();
            LatLng PowerUpGameBar = new LatLng(43.6487, -79.3742);
            googleMap.addMarker(new MarkerOptions().position(PowerUpGameBar).title("Sweet Tooth on Front").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)).snippet("Ice Cream Parlour")).showInfoWindow();
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(toronto));
        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_maps, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }
}