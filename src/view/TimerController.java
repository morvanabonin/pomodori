package view;

import dao.BaseDAO;
import dao.TaskDAO;
import entity.Task;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;
import javafx.scene.effect.InnerShadow;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    Timeline temporizador = new Timeline();
    BaseDAO taskdao = new TaskDAO();
    Task task = new Task();

    int tempoFaltante;
    int segundos = 1500;

    public void play() {

        taskTitle.setText(taskName.getText());
        taskName.setStyle("visibility: hidden");

        /** Efeito nos botões **/
        InnerShadow innerShadow = new InnerShadow();
        innerShadow.setRadius(2d);
        innerShadow.setOffsetX(1);
        innerShadow.setOffsetY(1);
        btnPlay.setEffect(innerShadow);
        btnStop.setEffect(innerShadow);

        btnPlay.setStyle("visibility: hidden");
        btnStop.setStyle("visibility: visible");

        /** Call function time, do the time run **/
        this.timer();

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String now = dateFormat.format(date);

        /** Persist object Task in Pomodori database */
        task.setName(taskName.getText());
        task.setCreatedAt(now);
        taskdao.persist(task);
    }

    public void stop() {
        taskName.setStyle("visibility: visible");
        btnPlay.setStyle("visibility: visible");
        btnStop.setStyle("visibility: hidden");
        temporizador.stop();
        taskName.setText("");
        labelTimer.setText("25:00");
        task.setCompleted(true);
        taskdao.update(task);
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

    public void btnHome() {
        paneHome.setStyle("visibility: visible");
        paneReport.setStyle("visibility: hidden");
        paneAbout.setStyle("visibility: hidden");
    }

    public void timer() {
        temporizador.setCycleCount(Animation.INDEFINITE);
        KeyFrame time = new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                atualizaValores();
            }
        });
        tempoFaltante = segundos;
        temporizador.getKeyFrames().add(time);
        temporizador.play();
    }

    public void atualizaValores() {
        tempoFaltante--;
        atualizaLabelTempo(tempoFaltante);
    }

    private void atualizaLabelTempo(int segundos) {
        String txtMinutos = String.format("%02d", segundos / 60);
        String txtSegundos = String.format("%02d", segundos % 60);
        labelTimer.setText(txtMinutos + ":" + txtSegundos);
    }

}
