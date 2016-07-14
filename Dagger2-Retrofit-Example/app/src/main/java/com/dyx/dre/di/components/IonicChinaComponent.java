package com.dyx.dre.di.components;

import com.dyx.dre.di.modules.IonicChinaModule;
import com.dyx.dre.di.scopes.ArticleScope;
import com.dyx.dre.view.ui.ArticleAct;

import dagger.Component;

/**
 * project name：Dagger2-Retrofit-Example
 * class describe：
 * create person：dayongxin
 * create time：16/7/14 下午10:59
 * alter person：dayongxin
 * alter time：16/7/14 下午10:59
 * alter remark：
 */
@ArticleScope
@Component(dependencies = NetComponent.class, modules = IonicChinaModule.class)
public interface IonicChinaComponent {
    void inject(ArticleAct articleAct);
}
