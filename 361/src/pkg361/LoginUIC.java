package pkg361;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;

public class LoginUIC implements Initializable
{
    @FXML private Button backButton;
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private Button submitButton;
    
    private LoginC theLoginC;
    
    @FXML public void handleBackButton (ActionEvent ae) throws Exception
    {
        System.out.println("Cancel login");
        theLoginC.goToSearch();
    }
    
    @FXML private void handleSubmitButton(ActionEvent event) throws Exception {
        
        System.out.print("Authenticating... ");
        
        String username = usernameField.getText();
        String password = passwordField.getText();
        
        boolean authenticated = theLoginC.authenticate(username, password);
        if (authenticated)
        {
            theLoginC.goToSearch();
        }  
        else
        {
            usernameField.clear();
            passwordField.clear();
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Nope");
            alert.setHeaderText("Not quite");
            alert.setContentText("Try again");
            alert.showAndWait();
        }
        
    }
    
    public void setLoginC(LoginC aLoginC)
    {
        this.theLoginC = aLoginC;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
    }    
    
}
