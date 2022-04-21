package com.codewithjosh.PHINMAUPangGuide2k21.adapters;

import android.content.Context;
import android.content.Intent;
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

    public Context mContext;
    public List<CampusModel> mCampus;

    public CampusAdapter(Context mContext, List<CampusModel> mCampus) {
        this.mContext = mContext;
        this.mCampus = mCampus;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_campus, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.iv_campus_image.setImageResource(mCampus.get(position).getCampus_image());
        holder.tv_campus_name.setText(mCampus.get(position).getCampus_name());

        if (!(position <= 1)) holder.v_gap.setVisibility(View.GONE);

        holder.setListener(position);

    }

    @Override
    public int getItemCount() {
        return mCampus.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView iv_campus_image;
        TextView tv_campus_name;
        View v_gap;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            iv_campus_image = itemView.findViewById(R.id.iv_campus);
            tv_campus_name = itemView.findViewById(R.id.tv_campus);
            v_gap = itemView.findViewById(R.id.v_gap);

        }

        public void setListener(int position) {

            itemView.setOnClickListener(v -> {

                Intent i = new Intent(mContext, ViewImageActivity.class);
                int itemPosition = getLayoutPosition();
                i.putExtra("i_position", itemPosition );
                i.putExtra("s_campus_name", mCampus.get(position).getCampus_name());
                i.putExtra("i_campus_image", mCampus.get(position).getCampus_image());
                mContext.startActivity(i);
            });

        }

    }

}
