package iit.oop.association;

import java.util.List;

class Library {
    private List<Book> books;
 
    Library(List<Book> books)
    {
 
        this.books = books;
    }
    public List<Book> getTotalBooksInLibrary()
    {
 
        return books;
    }
}
