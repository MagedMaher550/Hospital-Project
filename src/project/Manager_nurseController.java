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
public class Manager_nurseController implements Initializable {
    
     @FXML
    private Button add;

    @FXML
    private Button remove;

    @FXML
    private Button edit;

    @FXML
    private Button back;

    switchScreen sc = new switchScreen();
    @FXML
    void add(ActionEvent event) throws IOException {
        sc.changeScreen(event, "Nurse_Application.fxml", "Nurse Application");

    }

    @FXML
    void back(ActionEvent event) throws IOException {
        sc.changeScreen(event, "Manager_HomePage.fxml", "Home Page");

    }

    @FXML
    void edit(ActionEvent event) {

    }

    @FXML
    void remove(ActionEvent event) {

    }


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
