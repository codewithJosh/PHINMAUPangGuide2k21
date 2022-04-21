package com.codewithjosh.PHINMAUPangGuide2k21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class UniformActivity extends AppCompatActivity {

    ImageButton _backBtn;
    TextView _linkCMA, _linkCITE,_linkCSS,_linkCEA,_linkCHS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uniform);

        _backBtn = findViewById(R.id.btn_return);
        _linkCMA =  findViewById(R.id.link_cma);
        _linkCITE =  findViewById(R.id.link_cite);
        _linkCSS =  findViewById(R.id.link_css);
        _linkCEA =  findViewById(R.id.link_cea);
        _linkCHS =  findViewById(R.id.link_chs);

        _backBtn.setOnClickListener(view -> onBackPressed());

    }

}