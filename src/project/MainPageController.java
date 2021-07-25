package project;

import Home.*;
import Add.*;
import OperationsCode.* ;
import Update.*;
//import OperationsCode.*;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Owner
 */
public class MainPageController implements Initializable {

    @FXML
    private TextField UserName;

    @FXML
    private TextField Password;

    @FXML

    private Button signIn;

    @FXML
    private Text text;

    Stage HomePage, MainPage;
    
    @FXML
    void connect (ActionEvent event) throws Exception{
        if(event.getTarget() == signIn){
            
            Operations op = new Operations();
            
            String username = UserName.getText();
            Account a = op.searchInAccount(username);
            
            if(a == null){
                text.setVisible(true);
                UserName.clear();
                Password.clear();
            }else{
                
                if( a.getPassword().equals(Password.getText()) ){
                    switchScreen screen = new switchScreen();
                    screen.changeScreen(event,"HomePage.fxml", "Home Page");
                    
                }else{
                    System.out.println("Error in password");
                    text.setVisible(true);
                    UserName.clear();
                    Password.clear();  
                }
                
            }
            
            
                   

        }else {
            text.setVisible(true);
            UserName.clear();
            Password.clear();
        }
    }

   /* @FXML
    void action(ActionEvent event) throws Exception {
        System.out.println("gooh");
        if (event.getTarget() == signIn && UserName.getText().equalsIgnoreCase("") && Password.getText().equalsIgnoreCase("")) {
            System.out.println("gooh");

            Operations2 operation = new Operations2();
            System.out.println("connected");

            Parent root = FXMLLoader.load(getClass().getResource("/hospital/MainPage.fxml"));
            Scene scene = new Scene(root);
            MainPage.setScene(scene);
            MainPage.close();

            Parent root1 = FXMLLoader.load(getClass().getResource("/hospital/HomePage.fxml"));
            Scene scene1 = new Scene(root1);
            HomePage.setScene(scene1);
            HomePage.show();

        } else {
            text.setVisible(true);
            UserName.clear();
            Password.clear();
        }

    }*/

    public void initialize(URL url, ResourceBundle rb) {

    }

}
