package com.azhohov.newbuildings.view;

import com.azhohov.newbuildings.model.Building;

import java.util.List;

/**
 * Created by Leshiy on 02.04.2017.
 */

public interface BuildingsView {
    void showBuildings(List<Building> buildings);

    void showLoadingIndicator();

    void hideLoadingIndicator();
}
