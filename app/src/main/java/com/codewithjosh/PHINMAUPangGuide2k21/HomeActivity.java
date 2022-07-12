package com.codewithjosh.PHINMAUPangGuide2k21;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    Button navCampus;
    Button navEnrollment;
    Button navPayment;
    Button navUniform;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initViews();
        buildButtons();

    }

    private void initViews()
    {

        navCampus = findViewById(R.id.nav_campus);
        navEnrollment = findViewById(R.id.nav_enrollment);
        navPayment = findViewById(R.id.nav_payment);
        navUniform = findViewById(R.id.nav_uniform);

    }

    private void buildButtons()
    {

        navCampus.setOnClickListener(v -> startActivity(new Intent(this, CampusActivity.class)));

        navEnrollment.setOnClickListener(v -> startActivity(new Intent(this, EnrollmentActivity.class)));

        navPayment.setOnClickListener(v -> startActivity(new Intent(this, PaymentActivity.class)));

        navUniform.setOnClickListener(v -> startActivity(new Intent(this, UniformActivity.class)));

    }

}