package com.codewithjosh.PHINMAUPangGuide2k21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

public class PaymentActivity extends AppCompatActivity {

    ImageButton btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        btn_back = findViewById(R.id.btn_back);

        btn_back.setOnClickListener(v -> onBackPressed());

    }

}