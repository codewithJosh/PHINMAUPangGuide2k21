package com.codewithjosh.PHINMAUPangGuide2k21;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button navHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        buildButtons();

    }

    private void initViews()
    {

        getWindow().setNavigationBarColor(getResources().getColor(R.color.color_brunswick_green));

        navHome = findViewById(R.id.nav_home);

    }

    private void buildButtons()
    {

        navHome.setOnClickListener(v -> {

            startActivity(new Intent(this, HomeActivity.class));
            finish();

        });

    }

}