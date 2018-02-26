package pkg361;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BookmarkC
{
    private Stage stage;
    private BookmarkUIC theBookmarkUIC;
    
    public BookmarkC(Stage stage)
    {
        this.stage = stage;
        setBookmarkScene(this.stage);
    }
    
    public void setBookmarkScene(Stage stage)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BookmarkUI.fxml"));
            Parent login = loader.load();
            theBookmarkUIC = loader.getController();
            theBookmarkUIC.setBookmarkC(this);
            Scene scene = new Scene(login);
            stage.setScene(scene);
            stage.show();            
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
