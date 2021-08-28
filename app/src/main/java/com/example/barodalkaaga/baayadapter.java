package com.example.barodalkaaga;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class  baayadapter extends RecyclerView.Adapter<baayadapter.myviewholder> {
    private ArrayList<degmamodel> degmamodelArrayList;
    Context context;

    public baayadapter(ArrayList<degmamodel> degmamodelArrayList, Context context) {
        this.degmamodelArrayList = degmamodelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public baayadapter.myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.list_degma_recyclerviiew,parent,false);

        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull baayadapter.myviewholder holder, int position) {
        holder.degma.setText(degmamodelArrayList.get(position).getDegmooyinka());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class myviewholder extends RecyclerView.ViewHolder {

        TextView  degma;
        public myviewholder(@NonNull View itemView) {
            super(itemView);

            degma=itemView.findViewById(R.id.degmo);
        }
    }
}
