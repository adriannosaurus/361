package pkg361;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

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
    @FXML private TableColumn vendorColumn;
    @FXML private TableColumn priceColumn;
    @FXML private ObservableList<Book> listOfBookmarks;
    
    private SearchC theSearchC;
    private ProfileC theProfileC;
    private LoginC theLoginC;
    private LoginUIC theLoginUIC;
    private User currentUser;
    
    @FXML public void handleBackButton (ActionEvent ae) throws Exception
    {
        theProfileC.goToSearch();
    }
    
    @FXML public void handleLogoutButton (ActionEvent ae) throws Exception
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("LOGOUT");
        alert.setHeaderText("You are now logging out");
        alert.setContentText("The application will close now. Okay bye");
        alert.showAndWait();
        theProfileC.close();
    }
    
    @FXML public void changeUsernameButton (ActionEvent ae) throws Exception
    {
        currentUser.setUsername(usernameField.getText());
        System.out.println("Username changed to " + usernameField.getText());
        usernameLabel.setText("Username: " + currentUser.getUsername());
        usernameField.clear();
    }
    
    @FXML public void changePasswordButton (ActionEvent ae) throws Exception
    {
        currentUser.setPassword(passwordField.getText());
        String pass = "";
        for (int i = 0; i < (passwordField.getText()).length(); ++i)
        {
            pass += "*";
        }
        System.out.println("Password changed to " + pass);
        passwordField.clear();
    }
    
    @FXML public void changeFirstnameButton (ActionEvent ae) throws Exception
    {
        currentUser.setfName(firstnameField.getText());
        System.out.println("First name changed to " + firstnameField.getText());
        firstnameLabel.setText("First name: " + currentUser.getfName());
        firstnameField.clear();
    }
    
    @FXML public void changeLastnameButton (ActionEvent ae) throws Exception
    {
        currentUser.setlName(lastnameField.getText());
        System.out.println("Last name changed to " + lastnameField.getText());
        lastnameLabel.setText("Last name: " + currentUser.getlName());
        lastnameField.clear();
    }
    
    public void setProfileC(ProfileC aProfileC, User currentUser)
    {
        this.theProfileC = aProfileC;
        this.currentUser = currentUser;
        usernameLabel.setText("Username: " + currentUser.getUsername());
        firstnameLabel.setText("First name: " + currentUser.getfName());
        lastnameLabel.setText("Last name: " + currentUser.getlName());
        
        vendorColumn = new TableColumn("Vendor");
        priceColumn = new TableColumn("Price");
        vendorColumn.setCellValueFactory(new PropertyValueFactory<Book, String>("vendor"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<Book, String>("price"));
        //listOfBookmarks = FXCollections.observableArrayList(theSearchC.resultsList);
        bookmarksTable.setItems(listOfBookmarks);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
    }
}