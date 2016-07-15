package com.dyx.dre.view.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.apkfuns.logutils.LogUtils;
import com.dyx.dre.R;
import com.dyx.dre.XApplication;
import com.dyx.dre.models.Article;
import com.dyx.dre.network.interfaces.IonicChinaInterface;
import com.dyx.dre.view.adapter.ArticleAdapter;
import com.dyx.dre.view.thridpart.DividerItemDecoration;

import java.util.List;

import javax.inject.Inject;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * project name：Dagger2-Retrofit-Example
 * class describe：
 * create person：dayongxin
 * create time：16/7/14 下午10:40
 * alter person：dayongxin
 * alter time：16/7/14 下午10:40
 * alter remark：
 */
public class ArticleAct extends Activity {
    @Inject
    Retrofit mRetrofit;

    @Inject
    IonicChinaInterface mIonicChinaInterface;

    private RecyclerView mRecyclerView;

    private ArticleAdapter mArticleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.rv_article);
        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST));


        ((XApplication) getApplication()).getmIonicChinaComponent().inject(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Call<Article> call = mIonicChinaInterface.getArticle();

        call.enqueue(new Callback<Article>() {
            @Override
            public void onResponse(Response<Article> response, Retrofit retrofit) {
                if (response.isSuccess()) {
                    Article article = response.body();
                    List<Article.DataEntity> mDataSet = article.getData();
                    mArticleAdapter = new ArticleAdapter(mDataSet, ArticleAct.this);
                    mRecyclerView.setAdapter(mArticleAdapter);
                } else {
                    LogUtils.i(response.code());
                }
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }
}
