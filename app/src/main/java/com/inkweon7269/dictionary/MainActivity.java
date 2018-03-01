package com.inkweon7269.dictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView btn_fruit;
    TextView btn_vegetable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_fruit = (TextView) findViewById(R.id.btn_fruit);
        btn_vegetable = (TextView) findViewById(R.id.btn_vegetable);

        btn_fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), FruitActivity.class);
                startActivity(intent);

            }
        });

        btn_vegetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), VegetableActivity.class);
                startActivity(intent);

            }
        });

    }
}
