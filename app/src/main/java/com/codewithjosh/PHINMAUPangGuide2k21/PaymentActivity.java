package com.codewithjosh.PHINMAUPangGuide2k21;

import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PaymentActivity extends AppCompatActivity {

    ImageButton _backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        _backBtn = findViewById(R.id.btn_return);

        _backBtn.setOnClickListener(view -> onBackPressed());

    }
}