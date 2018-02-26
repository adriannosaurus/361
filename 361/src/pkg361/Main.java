package pkg361;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }
    
    public void start(Stage stage) throws Exception {
        SearchC theSearchC = new SearchC(stage);
    }

}
