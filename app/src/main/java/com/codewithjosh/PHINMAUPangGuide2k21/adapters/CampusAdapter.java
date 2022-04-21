package com.codewithjosh.PHINMAUPangGuide2k21.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codewithjosh.PHINMAUPangGuide2k21.R;
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
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_campus,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder._campusText.setText(mList.get(position).getCampus_name());
        holder._campusImage.setImageResource(mList.get(position).getCampus_image());

        if(!(position <= 1) ){
            holder._campusSpace.setVisibility(View.GONE);
        }

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView _campusImage;
        TextView _campusText,_campusSpace;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            _campusImage = itemView.findViewById(R.id.campus_img);
            _campusText = itemView.findViewById(R.id.campus_text);
            _campusSpace = itemView.findViewById(R.id.campus_areaSpace);
        }

    }

}
