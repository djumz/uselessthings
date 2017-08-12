/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ites;

import java.util.Random;
import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author komp
 */
public class ITES extends Application {
    /*public double round(int x1, int y1, int x2, int y2){
        double transportcost = 0;
        for(int i = 0; x1!=x2 && y1!=y2; i++){
        }
        return transportcost;
    }*/
    
    @Override
    public void start(Stage primaryStage) {
        AnchorPane root = new AnchorPane();
        root.setStyle("-fx-background-color: #b2b4b5;");
        GridPane map = new GridPane();
        
        Label onx = new Label("0");
        Label ony = new Label("0");
        Label oncolor = new Label("#40AF50");
        Label type = new Label("Farmland");
        type.setStyle("-fx-text-size: 20px;");
        type.setLayoutX(1000);
        type.setLayoutY(20);
        type.setVisible(false);
        root.getChildren().addAll(type);
        
        Field[][] buttons = new Field[32][32];
        for(int i=0; i<32; i++){
            for(int j=0; j<32; j++){
                buttons[i][j] = new Field("", "Farmland", i, j, "#4CAF50");
                GridPane.setConstraints(buttons[i][j], i, j);
                map.getChildren().addAll(buttons[i][j]);
            }
        }
        
        Random randx = new Random();
        Random randy = new Random();
        //cities
        for(int i=0; i<3; i++){
            int cx = randx.nextInt(32);
            int cy = randy.nextInt(32);
            buttons[cx][cy].setStyle("-fx-background-color: #b2b200;");
            buttons[cx][cy].setType("City");
            buttons[cx][cy].setColour("#b2b200");
        }
        //mountains
        for(int i=0; i<4; i++){
            int mx = randx.nextInt(28)+2;
            int my = randy.nextInt(28)+2;
            buttons[mx][my].setStyle("-fx-background-color: #715d3e;");
            buttons[mx][my+1].setStyle("-fx-background-color: #715d3e;");
            buttons[mx+1][my].setStyle("-fx-background-color: #715d3e;");
            buttons[mx][my-1].setStyle("-fx-background-color: #715d3e;");
            buttons[mx-1][my].setStyle("-fx-background-color: #715d3e;");
            buttons[mx][my].setColour("#715d3e");
            buttons[mx][my+1].setColour("#715d3e");
            buttons[mx+1][my].setColour("#715d3e");
            buttons[mx][my-1].setColour("#715d3e");
            buttons[mx-1][my].setColour("#715d3e");
        }
        for (Field[] buttons1 : buttons) {
            for (Field item : buttons1) {
                item.setOnAction(e -> {
                    buttons[Integer.valueOf(onx.getText())][Integer.valueOf(ony.getText())].setStyle("-fx-background-color: "+ oncolor.getText() +";");
                    item.setStyle("-fx-background-color: #4286f4;");
                    type.setText(item.getType());
                    type.setVisible(true);
                    onx.setText(""+item.getX());
                    ony.setText(""+item.getY());
                    oncolor.setText(""+item.getColour());
                    type.setText(oncolor.getText());
                });
            }
        }
        
        
        map.setPadding(new Insets(5, 5, 5, 5));
        root.getChildren().addAll(map);
        Scene scene = new Scene(root, 1392, 990);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());  
        
        primaryStage.setTitle("Economy Simulation Fail #420");
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
