package org.example;

import java.util.List;
public class Customer {

    private String name;
    private String ID;
    private List<Item> borrowedItems;

    private void returnItem ()
    {

    }
    private void borrowItem()
    {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public List<Item> getBorrowedItems() {
        return borrowedItems;
    }

    public void setBorrowedItems(List<Item> borrowedItems) {
        this.borrowedItems = borrowedItems;
    }
}
