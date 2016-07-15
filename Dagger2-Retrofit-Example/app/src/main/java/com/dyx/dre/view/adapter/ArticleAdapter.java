package com.dyx.dre.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dyx.dre.R;
import com.dyx.dre.models.Article;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * project name：Dagger2-Retrofit-Example
 * class describe：
 * create person：dayongxin
 * create time：16/7/14 下午11:33
 * alter person：dayongxin
 * alter time：16/7/14 下午11:33
 * alter remark：
 */
public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.ViewHolder> {
    private List<Article.DataEntity> mDataSet;
    private Context mContext;

    public ArticleAdapter(List<Article.DataEntity> mDataSet, Context mContext) {
        this.mDataSet = mDataSet;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_item_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        /**
         * tab
         */
        holder.mTv_tab.setText(mDataSet.get(position).getTab());
        /**
         * title
         */
        holder.mTv_title.setText(mDataSet.get(position).getTitle());
        /**
         * last_reply_at
         */
        holder.mTv_last_reply_at.setText(mDataSet.get(position).getLast_reply_at());
        /**
         *create_at
         */
        holder.mTv_create_at.setText(mDataSet.get(position).getCreate_at());
        /**
         *reply_count
         */
        holder.mTv_reply_count.setText(mDataSet.get(position).getReply_count() + "");
        /**
         *
         */
        holder.mTv_visit_count.setText(mDataSet.get(position).getVisit_count() + "");
        /**
         *loginname
         */
        holder.mTv_loginname.setText(mDataSet.get(position).getAuthor().getLoginname());
        /**
         *avatar_url
         */
        holder.mIv_avatar_url.setTag(position);
        Picasso.with(mContext).load(mDataSet.get(position).getAuthor().getAvatar_url()).resize(240, 240).centerCrop().into(holder.mIv_avatar_url);
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTv_tab;
        TextView mTv_title;
        TextView mTv_last_reply_at;
        TextView mTv_create_at;
        TextView mTv_reply_count;
        TextView mTv_visit_count;
        TextView mTv_loginname;
        ImageView mIv_avatar_url;

        public ViewHolder(View itemView) {
            super(itemView);

            mTv_tab = (TextView) itemView.findViewById(R.id.tv_tab);
            mTv_title = (TextView) itemView.findViewById(R.id.tv_title);
            mTv_last_reply_at = (TextView) itemView.findViewById(R.id.tv_last_reply_at);
            mTv_create_at = (TextView) itemView.findViewById(R.id.tv_create_at);
            mTv_reply_count = (TextView) itemView.findViewById(R.id.tv_reply_count);
            mTv_visit_count = (TextView) itemView.findViewById(R.id.tv_visit_count);
            mTv_loginname = (TextView) itemView.findViewById(R.id.tv_loginname);
            mIv_avatar_url = (ImageView) itemView.findViewById(R.id.iv_avatar_url);
        }
    }
}
