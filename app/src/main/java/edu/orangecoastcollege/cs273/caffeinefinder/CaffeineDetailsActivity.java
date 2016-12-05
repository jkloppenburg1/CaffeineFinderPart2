package edu.orangecoastcollege.cs273.caffeinefinder;

import android.content.Intent;
import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.GoogleMap;

import org.w3c.dom.Text;

public class CaffeineDetailsActivity extends AppCompatActivity {

    private CaffeineLocation theLocation;
    private TextView detailsTextView;
    private GoogleMap myMap;


    // Member variable to access the Google Play services (LOCATION SERVICES) :
    private GoogleApiClient mGoogleApiClient;
    // Member variable to store location requests (how often to update)
    private LocationRequest mLocationRequest;
    // Member variable to store our current location
    private Location myLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caffeine_details);

        detailsTextView = (TextView) findViewById(R.id.detailsTextView);

        Intent intent = getIntent();

        CaffeineLocation theLocation = intent.getParcelableExtra("CaffeineLocation");
        String details;

        detailsTextView.setText(theLocation.toString());


    }
}
