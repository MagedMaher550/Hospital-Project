/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author LENOVO
 */
public class switchScreen {

    public void changeScreen(ActionEvent event, String path, String title) throws IOException {
        Parent second = FXMLLoader.load(getClass().getResource(path));
        Scene scene = new Scene(second);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene);
       // window.setResizable(false);
        window.setTitle(title);
      //  window.getIcons().add(new Image("/view/building.png"));
        window.show();
    }

    public void popUp(ActionEvent event, String path, String title) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(path));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        //log in page
        stage.setTitle(title);
 // stage.getIcons().add(new Image("/view/building.png"));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setResizable(false);
        stage.show();
    }
}
