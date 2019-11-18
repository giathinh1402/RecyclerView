package com.example.recyclerviewthinh;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewNumbers;
    List<Integer> arrayNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewNumbers = findViewById(R.id.Recycler_Number);
        recyclerViewNumbers.setLayoutManager(new LinearLayoutManager(this));

        final List<Integer> arrayNumbers = new ArrayList<Integer>();

        for (int i = 1; i <= 100; i++){
            arrayNumbers.add(i);
        }
        NumberAdapter numberAdapter = new NumberAdapter();
        recyclerViewNumbers.setAdapter(numberAdapter);
        numberAdapter.arrayNumber = arrayNumbers;
        numberAdapter.notifyDataSetChanged();

    }
}
