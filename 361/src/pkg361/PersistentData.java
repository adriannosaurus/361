package pkg361;
import java.io.Serializable;

//never mind (for now)

public class PersistentData implements Serializable
{
    private BookList theBookList;
    private UserList theUserList;
    
    public PersistentData()
    {
        if(theBookList == null)
        {
            theBookList = new BookList();
        }
        if(theUserList == null)
        {
            theUserList = new UserList();
        }
    }

    public BookList getTheBookList()
    {
        return theBookList;
    }
    public void setTheBookList(BookList theBookList)
    {
        this.theBookList = theBookList;
    }
    
    public UserList getTheUserList()
    {
        return theUserList;
    }
    public void setTheUserList(UserList theUserList)
    {
        this.theUserList = theUserList;
    }
}
