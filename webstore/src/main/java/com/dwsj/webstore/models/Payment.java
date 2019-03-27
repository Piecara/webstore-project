package com.dwsj.webstore.models;

import javax.persistence.*;

@Entity
@Table(name = "Payment")
public class Payment {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "payment_type")
    private String paymentType;

/*   CAUSING AN ERROR
    @OneToOne(mappedBy="payment", cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private Payment payment;

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
*/
    public Payment() {
    }

    public Payment(String paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", paymentType='" + paymentType + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}
