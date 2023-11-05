package org.example;

import java.util.ArrayList;
import java.util.List;
public class Customer {
    Customer(String name)
    {
        this.name=name;
        ID++;
        borrowedItems = new ArrayList<Item>();
    }

    private String name;
    private static int ID = 0;
    private List<Item> borrowedItems ;

    public void returnItem (Item item)
    {
        borrowedItems.remove(item);
    }
    public void borrowItem(Item item)
    {

        borrowedItems.add(item);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public List<Item> getBorrowedItems() {
        return borrowedItems;
    }

    public void setBorrowedItems(List<Item> borrowedItems) {
        this.borrowedItems = borrowedItems;
    }
}
