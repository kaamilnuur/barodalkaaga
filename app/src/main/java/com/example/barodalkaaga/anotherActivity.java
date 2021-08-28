package com.example.barodalkaaga;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class anotherActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
   private ArrayList<degmamodel> degmamodelArrayList;
;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        recyclerView=findViewById(R.id.recyclerview_degma);
        degmamodelArrayList=new ArrayList<>();
        degmamodelArrayList.add(new degmamodel("1:cabdi casiis"+"\n"+"2:Boondheere"
                +"\n"+"3:Dayniile"+"\nn"+"4:Hodan"+"\nn"+"5:Kaaran"
                +"\n"+"6:yaaqshiid"+"\n"+"7:Howl-wadaag"+"\n"+"8:Shibis"+"\n"+"9:Warta nabada"
                +"\n"+"10:Hiliwaa"+"\n"+"11Kaxad"+"\n"+"12:xamarweyne"
                +"\n"+"13:xamar jajab"+"\n"+"14:Dharkaynley"+"\n"+"15:wadajir"+"\n"+"16Waberi"+"\n"+"17Shangaani" ));
               degmadapter adapter=new degmadapter(degmamodelArrayList,this);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}