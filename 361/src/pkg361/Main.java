package pkg361;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.*;

public class Main extends Application
{
    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception
    {
        LoginC theLoginC = new LoginC(stage);
    }

}