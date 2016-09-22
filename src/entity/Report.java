/**
 * Entity to generate the report table in database
 * @author Morvana Bonin <morvanabonin@gmail.com>
 * @since 2016
 */
package entity;

import javax.persistence.*;

/**
 * Entity Report.
 */
@Entity
public class Report {

    @Id
    @GeneratedValue
    private int id;

    @Id
    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

    public int getId() {
        return id;
    }

    public Task getTask() {
        return task;
    }
}
