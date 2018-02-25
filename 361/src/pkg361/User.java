package pkg361;

import java.io.Serializable;

public class User implements Serializable
{
    private String username;
    private String password;
    //private Profile profile;
    
    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    
    public boolean isEqual(String username, String password)
    {
        return (username.equals(this.username) && password.equals(this.password));
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
    
    
}
