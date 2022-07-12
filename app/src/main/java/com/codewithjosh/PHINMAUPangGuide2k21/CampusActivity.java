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

    ImageButton btnBack;
    RecyclerView recyclerCampus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus);

        initViews();
        initRecyclerView();
        loadCampuses();
        buildButtons();

    }

    private void initViews() {

        btnBack = findViewById(R.id.btn_back);
        recyclerCampus = findViewById(R.id.recycler_campus);

    }

    private void initRecyclerView() {

        recyclerCampus.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        recyclerCampus.setItemAnimator(new DefaultItemAnimator());
        recyclerCampus.setHasFixedSize(true);

    }

    private void loadCampuses() {

        final ArrayList<CampusModel> campuses = new ArrayList<>();
        campuses.add(new CampusModel(R.drawable.img_campus, "CAMPUS"));
        campuses.add(new CampusModel(R.drawable.img_c_m_a, "CMA BUILDING"));
        campuses.add(new CampusModel(R.drawable.img_basic_ed, "BASIC ED BUILDING"));
        campuses.add(new CampusModel(R.drawable.img_m_b_a, "MBA BUILDING"));
        campuses.add(new CampusModel(R.drawable.img_n_h, "NH BUILDING"));
        campuses.add(new CampusModel(R.drawable.img_c_i_t_e, "CITE BUILDING"));
        campuses.add(new CampusModel(R.drawable.img_s_p, "STUDENT PLAZA"));
        campuses.add(new CampusModel(R.drawable.img_hallway, "HALLWAY"));

        recyclerCampus.setAdapter(new CampusAdapter(this, campuses));

    }

    private void buildButtons() {

        btnBack.setOnClickListener(v -> onBackPressed());

    }

}