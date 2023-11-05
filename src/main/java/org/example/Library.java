package org.example;
import java.util.ArrayList;
import java.util.List;

public class Library implements Manageable{
    private List<Item> items = new ArrayList<Item>();
    private List <Customer> customers=new ArrayList<Customer>();

    public void RegisterCustomer(Customer customer)
    {

    }
    public void LendItem(Customer customer, Item item)
    {

    }
    public void returnItem(Customer customer,Item item)
    {

    }
    public List<Item> getItems()
    {
        return items;
    }
    public void add(Item item)
    {
        items.add(item);
    }
    public void remove(Item item)
    {
        items.remove(item);
    }
    public void ListBorrowed()
    {
        for (Item item:items) {
            if (item.isBorrowed()==true) {
                System.out.println(item.getTitle());
            }
        }
    }
    public void ListAvailable()
    {
        for (Item item:items) {
            if (item.isBorrowed()==false) {
                System.out.println(item.getTitle());
            }
        }
    }



}