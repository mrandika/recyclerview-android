package org.andika.recyclerku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv_item;
    ItemAdapter adapter;
    ArrayList<ItemModel> itemModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_item = findViewById(R.id.rv_item);
        itemModels = new ArrayList<>();
        itemModels.addAll(ItemDummy.getAllData());

        adapter = new ItemAdapter(this);
        adapter.setItemModels(itemModels);

        rv_item.setLayoutManager(new LinearLayoutManager(this));
        rv_item.setAdapter(adapter);
    }
}
