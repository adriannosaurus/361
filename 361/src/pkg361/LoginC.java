package pkg361;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginC
{
    private Stage stage;
    private LoginUIC theLoginUIC;
    private UserList listOfUsers;
    private String currentUser;
    
    public LoginC(Stage stage)
    {
        this.stage = stage;
        setLoginScene(stage);
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
    
    //verify throwing an issue
    public boolean authenticate(String username, String password){
        
        if(listOfUsers.verifyLogin(username, password)){
            setCurrentUser(username);
            //NavCntl theNavCntl = NavCntl.getNavCntl(this.stage);
            //theNavCntl.setTheCurrentUser(theCurrentUser); 
            System.out.println("User authenticated successfully");
            return true;
        }             
        
        return false;
    }
    
    public void setCurrentUser(String username)
    {
        this.currentUser = username;
    }
    
    public String getCurrentUser()
    {
        return currentUser;
    }
    
    public void goToSearch()
    {
        SearchC theSearchC = new SearchC(this.stage);
    }
}
