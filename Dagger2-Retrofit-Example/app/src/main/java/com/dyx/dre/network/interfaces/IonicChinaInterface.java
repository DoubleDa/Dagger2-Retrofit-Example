package com.dyx.dre.network.interfaces;

import com.dyx.dre.models.Article;

import retrofit.Call;
import retrofit.http.GET;

/**
 * project name：Dagger2-Retrofit-Example
 * class describe：
 * create person：dayongxin
 * create time：16/7/14 下午10:49
 * alter person：dayongxin
 * alter time：16/7/14 下午10:49
 * alter remark：
 */
public interface IonicChinaInterface {
    @GET("/api/v1/topics")
    Call<Article> getArticle();
}
