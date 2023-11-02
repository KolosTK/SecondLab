package org.example;

abstract class Item {
    private String title;
    private String uniqueID;
    private boolean isBorrowed = false;

    public abstract void borrowItem();
    public abstract void returnItem();

}
