package com.example.barodalkaaga;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class jubadahoosweActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<degmamodel> degmamodelArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jubadahooswe);
        recyclerView=findViewById(R.id.recyclerview_jubadahoose);
        degmamodelArrayList=new ArrayList<>();
        degmamodelArrayList.add(new degmamodel("1:kismaayo caasimada gobolka"+"\n"+"2:afmadow"
                +"\n"+"3:badhaade"+"\n"+"4:jamaame"));
        degmadapter adapter=new degmadapter(degmamodelArrayList,this);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}