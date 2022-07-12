package com.codewithjosh.PHINMAUPangGuide2k21;

import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UniformActivity extends AppCompatActivity {

    ImageButton btnBack;
    TextView navCEA;
    TextView navCHS;
    TextView navCITE;
    TextView navCMA;
    TextView navCSS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uniform);

        initViews();
        buildButtons();

    }

    private void initViews() {

        btnBack = findViewById(R.id.btn_back);
        navCEA = findViewById(R.id.nav_c_e_a);
        navCHS = findViewById(R.id.nav_c_h_s);
        navCITE = findViewById(R.id.nav_c_i_t_e);
        navCMA = findViewById(R.id.nav_c_m_a);
        navCSS = findViewById(R.id.nav_c_s_s);

    }

    private void buildButtons() {

        btnBack.setOnClickListener(v -> onBackPressed());

        navCEA.setOnClickListener(v -> goToURL(navCEA));

        navCHS.setOnClickListener(v -> goToURL(navCHS));

        navCITE.setOnClickListener(v -> goToURL(navCITE));

        navCMA.setOnClickListener(v -> goToURL(navCMA));

        navCSS.setOnClickListener(v -> goToURL(navCSS));

    }

    private void goToURL(final TextView tv) {

        tv.setPaintFlags(tv.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        final String url = tv.getText().toString();

        final Uri uri = Uri.parse(url);
        final Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

    }

}