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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import project.switchScreen;

/**
 * FXML Controller class
 *
 * @author Owner
 */
public class PatientController implements Initializable {
    
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
        sc.changeScreen(event, "Patient_Application.fxml", "Patient Application");

    }

    @FXML
    void back(ActionEvent event) throws IOException {
        sc.changeScreen(event, "HomePage.fxml", "Home Page");

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
