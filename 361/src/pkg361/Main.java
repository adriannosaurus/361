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
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
//        Connection conn = DriverManager.getConnection("jdbc:sqlserver://HOSP_SQL1.company.com;user=name;password=abcdefg;database=Test");
//        
//        System.out.println("test");
//        
//        Statement sta = conn.createStatement();
//        String Sql = "select * from testing_table";
//        ResultSet rs = sta.executeQuery(Sql);
//        while (rs.next())
//        {
//                System.out.println(rs.getString("txt_title"));
//        }
}
    
    public void start(Stage stage) throws Exception {
        SearchC theSearchC = new SearchC(stage);
    }

}