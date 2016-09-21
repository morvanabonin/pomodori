/**
 * Entity to generate the task table in database
 * @author Morvana Bonin <morvanabonin@gmail.com>
 * @since 2016
 */
package entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Entity Task.
 */
@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "initial_time")
    private Date initialTime;
    @Column(name = "final_time")
    private Date finalTime;

    public Task() {}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(Date initialTime) {
        this.initialTime = initialTime;
    }

    public Date getFinalTime() {
        return finalTime;
    }

    public void setFinalTime(Date finalTime) {
        this.finalTime = finalTime;
    }
}


