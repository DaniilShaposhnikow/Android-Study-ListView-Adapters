package com.hfad.mexicanrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

public class BurritosCategoryActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burritos_category);

        ArrayAdapter<Burritos> listadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Burritos.burritos);
        

    }
}
