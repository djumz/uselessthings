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
    
    public int oob(int p, int min, int max){
        if(p<min){p=min;}
        if(p>max){p=max;}
        return p;
    }
    
    public void bold(int[] xs, int[] ys, int width, int height, int dots, PixelWriter writer, Color black){
        for (int i = 0; i < dots; i++) {
            for (int y = -1; y < 2; y++) {
                for (int x = -1; x < 2; x++) {
                    writer.setColor(oob(xs[i]+x, 0, width-1), oob(ys[i]+y, 0, height-1), black);
                }
            }
        }
    }
    
    @Override
    public void start(Stage primaryStage) throws MalformedURLException {
        
        //define the colour black
        Image c = new Image(new File("C:\\Users\\komp\\Documents\\NetBeansProjects\\teslic\\src\\teslic\\c.png").toURI().toURL().toExternalForm());
        PixelReader rc = c.getPixelReader();
        Color black = rc.getColor(0, 0);
        
        //get image with dots and make empty writable image of same size
        //Image srcIm = new Image(new File("C:\\Users\\komp\\Documents\\NetBeansProjects\\teslic\\src\\teslic\\test.jpg").toURI().toURL().toExternalForm());
        int width = 1251;
        int height = 851;
        //PixelReader readerASS = srcIm.getPixelReader();
        WritableImage dest = new WritableImage(width, height);
        PixelReader reader = dest.getPixelReader();
        PixelWriter writer = dest.getPixelWriter();
        
        //color 20 rand dots
        for (int y = 0; y < 20; y++) {
                writer.setColor((int) Math.floor(Math.random() * width),(int) Math.floor(Math.random() * height), black);
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
        double najblizatacka;
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
//                        if (Math.abs(udaljenostodtacke[j] - najblizatacka) < 0.2){
//                            writer.setColor(x, y, black);                             ovo ne radi
//                        }
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
        for (int x = 0; x < width; x++) {
            for (int y = height-1; y > 0; y--) {
                if (reader.getColor(x, y).equals(black)){break;}
                writer.setColor(x, y, randboje[dotkojijenajblizi[y*width+x]]);
            }
        }
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (reader.getColor(x, y).equals(black)){break;}
                writer.setColor(x, y, randboje[dotkojijenajblizi[y*width+x]]);
            }
        }
        
        //enlargen cities
        bold(xs, ys, width, height, dots, writer, black);
        
        //color borders
        Color ovaboja;
        Color onaboja;
        Color granica;
        granica = rc.getColor(1, 0);
        for (int i = 0; i < width; i++) {
            ass:for (int j = 0; j < height; j++) {
                ovaboja = reader.getColor(i, j);
                for (int x = -1; x < 2; x++) {
                    for (int y = -1; y < 2; y++) {
                        onaboja = reader.getColor(oob(i+x, 0, width-1), oob(j+y, 0, height-1));
                        if(!ovaboja.equals(onaboja) && !onaboja.equals(granica) && !ovaboja.equals(granica) && !ovaboja.equals(black) && !onaboja.equals(black)){
                            writer.setColor(i, j, granica);
                            //break ass;
                            //onaboja = Color.color(Math.random(), Math.random(), Math.random());
                        }
                    }
                }
            }
        }
        
        //remember cities
        int brs = 0;
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Color color = reader.getColor(x, y);
                if (color.equals(granica)){
                    brs++;
                }
            }
        }
        int[] xb = new int[brs];
        int[] yb = new int[brs];
        int bordersfound = 0;
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Color color = reader.getColor(x, y);
                if (color.equals(granica)){
                    xb[bordersfound] = x;
                    yb[bordersfound] = y;
                    bordersfound++;
                }
            }
        }
        
        //enlargen borders
        bold(xb, yb, width, height, brs, writer, granica);
        
        //scene
        ImageView iv = new ImageView();
        iv.setImage(dest);
        AnchorPane root = new AnchorPane();
        
        root.getChildren().addAll(iv);
        
        Scene scene = new Scene(root, width+1, height+1);
        
        primaryStage.setTitle("assassassassassassassassassassassassassass");
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
