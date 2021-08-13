package com.hfad.mexicanrestaurant;

public class Nachos
{
    private String Name;
    private String Description;
    private int imageResourceID;

    public static final Nachos [] nachos =
            {
                 new Nachos("Chicken nachos", "The best chicken nachos", R.drawable.chicken),
                 new Nachos("Nachos with salsa and guacamole", "The best Nachos with salsa and guacamole", R.drawable.salsaguacamole),
                 new Nachos("Nachos with cheese sauce", "The best Nachos with cheese sauce", R.drawable.cheese )
            };
    private Nachos (String name, String description, int imageResourceID)
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
