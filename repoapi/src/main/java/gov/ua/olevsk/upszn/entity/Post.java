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

    @OneToOne
    @JoinColumn(name = "town_id")
    private Town town;
}
