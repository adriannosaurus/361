package pkg361;

import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class NewUserC
{
    private Stage stage;
    private NewUserUIC theNewUserUIC;
    
    private LoginC theLoginC;
    private SearchC theSearchC;
    
    public NewUserC(Stage stage)
    {
        this.stage = stage;
        setNewUserScene(stage);
    }
    
    public void setNewUserScene(Stage stage)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("NewUserUI.fxml"));
            Parent parent = loader.load();
            theNewUserUIC = loader.getController();
            theNewUserUIC.setNewUserC(this);
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.show();            
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public void goToLogin()
    {
        theLoginC = new LoginC(this.stage);
    }
    
    public void goToSearch()
    {
        SearchC theSearchC = new SearchC (this.stage);
    }
}
