package com.months;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private monthsadapter monthsadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

       monthsadapter = new monthsadapter(this);
        recyclerView.setAdapter(monthsadapter);
        String[] monthsOfTheYear = {"january","february","march","April","May","June","July","August","September","October","November","December"};

       monthsadapter.setMonthsList(monthsOfTheYear);
    }
}
