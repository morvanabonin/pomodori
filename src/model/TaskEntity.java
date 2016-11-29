/**
 * Entity to generate the task table in database
 * @author Morvana Bonin <morvanabonin@gmail.com>
 * @since 2016
 */
package model;

import javax.persistence.*;
import java.util.Date;

/**
 * Entity TaskEntity.
 */
@Entity
@Table(name = "task", schema = "pomodori")
public class TaskEntity {

    @Id
    @GeneratedValue
    @JoinColumn(name = "task_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Integer id;

    @Basic(optional = true)
    @Column(name = "name")
    private String name;

    @Basic(optional = true)
    @Column(name = "createdAt")
    private Date createdAt;

    public TaskEntity() {}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return createdAt;
    }

    public void setCreated(Date createdAt) {
        this.createdAt = createdAt;
    }
}


