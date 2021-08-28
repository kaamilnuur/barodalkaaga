package com.example.barodalkaaga;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class shabeeladahooseActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<degmamodel> degmamodelArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shabeeladahoose);
        recyclerView=findViewById(R.id.recyclerview_shabeela);
        degmamodelArrayList=new ArrayList<>();
        degmamodelArrayList.add(new degmamodel("1:marka caasimada gobolka"+"\n"+"2:Af-gooye"
                +"\n"+"3:walaweyn"+"\n"+"4:baraawe"+"\n"+"5:kuntu waarey"
                +"\n"+"6:sablaale"));
        degmadapter adapter=new degmadapter(degmamodelArrayList,this);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}