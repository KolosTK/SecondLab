package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    private Customer customer;
    private Book book1;
    private Book book2;
    private DVD dvd;
    private Library lib;
    List<Item> testItem;
    @BeforeEach
    public void setUp()
    {
        customer = new Customer("Stiven");
        lib = new Library();
        book1 = new Book ("Dead poet society","Robin Williams");
        book2 = new Book ("Nice","Roberto Entonino");
        dvd = new DVD ("Enkacio",213);
        testItem = new ArrayList<Item>();

    }
    @Test
    public void testReturnItem()
    {
        testItem.add(book2);
        testItem.add(dvd);

        customer.borrowItem(book1);
        customer.borrowItem(book2);
        customer.borrowItem(dvd);

        customer.returnItem(book1);

        assertEquals(testItem,customer.getBorrowedItems());

    }
    @Test
    public void testBorrowItem()
    {
        testItem.add(book1);
        testItem.add(book2);
        testItem.add(dvd);

        customer.borrowItem(book1);
        customer.borrowItem(book2);
        customer.borrowItem(dvd);

        assertEquals(testItem,customer.getBorrowedItems());
    }
    @Test
    public void testIsNotBorrowItem()
    {
        testItem.add(book1);
        testItem.add(dvd);

        customer.borrowItem(book1);
        customer.borrowItem(book2);
        customer.borrowItem(dvd);

        assertNotEquals(testItem,customer.getBorrowedItems());
    }

}