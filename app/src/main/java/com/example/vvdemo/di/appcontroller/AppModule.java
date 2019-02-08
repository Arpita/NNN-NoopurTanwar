package com.example.vvdemo.di.appcontroller;

import android.app.Application;
import android.content.Context;

import com.example.vvdemo.R;
import com.example.vvdemo.data.APIInterface;
import com.example.vvdemo.di.qualifiers.ApplicationContext;

import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module(includes = {OkHttpClientModule.class})
public class AppModule {

    @Provides
    @Singleton
    public APIInterface apiInterface(Retrofit retrofit){
        return retrofit.create(APIInterface.class);
    }

    @Provides
    @Singleton
    public Retrofit retrofit(OkHttpClient okHttpClient,
                             GsonConverterFactory gsonConverterFactory, String baseUrl){
        return new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(baseUrl)
                .addConverterFactory(gsonConverterFactory)
                .build();
    }

    @Provides
    @Singleton
    public GsonConverterFactory gsonConverterFactory(){
        return GsonConverterFactory.create();
    }

    @Provides
    @Singleton
    public String baseUrl(@ApplicationContext Context context){
        return context.getResources().getString(R.string.base_url);
    }

    @Provides
    @Singleton
    @ApplicationContext
    static Context provideContext(Application application) {
        return application;
    }

    /*@Provides
    @Singleton
    public MovieDB provideMovieDB(@ApplicationContext Context context){
        return MovieDB.getsInstance(context);
    }*/
}
