/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Owner
 */
public class NurseController implements Initializable {
    
    @FXML
    private Button back;

    @FXML
    void back(ActionEvent event) throws IOException {
        
        switchScreen sc = new switchScreen();
        sc.changeScreen(event, "HomePage.fxml", "Home Page");

    }


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
