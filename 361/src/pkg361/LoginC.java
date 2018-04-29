package pkg361;

import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginC
{
    private Stage stage;
    private LoginUIC theLoginUIC;
    
    private NewUserC theNewUserC;
    private NewUserUIC theNewUserUIC;
    private UserList listOfUsers;
    private User currentUser = null;
    
    //CONSTRUCTOR
    public LoginC(Stage stage)
    {
        listOfUsers = new UserList();
        listOfUsers.populateListOfUsers();
        this.stage = stage;
        setLoginScene(this.stage);
    }
    
    //SET SCENE
    public void setLoginScene(Stage stage)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginUI.fxml"));
            Parent parent = loader.load();
            theLoginUIC = loader.getController();
            theLoginUIC.setLoginC(this);
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.show();            
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    //CHECK IF USER IS VALID
    public boolean authenticate(String un, String pw)
    {       
        if(listOfUsers.verifyLogin(un, pw))
        {
            setCurrentUser(un);
            System.out.println("User authentication successful. " +
                    "Current user: " + currentUser.getUsername());
            return true;
        }
        else
        {
            System.out.println("User authentication failed");
        }
        
        return false;
    }
    
    //GETTERS AND SETTERS
    public void setCurrentUser(String username)
    {
        ArrayList<User> userList = listOfUsers.populateListOfUsers();
        for (int i = 0; i < userList.size(); ++i)
        {
            String localUsername = userList.get(i).getUsername();
            if (localUsername.equals(username))
            {
                currentUser = userList.get(i);
            }
        }
    }
    public User getCurrentUser()
    {
        return currentUser;
    }
    
    //REMOVE CURRENT USER
    //kinda sorta unnecessary since I revamped the code but ¯\_(ツ)_/¯
    public void logoutUser()
    {
        currentUser = null;
    }
    
    //NAVIGATION
    public void goToSearch()
    {
        SearchC theSearchC = new SearchC (this.stage, currentUser);
    }
    public void goToNewUser()
    {
        NewUserC theNewUserC = new NewUserC(this.stage);
    }
    public void close()
    {
        stage.close();
        System.exit(0);
    }
    
}
