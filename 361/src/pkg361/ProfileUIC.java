package pkg361;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class ProfileUIC implements Initializable
{
    @FXML private Button backButton;
    @FXML private Label welcomeLabel;
    @FXML private Label tempMessageLabel;
    
    private SearchC_Anon theSearchC;
    private ProfileC theProfileC;
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
    }
    
    @FXML public void handleBackButton (ActionEvent ae) throws Exception
    {
        theSearchC.goToLogin();
    }
    
    public void setProfileC(ProfileC aProfileC)
    {
        this.theProfileC = aProfileC;
    }
}
