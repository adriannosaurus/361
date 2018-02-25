package pkg361;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class SearchUIC implements Initializable
{
    @FXML private Label titleLabel;
    @FXML private Label isbnLabel;
    @FXML private Label authorLabel;
    @FXML private Label editionLabel;
    @FXML private ImageView bookImage;
    @FXML private TextField userInput;
    @FXML private Button submitButton;
    @FXML private Button loginButton;
    @FXML private TableView resultsTable;
    
    private SearchC theSearchC;
    
    @FXML public void handleSubmitButton (ActionEvent ae) throws Exception
    {
        //String input = userInput.getText();// ¯\_(ツ)_/¯ NullPointer¿
        
        //Enter search term here for now
        String input = "Phantom of the Opera";
        Book bookToDisplay;
        int searchType = theSearchC.searchBooks(input);
        if (searchType == 1)
        {
            System.out.println("Search by ISBN");
            
            //bookToDisplay = theSearchC.searchByIsbn(input);
            
            isbnLabel.setText("ISBN: " + theSearchC.searchByIsbn(input));
            
            titleLabel.setVisible(true);
            isbnLabel.setVisible(true);
            authorLabel.setVisible(true);
            editionLabel.setVisible(true);
            bookImage.setVisible(true);
            resultsTable.setVisible(true);// ¯\_(ツ)_/¯ NullPointer¿
            
        }
        if (searchType == 2)
        {
            System.out.println("Search by Title");
            
            titleLabel.setText(theSearchC.searchByTitle(input));
            
            titleLabel.setVisible(true);
            isbnLabel.setVisible(true);
            authorLabel.setVisible(true);
            editionLabel.setVisible(true);
            bookImage.setVisible(true);
            //resultsTable.setVisible(true);// ¯\_(ツ)_/¯ NullPointer¿
        }   
    }
    
    @FXML public void handleLoginButton (ActionEvent ae) throws Exception
    {
        System.out.println("login clicked");
        theSearchC.goToLogin();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
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
}
