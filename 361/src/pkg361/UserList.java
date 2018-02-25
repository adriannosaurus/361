package pkg361;

import java.io.Serializable;
import java.util.ArrayList;

public class UserList implements Serializable
{
    private ArrayList<User> listOfUsers;
    
    public UserList()
    {
        listOfUsers = populateListOfUsers();
    }
    
    public ArrayList<User> populateListOfUsers()
    {
        listOfUsers.add(new User("adrianne", "kubiak"));
        listOfUsers.add(new User("test", "user"));
        return listOfUsers;
    }
    
    public boolean verifyLogin(String username, String password)
    {
        for (User x: listOfUsers)
        {
            System.out.println(x.getUsername());
            if (x.isEqual(username, password))
            {
                return true;
            }
        }
        return false;
    }
    
    public boolean addUser(User toAdd)
    {
        boolean success = true;
        for (User x: listOfUsers)
        {
            boolean same = (x.getUsername()).equals(toAdd.getUsername());
            if (same)
            {
                return false;
            }
        }
        listOfUsers.add(toAdd);
        return success;
    }
    
    public User getUser(String username)
    {
        for (User x: listOfUsers)
        {
            if ((x.getUsername()).equals(username))
            {
                return x;
            }
        }
        return null;
    }
}
