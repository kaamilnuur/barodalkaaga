package com.example.barodalkaaga;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myadapter extends RecyclerView.Adapter<myadapter.myviewholder> {
    ArrayList<model>arrayList;
    Context context;
    RecyclerView recyclerView;
    int index;
    ArrayList<degmamodel>degmamodels=new ArrayList<>();
    degmadapter degmadapter;

    public myadapter(ArrayList<degmamodel> degmamodels) {
        this.degmamodels = degmamodels;
    }

    public myadapter(ArrayList<model> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
        this.recyclerView = recyclerView;
    }

    @NonNull
    @Override
    public myadapter.myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.list_recycler_items,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myadapter.myviewholder holder, int position) {
        holder.number.setText(arrayList.get(position).getNumberka());
        holder.goblka.setText(arrayList.get(position).getMagacagobolka());

      holder.itemView.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              switch (position) {
                  case 0:
                  Intent intent = new Intent(context, anotherActivity.class);
                  context.startActivity(intent);
                  break;
                  case 1:
                      Intent intent1 = new Intent(context, mudugActivity.class);
                      context.startActivity(intent1);
                      break;
                  case 2:
                      Intent intent2 = new Intent(context, baayActivity.class);
                      context.startActivity(intent2);
                      break;
                  case 3:
                      Intent intent3 = new Intent(context, bakoolActivity.class);
                      context.startActivity(intent3);
                      break;
                  case 4:
                      Intent intent4 = new Intent(context, soolActivity.class);
                      context.startActivity(intent4);
                      break;
                  case 5:
                      Intent intent5 = new Intent(context, sanaagActivity.class);
                      context.startActivity(intent5);
                      break;
                  case 6:
                      Intent intent6 = new Intent(context, galgaduudActivity.class);
                      context.startActivity(intent6);
                      break;
                  case 7:
                      Intent intent7 = new Intent(context, togdheerActivity.class);
                      context.startActivity(intent7);
                      break;
                  case 8:
                      Intent intent8 = new Intent(context, awdalActivity.class);
                      context.startActivity(intent8);
                      break;
                  case 9:
                      Intent intent9= new Intent(context, shabeeladahooseActivity.class);
                      context.startActivity(intent9);
                      break;
                  case 10:
                      Intent intent10= new Intent(context, shabeeladhexeActivity.class);
                      context.startActivity(intent10);
                      break;
                  case 11:
                      Intent intent11= new Intent(context, jubadahoosweActivity.class);
                      context.startActivity(intent11);
                      break;
                  case 12:
                      Intent intent12= new Intent(context, jubadadhexeActivity.class);
                      context.startActivity(intent12);
                      break;
                  case 13:
                      Intent intent13= new Intent(context, gedoActivity.class);
                      context.startActivity(intent13);
                      break;
                  case 14:
                      Intent intent14= new Intent(context, hiiraanActivity.class);
                      context.startActivity(intent14);
                      break;
                  case 15:
                      Intent intent15= new Intent(context, waqooyiActivity.class);
                      context.startActivity(intent15);
                      break;
                  case 16:
                      Intent intent16= new Intent(context, nugaalActivity.class);
                      context.startActivity(intent16);
                      break;
                  case 17:
                      Intent intent17= new Intent(context,bariActivity.class);
                      context.startActivity(intent17);
                      break;






              }
          }
      });



    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public void filter(ArrayList<model> filterlist) {
      arrayList=filterlist;
      notifyDataSetChanged();
    }



    public class myviewholder extends RecyclerView.ViewHolder {
        TextView  number,goblka;
        CardView cardView;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            number=itemView.findViewById(R.id.number);
            goblka=itemView.findViewById(R.id.gobolka);
            cardView=itemView.findViewById(R.id.card);
        }
    }
}
