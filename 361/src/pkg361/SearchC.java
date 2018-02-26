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
    BookList bookListClass;
    ArrayList<Book> localListOfBooks;
    
    public SearchC(Stage stage)
    {
        this.stage = stage;
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
        char mid = searchTerm.charAt(5);
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
            System.out.println("You done messed up");
            return 0;
        }
    }
    
    public String searchByIsbn(String in)
    {
        String searchIsbn = "";
        Book bookToReturn = new Book();
        System.out.println("Original string: " + in);        
        for (int i = 0; i < in.length(); ++i)
        {
            char x = in.charAt(i);
            if (Character.isDigit(x))
            {
                searchIsbn += x;
            }
        }
        System.out.println("Concat: " + searchIsbn);
        return searchIsbn;
    }
    
    public Book searchByTitle(String in)
    {
        String searchTerm = in; //input
        System.out.println("SearchC search term: " + in);
        return new Book();
    }
    
    public void goToLogin()
    {
        LoginC theLoginC = new LoginC(this.stage);
    }
    
    public void goToBookmarks()
    {
        BookmarkC theBookmarkC = new BookmarkC(this.stage);
    }

}
