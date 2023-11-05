package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private Library lib;
    private Book book1;
    private Book book2;
    @BeforeEach
    public void setUp()
    {
        lib = new Library();
        book1 = new Book("First chanse","Redric Medison");
        book2 = new Book("Princess","Medit Pierro");

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
   
}