package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Pomodori extends Application {

    private AnchorPane root;

    @Override
    public void start(Stage primaryStage) throws Exception{
        /*TimerController teste = new TimerController();
        teste.play();*/

        /*FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("pomodori.fxml"));
        loader.setRoot(root);
        root = loader.load();

        // Show the scene containing the root layout.
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();*/
        Parent root = FXMLLoader.load(getClass().getResource("pomodori.fxml"));


        Scene scene = new Scene(root);
        scene.setRoot(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        /*TimerController teste = new TimerController();
        teste.play();*/
        launch(args);
    }
}


