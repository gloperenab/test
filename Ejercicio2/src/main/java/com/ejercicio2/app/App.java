package com.ejercicio2.app;

import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App extends Application
{
    public static void main( String[] args ) {

        System.out.println( "Cargando..." );
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        stage = FXMLLoader.load(getClass().getResource("/fxml/principal.fxml"));
        stage.show();
    }

    public void fxml2(){
        try {
            Stage op = FXMLLoader.load(getClass().getResource("/ruta/archivo2.fxml"));
            op.show();

        } catch (IOException e) {

        }
    }

}
