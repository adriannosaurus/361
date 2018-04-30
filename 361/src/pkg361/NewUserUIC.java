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
    
    @FXML private Label cPasswordLabel;
    @FXML private PasswordField cPasswordField;
        
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
    private String cpw;
    private String fn;
    private String ln;
    
    //BUTTON HANDLERS
    @FXML public void handleCancelButton (ActionEvent ae) throws Exception
    {
        theNewUserC.goToLogin();
    }
    @FXML public void handleLoginButton (ActionEvent ae) throws Exception
    {
        un = usernameField.getText();
        pw = passwordField.getText();
        cpw = cPasswordField.getText();
        fn = firstnameField.getText();
        ln = lastnameField.getText();
        
        if ((!un.isEmpty()) && (!pw.isEmpty()))
        {
            if(!pw.equals(cpw))
            {
                passwordField.clear();
                cPasswordField.clear();
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Whoa");
                alert.setHeaderText("Passwords don't match");
                alert.setContentText("Please try again");
                alert.showAndWait();
            }
            else
            {
                newUser = new User(un, pw, fn, ln);
                System.out.println("NEW USER: " + un);
                theNewUserC.goToSearch(newUser);
            }
        }
        else
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Wait a minute");
            alert.setHeaderText("There's no data");
            alert.setContentText("Please enter info");
            alert.showAndWait();
        }
    }
    
    //SETTER
    public void setNewUserC(NewUserC aNewUserC)
    {
        this.theNewUserC = aNewUserC;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
    }
}