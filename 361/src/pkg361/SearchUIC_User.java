package pkg361;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.stage.Stage;

public class SearchUIC_User implements Initializable
{
    @FXML private Label titleLabel;
    @FXML private Label isbnLabel;
    @FXML private Label authorLabel;
    @FXML private Label editionLabel;
    @FXML private ImageView bookImage;
    @FXML private TextField userInputField;
    @FXML private Button submitButton;
    @FXML private Button profileButton;
    @FXML private TableView resultsTable;
    
    private SearchC_User theSearchC;
    private BookList theBookList;
    private LoginC theLoginC;
    private Book bookToDisplay;
    
    @FXML public void handleSubmitButton (ActionEvent ae) throws Exception
    {       
        String input = userInputField.getText();
        
        int searchType = theSearchC.getSearchType(input);
        if (searchType == 1)
        {
            System.out.print("Search by ISBN: ");
            
            //Fixing search by string before search by ISBN
            bookToDisplay = theSearchC.searchByIsbn(input);
            
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
            
        }
        if (searchType == 2)
        {
            System.out.print("Search by Title: ");
            
            bookToDisplay = theSearchC.searchByTitle(input);

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
        }   
    }
    
    @FXML public void handleProfileButton (ActionEvent ae) throws Exception
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Nope");
        alert.setHeaderText("Not quite");
        alert.setContentText("Try again");
        alert.showAndWait();
    }
    
    public void setSearchC(SearchC_User aSearchC)
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