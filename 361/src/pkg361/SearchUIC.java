package pkg361;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.*;
import javafx.stage.Stage;

public class SearchUIC implements Initializable
{
    @FXML private Label titleLabel;
    @FXML private Label isbnLabel;
    @FXML private Label authorLabel;
    @FXML private Label editionLabel;
    @FXML private ImageView bookImage;
    @FXML private TextField userInputField;
    @FXML private Button submitButton;
    @FXML private Button loginButton;
    @FXML private Button profileButton;
    @FXML private Button bookmarkButton;
    @FXML private TableView resultsTable;
    
    private SearchC theSearchC;
    private BookList theBookList;
    private LoginC theLoginC;
    private Book bookToDisplay;
    private User currentUser;
    
    @FXML public void handleSubmitButton (ActionEvent ae) throws Exception
    {       
        String input = userInputField.getText();
        
        //NullPointer¿¿¿
        //currentUser = theLoginC.getCurrentUser();
        
        if((userInputField.getText().isEmpty()))
        {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Wait what");
            alert.setHeaderText("There's no search term");
            alert.setContentText("Try again");
            alert.showAndWait();
        }
        else
        {
            int searchType = theSearchC.getSearchType(input);
            
            
            if (searchType == 1)
            {
                System.out.print("Search by ISBN: ");

                //Fixing search by string before search by ISBN
                bookToDisplay = theSearchC.searchByIsbn(input);
                
                if(bookToDisplay.getTitle().isEmpty())
                {
                    titleLabel.setVisible(false);
                    isbnLabel.setVisible(false);
                    authorLabel.setVisible(false);
                    editionLabel.setVisible(false);
                    bookImage.setVisible(false);
                    resultsTable.setVisible(false);
                    bookmarkButton.setVisible(false);
                    
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Hang on");
                    alert.setHeaderText("Error 404: Book not found");
                    alert.setContentText("Try again I guess");
                    alert.showAndWait();
                }
                else
                {
                    titleLabel.setText(bookToDisplay.getTitle());
                    isbnLabel.setText(bookToDisplay.getIsbn());
                    authorLabel.setText(bookToDisplay.getAuthor());
                    editionLabel.setText(bookToDisplay.getEdition());
                    Image img = new Image(bookToDisplay.getImage());
                    bookImage.setImage(img);
                    if (currentUser != null)
                    {
                        bookmarkButton.setVisible(true);
                    }

                    titleLabel.setVisible(true);
                    isbnLabel.setVisible(true);
                    authorLabel.setVisible(true);
                    editionLabel.setVisible(true);
                    bookImage.setVisible(true);
                    resultsTable.setVisible(true);
                }
            }
            
            
            if (searchType == 2)
            {
                System.out.print("Search by Title: ");

                bookToDisplay = theSearchC.searchByTitle(input);

                if(bookToDisplay.getTitle().isEmpty())
                {
                    titleLabel.setVisible(false);
                    isbnLabel.setVisible(false);
                    authorLabel.setVisible(false);
                    editionLabel.setVisible(false);
                    bookImage.setVisible(false);
                    resultsTable.setVisible(false);
                    bookmarkButton.setVisible(false);
                    
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Hang on");
                    alert.setHeaderText("Error 404: Book not found");
                    alert.setContentText("Try again I guess");
                    alert.showAndWait();
                }
                else
                {
                    titleLabel.setText(bookToDisplay.getTitle());
                    isbnLabel.setText(bookToDisplay.getIsbn());
                    authorLabel.setText(bookToDisplay.getAuthor());
                    editionLabel.setText(bookToDisplay.getEdition());
                    Image img = new Image(bookToDisplay.getImage());
                    bookImage.setImage(img);

                    titleLabel.setVisible(true);
                    isbnLabel.setVisible(true);
                    authorLabel.setVisible(true);
                    editionLabel.setVisible(true);
                    bookImage.setVisible(true);
                    resultsTable.setVisible(true);
                    if (currentUser != null)
                    {
                        bookmarkButton.setVisible(true);
                    }
                }
            }   
        }
    }
    
    @FXML public void handleLoginButton (ActionEvent ae) throws Exception
    {
        theSearchC.goToLogin();
    }
    
    @FXML public void handleProfileButton (ActionEvent ae) throws Exception
    {
        theSearchC.goToProfile();
    }
    
    @FXML public void handleBookmarkButton (ActionEvent ae) throws Exception
    {
        Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("WHOA");
            alert.setHeaderText("Under Construction");
            alert.setContentText("don't break the code pls thx");
            alert.showAndWait();
    }
    
    public void authenticatedButtons()
    {
        loginButton.setVisible(false);
        profileButton.setVisible(true);
    }
    
    public void deauthenticatedButtons()
    {
        loginButton.setVisible(true);
        profileButton.setVisible(false);
    }
    
    public void setSearchC(SearchC aSearchC)
    {
        this.theSearchC = aSearchC;
    }

    public Label getTitleLabel()
    {
        return titleLabel;
    }
    public void setTitleLabel(Label titleLabel)
    {
        this.titleLabel = titleLabel;
    }

    public Label getIsbnLabel()
    {
        return isbnLabel;
    }
    public void setIsbnLabel(Label isbnLabel)
    {
        this.isbnLabel = isbnLabel;
    }

    public Label getAuthorLabel()
    {
        return authorLabel;
    }
    public void setAuthorLabel(Label authorLabel)
    {
        this.authorLabel = authorLabel;
    }

    public Label getEditionLabel()
    {
        return editionLabel;
    }
    public void setEditionLabel(Label editionLabel)
    {
        this.editionLabel = editionLabel;
    }

    public ImageView getBookImage()
    {
        return bookImage;
    }
    public void setBookImage(ImageView bookImage)
    {
        this.bookImage = bookImage;
    }
    
    public TableView getResultsTable()
    {
        return resultsTable;
    }
    public void setResultsTable(TableView resultsTable)
    {
        this.resultsTable = resultsTable;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
    }
}