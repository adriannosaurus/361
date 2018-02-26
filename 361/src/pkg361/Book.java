package pkg361;

import java.io.Serializable;
import java.util.*;
import javafx.scene.image.ImageView;

// Figure out how to link images in <default package> to each textbook

public class Book implements Serializable
{
    private String title;
    private String isbn;
    private String author;
    private String edition;
    private double price;
    
    public Book()
    {
        this.title = "";
        this.isbn = "";
        this.author = "";
        this.edition = "";
        this.price = 0.0;
    }
    
    public Book(String title, String isbn, String author, String edition, double price)
    {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.edition = edition;
        this.price = price;
    }

    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getIsbn()
    {
        return isbn;
    }
    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getEdition()
    {
        return edition;
    }
    public void setEdition(String edition)
    {
        this.edition = edition;
    }
    
    public double setPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
}
