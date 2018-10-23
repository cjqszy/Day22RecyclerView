package com.example.cln62.day22recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<MyDataClass> myDataClassList;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDataClassList = new ArrayList<>();
        createMydata();

        recyclerView = findViewById(R.id.recyclerView);
        myAdapter = new MyAdapter(myDataClassList);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setAdapter(myAdapter);
    }

    private void createMydata() {
        MyDataClass myDataClass = new MyDataClass("a", "b", "c");
        MyDataClass myDataClass2 = new MyDataClass("a", "b2", "c2");
        MyDataClass myDataClass3 = new MyDataClass("a", "b3", "c3");
        MyDataClass myDataClass4 = new MyDataClass("a", "b4", "c4");

        myDataClassList.add(myDataClass);
        myDataClassList.add(myDataClass2);
        myDataClassList.add(myDataClass3);
        myDataClassList.add(myDataClass4);
    }
}
