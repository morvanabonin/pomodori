package view;

import dao.TaskDao;
import entity.Task;
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

    /** Aqui a gambi por não conhecer bem o JavaFX, mas curti minha solução *-* */
    @FXML
    public Pane paneReport;
    
    @FXML
    public Pane paneAbout;

    public boolean play() {
        Task task = new Task();
        TaskDao taskdao = new TaskDao();

        task.setName("Teste");
        taskdao.insert(task);
        return true;
    }

}
