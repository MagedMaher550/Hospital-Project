/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;



import Home.PatientsHome ;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 * FXML Controller class
 *
 * @author Owner
 */
public class HomePageController implements Initializable {
    
    @FXML
    private Button Patient;

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
    void patient(ActionEvent event)throws Exception {
//         sc.changeScreen(event, "Patient.fxml", "Patient");
        PatientsHome patientsHome = new PatientsHome();
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

//        Stage s = new Stage();
        patientsHome.start(window);
         
    }
    
    @FXML
    void doctor(ActionEvent event) throws IOException {
         sc.changeScreen(event, "Doctor.fxml", "Doctor");


    }

    @FXML
    void logout(ActionEvent event) throws IOException {
         sc.changeScreen(event, "MainPage.fxml", "Main Page");


    }

    
    @FXML
    void nurse(ActionEvent event) throws IOException {
         sc.changeScreen(event, "Nurse.fxml", "Nurse");


    }

    @FXML
    void room(ActionEvent event) throws IOException {
         sc.changeScreen(event, "Room.fxml", "Room");


    }

    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
