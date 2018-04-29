package pkg361;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ProfileC
{
    private Stage stage;
    private ProfileUIC theProfileUIC;
    private LoginC theLoginC;
    private User currentUser;
    
    //CONSTRUCTOR
    public ProfileC(Stage stage, User currentUser)
    {
        this.stage = stage;
        this.currentUser = currentUser;
        setProfileScene(this.stage);
    }
    
    //SET SCENE
    public void setProfileScene(Stage stage)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ProfileUI.fxml"));
            Parent parent = loader.load();
            theProfileUIC = loader.getController();
            theProfileUIC.setProfileC(this, currentUser);
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
    public void goToSearch()
    {
        SearchC theSearchC = new SearchC (this.stage, currentUser);
    }
    public void close()
    {
        stage.close();
        System.exit(0);
    }
}
