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

    }
    public void ListAvailable()
    {

    }


}