package pkg361;

import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class SearchC
{
    private Stage stage;
    private SearchUIC theSearchUIC;
    private LoginC theLoginC;
    BookList bookListClass;
    ArrayList<Book> localListOfBooks;
    
    public SearchC(Stage stage)
    {
        this.stage = stage;
        bookListClass = new BookList();
        setSearchScene(stage);
    }
    
    public void setSearchScene(Stage stage)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SearchUI.fxml"));
            Parent search = loader.load();
            theSearchUIC = loader.getController();
            theSearchUIC.setSearchC(this);
            Scene scene = new Scene(search);
            stage.setScene(scene);
            stage.show();            
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public int getSearchType(String input)
    {
        String searchTerm = input;
        char first = searchTerm.charAt(0);
        char mid = searchTerm.charAt(1);
        char last = searchTerm.charAt(searchTerm.length() - 1);
        if (Character.isDigit(first) && Character.isDigit(last) && Character.isDigit(mid))//input.charAt(0)))
        {
            return 1;
        }
        else if (Character.isLetter(first) || Character.isLetter(mid))//input.charAt(0)))
        {
            return 2;
        }
        else
        {
            System.out.println("You done did an oops");
            return 0;
        }
    }
    
    public Book searchByIsbn(String in)
    {      
        String searchISBN = "";
        Book toReturn = new Book();
        localListOfBooks = bookListClass.getListOfBooks();
             
        for (int i = 0; i < in.length(); ++i)
        {
            char x = in.charAt(i);
            if (Character.isDigit(x))
            {
                searchISBN += x;
            }
        }
        
        System.out.println(searchISBN + "\n");
        
        for (int i = 0; i < localListOfBooks.size(); ++i)
        {
            String tempISBN = localListOfBooks.get(i).getIsbn();
            
            if(tempISBN.contains(in))
            {
                toReturn = localListOfBooks.get(i);
            }
        }
        
        if(toReturn.equals(null))
        {
            toReturn = new Book();
        }
        
        return toReturn;
    }
    
    public Book searchByTitle(String in)
    {        
        String searchTerm = in.toLowerCase();
        Book toReturn = new Book();
        System.out.println(in + "\n");
        localListOfBooks = bookListClass.getListOfBooks();
        
        for (int i = 0; i < localListOfBooks.size(); ++i)
        {
            String tempBookName = localListOfBooks.get(i).getTitle().toLowerCase();
            
            if(tempBookName.contains(in))
            {
                toReturn = localListOfBooks.get(i);
            }
        }
        
        if(toReturn.equals(null))
        {
            toReturn = new Book();
        }
        
        return toReturn;
    }
    
    public void goToLogin()
    {
        theLoginC = new LoginC(this.stage);
    }
    
    public void goToBookmarks()
    {
        ProfileC theProfileC = new ProfileC(this.stage);
    }

}