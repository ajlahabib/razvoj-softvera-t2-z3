package ba.unsa.etf.rs.tutorijal2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Scanner;
import java.io.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));
        primaryStage.setTitle("Zadatak 3");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        String recenica="",najduza="";
        Scanner ulaz=new Scanner(System.in);
        System.out.println("Unesi recenicu:");
        recenica=ulaz.nextLine();
        for(String rijec: recenica.split(" ")){
            if(rijec.length()>najduza.length())
                najduza=rijec;

        }
        String str= new String(najduza);

        System.out.println("Najduza rijec je: "+ str.toUpperCase());


    launch(args);
    }
}
