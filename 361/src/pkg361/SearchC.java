package pkg361;

import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SearchC
{
    private Stage stage;
    BookList bookListClass;
    private SearchUIC theSearchUIC;
    
    public SearchC(Stage stage)
    {
        this.stage = stage;
        setSearchScene(stage);
    }
    
    public void setSearchScene(Stage stage)
    {
        try{
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
    
    public boolean searchBooks(String input)
    {
        if (Character.isDigit(input.charAt(0)))
        {
            System.out.println("ISBN");
            return true;
        }
        else if (Character.isLetter(input.charAt(0)))
        {
            System.out.println("Title");
            return true;
        }
        return false;
    }

}
