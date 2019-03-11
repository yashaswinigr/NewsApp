package com.yashaswini.NewsApp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {
    //private Model[] itemsData;


    private Context mCtx;

    private List<Model> newsList;

    private Context mContext;
    private  OnItemClickListner clickListner;

   // public NewsAdapter(List<Model> newsList, Context mctx) {
       // this.mCtx = mCtx;
        //this.newsList = newsList;
    //}

    public NewsAdapter(List<Model> newsList) {
        this.newsList=newsList;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext=parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.activity_news, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        Model news = newsList.get(position);


        holder.textViewTitle.setText(news.getTitle());
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickListner.onItemClick(holder.image,position);
                }

        });


        Glide.with(mContext).load(news.getImageUrl()).into(holder.image);






        // newsViewHolder.image.setText(news.getImageUrl());
    }


    @Override
    public int getItemCount(){
        return newsList.size();
    }

    {
}


    class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTitle;

        ImageView image;


        public ViewHolder(View itemview) {
            super(itemview);

            textViewTitle = itemview.findViewById(R.id.textViewName);

            image = itemview.findViewById(R.id.textViewImageUrl);
        }
    }



    }

