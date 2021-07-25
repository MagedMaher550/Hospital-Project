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
public class Manager_HomePageController implements Initializable {
    
   
    @FXML
    private Button Doctor;

    @FXML
    private Button Nurse;

    @FXML
    private Button Room;

    @FXML
    private Button Logout;
    
    switchScreen sc = new switchScreen();

    @FXML
    void doctor(ActionEvent event) throws IOException {
        
        sc.changeScreen(event, "Manager_doctor.fxml", "Doctor");

    }

    @FXML
    void logout(ActionEvent event) throws IOException {
        
        sc.changeScreen(event, "MainPage.fxml", "Main Page");

    }

    @FXML
    void nurse(ActionEvent event) throws IOException {
        
        sc.changeScreen(event, "Manager_nurse.fxml", "Nurse");

    }

    
    @FXML
    void room(ActionEvent event) throws IOException {
        
        sc.changeScreen(event, "Room.fxml", "Room");

    }


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
