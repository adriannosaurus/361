package pkg361;

import java.io.Serializable;
import java.util.ArrayList;

public class UserList implements Serializable
{
    private ArrayList<User> listOfUsers = new ArrayList();
    
    public UserList()
    {
        listOfUsers = populateListOfUsers();
    }
    
    public ArrayList<User> populateListOfUsers()
    {
        listOfUsers.add(new User("adrianne", "kubiak"));
        listOfUsers.add(new User("test", "user"));
        System.out.println("listOfUsers populated: " + listOfUsers.size() + " users");
        return listOfUsers;
    }
    
    public boolean verifyLogin(String userIn, String passIn)
    {
        for (User x: listOfUsers)
        {
            if (x.isEqual(userIn, passIn))
            {
                System.out.println("Verified: true");
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
    
    public boolean testMethod()
    {
        return true;
    }
}