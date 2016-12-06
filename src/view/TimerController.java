package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
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

    /** Home pane */
    @FXML
    public Pane paneHome;
    
    @FXML
    public Label taskTitle;

    @FXML
    public TextField taskName;

    @FXML
    public  ProgressIndicator progressTimer;

    @FXML
    public Label labelTimer;

    @FXML
    public Button btnStop;

    @FXML
    public Button btnHome;

    /** Report pane **/
    @FXML
    public Label pieTitle;

    @FXML
    public PieChart pieChart;

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
        paneReport.setStyle("visibility:visible");
        paneHome.setStyle("visibility: hidden");
        pieTitle.setText("Hoje");
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("TCC", 100));
        pieChart.setData(pieChartData);
    }

    public void reportSevenDays() {
        paneReport.setStyle("visibility:visible");
        paneHome.setStyle("visibility: hidden");
        pieTitle.setText("7 dias");
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("TCC", 50),
                        new PieChart.Data("Jogar", 50));
        pieChart.setData(pieChartData);
    }

    public void reportFifteenDays() {
        paneReport.setStyle("visibility:visible");
        paneHome.setStyle("visibility: hidden");
        pieTitle.setText("15 dias");
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Java", 50),
                        new PieChart.Data("TCC", 50),
                        new PieChart.Data("Louça", 25),
                        new PieChart.Data("Python", 25),
                        new PieChart.Data("Jogar", 25));
        pieChart.setData(pieChartData);
    }

    public void reportThirtyDays() {
        paneReport.setStyle("visibility:visible");
        paneHome.setStyle("visibility: hidden");
        pieTitle.setText("30 dias");
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Java", 50),
                        new PieChart.Data("TCC", 50),
                        new PieChart.Data("Louça", 25),
                        new PieChart.Data("Emails", 25),
                        new PieChart.Data("Facebook", 50),
                        new PieChart.Data("Python", 25),
                        new PieChart.Data("Jogar", 25));
        pieChart.setData(pieChartData);
    }

    public void bntAbout() {
        paneHome.setStyle("visibility: hidden");
        paneReport.setStyle("visibility: hidden");
        paneAbout.setStyle("visibility:visible");
    }

    public void btnPlay() {
        paneHome.setStyle("visibility: visible");
        paneReport.setStyle("visibility: hidden");
        paneAbout.setStyle("visibility: hidden");
    }

    public void timer() {
        String txtMinutos = String.format("%02d", segundos / 60);
        String txtSegundos = String.format("%02d", segundos % 60);
        labelTimer.setText(txtMinutos + ":" + txtSegundos);
    }
}
