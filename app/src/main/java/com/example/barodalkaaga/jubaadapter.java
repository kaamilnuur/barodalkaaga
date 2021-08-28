package com.example.barodalkaaga;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class jubaadapter  extends RecyclerView.Adapter<jubaadapter.myviewholder> {
    private ArrayList<degmamodel>degmamodelArrayList;
    Context context;

    public jubaadapter(ArrayList<degmamodel> degmamodelArrayList, Context context) {
        this.degmamodelArrayList = degmamodelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view=LayoutInflater.from(context).inflate(R.layout.list_degma_recyclerviiew,parent,false);

        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
       holder.degmo.setText(degmamodelArrayList.get(position).getDegmooyinka());
    }

    @Override
    public int getItemCount() {
        return degmamodelArrayList.size();
    }

    public class myviewholder extends RecyclerView.ViewHolder {

        TextView degmo;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            degmo=itemView.findViewById(R.id.degmo);

        }
    }
}
