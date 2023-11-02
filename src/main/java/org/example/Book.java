package org.example;

public class Book extends Item{

    Book (String titile, String author)
    {
        this.author=author;
        setTitle(title);
        bookId=getUniqueID();
    }
    private int bookId;
    private String author;

    public void borrowItem()
    {

    }
    public void returnItem()
    {

    }
    public void getID()
    {
        System.out.println(bookId);
    }
}
