package view;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;

public class TimerController {

    /** Menus */
    @FXML
    public Button btnPlay;

    /** Report MenuButton and SubItems */
    @FXML
    public MenuButton menuReport;

    @FXML
    public MenuItem today;

    @FXML
    public MenuItem sevenDays;

    @FXML
    public MenuItem fifteenDays;

    @FXML
    public MenuItem thirtyDays;

    @FXML
    public Button btnAbout;

    /** Home panel */
    @FXML
    public Pane paneHome;
    
    @FXML
    public Label taskTitle;

    @FXML
    public TextField taskName;

    @FXML
    public  ProgressIndicator progressTimer;

    @FXML
    public Button btnStop;

    @FXML
    public Button btnHome;

    /** Aqui a gambi por não conhecer bem o JavaFX, mas curti minha solução =P */
    @FXML
    public Pane paneReport;
    
    @FXML
    public Pane paneAbout;

    public void play() {
        taskTitle.setText(taskName.getText());
        taskName.setStyle("visibility: hidden");
        btnPlay.setStyle("visibility: hidden");
        btnStop.setStyle("visibility: visible");
    }

    public void stop() {
        taskName.setStyle("visibility: visible");
        taskName.setText("");
        btnPlay.setStyle("visibility: visible");
        btnStop.setStyle("visibility: hidden");
    }

    public void bntReport() {
        paneHome.setStyle("visibility: hidden");
        paneReport.setStyle("visibility:visible");
    }

    public void bntAbout() {
        paneHome.setStyle("visibility: hidden");
        paneReport.setStyle("visibility: hidden");
        paneAbout.setStyle("visibility:visible");
    }

}
