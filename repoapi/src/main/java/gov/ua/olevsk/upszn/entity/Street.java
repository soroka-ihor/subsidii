package gov.ua.olevsk.upszn.entity;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "street")
public class Street implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    public Street() {

    }

    public Street(String name) {
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
