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
    public List<CampusModel> mList;

    public CampusAdapter(Context mContext, List<CampusModel> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_campus, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder._campusText.setText(mList.get(position).getCampus_name());
        holder._campusImage.setImageResource(mList.get(position).getCampus_image());

        if (!(position <= 1)) {
            holder._campusSpace.setVisibility(View.GONE);
        }

        holder.setListener(position);

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView _campusImage;
        TextView _campusText;
        View _campusSpace;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            _campusImage = itemView.findViewById(R.id.iv_campus);
            _campusText = itemView.findViewById(R.id.tv_campus);
            _campusSpace = itemView.findViewById(R.id.v_gap);
        }

        public void setListener(int position) {
            itemView.setOnClickListener(view -> {
                Intent i = new Intent(mContext, ViewImageActivity.class);
                int itemPosition = getLayoutPosition();
                i.putExtra("position", itemPosition);
                i.putExtra("name", mList.get(position).getCampus_name());
                i.putExtra("image", mList.get(position).getCampus_image());
                mContext.startActivity(i);
            });
        }

    }

}
