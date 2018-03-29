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
    private UserList listOfUsers;
    private User currentUser;
    private PersistentData thePD;
    
    public LoginC(Stage stage)
    {
        listOfUsers = new UserList();
        listOfUsers.populateListOfUsers();
        this.stage = stage;
        setLoginScene(this.stage);
    }
    
    public void setLoginScene(Stage stage)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginUI.fxml"));
            Parent login = loader.load();
            theLoginUIC = loader.getController();
            theLoginUIC.setLoginC(this);
            Scene scene = new Scene(login);
            stage.setScene(scene);
            stage.show();            
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public boolean authenticate(String un, String pw)
    {       
        if(listOfUsers.verifyLogin(un, pw))
        {
            setCurrentUser(un);
            System.out.print("User authentication successful. ");
            System.out.println("Current user: " + currentUser.getUsername());
            return true;
        }
        else
        {
            System.out.println("User authentication failed");
        }
        
        return false;
    }
    
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
    
    public void goToSearch()
    {
        SearchC_User theSearchC = new SearchC_User (this.stage);
    }
    
}
