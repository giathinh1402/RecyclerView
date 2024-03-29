package com.example.recyclerstudentview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.StudentAdapter> {
    ArrayList<Student> studentList;

    @NonNull
    @Override
    public StudentAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_row, parent, false);
        return new StudentAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentAdapter holder, int position) {
        holder.nameS.setText(studentList.get(position).nameS);
        holder.score.setText("" + studentList.get(position).score);
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    class StudentAdapter extends RecyclerView.ViewHolder {
        TextView nameS, score;

        public StudentAdapter(@NonNull View itemView) {
            super(itemView);

            nameS = itemView.findViewById(R.id.name);
            score = itemView.findViewById(R.id.score);
        }
    }

}
