package pkg361;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class NewUserUIC implements Initializable
{
    @FXML private Button cancelButton;
    @FXML private Button loginButton;
    
    @FXML private Label usernameLabel;
    @FXML private TextField usernameField;
    
    @FXML private Label passwordLabel;
    @FXML private PasswordField passwordField;
        
    @FXML private Label firstnameLabel;
    @FXML private TextField firstnameField;
    
    @FXML private Label lastnameLabel;
    @FXML private TextField lastnameField;
    
    private SearchC theSearchC;
    private LoginC theLoginC;
    private NewUserC theNewUserC;
    private UserList listOfUsers;
    private User newUser;
    
    private String un;
    private String pw;
    private String fn;
    private String ln;
    
    @FXML public void handleCancelButton (ActionEvent ae) throws Exception
    {
        System.out.println("NEW USER CANCEL");
        theSearchC.goToLogin();
    }
    
    @FXML public void handleLoginButton (ActionEvent ae) throws Exception
    {
        System.out.println("NEW USER LOGIN");
        un = usernameField.getText();
        pw = passwordField.getText();
        fn = firstnameField.getText();
        ln = lastnameField.getText();
        
        System.out.println(un + ": " + fn + " " + ln);
        theLoginC.goToSearch();
    }
    
    public void setNewUserC(NewUserC aNewUserC)
    {
        this.theNewUserC = aNewUserC;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
    }
}