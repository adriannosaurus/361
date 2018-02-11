package pkg361;

import java.io.Serializable;
import java.util.*;

public class BookList
{
    // Will end up being the databases
    private ArrayList<Book> listOfBooks = new ArrayList();
    
    public BookList()
    {
        listOfBooks = getBookDummyData();
    }
    
    public ArrayList<Book> getBookDummyData()
    {
        listOfBooks.add(new Book("HTML and CSS: Design and Build Websites", "9781118008188", "Jon Duckett", 1, 29.99));
        listOfBooks.add(new Book("Living Language: Dothraki", "9780804160865", "David J. Peterson", 1, 19.99));
        listOfBooks.add(new Book("Android Programming: The Big Nerd Ranch Guide", "9780134706054", "Bill Phillips, Chris Stewart, Kristin Marsicano", 3, 49.99));
        listOfBooks.add(new Book("Life Themes: An Anthology of Plays for the Theatre", "9781285463575", "Robert Barton, Annie McGregor", 2, 19.99));
        listOfBooks.add(new Book("Computer Networking: A Top-Down Approach", "9780132856201", "Jim Kurose, Keith Ross", 6, 69.99));
        listOfBooks.add(new Book("Charlas de Sobremesa: Conversación en Español", "9780300191622", "Teresa Carballal, Margarita Ribas Groeger", 1, 64.99));
        
        return listOfBooks;
    }

}
