package com.hfad.mexicanrestaurant;

public class Burritos
{
    private String Name;
    private String Description;
    private int imageResourceID;

    public static final Burritos [] burritos =
            {
                    new Burritos ("Chicken Burritos", "The best chicken burritos", R.drawable.chickenbur),
                    new Burritos ("Spicy burrito with minced meat, beans, corn and tomatoes", "Very Hot", R.drawable.tomatoes),
                    new Burritos ("Сhimichanga", "The best chimichanga", R.drawable.chimichanga )
            };
    private Burritos (String name, String description, int imageResourceID)
    {
        this.Name = name;
        this.Description = description;
        this.imageResourceID = imageResourceID;
    }
    public String getDescription ()
    {
        return Description;
    }
    public String getName()
    {
        return Name;
    }
    public int getImageResourceID ()
    {
        return imageResourceID;
    }
    public String toString()
    {
        return this.Name;
    }
}
