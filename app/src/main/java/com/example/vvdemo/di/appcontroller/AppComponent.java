package com.example.vvdemo.di.appcontroller;

import android.app.Application;

import com.example.vvdemo.app.MyApp;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, InjectorModule.class})
public interface AppComponent extends AndroidInjector<MyApp> {

    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

    void inject(Application application);
}
