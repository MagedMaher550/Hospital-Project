/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import Home.*;
import Add.*;
import Update.*;
import OperationsCode.*;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Owner
 */
public class Patient_ApplicationController implements Initializable {
    
     @FXML
    private TextField FirstName;

    @FXML
    private TextField LastName;

    @FXML
    private TextField ID;

    @FXML
    private TextField DateOfBirth;

    @FXML
    private TextField age;

    @FXML
    private TextField address;

    @FXML
    private TextField PhoneNumber;

    @FXML
    private TextField email;

    @FXML
    private RadioButton male;

    @FXML
    private RadioButton female;

    
    @FXML
    private MenuButton doctor;


    @FXML
    private Button add;

    @FXML
    private Button back;
    
    String g;

    @FXML
    void add(ActionEvent event) {
        
        if(male.isSelected()){
            g = "male";
        }else{
            g = "Female";
        }
        
//        Operations oop = new Operations();
//        oop.addPatient(FirstName.getText(), LastName.getText(), ID.getText(), g, DateOfBirth.getText(), 20, address.getText(), PhoneNumber.getText(), email.getText(), 1, 1, 1);

    }

    @FXML
    void back(ActionEvent event) throws IOException {
        switchScreen sc = new switchScreen();
        sc.changeScreen(event, "Patient.fxml", "Patient");

    }
    
    

    
    void gender(ActionEvent event) {
        if(event.getTarget()== male)
            g = "Male";
        else if (event.getTarget()== male)
            g = "Female";

    }



    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
