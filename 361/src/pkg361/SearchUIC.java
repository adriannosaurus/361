package pkg361;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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
    
    private SearchC theSearchC;
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
    }

    public void setSearchC(SearchC aSearchC)
    {
        this.theSearchC = aSearchC;
    }    
    
    public void handleSubmitButton (ActionEvent ae) throws Exception
    {
        String input = userInput.getText(); //NullPonter?
        boolean bookFound = theSearchC.searchBooks(input);
        if (bookFound == true)
        {
            titleLabel.setVisible(true);
            isbnLabel.setVisible(true);
            authorLabel.setVisible(true);
            editionLabel.setVisible(true);
            bookImage.setVisible(true);
        }
        
    }
    
}
