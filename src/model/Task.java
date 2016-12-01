/**
 * Entity to generate the task table in database
 * @author Morvana Bonin <morvanabonin@gmail.com>
 * @since 2016
 */
package model;

import javax.persistence.*;
import java.util.Date;

/**
 * Entity Task.
 */
@Entity
@Table(name = "task", schema = "pomodori")
public class Task {
    private int id;
    private String name;
    private boolean shortBreak;
    private boolean longBreak;
    private Date createdAt;
    private boolean completed;
    private int keep;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 60)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "shortBreak", nullable = true)
    public boolean getShortBreak() {
        return shortBreak;
    }

    public void setShortBreak(boolean shortBreak) {
        this.shortBreak = shortBreak;
    }

    @Basic
    @Column(name = "longBreak", nullable = true)
    public boolean getLongBreak() {
        return longBreak;
    }

    public void setLongBreak(boolean longBreak) {
        this.longBreak = longBreak;
    }

    @Basic
    @Column(name = "createdAt", nullable = true)
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "completed", nullable = true)
    public boolean getCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Basic
    @Column(name = "keep", nullable = true)
    public int getKeep() {
        return keep;
    }

    public void setKeep(Integer keep) {
        this.keep = keep;
    }
}
