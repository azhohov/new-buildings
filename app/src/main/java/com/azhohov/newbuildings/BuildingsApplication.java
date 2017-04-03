package com.azhohov.newbuildings;

import android.app.Application;

import com.azhohov.newbuildings.dagger.component.ApplicationComponent;
import com.azhohov.newbuildings.dagger.component.DaggerApplicationComponent;
import com.azhohov.newbuildings.dagger.module.ApplicationModule;

/**
 * Created by Leshiy on 02.04.2017.
 */

public class BuildingsApplication extends Application {
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();
    }

    private void initializeInjector() {
        this.component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
