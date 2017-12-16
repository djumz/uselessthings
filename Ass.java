/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass;

import java.io.File;
import java.net.MalformedURLException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author komp
 */
public class Ass extends Application {
    
    public double round(double p){
        p = Math.round(p * 100);
        p = p/100;
        return p;
    }
    
    @Override
    public void start(Stage primaryStage) throws MalformedURLException {
        
        //define the colour black
        Image c = new Image(new File("C:\\Users\\komp\\Documents\\NetBeansProjects\\teslic\\src\\teslic\\c.png").toURI().toURL().toExternalForm());
        PixelReader rc = c.getPixelReader();
        Color black = rc.getColor(0, 0);
        
        //get image with dots and make empty writable image of same size
        //Image srcIm = new Image(new File("C:\\Users\\komp\\Documents\\NetBeansProjects\\teslic\\src\\teslic\\test.jpg").toURI().toURL().toExternalForm());
        int width = 751;
        int height = 251;
        //PixelReader readerASS = srcIm.getPixelReader();
        WritableImage dest = new WritableImage(width, height);
        PixelReader reader = dest.getPixelReader();
        PixelWriter writer = dest.getPixelWriter();
        
        //
        for (int y = 0; y < 20; y++) {
                writer.setColor((int) Math.floor(Math.random() * 750),(int) Math.floor(Math.random() * 250), black);
            }
        
        //count dots
        int dots = 0;
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Color color = reader.getColor(x, y);
                if (color.equals(black)){
                    dots++;
                }
            }
        }

        //remember dots' place
        int[] xs = new int[dots];
        int[] ys = new int[dots];
        int dotsfound = 0;
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Color color = reader.getColor(x, y);
                if (color.equals(black)){
                    xs[dotsfound] = x;
                    ys[dotsfound] = y;
                    dotsfound++;
                }
            }
        }
        
        //naci najblizu tacku za sve
        double[] udaljenostodtacke = new double[dots];
        double najblizatacka = 100000000;
        int[] dotkojijenajblizi = new int[width*height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                najblizatacka = 10000000;
outerloop :     for (int a = 0; a < 1; a++){
                    for (int i = 0; i < dots; i++) {
                        udaljenostodtacke[i] = Math.sqrt(Math.pow(x-xs[i], 2) + Math.pow(y-ys[i], 2));
                        if (udaljenostodtacke[i] == 0){break outerloop;}
                    }
                    for (int j = 0; j < dots; j++) {
                        if (udaljenostodtacke[j] == najblizatacka){
                            writer.setColor(x, y, black);
                        }
                        if (udaljenostodtacke[j] < najblizatacka){
                            najblizatacka = udaljenostodtacke[j];
                            dotkojijenajblizi[y*width+x] = j;
                        }
                    }
                }
            }
        }
            
        //random colors 
        Color[] randboje = new Color[dots];
        for (int i = 0; i < dots; i++){
            randboje[i] = Color.color(Math.random(), Math.random(), Math.random());
        }
            
        //dodeljivanje boja pixelima
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if (reader.getColor(x, y).equals(black)){break;}
                writer.setColor(x, y, randboje[dotkojijenajblizi[y*width+x]]);
            }
        }   
        
        
        
        //debug
        //for (int x = 0; x < width; x++) {
            //for (int y = 0; y < height; y++) {
                for (int i = 0; i < dots; i++) {
                    //System.out.println(udaljenostodtacke[i]);
                    System.out.print(xs[i]+ "    ");
                    System.out.println(ys[i]);
                }   
                for (int i = 0; i < width*height; i++) {
                System.out.println(dotkojijenajblizi[i]);
                }
            //}
        //}  
        System.out.println(dots);
        
        ImageView iv = new ImageView();
        iv.setImage(dest);
        AnchorPane root = new AnchorPane();
        
        root.getChildren().addAll(iv);
        
        Scene scene = new Scene(root, 1300, 750);
        
        primaryStage.setTitle("Hello World!");
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
