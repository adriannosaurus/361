package pkg361;

import java.io.*;
import java.util.*;

public class BookList implements Serializable
{
    private ArrayList<Book> listOfBooks = null;
    private String listOfBooksFileName;
    
    public BookList()
    {
        listOfBooks = getDummyData();
    }
    
    public ArrayList<Book> getDummyData()
    {
        ArrayList<Book> localListOfBooks = new ArrayList();
        /*0*/localListOfBooks.add(new Book("Amazon", "HTML and CSS: Design and Build Websites", "9781118008188", "Jon Duckett", "Edition 1", 29.99, "HTML.jpg"));
        /*1*/localListOfBooks.add(new Book("Chegg", "Living Language: Dothraki", "9780804160865", "David J. Peterson", "Edition 1", 19.99, "Dothraki.jpg"));
        /*2*/localListOfBooks.add(new Book("Amazon", "Android Programming: The Big Nerd Ranch Guide", "9780134706054", "Bill Phillips, Chris Stewart, Kristin Marsicano", "Edition 3", 49.99, "Android.jpg"));
        /*3*/localListOfBooks.add(new Book("Barnes and Noble", "Life Themes: An Anthology of Plays for the Theatre", "9781285463575", "Robert Barton, Annie McGregor", "Edition 2", 19.99, "Life Themes.jpg"));
        /*4*/localListOfBooks.add(new Book("Cengage", "Computer Networking: A Top-Down Approach", "9780132856201", "Jim Kurose, Keith Ross", "Edition 6", 69.99, "Networking.jpg"));
        /*5*/localListOfBooks.add(new Book("Amazon", "Charlas de Sobremesa: Conversación en Español", "9780300191622", "Teresa Carballal, Margarita Ribas Groeger", "Edition 1", 64.99, "Charlas.jpg"));
        
        return localListOfBooks;
    }

    public ArrayList<Book> getListOfBooks()
    {
        return listOfBooks;
    }

    public void setListOfBooks(ArrayList<Book> listOfBooks)
    {
        this.listOfBooks = listOfBooks;
    }
}
