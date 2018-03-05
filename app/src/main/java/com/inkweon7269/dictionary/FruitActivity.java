package com.inkweon7269.dictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.inkweon7269.dictionary.mRecyclerView.ListItem;
import com.inkweon7269.dictionary.mRecyclerView.MyAdapter;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class FruitActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

        recyclerView = (RecyclerView) findViewById(R.id.fruit_recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

        String json = null;

        try {

            InputStream is = getAssets().open("dictionary.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");


            JSONObject jsonObject = new JSONObject(json);
            JSONArray array = jsonObject.getJSONArray("fruit");

            for(int i = 0; i < array.length(); i++) {

                JSONObject o = array.getJSONObject(i);
                ListItem item = new ListItem(
                        o.getString("title"),
                        o.getString("desc")
                );

                listItems.add(item);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        adapter = new MyAdapter(listItems, this);
        recyclerView.setAdapter(adapter);

    }
}