package com.example.myfirstapp.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.myfirstapp.R;
import com.example.myfirstapp.listview.CustomAdapter;

public class ListViewActivity extends AppCompatActivity {

    private static final int DATASET_COUNT = 50;

    private RecyclerView recyclerView;

    private ListDataModel[] data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        recyclerView = findViewById(R.id.list_view_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        initDataset();

        recyclerView.setAdapter(new CustomAdapter(data));
    }

    /**
     * Generates Strings for RecyclerView's adapter. This data would usually come
     * from a local content provider or remote server.
     */
    private void initDataset() {
        data = new ListDataModel[DATASET_COUNT];
        for (int i = 0; i < DATASET_COUNT; i++) {
            data[i] = new ListDataModel("This is element #" + i, "Details for element #" + i);
        }
    }

}
