package com.azhohov.newbuildings.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.azhohov.newbuildings.R;
import com.azhohov.newbuildings.adapter.viewholder.BuildingViewHolder;
import com.azhohov.newbuildings.model.Building;

import java.util.Collections;
import java.util.List;

/**
 * Created by Leshiy on 03.04.2017.
 */

public class BuildingsAdapter extends RecyclerView.Adapter<BuildingViewHolder> {

    private List<Building> buildingsList;
    private final LayoutInflater layoutInflater;

    public BuildingsAdapter(Context context) {
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.buildingsList = Collections.emptyList();
    }

    public void changeDataSet(@NonNull List<Building> entries) {
        buildingsList = entries;
        notifyDataSetChanged();
    }

    @Override
    public BuildingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = layoutInflater.inflate(R.layout.building_list_item, parent, false);
        return new BuildingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BuildingViewHolder holder, int position) {
        holder.bindView(buildingsList.get(position));
    }

    @Override
    public int getItemCount() {
        return buildingsList.size();
    }
}
