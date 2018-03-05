package com.inkweon7269.dictionary.mRecyclerView;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.inkweon7269.dictionary.DetailActivity;
import com.inkweon7269.dictionary.R;

import java.util.List;

/**
 * Created by inkweon7269 on 2018. 3. 2..
 */

public class MyAdapter extends RecyclerView.Adapter<ViewHolder> {

    private List<ListItem> listItems;
    private Context context;

    public MyAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.list_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final ListItem listItem = listItems.get(position);

        holder.list_title.setText(listItem.getList_title());
        holder.list_desc.setText(listItem.getList_desc());


        final String list_title = listItem.getList_title();
        final String list_desc = listItem.getList_desc();

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(int position) {
                 // Toast.makeText(context, list_title, Toast.LENGTH_SHORT).show();
                openDetailActivity(list_title, list_desc);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    private void openDetailActivity(String title, String desc) {

        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra("title", title);
        intent.putExtra("desc", desc);

        context.startActivity(intent);

    }

}






