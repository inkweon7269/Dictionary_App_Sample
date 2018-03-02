package com.inkweon7269.dictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.inkweon7269.dictionary.mRecyclerView.ListItem;
import com.inkweon7269.dictionary.mRecyclerView.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class VegetableActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetable);

        recyclerView = (RecyclerView) findViewById(R.id.vegetable_recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

        listItems.add(new ListItem("배추", "배추는 배추나무에서 나는 야채입니다."));
        listItems.add(new ListItem("무", "무는 무나무에서 나는 야채입니다."));
        listItems.add(new ListItem("토마토", "토마토는 토마토나무에서 나는 야채입니다."));
        listItems.add(new ListItem("당근", "당근은 당근나무에서 나는 야채입니다."));
        listItems.add(new ListItem("양파", "양파은 양파나무에서 나는 야채입니다."));
        listItems.add(new ListItem("가지", "가지은 가지나무에서 나는 야채입니다."));
        listItems.add(new ListItem("고추", "고추는 고추나무에서 나는 야채입니다."));

        adapter = new MyAdapter(listItems, this);
        recyclerView.setAdapter(adapter);

    }
}