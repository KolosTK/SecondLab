package org.example;

abstract class Item {
    Item()
    {
        uniqueID++;
    }
    private String title;
    private static int uniqueID = 0;
    private boolean isBorrowed = false;

    public abstract void borrowItem();
    public abstract void returnItem();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}
