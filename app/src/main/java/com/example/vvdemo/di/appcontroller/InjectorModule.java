package com.example.vvdemo.di.appcontroller;

import com.example.vvdemo.view.MainActivity;
import com.example.vvdemo.di.modules.MainActivityModule;
import com.example.vvdemo.di.scope.PerActivity;

import dagger.Module;
import dagger.android.AndroidInjectionModule;
import dagger.android.ContributesAndroidInjector;

@Module(includes = AndroidInjectionModule.class)
public abstract class InjectorModule {
    @ContributesAndroidInjector(modules = {MainActivityModule.class})
    @PerActivity
    abstract MainActivity bindMainActivity();
}
