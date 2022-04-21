package com.codewithjosh.PHINMAUPangGuide2k21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class EnrollmentActivity extends AppCompatActivity {

    ImageButton _backBtn;
    TextView _linkEnroll, _linkProof;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enrollment);

        _backBtn = findViewById(R.id.btn_return);
        _linkEnroll =  findViewById(R.id.link_enroll);
        _linkProof =  findViewById(R.id.link_proof);

        _backBtn.setOnClickListener(view -> onBackPressed());

    }

}