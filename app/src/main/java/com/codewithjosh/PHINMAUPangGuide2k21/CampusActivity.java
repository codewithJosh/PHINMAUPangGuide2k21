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

    ImageButton btn_back;
    RecyclerView recycler_campus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus);

        btn_back = findViewById(R.id.btn_back);
        recycler_campus = findViewById(R.id.recycler_campus);

        btn_back.setOnClickListener(v -> onBackPressed());

        recycler_campus.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        recycler_campus.setItemAnimator(new DefaultItemAnimator());
        recycler_campus.setHasFixedSize(true);

        ArrayList<CampusModel> campusModel = new ArrayList<>();
        campusModel.add(new CampusModel(R.drawable.img_campus, "CAMPUS"));
        campusModel.add(new CampusModel(R.drawable.img_cma, "CMA BUILDING"));
        campusModel.add(new CampusModel(R.drawable.img_basic_ed, "BASIC ED BUILDING"));
        campusModel.add(new CampusModel(R.drawable.img_mba, "MBA BUILDING"));
        campusModel.add(new CampusModel(R.drawable.img_nh, "NH BUILDING"));
        campusModel.add(new CampusModel(R.drawable.img_cite, "CITE BUILDING"));
        campusModel.add(new CampusModel(R.drawable.img_sp, "STUDENT PLAZA"));
        campusModel.add(new CampusModel(R.drawable.img_hallway, "HALLWAY"));

        recycler_campus.setAdapter(new CampusAdapter(this, campusModel));

    }

}