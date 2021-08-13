package com.hfad.mexicanrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NachosActivity extends AppCompatActivity
{
    public static final  String EXTRA_NACHOSID = "nachosid";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nachos);

        int nachID = (Integer)getIntent().getExtras().get(EXTRA_NACHOSID);
        Nachos nachos = Nachos.nachos[nachID];

        TextView name = (TextView) findViewById (R.id.name);
        name.setText(nachos.getName());

        TextView desc = (TextView) findViewById(R.id.description);
        desc.setText(nachos.getDescription());

        ImageView photo = (ImageView) findViewById (R.id.photo);
        photo.setImageResource(nachos.getImageResourceID());
        photo.setContentDescription(nachos.getName());
    }
}