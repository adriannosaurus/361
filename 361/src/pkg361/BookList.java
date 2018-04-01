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
        localListOfBooks.add(new Book("Amazon", "HTML and CSS: Design and Build Websites", "9781118008188", "Jon Duckett", "Edition 1", 29.99, "HTML.jpg"));
        localListOfBooks.add(new Book("Amazon", "Living Language: Dothraki", "9780804160865", "David J. Peterson", "Edition 1", 19.99, "Dothraki.jpg"));
        localListOfBooks.add(new Book("Amazon", "Android Programming: The Big Nerd Ranch Guide", "9780134706054", "Bill Phillips, Chris Stewart, Kristin Marsicano", "Edition 3", 49.99, "Android.jpg"));
        localListOfBooks.add(new Book("Amazon", "Life Themes: An Anthology of Plays for the Theatre", "9781285463575", "Robert Barton, Annie McGregor", "Edition 2", 15.99, "Life Themes.jpg"));
        localListOfBooks.add(new Book("Amazon", "Computer Networking: A Top-Down Approach", "9780132856201", "Jim Kurose, Keith Ross", "Edition 6", 69.99, "Networking.jpg"));
        localListOfBooks.add(new Book("Amazon", "Charlas de Sobremesa: Conversación en Español", "9780300191622", "Teresa Carballal, Margarita Ribas Groeger", "Edition 1", 59.99, "Charlas.jpg"));
        
        localListOfBooks.add(new Book("Barnes & Noble", "HTML and CSS: Design and Build Websites", "9781118008188", "Jon Duckett", "Edition 1", 34.99, "HTML.jpg"));
        localListOfBooks.add(new Book("Barnes & Noble", "Living Language: Dothraki", "9780804160865", "David J. Peterson", "Edition 1", 19.99, "Dothraki.jpg"));
        localListOfBooks.add(new Book("Barnes & Noble", "Android Programming: The Big Nerd Ranch Guide", "9780134706054", "Bill Phillips, Chris Stewart, Kristin Marsicano", "Edition 3", 49.99, "Android.jpg"));
        localListOfBooks.add(new Book("Barnes & Noble", "Life Themes: An Anthology of Plays for the Theatre", "9781285463575", "Robert Barton, Annie McGregor", "Edition 2", 19.99, "Life Themes.jpg"));
        localListOfBooks.add(new Book("Barnes & Noble", "Computer Networking: A Top-Down Approach", "9780132856201", "Jim Kurose, Keith Ross", "Edition 6", 69.99, "Networking.jpg"));
        localListOfBooks.add(new Book("Barnes & Noble", "Charlas de Sobremesa: Conversación en Español", "9780300191622", "Teresa Carballal, Margarita Ribas Groeger", "Edition 1", 69.99, "Charlas.jpg"));
        
        localListOfBooks.add(new Book("Chegg", "HTML and CSS: Design and Build Websites", "9781118008188", "Jon Duckett", "Edition 1", 29.99, "HTML.jpg"));
        localListOfBooks.add(new Book("Chegg", "Android Programming: The Big Nerd Ranch Guide", "9780134706054", "Bill Phillips, Chris Stewart, Kristin Marsicano", "Edition 3", 49.99, "Android.jpg"));
        localListOfBooks.add(new Book("Chegg", "Life Themes: An Anthology of Plays for the Theatre", "9781285463575", "Robert Barton, Annie McGregor", "Edition 2", 16.99, "Life Themes.jpg"));
        localListOfBooks.add(new Book("Chegg", "Charlas de Sobremesa: Conversación en Español", "9780300191622", "Teresa Carballal, Margarita Ribas Groeger", "Edition 1", 64.99, "Charlas.jpg"));
        
        localListOfBooks.add(new Book("Cengage", "HTML and CSS: Design and Build Websites", "9781118008188", "Jon Duckett", "Edition 1", 27.99, "HTML.jpg"));
        localListOfBooks.add(new Book("Cengage", "Android Programming: The Big Nerd Ranch Guide", "9780134706054", "Bill Phillips, Chris Stewart, Kristin Marsicano", "Edition 3", 49.99, "Android.jpg"));
        localListOfBooks.add(new Book("Cengage", "Life Themes: An Anthology of Plays for the Theatre", "9781285463575", "Robert Barton, Annie McGregor", "Edition 2", 17.99, "Life Themes.jpg"));
        localListOfBooks.add(new Book("Cengage", "Computer Networking: A Top-Down Approach", "9780132856201", "Jim Kurose, Keith Ross", "Edition 6", 69.99, "Networking.jpg"));
        localListOfBooks.add(new Book("Cengage", "Charlas de Sobremesa: Conversación en Español", "9780300191622", "Teresa Carballal, Margarita Ribas Groeger", "Edition 1", 64.99, "Charlas.jpg"));
        
        localListOfBooks.add(new Book("HUB Bookstore", "HTML and CSS: Design and Build Websites", "9781118008188", "Jon Duckett", "Edition 1", 29.99, "HTML.jpg"));
        localListOfBooks.add(new Book("HUB Bookstore", "Android Programming: The Big Nerd Ranch Guide", "9780134706054", "Bill Phillips, Chris Stewart, Kristin Marsicano", "Edition 3", 49.99, "Android.jpg"));
        localListOfBooks.add(new Book("HUB Bookstore", "Life Themes: An Anthology of Plays for the Theatre", "9781285463575", "Robert Barton, Annie McGregor", "Edition 2", 19.99, "Life Themes.jpg"));
        localListOfBooks.add(new Book("HUB Bookstore", "Computer Networking: A Top-Down Approach", "9780132856201", "Jim Kurose, Keith Ross", "Edition 6", 69.99, "Networking.jpg"));
        localListOfBooks.add(new Book("HUB Bookstore", "Charlas de Sobremesa: Conversación en Español", "9780300191622", "Teresa Carballal, Margarita Ribas Groeger", "Edition 1", 64.99, "Charlas.jpg"));
        
        localListOfBooks.add(new Book("Downtown Bookstore", "HTML and CSS: Design and Build Websites", "9781118008188", "Jon Duckett", "Edition 1", 24.99, "HTML.jpg"));
        localListOfBooks.add(new Book("Downtown Bookstore", "Android Programming: The Big Nerd Ranch Guide", "9780134706054", "Bill Phillips, Chris Stewart, Kristin Marsicano", "Edition 3", 49.99, "Android.jpg"));
        localListOfBooks.add(new Book("Downtown Bookstore", "Life Themes: An Anthology of Plays for the Theatre", "9781285463575", "Robert Barton, Annie McGregor", "Edition 2", 13.99, "Life Themes.jpg"));
        localListOfBooks.add(new Book("Downtown Bookstore", "Computer Networking: A Top-Down Approach", "9780132856201", "Jim Kurose, Keith Ross", "Edition 6", 39.99, "Networking.jpg"));
        localListOfBooks.add(new Book("Downtown Bookstore", "Charlas de Sobremesa: Conversación en Español", "9780300191622", "Teresa Carballal, Margarita Ribas Groeger", "Edition 1", 49.99, "Charlas.jpg"));
                
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
