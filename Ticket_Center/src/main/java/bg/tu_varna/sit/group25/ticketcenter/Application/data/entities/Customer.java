package bg.tu_varna.sit.group25.ticketcenter.Application.data.entities;

import javax.persistence.*;
import java.io.Serializable;

@Table(name="CUSTOMER")
public class Customer implements Serializable
{
    private static final long selialversionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CUSTOMER_ID",nullable = false)
    private int CUSTOMER_ID;

    @Column(name="CUSTOMER_NAME",nullable = false)
    private String CUSTOMER_NAME;

    @Column(name="PHONE_NUMBER",nullable = false)
    private String PHONE_NUMBER;

    @Column(name="TICKET_LIMIT",nullable = false)
    private int TICKET_LIMIT;
    public int getCUSTOMER_ID() {
        return CUSTOMER_ID;
    }

    public int getTICKET_LIMIT() {
        return TICKET_LIMIT;
    }

    public void setTICKET_LIMIT(int TICKET_LIMIT) {
        this.TICKET_LIMIT = TICKET_LIMIT;
    }

    @Override
    public String toString() {
        return "Customer info [" +"\n"+
                "Customer's id= " + CUSTOMER_ID +"\n"+
                "Customer's name= " + CUSTOMER_NAME + "\n" +
                "Customer's phone number= " + PHONE_NUMBER + "\n" +
                "Customer's ticket limit= " + TICKET_LIMIT +
                ']';
    }
}
