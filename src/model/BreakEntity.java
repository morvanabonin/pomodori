/**
 * Entity to generate the report table in database
 * @author Morvana Bonin <morvanabonin@gmail.com>
 * @since 2016
 */
package model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Entity BreakEntity.
 */
@Entity
@Table(name = "break", schema = "pomodori")
public class BreakEntity {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    private TaskEntity task;


    private boolean shortBreak;
    private boolean longBreak;
    private Timestamp createdAt;

    public int getId() {
        return id;
    }

    public TaskEntity getTask() {
        return task;
    }

    public boolean getShortBreak() {
        return shortBreak;
    }

    public void setShortBreak(boolean shortBreak) {
        this.shortBreak = shortBreak;
    }

    public boolean getLongBreak() {
        return longBreak;
    }

    public void setLongBreak(boolean longBreak) {
        this.longBreak = longBreak;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}

