package com.dwsj.webstore.payment;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
@Getter
@Setter
@ToString
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

}
