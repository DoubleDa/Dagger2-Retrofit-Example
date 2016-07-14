package com.dyx.dre.di.components;

import com.dyx.dre.di.modules.AppModule;
import com.dyx.dre.di.modules.NetModule;
import com.squareup.okhttp.OkHttpClient;

import javax.inject.Singleton;

import dagger.Component;
import retrofit.Retrofit;

/**
 * project name：Dagger2-Retrofit-Example
 * class describe：
 * create person：dayongxin
 * create time：16/7/14 下午10:58
 * alter person：dayongxin
 * alter time：16/7/14 下午10:58
 * alter remark：
 */
@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    Retrofit retrofit();

    OkHttpClient okHttpClient();
}
