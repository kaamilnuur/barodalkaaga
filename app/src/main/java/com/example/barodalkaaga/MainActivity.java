package com.example.barodalkaaga;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        RecyclerView recyclerView1;
        ArrayList<model>arrayList;
        myadapter myadapter;
        EditText   searching;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView1=findViewById(R.id.recyclerview1);
        searching=findViewById(R.id.search);
        searching.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
              filter(s.toString());
            }
        });

        arrayList=new ArrayList<>();
        arrayList.add(new model("Banaadir","1"));
        arrayList.add(new model("Mudug","2"));
        arrayList.add(new model("Baay","3"));
        arrayList.add(new model("Bakool","4"));
        arrayList.add(new model("Sool","5"));
        arrayList.add(new model("Sanaag","6"));
        arrayList.add(new model("Galgaduud","7"));
        arrayList.add(new model("Togdheer","8"));
        arrayList.add(new model("Awdal","9"));
        arrayList.add(new model("Shabeelada hoose","10"));
        arrayList.add(new model("Shabeelada dhexe","11"));
        arrayList.add(new model("Jubbada hoose","12"));
        arrayList.add(new model("Jubbada dhexe","13"));
        arrayList.add(new model("Gedo","14"));
        arrayList.add(new model("Hiiraan","15"));
        arrayList.add(new model("Waqooyi galbeed","16"));
        arrayList.add(new model("Nugaal","17"));
        arrayList.add(new model("Bari","18"));
         myadapter=new myadapter(arrayList,this);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
       recyclerView1.setLayoutManager(linearLayoutManager);
       recyclerView1.setAdapter(myadapter);

    }

    private void filter(String text) {
        ArrayList<model>filterlist=new ArrayList<>();
        for (model item:arrayList){
            if (item.getMagacagobolka().toLowerCase().contains(text.toLowerCase())){
                filterlist.add(item);
            }
        }
        myadapter.filter(filterlist);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        MenuItem searchItem=menu.findItem(R.id.searching);
        SearchView searchView= (SearchView) searchItem.getActionView();
        searchView.setQueryHint("search here");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.about){
            aboutActivity();
        }
        return super.onOptionsItemSelected(item);
    }

    private void aboutActivity() {
        Intent intent=new Intent(MainActivity.this,aboutActivity.class);
        startActivity(intent);
    }
}