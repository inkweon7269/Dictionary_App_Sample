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

        listItems.add(new ListItem("사과", "사과는 사과나무에서 나는 과일입니다."));
        listItems.add(new ListItem("배", "배는 배나무에서 나는 과일입니다."));
        listItems.add(new ListItem("포도", "포도는 포도나무에서 나는 과일입니다."));
        listItems.add(new ListItem("수박", "수박은 수박나무에서 나는 과일입니다."));
        listItems.add(new ListItem("귤", "귤은 귤나무에서 나는 과일입니다."));
        listItems.add(new ListItem("멜론", "멜론은 귤나무에서 나는 과일입니다."));
        listItems.add(new ListItem("참외", "참외는 참외나무에서 나는 과일입니다."));

        adapter = new MyAdapter(listItems, this);
        recyclerView.setAdapter(adapter);

    }
}