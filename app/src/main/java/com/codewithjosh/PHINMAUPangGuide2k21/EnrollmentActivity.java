package com.codewithjosh.PHINMAUPangGuide2k21;

import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EnrollmentActivity extends AppCompatActivity {

    ImageButton _backBtn;
    TextView _linkEnroll, _linkProof;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enrollment);

        _backBtn = findViewById(R.id.btn_return);
        _linkEnroll = findViewById(R.id.link_enroll);
        _linkProof = findViewById(R.id.link_proof);

        _backBtn.setOnClickListener(view -> onBackPressed());

        _linkProof.setPaintFlags(_linkProof.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        _linkEnroll.setPaintFlags(_linkEnroll.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        _linkEnroll.setOnClickListener(view ->
                GoToURL(_linkEnroll.getText().toString())
        );

        _linkProof.setOnClickListener(view ->
                GoToURL(_linkProof.getText().toString())
        );

    }

    void GoToURL(String url) {
        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}