package com.hfad.mexicanrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BurritosCategory extends AppCompatActivity
{
   public static final String EXTRA_BURRITOSID = "burritosid";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burritos_category2);

        int burrID = (Integer) getIntent().getExtras().get(EXTRA_BURRITOSID);
        Burritos burritos = Burritos.burritos[burrID];

        TextView name = (TextView) findViewById (R.id.name1);
        name.setText(burritos.getName());

        TextView desc = (TextView) findViewById(R.id.description1);
        desc.setText(burritos.getDescription());

        ImageView photo = (ImageView) findViewById(R.id.photo1);
        photo.setImageResource(burritos.getImageResourceID());
        photo.setContentDescription(burritos.getName());
    }
}
