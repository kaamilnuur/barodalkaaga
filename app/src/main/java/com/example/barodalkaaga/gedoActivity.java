package com.example.barodalkaaga;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class gedoActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<degmamodel> degmamodelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gedo);
        recyclerView=findViewById(R.id.recyclerview_gedo);
        degmamodelArrayList=new ArrayList<>();
        degmamodelArrayList.add(new degmamodel("1:Garbahaarey caasimada gobolka"+"\n"+"2:luuq"
                +"\n"+"3:doolow"+"\n"+"4:beledxaaawo"+"\n"+"5:ceelwaaq"+"\n"+"5:baardheere" ));
        degmadapter adapter=new degmadapter(degmamodelArrayList,this);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}