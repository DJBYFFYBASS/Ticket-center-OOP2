package bg.tu_varna.sit.group25.ticketcenter.Application.data.entities;

import javax.persistence.*;
import java.util.Set;

@Table(name="Form",schema = "ticketcenter")
@SecondaryTable(name="Customer",pkJoinColumns = @PrimaryKeyJoinColumn(name = "Customer_ID"))
@Entity
public class Form {
    @Id
    @Column(name= "Sold_Tickets",nullable = false)
    private int Sold_Tickets;

    @Column(name="Price_Ticket",nullable = false)
    private double Price_Ticket;

    @Column(name="Customer_ID",nullable = false)
    private int Customer_ID;

    @Column(name="Distributor_ID",nullable = false)
    private int Distributor_ID;

    @Column(name="Show_ID",nullable = false)
    private int Show_ID;

    @Embedded
    Customer customer;

    @ManyToOne
    @JoinColumn(name="Show_ID",nullable = false)
    private Show show;

    public Form() {
    }

    public Form(int sold_Tickets, double price_Ticket, int customer_ID, int distributor_ID, int show_ID, Customer customer) {
        Sold_Tickets = sold_Tickets;
        Price_Ticket = price_Ticket;
        Customer_ID = customer_ID;
        Distributor_ID = distributor_ID;
        Show_ID = show_ID;
        this.customer = customer;
    }

    public int getSold_Tickets() {
        return Sold_Tickets;
    }

    public void setSold_Tickets(int sold_Tickets) {
        Sold_Tickets = sold_Tickets;
    }

    public double getPrice_Ticket() {
        return Price_Ticket;
    }

    public void setPrice_Ticket(double price_Ticket) {
        Price_Ticket = price_Ticket;
    }

    public int getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        Customer_ID = customer_ID;
    }

    public int getDistributor_ID() {
        return Distributor_ID;
    }

    public void setDistributor_ID(int distributor_ID) {
        Distributor_ID = distributor_ID;
    }

    public int getShow_ID() {
        return Show_ID;
    }

    public void setShow_ID(int show_ID) {
        Show_ID = show_ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "form{" +
                "Sold_Tickets=" + Sold_Tickets +
                ", Price_Ticket=" + Price_Ticket +
                ", Customer_ID=" + Customer_ID +
                ", Distributor_ID=" + Distributor_ID +
                ", Show_ID=" + Show_ID +
                '}';
    }
}
