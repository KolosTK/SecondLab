package org.example;

interface Manageable {
    public void add(Item item);
    public void remove(Item item);
    public void listBorrowed();
    public void listAvailable();
}
