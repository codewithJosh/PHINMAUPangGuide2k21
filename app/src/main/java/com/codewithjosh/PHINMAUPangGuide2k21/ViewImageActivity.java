package com.codewithjosh.PHINMAUPangGuide2k21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewImageActivity extends AppCompatActivity {

    int i_position, i_campus_image;
    String s_campus_name;

    ImageButton btn_back;
    ImageView iv_campus_image;
    TextView tv_campus_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_image);

        btn_back = findViewById(R.id.btn_back);
        iv_campus_image = findViewById(R.id.iv_campus_image);
        tv_campus_name = findViewById(R.id.tv_campus_name);

        btn_back.setOnClickListener(v -> onBackPressed());

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            i_position = extras.getInt("i_position");
            i_campus_image = extras.getInt("i_campus_image");
            s_campus_name = extras.getString("s_campus_name");
        }

        tv_campus_name.setText(s_campus_name);
        iv_campus_image.setImageResource(i_campus_image);

        if ((i_position%2) == 0) tv_campus_name.setTextColor(getResources().getColor(R.color.colorSpaceCadet));

    }

}