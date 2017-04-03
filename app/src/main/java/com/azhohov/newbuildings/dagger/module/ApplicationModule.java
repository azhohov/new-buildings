package com.azhohov.newbuildings.dagger.module;

import android.app.Application;

import com.azhohov.newbuildings.BuildingsApplication;

import dagger.Module;

/**
 * Created by Leshiy on 02.04.2017.
 */

@Module
public class ApplicationModule {
    protected final Application application;

    public ApplicationModule(BuildingsApplication buildingsApplication) {
        application = buildingsApplication;
    }
}
