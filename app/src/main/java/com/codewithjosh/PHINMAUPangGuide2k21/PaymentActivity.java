package com.codewithjosh.PHINMAUPangGuide2k21;

import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PaymentActivity extends AppCompatActivity {

    ImageButton btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        initViews();
        buildButtons();

    }

    private void initViews()
    {

        btnBack = findViewById(R.id.btn_back);

    }

    private void buildButtons()
    {

        btnBack.setOnClickListener(v -> onBackPressed());

    }

}