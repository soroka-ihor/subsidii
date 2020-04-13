package gov.ua.olevsk.upszn.entity;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "accountant")
public class Accountant implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "surname")
    private String surname;

    @Column(name = "name")
    private String name;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "olsprecid")
    private int olprecid;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "p_series_id")
    private Passport passportSeries;

    @Column(name = "p_number")
    private int passportNumber;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "bank_id")
    private Bank bank;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "post_id")
    private Post post;

    @Column(name = "iban")
    private String iban;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "town_id")
    private Town town;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "street_id")
    private Street street;

    @Column(name = "house_num")
    private int houseNumber;

    public Accountant() {}

    public Accountant(int olprecid, Passport passportSeries, int passportNumber, Bank bank, Post post, String iban, Town town,
                      Street street, int houseNumber, String surname, String name, String patronymic) {
        this.olprecid = olprecid;
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
        this.bank = bank;
        this.post = post;
        this.iban = iban;
        this.town = town;
        this.street = street;
        this.houseNumber = houseNumber;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public int getOlprecid() {
        return olprecid;
    }

    public void setOlprecid(int olprecid) {
        this.olprecid = olprecid;
    }

    public Passport getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(Passport passportSeries) {
        this.passportSeries = passportSeries;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
}
