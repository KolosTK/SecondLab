package org.example;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

class LibraryTest {

    private Library lib;
    private Book book1;
    private Book book2;
    private DVD dvd;
    private Customer customer;
    private List<Item> testItem;

    @BeforeEach
    public void setUp()
    {
        lib = new Library();
        book1 = new Book("First chanse","Redric Medison");
        book2 = new Book("Princess","Medit Pierro");
        dvd = new DVD("Alaska",123);
        customer = new Customer ("Tomas");
        testItem = new ArrayList<Item>();

    }

    @Test
    void testAdd() {
        assertEquals(0, lib.getItems().size());
        lib.add(book1);
        assertEquals(1, lib.getItems().size());
        assertTrue(lib.getItems().contains(book1));
    }

    @Test
    void testRemove() {
        lib.add(book1);
        lib.add(book2);
        assertEquals(2,lib.getItems().size());
        lib.remove(book2);
        assertEquals(1,lib.getItems().size());
        assertFalse(lib.getItems().contains(book2));
    }
    @Test
    void testLendItem()
    {
        testItem.add(book1);
        testItem.add(book2);

        lib.lendItem(customer,book1);
        lib.lendItem(customer,book2);

        assertTrue(book1.isBorrowed());
        assertFalse(dvd.isBorrowed());
        assertEquals(testItem,customer.getBorrowedItems());
    }
    @Test
    void testReturnItem()
    {
        testItem.add(book1);

        lib.lendItem(customer,book1);
        lib.lendItem(customer,book2);

        lib.returnItem(customer,book2);

        assertTrue(book1.isBorrowed());
        assertFalse(book2.isBorrowed());

        assertEquals(customer.getBorrowedItems(),testItem);
    }
    /*@Test
    void testListBorrowed() {
        System.setOut(new PrintStream(outContent));
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        book2.setBorrowed(true);
        lib.add(book1);
        lib.add(book2);
        lib.ListAvailable();
        assertEquals("Princess", outContent.toString());
    }*/


}