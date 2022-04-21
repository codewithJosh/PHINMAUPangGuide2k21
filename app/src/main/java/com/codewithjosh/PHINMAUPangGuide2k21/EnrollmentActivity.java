package com.codewithjosh.PHINMAUPangGuide2k21;

import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EnrollmentActivity extends AppCompatActivity {

    ImageButton btn_back;
    TextView nav_enrollment, nav_proof;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enrollment);

        btn_back = findViewById(R.id.btn_back);
        nav_enrollment = findViewById(R.id.nav_enrollment);
        nav_proof = findViewById(R.id.nav_proof);

        btn_back.setOnClickListener(v -> onBackPressed());

        nav_enrollment.setOnClickListener(v -> goToURL(nav_enrollment));

        nav_proof.setOnClickListener(v -> goToURL(nav_proof));

    }

    private void goToURL(final TextView tv) {

        tv.setPaintFlags(tv.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        final String s = tv.getText().toString();

        Uri uri = Uri.parse(s);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

    }

}