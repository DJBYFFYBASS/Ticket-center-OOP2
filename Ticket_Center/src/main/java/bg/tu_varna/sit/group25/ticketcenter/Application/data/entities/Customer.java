package bg.tu_varna.sit.group25.ticketcenter.Application.data.entities;

import javax.persistence.*;

@Table(name="customer")
@Entity
public class Customer {
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name="Customer_ID",nullable = false)
    private int Customer_ID;

    @Column(name="Customer_Name",nullable = false)
    private String Customer_Name;

    @Column(name="Phone_Number",nullable = false)
    private String Phone_Number;

    @Column(name="Ticket_Limit",nullable = false)
    private int Ticket_Limit;



    public int getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        Customer_ID = customer_ID;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        Customer_Name = customer_Name;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        Phone_Number = phone_Number;
    }

    public int getTicket_Limit() {
        return Ticket_Limit;
    }

    public void setTicket_Limit(int ticket_Limit) {
        Ticket_Limit = ticket_Limit;
    }

    @Override
    public String toString() {
        return "customer{" +
                "Customer_ID=" + Customer_ID +
                ", Customer_Name='" + Customer_Name + '\'' +
                ", Phone_Number='" + Phone_Number + '\'' +
                ", Ticket_Limit=" + Ticket_Limit +
                '}';
    }
}
