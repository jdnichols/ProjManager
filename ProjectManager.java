/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmanager;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.*;
import javafx.geometry.HPos;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *
 * @author johnn
 */
public class ProjectManager extends Application {
    User[] userlist = new User[255];
    private int usernumber = 0;
    //private String serverHostname = new String("127.0.0.1");
    int portnumber;
    @Override
    public void start(Stage primaryStage) {
        //create buttons for initial connection screen
        Button btn = new Button();
        TextField nicktxt = new TextField();
        Label nicklabel = new Label();
        nicklabel.setText("User Name:");
        btn.setText("Connect");
        Label iplabel = new Label();
        iplabel.setText("IP Address: ");
        Label socketlabel = new Label();
        socketlabel.setText("Port: ");
        
        TextField iptxt = new TextField();
        TextField porttxt = new TextField();
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                try {
                    Socket s = new Socket(iptxt.getText(),portnumber = Integer.parseInt(porttxt.getText()));
                }
                catch(UnknownHostException e){
                    System.out.println(e);
                } catch (IOException ex) {
                    Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
                }

                
                
            }
        });
        
        GridPane root = new GridPane();
        GridPane.setRowIndex(nicklabel, 0);
        GridPane.setRowIndex(nicktxt, 0);
        GridPane.setRowIndex(btn, 3);
        GridPane.setColumnIndex(nicktxt, 1);
        GridPane.setRowIndex(iptxt,1);
        GridPane.setColumnIndex(iptxt,1);
        GridPane.setRowIndex(porttxt, 2);
        GridPane.setColumnIndex(porttxt,1);
        GridPane.setRowIndex(iplabel,1);
        GridPane.setRowIndex(socketlabel,2);

        root.getChildren().add(nicklabel);
        root.getChildren().add(nicktxt);
        root.getChildren().add(btn);
        root.getChildren().add(iptxt);
        root.getChildren().add(porttxt);
        root.getChildren().add(iplabel);
        root.getChildren().add(socketlabel);
        root.setPadding(new Insets(10,10,10,10));
        root.setVgap(5);
        root.setHgap(5);
        
        Scene scene = new Scene(root, 300, 180);
        
        primaryStage.setTitle("Project Manager");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
