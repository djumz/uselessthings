/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ites;

import static java.lang.Math.sqrt;
import java.util.Random;
import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.application.Platform;
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


public class ITES extends Application {
    public int fix(int x){
        if(x<0){
            x=0;
        }
        if(x>32){
            x=32;
        }
        return x;
    }
    
    public void findpath(int x1, int y1, int x2, int y2, Field[][] infra){
        for(int i=0; i<32; i++){
            for(int j=0; j<32; j++){
                infra[i][j].setInfra(Math.sqrt(((i-x1)*(i-x1))+((j-y1)*(j-y1)))+Math.sqrt(((i-x2)*(i-x2))+((j-y2)*(j-y2))));
                infra[i][j].setGcost(Math.sqrt(((i-x1)*(i-x1))+((j-y1)*(j-y1))));
                infra[i][j].setHcost(Math.sqrt(((i-x2)*(i-x2))+((j-y2)*(j-y2))));
                if (infra[i][j].getType() == "Mountain"){
                    infra[i][j].setInfra(infra[i][j].getInfra()+50);
                    infra[i][j].setGcost(infra[i][j].getGcost()+50);
                    infra[i][j].setHcost(infra[i][j].getHcost()+50);
                }
            }
        }
    }
    
    public void pathcolorer(int x1, int y1, int x2, int y2, Field[][] infra){
        int ogx1 = x1;
        int ogy1 = y1;
        //goes there
        while(!(x1==x2 && y1==y2)){ 
            infra[fix(x1)][fix(y1)].setInfra(infra[fix(x1)][fix(y1)].getInfra()+20);
            int byx = x1; //before start im
            int byy = y1; //on this x & y
            double binfra = 999999;
            for(int g=-1; g<2; g++){
                for(int h=-1; h<2; h++){
                    if(infra[fix(x1+g)][fix(y1+h)].getInfra()<=binfra && !(g==0 && h==0)){//if this is lowest loss
                        //best yet way
                        binfra = infra[fix(x1+g)][fix(y1+h)].getInfra();
                        //best yet place
                        byx = fix(x1+g);
                        byy = fix(y1+h);
                    }
                }
            }
            x1 = byx;   
            y1 = byy;  
            //ourroad[a] = infra[nextx][nexty];
            //dont go back
            infra[fix(x1)][fix(y1)].setStyle("-fx-background-color: #436456;");
            infra[fix(x1)][fix(y1)].setColour("#436456");
            infra[fix(x1)][fix(y1)].setType("Road");
        }
        
        x1 = ogx1;
        y1 = ogy1;
        
        
        //goes back
        while(!(x1==x2 && y1==y2)){ 
            infra[fix(x1)][fix(y1)].setInfra(infra[fix(x1)][fix(y1)].getHcost()+20);
            int byx = x1; //before start im
            int byy = y1; //on this x & y
            double binfra = 999999;
            for(int g=-1; g<2; g++){
                for(int h=-1; h<2; h++){
                    if(infra[fix(x1+g)][fix(y1+h)].getHcost()<=binfra && !(g==0 && h==0) && infra[fix(x1+g)][fix(y1+h)].getColour()=="#436456"){//if this is lowest loss
                        //best yet way
                        binfra = infra[fix(x1+g)][fix(y1+h)].getHcost();
                        //best yet place
                        byx = fix(x1+g);
                        byy = fix(y1+h);
                    }
                }
            }
            x1 = byx;   
            y1 = byy;  
            //dont go back
            infra[fix(x1)][fix(y1)].setStyle("-fx-background-color: #817253;");
            infra[fix(x1)][fix(y1)].setColour("#817253");
            infra[fix(x1)][fix(y1)].setType("Road");
        }
        
        
        //fixes road remains
        for(int i=0; i<32; i++){
            for(int j=0; j<32; j++){
                if(infra[fix(i)][fix(j)].getColour()=="#436456"){
                    infra[fix(i)][fix(j)].setColour("#4CAF50");
                    infra[fix(i)][fix(j)].setStyle("-fx-background-color: #4CAF50;");
                    infra[fix(i)][fix(j)].setType("Farmland");
                }
                if(infra[fix(i)][fix(j)].getColour()=="#817253"){
                    infra[fix(i)][fix(j)].setColour("#b2b4b5");
                    infra[fix(i)][fix(j)].setStyle("-fx-background-color: #b2b4b5;");
                }
            }
        }
    }
    
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
                buttons[i][j] = new Field("", "Farmland", i, j, 0.0, 0.0, 0, 0,"#4CAF50");
                GridPane.setConstraints(buttons[i][j], i, j);
                map.getChildren().addAll(buttons[i][j]);
            }
        }
        
        Random randx = new Random();
        Random randy = new Random();
        
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
            buttons[mx][my].setType("Mountain");
            buttons[mx][my+1].setType("Mountain");
            buttons[mx+1][my].setType("Mountain");
            buttons[mx][my-1].setType("Mountain");
            buttons[mx-1][my].setType("Mountain");
        }
        //cities
        for(int i=0; i<2; i++){
            int c1x = randx.nextInt(30)+1;
            int c1y = randy.nextInt(30)+1;
            buttons[c1x][c1y].setStyle("-fx-background-color: #b2b200;");
            buttons[c1x][c1y].setType("City");
            
            int c2x = randx.nextInt(30)+1;
            int c2y = randy.nextInt(30)+1;
            buttons[c2x][c2y].setStyle("-fx-background-color: #b2b200;");
            buttons[c2x][c2y].setType("City");
            findpath(c1x,c1y,c2x,c2y, buttons);
            pathcolorer(c1x,c1y,c2x,c2y, buttons);
            buttons[fix(c1x)][fix(c1y)].setStyle("-fx-background-color: #b2b200;");//no need for fix()
            buttons[fix(c2x)][fix(c2y)].setStyle("-fx-background-color: #b2b200;");
            buttons[c1x][c1y].setColour("#b2b200");
            buttons[c2x][c2y].setColour("#b2b200");
            for (Field[] buttons1 : buttons) {
            for (Field item : buttons1) {
                item.setOnAction(e -> {
                    //item.setInfra(0);
                });
            }
        }
            
        }
        //pathcolorer(3,5,6,18, buttons);
        for (Field[] buttons1 : buttons) {
            for (Field item : buttons1) {
                item.setOnAction(e -> {
                    //pathcolorer(2,2,5,5, buttons);
                    buttons[Integer.valueOf(onx.getText())][Integer.valueOf(ony.getText())].setStyle("-fx-background-color: "+ oncolor.getText() +";");
                    item.setStyle("-fx-background-color: #4286f4;");
                    type.setText(item.getType());
                    type.setVisible(true);
                    onx.setText(""+item.getX());
                    ony.setText(""+item.getY());
                    oncolor.setText(""+item.getColour());
                    type.setText("" + item.getInfra());
                    
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
