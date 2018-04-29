package pkg361;

import java.io.Serializable;
import java.util.ArrayList;

public class UserList implements Serializable
{
    private ArrayList<User> listOfUsers = new ArrayList();
    
    //CONSTRUCTOR
    public UserList()
    {
        listOfUsers = populateListOfUsers();
    }
    
    //ALL DEM USERS
    public ArrayList<User> populateListOfUsers()
    {
        listOfUsers.add(new User("adriannosaurus", "pass", "Adrianne", "Kubiak"));
        listOfUsers.add(new User("nada", "pass", "Nada", "Ziab"));
        listOfUsers.add(new User("aaron", "pass", "Aaron", "Stricker"));
        listOfUsers.add(new User("test", "user"));
        return listOfUsers;
    }
    
    //USER VERIFICATION
    public boolean verifyLogin(String userIn, String passIn)
    {
        for (User x: listOfUsers)
        {
            if (x.isEqual(userIn, passIn))
            {
                return true;
            }
        }
        return false;
    }
    
    //NEW USER
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
    
    //GETTER
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