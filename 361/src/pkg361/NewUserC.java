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
    
    private UserList listOfUsers;
    private User newUser;
    
    //CONSTRUCTOR
    public NewUserC(Stage stage)
    {
        this.stage = stage;
        setNewUserScene(stage);
    }
    
    //SET SCENE
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
    
    //NAVIGATION
    public void goToLogin()
    {
        theLoginC = new LoginC(this.stage);
    }
    public void goToSearch(User newUser)
    {
        this.newUser = newUser;
        SearchC theSearchC = new SearchC (this.stage, newUser);
    }
}
