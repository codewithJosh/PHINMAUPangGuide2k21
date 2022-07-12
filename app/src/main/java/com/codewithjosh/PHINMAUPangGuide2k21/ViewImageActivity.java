package com.codewithjosh.PHINMAUPangGuide2k21;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ViewImageActivity extends AppCompatActivity {

    ImageButton btnBack;
    ImageView ivCampusImage;
    TextView tvCampusName;
    int campusId;
    int campusImage;
    String campusName;
    SharedPreferences sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_image);

        initViews();
        initSharedPref();
        load();
        build();

    }

    private void initViews()
    {

        btnBack = findViewById(R.id.btn_back);
        ivCampusImage = findViewById(R.id.iv_campus_image);
        tvCampusName = findViewById(R.id.tv_campus_name);

    }

    private void initSharedPref()
    {

        sharedPref = getSharedPreferences("user", MODE_PRIVATE);

    }

    private void load()
    {

        campusId = sharedPref.getInt("campus_id", MODE_PRIVATE);
        campusImage = sharedPref.getInt("campus_image", MODE_PRIVATE);
        campusName = sharedPref.getString("campus_name", String.valueOf(MODE_PRIVATE));

    }

    private void build()
    {

        tvCampusName.setText(campusName);
        ivCampusImage.setImageResource(campusImage);

        if (campusId % 2 == 0) tvCampusName.setTextColor(getResources().getColor(R.color.colorSpaceCadet));

        btnBack.setOnClickListener(v -> onBackPressed());

    }

}