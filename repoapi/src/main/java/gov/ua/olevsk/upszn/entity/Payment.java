package gov.ua.olevsk.upszn.entity;

import javax.persistence.*;
import java.io.Serializable;

public class Payment implements Serializable {
    @GeneratedValue
    @Id
    @Column(name = "id")
    private int id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "acc_id")
    private Accountant accountant;

    @Column(name = "sum")
    private double sum;

    public Payment() {}

    public Payment(Accountant accountant, double sum) {
        this.accountant = accountant;
        this.sum = sum;
    }

    public Accountant getAccountant() {
        return accountant;
    }

    public void setAccountant(Accountant accountant) {
        this.accountant = accountant;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
