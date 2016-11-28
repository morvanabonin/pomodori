/**
 * Entity to generate the report table in database
 * @author Morvana Bonin <morvanabonin@gmail.com>
 * @since 2016
 */
package model;

    import javax.persistence.*;
    import java.sql.Date;

/**
 * Entity Break.
 */
@Entity
public class Break {

    @Id
    @GeneratedValue
    private int id;

    @Id
    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

    private boolean shortBreak;
    private boolean longBreak;
    private Date createdAt;

    public int getId() {
        return id;
    }

    public Task getTask() {
        return task;
    }

    public boolean isShortBreak() {
        return shortBreak;
    }

    public void setShortBreak(boolean shortBreak) {
        this.shortBreak = shortBreak;
    }

    public boolean isLongBreak() {
        return longBreak;
    }

    public void setLongBreak(boolean longBreak) {
        this.longBreak = longBreak;
    }

    public Date getCreated() {
        return createdAt;
    }

    public void setCreated(Date createdAt) {
        this.createdAt = createdAt;
    }
}

