package com.example.barodalkaaga;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class awdaladapter extends RecyclerView.Adapter<awdaladapter.myviewholdere> {

    private ArrayList<degmamodel> degmamodelArrayList;
    Context context;

    public awdaladapter(ArrayList<degmamodel> degmamodelArrayList, Context context) {
        this.degmamodelArrayList = degmamodelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public myviewholdere onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.list_degma_recyclerviiew,parent,false);

        return new myviewholdere(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholdere holder, int position) {
         holder.degma.setText(degmamodelArrayList.get(position).getDegmooyinka());
    }

    @Override
    public int getItemCount() {
        return degmamodelArrayList.size();
    }

    public class myviewholdere extends RecyclerView.ViewHolder {

        TextView degma;
        public myviewholdere(@NonNull View itemView) {
            super(itemView);
            degma=itemView.findViewById(R.id.degmo);
        }
    }
}
