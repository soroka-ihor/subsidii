package gov.ua.olevsk.upszn.entity;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "town")
public class Town implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    public Town() {

    }

    public Town(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
