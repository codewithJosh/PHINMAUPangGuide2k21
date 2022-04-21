package com.codewithjosh.PHINMAUPangGuide2k21;

import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.codewithjosh.PHINMAUPangGuide2k21.adapters.CampusAdapter;
import com.codewithjosh.PHINMAUPangGuide2k21.models.CampusModel;

import java.util.ArrayList;

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

        _recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        _recyclerView.setItemAnimator(new DefaultItemAnimator());
        _recyclerView.setHasFixedSize(true);

        ArrayList<CampusModel> campusModels = new ArrayList<>();
        campusModels.add(new CampusModel(R.drawable.img_campus, "CAMPUS"));
        campusModels.add(new CampusModel(R.drawable.img_cma, "CMA BUILDING"));
        campusModels.add(new CampusModel(R.drawable.img_basic_ed, "BASIC ED BUILDING"));
        campusModels.add(new CampusModel(R.drawable.img_mba, "MBA BUILDING"));
        campusModels.add(new CampusModel(R.drawable.img_nh, "NH BUILDING"));
        campusModels.add(new CampusModel(R.drawable.img_cite, "CITE BUILDING"));
        campusModels.add(new CampusModel(R.drawable.img_sp, "STUDENT PLAZA"));
        campusModels.add(new CampusModel(R.drawable.img_hallway, "HALLWAY"));

        _recyclerView.setAdapter(new CampusAdapter(CampusActivity.this, campusModels));

    }

}