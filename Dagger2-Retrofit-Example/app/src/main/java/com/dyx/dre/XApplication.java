package com.dyx.dre;

import android.app.Application;

import com.apkfuns.logutils.LogUtils;
import com.dyx.dre.constants.Constants;
import com.dyx.dre.di.components.DaggerIonicChinaComponent;
import com.dyx.dre.di.components.DaggerNetComponent;
import com.dyx.dre.di.components.IonicChinaComponent;
import com.dyx.dre.di.components.NetComponent;
import com.dyx.dre.di.modules.AppModule;
import com.dyx.dre.di.modules.IonicChinaModule;
import com.dyx.dre.di.modules.NetModule;

/**
 * project name：Dagger2-Retrofit-Example
 * class describe：
 * create person：dayongxin
 * create time：16/7/14 下午10:33
 * alter person：dayongxin
 * alter time：16/7/14 下午10:33
 * alter remark：
 */
public class XApplication extends Application {

    private NetComponent mNetComponent;
    private IonicChinaComponent mIonicChinaComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        LogUtils.configTagPrefix = "***Dagger2-Retrofit-Example***";
        LogUtils.configAllowLog = true;

        mNetComponent = DaggerNetComponent.builder().appModule(new AppModule(this)).netModule(new NetModule(Constants.HOST_URL)).build();

        mIonicChinaComponent = DaggerIonicChinaComponent.builder().netComponent(mNetComponent).ionicChinaModule(new IonicChinaModule()).build();
    }

    public NetComponent getmNetComponent() {
        return mNetComponent;
    }

    public IonicChinaComponent getmIonicChinaComponent() {
        return mIonicChinaComponent;
    }
}
