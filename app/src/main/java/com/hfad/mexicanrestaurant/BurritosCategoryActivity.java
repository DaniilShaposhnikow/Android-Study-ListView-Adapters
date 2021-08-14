package com.hfad.mexicanrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class BurritosCategoryActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burritos_category);

        ArrayAdapter<Burritos> listadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Burritos.burritos);
        ListView listburritos = (ListView) findViewById(R.id.listburritos);
        listburritos.setAdapter(listadapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Intent intent = new Intent(BurritosCategoryActivity.this, BurritosCategory.class);
                intent.putExtra(BurritosCategory.EXTRA_BURRITOSID, (int) l);
                startActivity(intent);
            }
        };
        listburritos.setOnItemClickListener(itemClickListener);
    }
}
