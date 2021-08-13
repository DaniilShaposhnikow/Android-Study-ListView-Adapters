package com.hfad.mexicanrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NachosCategoryActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nachos_category);

        //Создание Адаптера

        ArrayAdapter<Nachos> listadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Nachos.nachos);
        ListView list_nachos_activity = (ListView) findViewById(R.id.list_nachos_activity);
        list_nachos_activity.setAdapter(listadapter);

        //Создание слушателя

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Intent intent = new Intent(NachosCategoryActivity.this, NachosActivity.class);
                intent.putExtra(NachosActivity.EXTRA_NACHOSID, (int) l);
                startActivity(intent);
            }
        };

        //Связываем слушатель со списком
        list_nachos_activity.setOnItemClickListener(itemClickListener);
    }
}