package pkg361;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable
{
    private String username;
    private String password;
    private String fName;
    private String lName;
    private ArrayList<Book> bookmarksList;
    
    public User()
    {
        this.username = "username";
        this.password = "password";
        fName = null;
        lName = null;
    }
    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
        fName = null;
        lName = null;
    }
    public User(String username, String password, String fName, String lName)
    {
        this.username = username;
        this.password = password;
        this.fName = fName;
        this.lName = lName;
    }
    
    public void addBookmark(Book toAdd)
    {
        System.out.println("Add to bookmark: " + toAdd.getTitle());
    }
    
    public boolean isEqual(String username, String password)
    {
        return (username.equals(this.username) && password.equals(this.password));
    }
    
    public ArrayList<Book> getBookmarksList()
    {
        return bookmarksList;
    }

    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public String getfName()
    {
        return fName;
    }
    public void setfName(String fName)
    {
        this.fName = fName;
    }

    public String getlName()
    {
        return lName;
    }
    public void setlName(String lName)
    {
        this.lName = lName;
    }
    
}
