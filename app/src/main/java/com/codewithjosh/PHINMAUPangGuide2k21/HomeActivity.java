package com.codewithjosh.PHINMAUPangGuide2k21;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button _viewEnrollment, _viewUniform, _viewFees, _viewCampus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        _viewEnrollment = findViewById(R.id.view_Enrollment);
        _viewUniform = findViewById(R.id.view_uniforms);
        _viewFees = findViewById(R.id.view_Fees);
        _viewCampus = findViewById(R.id.view_campus);

        _viewEnrollment.setOnClickListener(view -> {
            startActivity(new Intent(HomeActivity.this, EnrollmentActivity.class));
        });

        _viewUniform.setOnClickListener(view -> {
            startActivity(new Intent(HomeActivity.this, UniformActivity.class));
        });

        _viewFees.setOnClickListener(view -> {
            startActivity(new Intent(HomeActivity.this, PaymentActivity.class));
        });

        _viewCampus.setOnClickListener(view -> {
            startActivity(new Intent(HomeActivity.this, CampusActivity.class));
        });

    }

}