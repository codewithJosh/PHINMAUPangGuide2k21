package com.codewithjosh.PHINMAUPangGuide2k21;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageButton;

public class CampusActivity extends AppCompatActivity {

    ImageButton _backBtn;
    RecyclerView _recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus);

        _backBtn = findViewById(R.id.btn_return);
        _recyclerView = findViewById(R.id.campusRecyclerView);

        _backBtn.setOnClickListener(view -> onBackPressed());

    }

}