package com.codewithjosh.PHINMAUPangGuide2k21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class UniformActivity extends AppCompatActivity {

    ImageButton btn_back;
    TextView nav_cma, nav_cite, nav_css, nav_cea, nav_chs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uniform);

        btn_back = findViewById(R.id.btn_back);

        nav_cma = findViewById(R.id.nav_cma);
        nav_cite = findViewById(R.id.nav_cite);
        nav_css = findViewById(R.id.nav_css);
        nav_cea = findViewById(R.id.nav_cea);
        nav_chs = findViewById(R.id.nav_chs);

        btn_back.setOnClickListener(v -> onBackPressed());

        nav_cma.setOnClickListener(v -> goToURL(nav_cma));

        nav_cite.setOnClickListener(v -> goToURL(nav_cite));

        nav_css.setOnClickListener(v -> goToURL(nav_css));

        nav_cea.setOnClickListener(v -> goToURL(nav_cea));

        nav_chs.setOnClickListener(v -> goToURL(nav_chs));

    }

    private void goToURL(final TextView tv) {

        tv.setPaintFlags(tv.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        final String s = tv.getText().toString();

        Uri uri = Uri.parse(s);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

    }

}