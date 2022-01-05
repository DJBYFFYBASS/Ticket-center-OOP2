package bg.tu_varna.sit.group25.ticketcenter.Application.data.entities;

import javax.persistence.*;
import java.util.Set;

@Table(name="Form")
@Entity
public class Form {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Form_ID",nullable = false)
    private long Form_Id;

    @Column(name= "Sold_Tickets",nullable = false)
    private long Sold_Tickets;

    @Column(name="Price_Ticket",nullable = false)
    private double Price_Ticket;

    @ManyToOne
    @JoinColumn(name="Distributor_ID",nullable = false)
    private Distributor distributor;

    @ManyToOne
    @JoinColumn(name="Customer_ID",nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name="Show_ID",nullable = false)
    private Show show;

    public Form() {
    }

    public long getSold_Tickets() {
        return Sold_Tickets;
    }

    public void setSold_Tickets(long sold_Tickets) {
        Sold_Tickets = sold_Tickets;
    }

    public double getPrice_Ticket() {
        return Price_Ticket;
    }

    public void setPrice_Ticket(double price_Ticket) {
        Price_Ticket = price_Ticket;
    }

    public Distributor getDistributor() {
        return distributor;
    }

    public void setDistributor(Distributor distributor) {
        this.distributor = distributor;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    @Override
    public String toString() {
        return "Form{" +
                "Sold_Tickets=" + Sold_Tickets +
                ", Price_Ticket=" + Price_Ticket +
                ", distributor=" + distributor +
                ", customer=" + customer +
                ", show=" + show +
                '}';
    }
}
