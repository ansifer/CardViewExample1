package com.doenough.cardviewexample1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Custom> arrayList;
    private CustomAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        arrayList = new ArrayList<>();
        arrayList.add(new Custom("HELLO"));
        arrayList.add(new Custom("HALLO"));
        arrayList.add(new Custom("CIAO"));
        arrayList.add(new Custom("HOLA"));
        arrayList.add(new Custom("BONJOUR"));
        arrayList.add(new Custom("NAMASTE"));
        arrayList.add(new Custom("SALAAM"));
        arrayList.add(new Custom("OLÀ"));
        arrayAdapter = new CustomAdapter(this, arrayList);
        recyclerView.setAdapter(arrayAdapter);
    }
}
