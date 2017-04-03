package com.azhohov.newbuildings.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.azhohov.newbuildings.BuildingsApplication;
import com.azhohov.newbuildings.dagger.component.ApplicationComponent;

/**
 * Created by Leshiy on 02.04.2017.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getApplicationComponent().inject(this);
    }

    protected ApplicationComponent getApplicationComponent() {
        return ((BuildingsApplication) getApplication()).getComponent();
    }
}
