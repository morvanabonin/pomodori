package view;

import dao.TaskDao;
import entity.Task;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class TimerController {

    @FXML
    public TextField btnPlay;

    public boolean play() {
        Task task = new Task();
        TaskDao taskdao = new TaskDao();

        task.setName("Teste");
        taskdao.insert(task);
        return true;
    }

}
