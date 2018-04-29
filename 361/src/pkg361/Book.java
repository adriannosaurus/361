package pkg361;

import java.io.Serializable;
import java.util.*;

public class Book implements Serializable
{
    private String vendor;
    private String title;
    private String shortTitle;
    private String isbn;
    private String author;
    private String edition;
    private double price;
    private String image;
    
    public Book()
    {
        this.vendor = "";
        this.title = "";
        this.shortTitle = "";
        this.isbn = "";
        this.author = "";
        this.edition = "";
        this.price = 0.0;
        this.image = "No.jpg";
    }
    
    public Book(String vendor, String title, String shortTitle, String isbn, String author, String edition, double price, String image)
    {
        this.vendor = vendor;
        this.title = title;
        this.shortTitle = shortTitle;
        this.isbn = isbn;
        this.author = author;
        this.edition = edition;
        this.price = price;
        this.image = image;
    }

    public String getVendor()
    {
        return vendor;
    }
    public void setVendor(String vendor)
    {
        this.vendor = vendor;
    }
    
    public String getShortTitle()
    {
        return shortTitle;
    }
    public void setShortTitle(String shortTitle)
    {
        this.shortTitle = shortTitle;
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
    
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }

    public String getImage()
   {
        return image;
    }
    public void setImage(String image)
    {
        this.image = image;
    }
    
    
}
