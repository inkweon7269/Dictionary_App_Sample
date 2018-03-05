package com.inkweon7269.dictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView detail_title;
    TextView detail_desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        detail_title = (TextView) findViewById(R.id.detail_title);
        detail_desc = (TextView) findViewById(R.id.detail_desc);

        Intent intent = this.getIntent();
        String title = intent.getExtras().getString("title");
        String article = intent.getExtras().getString("desc");

        detail_title.setText(title);
        detail_desc.setText(article);

    }
}