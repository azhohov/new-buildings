package com.azhohov.newbuildings.adapter.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.azhohov.newbuildings.R;
import com.azhohov.newbuildings.model.Building;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Leshiy on 03.04.2017.
 */

public class BuildingViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.tv_name)
    TextView tvName;

    public BuildingViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bindView(@NonNull Building building) {
        tvName.setText(building.getName());
    }
}
