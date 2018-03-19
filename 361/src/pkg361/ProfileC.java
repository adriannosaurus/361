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
    
    public ProfileC(Stage stage)
    {
        this.stage = stage;
        setBookmarkScene(this.stage);
    }
    
    public void setBookmarkScene(Stage stage)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ProfileUI.fxml"));
            Parent login = loader.load();
            theProfileUIC = loader.getController();
            theProfileUIC.setProfileC(this);
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
