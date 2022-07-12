package com.codewithjosh.PHINMAUPangGuide2k21;

import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EnrollmentActivity extends AppCompatActivity {

    ImageButton btnBack;
    TextView navEnrollment;
    TextView navProof;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enrollment);

        initViews();
        buildButtons();

    }

    private void initViews()
    {

        btnBack = findViewById(R.id.btn_back);
        navEnrollment = findViewById(R.id.nav_enrollment);
        navProof = findViewById(R.id.nav_proof);

    }

    private void buildButtons()
    {

        btnBack.setOnClickListener(v -> onBackPressed());

        navEnrollment.setOnClickListener(v -> goToURL(navEnrollment));

        navProof.setOnClickListener(v -> goToURL(navProof));

    }

    private void goToURL(final TextView tv) {

        tv.setPaintFlags(tv.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        final String url = tv.getText().toString();

        final Uri uri = Uri.parse(url);
        final Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

    }

}