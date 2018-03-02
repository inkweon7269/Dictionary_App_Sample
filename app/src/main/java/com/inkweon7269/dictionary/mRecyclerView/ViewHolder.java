package com.inkweon7269.dictionary.mRecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.inkweon7269.dictionary.R;

/**
 * Created by inkweon7269 on 2018. 3. 2..
 */

public class ViewHolder extends RecyclerView.ViewHolder {

    public TextView list_title;
    public TextView list_desc;

    public ViewHolder(View itemView) {
        super(itemView);

        list_title = (TextView) itemView.findViewById(R.id.list_title);
        list_desc = (TextView) itemView.findViewById(R.id.list_desc);

    }

}