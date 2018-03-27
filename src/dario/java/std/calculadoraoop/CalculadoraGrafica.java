package dario.java.std.calculadoraoop;

import java.io.IOException;
import java.net.URL;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class CalculadoraGrafica extends Application {
    
    
    public void start(Stage primaryStage)throws IOException{
 
        Parent root = FXMLLoader(getClass().getResource("PantallaCalculadora.fxml"));
        
        Scene scene = new Scene(root, 300, 450);
        
        primaryStage.setTitle("CalculadoraPOO");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }

    private Parent FXMLLoader(URL resource) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
