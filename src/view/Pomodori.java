package view;

import javafx.application.Application;
import javafx.stage.Stage;

public class Pomodori extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        TimerController teste = new TimerController();
        teste.play();
    }

    public static void main(String[] args) {
        TimerController teste = new TimerController();
        teste.play();
        //launch(args);
    }
}
