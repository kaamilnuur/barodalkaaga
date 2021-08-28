package com.example.barodalkaaga;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class soolActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<degmamodel> degmamodelArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sool);
        recyclerView=findViewById(R.id.recyclerview_sool);
        degmamodelArrayList=new ArrayList<>();
        degmamodelArrayList.add(new degmamodel("1:laas caanood gobolka"+"\n"+"2:taleex"
                +"\n"+"3:caynabo"+"\n"+"4:xudun" ));
        degmadapter adapter=new degmadapter(degmamodelArrayList,this);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}