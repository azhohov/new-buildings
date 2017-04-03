package com.azhohov.newbuildings.presenter;

import com.azhohov.newbuildings.model.Building;
import com.azhohov.newbuildings.view.BuildingsView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Leshiy on 02.04.2017.
 */

public class BuildingsPresenter {
    private BuildingsView buildingsView;

    public BuildingsPresenter(BuildingsView buildingsView) {
        this.buildingsView = buildingsView;
    }

    public void init() {
        List<Building> buildingList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Building building = new Building();
            building.setName("ЖК «номер " + i + "»");
            buildingList.add(building);
        }

        buildingsView.showBuildings(buildingList);
    }
}
