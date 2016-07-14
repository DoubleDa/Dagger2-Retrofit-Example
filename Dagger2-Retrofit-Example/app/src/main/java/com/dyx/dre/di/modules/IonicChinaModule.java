package com.dyx.dre.di.modules;

import com.dyx.dre.di.scopes.ArticleScope;
import com.dyx.dre.network.interfaces.IonicChinaInterface;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.Retrofit;

/**
 * project name：Dagger2-Retrofit-Example
 * class describe：
 * create person：dayongxin
 * create time：16/7/14 下午10:49
 * alter person：dayongxin
 * alter time：16/7/14 下午10:49
 * alter remark：
 */
@Module
public class IonicChinaModule {
    @Provides
    @ArticleScope
    public IonicChinaInterface providesIonicChinaInterface(Retrofit retrofit) {
        return retrofit.create(IonicChinaInterface.class);
    }
}
