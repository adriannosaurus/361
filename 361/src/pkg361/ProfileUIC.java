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
    @FXML private Button logoutButton;
    
    @FXML private Label usernameLabel;
    @FXML private TextField usernameField;
    @FXML private Button usernameButton;
    
    @FXML private Label passwordLabel;
    @FXML private PasswordField passwordField;
    @FXML private Button passwordButton;
    
    @FXML private Label firstnameLabel;
    @FXML private TextField firstnameField;
    @FXML private Button firstnameButton;
    
    @FXML private Label lastnameLabel;
    @FXML private TextField lastnameField;
    @FXML private Button latnameButton;
    
    @FXML private TableView bookmarksTable;
    
    private SearchC theSearchC;
    private ProfileC theProfileC;
    private LoginC theLoginC;
    private User currentUser;
    
    @FXML public void handleBackButton (ActionEvent ae) throws Exception
    {
        theProfileC.goToSearch();
    }
    
    @FXML public void handleLogoutButton (ActionEvent ae) throws Exception
    {
        System.out.println("Logout");
        theLoginC.logoutUser();
        theProfileC.goToSearch();
    }
    
    @FXML public void changeUsernameButton (ActionEvent ae) throws Exception
    {
        currentUser.setUsername(usernameField.getText());
        System.out.println("Username changed to " + usernameField.getText());
    }
    
    @FXML public void changePasswordButton (ActionEvent ae) throws Exception
    {
        currentUser.setPassword(passwordField.getText());
        System.out.println("Username changed to " + passwordField.getText());
    }
    
    @FXML public void changeFirstnameButton (ActionEvent ae) throws Exception
    {
        currentUser.setfName(firstnameField.getText());
        System.out.println("First name changed to " + firstnameField.getText());
    }
    
    @FXML public void changeLastnameButton (ActionEvent ae) throws Exception
    {
        currentUser.setlName(lastnameField.getText());
        System.out.println("Last name changed to " + lastnameField.getText());
    }
    
    public void setProfileC(ProfileC aProfileC)
    {
        this.theProfileC = aProfileC;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
    }
}