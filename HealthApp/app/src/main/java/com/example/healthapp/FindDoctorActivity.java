package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FindDoctorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_doctor);

        CardView exit = findViewById(R.id.cardFDBack);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FindDoctorActivity.this, HomeActivity.class));
            }
        });
        // 1
        CardView familyphysician = findViewById(R.id.cardFDFamilyPhysician);
        familyphysician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FindDoctorActivity.this, DoctorDetailActivity.class);
                i.putExtra("title", "Family Physicians");
                startActivity(i);
            }
        });
        // 2
        CardView dietician = findViewById(R.id.cardFDDietician);
        dietician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FindDoctorActivity.this, DoctorDetailActivity.class);
                i.putExtra("title", "Dietician");
                startActivity(i);
            }
        });
        // 3
        CardView dentist = findViewById(R.id.cardFDDentist);
        dentist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FindDoctorActivity.this, DoctorDetailActivity.class);
                i.putExtra("title", "Dentist");
                startActivity(i);
            }
        });
        // 4
        CardView surgeon = findViewById(R.id.cardFDSurgeon);
        surgeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FindDoctorActivity.this, DoctorDetailActivity.class);
                i.putExtra("title", "Surgeon");
                startActivity(i);
            }
        });
        // 5
        CardView cardilogits = findViewById(R.id.cardFDCardiologists);
        cardilogits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FindDoctorActivity.this, DoctorDetailActivity.class);
                i.putExtra("title", "Cardiologists");
                startActivity(i);
            }
        });
    }
}