package com.codewithjosh.PHINMAUPangGuide2k21;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    Button nav_enrollment, nav_uniform, nav_payment, nav_campus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        nav_enrollment = findViewById(R.id.nav_enrollment);
        nav_uniform = findViewById(R.id.nav_uniform);
        nav_payment = findViewById(R.id.nav_payment);
        nav_campus = findViewById(R.id.nav_campus);

        nav_enrollment.setOnClickListener(v -> startActivity(new Intent(this, EnrollmentActivity.class)));

        nav_uniform.setOnClickListener(v -> startActivity(new Intent(this, UniformActivity.class)));

        nav_payment.setOnClickListener(v -> startActivity(new Intent(this, PaymentActivity.class)));

        nav_campus.setOnClickListener(v -> startActivity(new Intent(this, CampusActivity.class)));

    }

}