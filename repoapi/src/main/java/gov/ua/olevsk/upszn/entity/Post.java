package gov.ua.olevsk.upszn.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "post")
public class Post implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "post_code")
    private int postCode;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "town_id")
    private Town town;

    public Post() {

    }

    public Post(int postCode, Town town) {
        this.postCode = postCode;
        this.town = town;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }
}
