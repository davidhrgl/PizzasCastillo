/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escom.pizzascastillo;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author davidhrgl
 */
public class MainApp extends Application {
    private Stage primaryStage;
    
    @Override
    public void start(Stage primaryStage) {
       this.primaryStage = primaryStage;
       this.primaryStage.setTitle("Pizzas Castillo");
       
       initPantallaPrincipal();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private void initPantallaPrincipal() {
        try{
            Parent root;
            root = FXMLLoader.load(MainApp.class.getResource("/fxml/PantallaPrincipal.fxml"));
            
            Scene scene  = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch(IOException e){
        e.printStackTrace();
        }
    }
    
}
