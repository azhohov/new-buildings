package com.azhohov.newbuildings.dagger.component;

import com.azhohov.newbuildings.activity.BaseActivity;
import com.azhohov.newbuildings.dagger.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Leshiy on 02.04.2017.
 */

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    void inject(BaseActivity activity);
}

