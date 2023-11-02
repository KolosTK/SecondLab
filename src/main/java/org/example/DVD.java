package org.example;

public class DVD extends Item {
    DVD (String titile, int duration)
    {
        this.duration=duration;
        setTitle(title);
        dvdId=getUniqueID();
    }
    private int dvdId;
    private int duration; //minutes
    public void borrowItem()
    {

    }
    public void returnItem()
    {

    }
    public void getID()
    {
        System.out.println(dvdId);
    }

}
