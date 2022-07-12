package com.codewithjosh.PHINMAUPangGuide2k21.adapters;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codewithjosh.PHINMAUPangGuide2k21.R;
import com.codewithjosh.PHINMAUPangGuide2k21.ViewImageActivity;
import com.codewithjosh.PHINMAUPangGuide2k21.models.CampusModel;

import java.util.List;

public class CampusAdapter extends RecyclerView.Adapter<CampusAdapter.ViewHolder> {

    public Context context;
    public List<CampusModel> campuses;
    SharedPreferences.Editor editor;

    public CampusAdapter(final Context context, final List<CampusModel> campuses) {

        this.context = context;
        this.campuses = campuses;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_campus, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final CampusModel campus = campuses.get(position);

//        initViews
        final ImageView ivCampusImage = holder.ivCampusImage;
        final TextView tvCampusName = holder.tvCampusName;
        final View vGap = holder.vGap;

//        load
        final int campusImage = campus.getCampus_image();
        final String campusName = campus.getCampus_name();

        initSharedPref();

        ivCampusImage.setImageResource(campusImage);
        tvCampusName.setText(campusName);

        if (position > 1) vGap.setVisibility(View.GONE);

        holder.itemView.setOnClickListener(v -> {

            editor.putInt("campus_id", position);
            editor.putInt("campus_image", campusImage);
            editor.putString("campus_name", campusName);
            editor.apply();
            context.startActivity(new Intent(context, ViewImageActivity.class));

        });

    }

    private void initSharedPref()
    {

        editor = context.getSharedPreferences("user", Context.MODE_PRIVATE).edit();

    }

    @Override
    public int getItemCount() {

        return campuses.size();

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView ivCampusImage;
        public TextView tvCampusName;
        public View vGap;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);

            ivCampusImage = itemView.findViewById(R.id.iv_campus);
            tvCampusName = itemView.findViewById(R.id.tv_campus);
            vGap = itemView.findViewById(R.id.v_gap);

        }

    }

}
