package project;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Hospital extends Application {
            

    @Override
    public void start(Stage primaryStage) {        

        try {
            Parent root = FXMLLoader.load(getClass().getResource("Page.fxml"));
            final java.net.URL resource = getClass().getResource("voice.mp4");
            final Media media = new Media(resource.toString());
            final MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
            primaryStage.getIcons().add(new Image("/project/Logo.png"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.show();
            Stage LoginStage = new Stage();
            LoginStage.setTitle("Login Page");
            LoginStage.getIcons().add(new Image("/project/Logo.png"));
            Parent root1 = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
            Scene scene1 = new Scene(root1,700,500);
            LoginStage.setScene(scene1);
            
            
            
            
            Task t = new Task<Void>() {
                @Override
                protected Void call() throws Exception {
                    Thread.sleep(2000);
                    Platform.runLater(() -> {
                        primaryStage.close();
                        LoginStage.show();
                    });
                    return null;
                }
            };
            Thread ts = new Thread(t);
            ts.start();
        } catch (IOException ex) {
            Logger.getLogger(Hospital.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
                
        
        
    }

    public static void main(String[] args) {
        launch(args);
    }

}
