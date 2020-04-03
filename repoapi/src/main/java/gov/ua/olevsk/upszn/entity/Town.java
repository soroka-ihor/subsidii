package gov.ua.olevsk.upszn.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "town")
public class Town implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

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
