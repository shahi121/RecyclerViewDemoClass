package com.example.recyclerviewdemoclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ViewDetails extends AppCompatActivity {

    Model model;
    ImageView imageDetails;
    TextView titleText, descriptionText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_details);

        imageDetails = (ImageView) findViewById(R.id.imageDetails);
        titleText = (TextView) findViewById(R.id.titleText);
        descriptionText = (TextView) findViewById(R.id.descriptionText);

        if (getIntent() != null) {
            model = getIntent().getParcelableExtra("id");
            imageDetails.setImageResource(model.image);
            titleText.setText(model.title);
            if(model.description != null){
                descriptionText.setVisibility(View.VISIBLE);
                descriptionText.setText(model.description);
            }
        }
    }
}
