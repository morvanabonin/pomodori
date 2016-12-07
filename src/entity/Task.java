/**
 * Entity to generate the task table in database
 * @author Morvana Bonin <morvanabonin@gmail.com>
 * @since 2016
 */
package entity;

import javax.persistence.*;

@Entity
@Table
@NamedQueries({
        @NamedQuery(name = "Task.findAll", query = "SELECT t FROM Task t ORDER BY t.id"),
        @NamedQuery(name = "Task.findById", query = "SELECT t FROM Task t WHERE t.id = :id"),
        @NamedQuery(name = "Task.updateCompleted", query = "UPDATE Task t SET t.completed=1 WHERE t.id = :id")
})
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = true, length = 60)
    private String name;

    @Column(nullable = true)
    private boolean shortBreak;

    @Column(nullable = true)
    private boolean longBreak;

    @Column(nullable = true, length = 60)
    private String createdAt;

    @Column(nullable = true)
    private boolean completed;

    @Column(nullable = true)
    private int keep;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public int getKeep() {
        return keep;
    }

    public void setKeep(int keep) {
        this.keep = keep;
    }

    /*public Task(String name, boolean shortBreak, boolean longBreak, Date createdAt, boolean completed, int keep) {
        this.name = name;
        this.shortBreak = shortBreak;
        this.longBreak = longBreak;
        this.createdAt = createdAt;
        this.completed = completed;
        this.keep = keep;
    }*/

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", shortBreak=" + shortBreak +
                ", longBreak=" + longBreak +
                ", createdAt=" + createdAt +
                ", completed=" + completed +
                ", keep=" + keep +
                '}';
    }
}
