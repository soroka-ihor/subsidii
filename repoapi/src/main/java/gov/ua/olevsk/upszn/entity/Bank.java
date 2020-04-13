package gov.ua.olevsk.upszn.entity;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bank")
public class Bank implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "mfo")
    private int mfo;

    @Column(name = "edrpou")
    private int edrpou;

    @Column(name = "name")
    private String name;

    public Bank() {

    }
    public Bank(int mfo, int edrpou, String name) {
        this.mfo = mfo;
        this.edrpou = edrpou;
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public int getMfo() {
        return mfo;
    }

    public void setMfo(int mfo) {
        this.mfo = mfo;
    }

    public int getEdrpou() {
        return edrpou;
    }

    public void setEdrpou(int edrpou) {
        this.edrpou = edrpou;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
