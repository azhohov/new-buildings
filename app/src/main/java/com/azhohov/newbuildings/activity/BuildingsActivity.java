package com.azhohov.newbuildings.activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.azhohov.newbuildings.R;
import com.azhohov.newbuildings.adapter.BuildingsAdapter;
import com.azhohov.newbuildings.model.Building;
import com.azhohov.newbuildings.presenter.BuildingsPresenter;
import com.azhohov.newbuildings.view.BuildingsView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BuildingsActivity extends BaseActivity implements BuildingsView {

    @BindView(R.id.rv_buildings)
    RecyclerView rvBuildings;

    private BuildingsPresenter buildingsPresenter;

    private BuildingsAdapter buildingsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buildings);
        ButterKnife.bind(this);

        buildingsAdapter = new BuildingsAdapter(this);

        rvBuildings.setLayoutManager(new LinearLayoutManager(this));
        rvBuildings.setAdapter(buildingsAdapter);

        buildingsPresenter = new BuildingsPresenter(this);
        buildingsPresenter.init();
    }

    @Override
    public void showBuildings(List<Building> buildings) {
        buildingsAdapter.changeDataSet(buildings);
    }

    @Override
    public void showLoadingIndicator() {

    }

    @Override
    public void hideLoadingIndicator() {

    }
}
