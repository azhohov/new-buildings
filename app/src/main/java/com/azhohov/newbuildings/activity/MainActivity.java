package com.azhohov.newbuildings.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.azhohov.newbuildings.R;
import com.azhohov.newbuildings.presenter.MainPresenter;
import com.azhohov.newbuildings.view.MainView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements MainView {

    @Inject
    MainPresenter mainPresenter;

    @BindView(R.id.btn_buildings_list)
    Button btnBuildingsList;

    @BindView(R.id.btn_load_buildings)
    Button btnLoadBuildings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_buildings_list)
    public void gotoBuildingsActivity(){
        Intent intent = new Intent(this, BuildingsActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_load_buildings)
    public void loadBuildings(){
        Toast.makeText(this, "Не реализовано", Toast.LENGTH_SHORT).show();
    }
}
