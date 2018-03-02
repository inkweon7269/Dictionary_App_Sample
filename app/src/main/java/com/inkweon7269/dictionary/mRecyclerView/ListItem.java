package com.inkweon7269.dictionary.mRecyclerView;

/**
 * Created by inkweon7269 on 2018. 3. 2..
 */

public class ListItem {

    private String list_title;
    private String list_desc;

    public ListItem(String list_title, String list_desc) {
        this.list_title = list_title;
        this.list_desc = list_desc;
    }

    public String getList_title() {
        return list_title;
    }

    public String getList_desc() {
        return list_desc;
    }

}