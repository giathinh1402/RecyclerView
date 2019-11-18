package com.example.recyclerviewthinh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NumberAdapter extends RecyclerView.Adapter<NumberAdapter.NumberViewHolder> {

    List<Integer> arrayNumber;
    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_number,parent,false);
        return new NumberViewHolder(view);

    }
    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder holder, int position) {
        holder.textViewNumber.setText("Number: " + arrayNumber.get(position).toString());
    }
    @Override
    public int getItemCount() {
        return arrayNumber.size();
    }
    public class NumberViewHolder extends RecyclerView.ViewHolder {
        TextView textViewNumber;
        public NumberViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNumber = itemView.findViewById(R.id.text_view_number);
        }
    }
}

