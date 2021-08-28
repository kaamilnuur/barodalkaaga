package com.example.barodalkaaga;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class waqooyiActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<degmamodel> degmamodelArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waqooyi);
        recyclerView=findViewById(R.id.recyclerview_waqooyi);
        degmamodelArrayList=new ArrayList<>();
        degmamodelArrayList.add(new degmamodel("1:Hargeysa caasimada gobolka"+"\n"+"2:Berbera"
                +"\n"+"3:gebiley"));
        degmadapter adapter=new degmadapter(degmamodelArrayList,this);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}