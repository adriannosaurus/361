package pkg361;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class LoginUIC implements Initializable
{
    @FXML private Button backButton;
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private Button submitButton;
    
    private LoginC theLoginC;
    
    @FXML public void handleBackButton (ActionEvent ae) throws Exception
    {
        System.out.println("back clicked");
        theLoginC.goToSearch();
    }
    
    @FXML
    private void handleSubmitButton(ActionEvent event) throws Exception {
        
        System.out.println("submit pressed");
        
        String username = usernameField.getText();
        String password = passwordField.getText();
         
        //auth throwing an issue
        if (!theLoginC.authenticate(username, password))
        {
            usernameField.clear();
            passwordField.clear();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Nope");
            alert.setHeaderText("That wasn't quite right");
            alert.setContentText("Please try again");
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
