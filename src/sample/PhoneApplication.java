package sample;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PhoneApplication extends Application {
//    ModelViewController
//    https://www.youtube.com/watch?v=ZQ-mII_pL0M
    PhoneController controller;

    public static void main(String args[]){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        controller = new PhoneController();
        controller.buildView(primaryStage);
    }
}
