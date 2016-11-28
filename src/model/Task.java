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
public class Task {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private Date createdAt;

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

    public Date getCreated() {
        return createdAt;
    }

    public void setCreated(Date createdAt) {
        this.createdAt = createdAt;
    }
}


