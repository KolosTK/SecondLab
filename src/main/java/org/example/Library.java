package org.example;
import java.util.ArrayList;
import java.util.List;

public class Library implements Manageable{
    private List<Item> items = new ArrayList<Item>();
    private List <Customer> customers=new ArrayList<Customer>();

    public void registerCustomer(Customer customer)
    {
        customers.add(customer);
    }
    public void lendItem(Customer customer, Item item)
    {
        customer.borrowItem(item);
        item.setBorrowed(true);
    }
    public void returnItem(Customer customer,Item item)
    {
        customer.returnItem(item);
        item.setBorrowed(false);
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
    public void listBorrowed()
    {
        for (Item item:items) {
            if (item.isBorrowed()==true) {
                System.out.println(item.getTitle());
            }
        }
    }
    public void listAvailable()
    {
        for (Item item:items) {
            if (item.isBorrowed()==false) {
                System.out.println(item.getTitle());
            }
        }
    }



}