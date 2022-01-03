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


    @Column(name="Distributor_ID",nullable = false)
    private int Distributor_ID;

    @Column(name="Show_ID",nullable = false)
    private int Show_ID;


    @Column(name="Customer_ID",nullable = false)
    private int Customer_ID;

    @ManyToOne
    @JoinColumn(name="Show_ID",nullable = false,insertable = false,updatable = false)
    private Show show;

    public Form(int sold_Tickets, double price_Ticket, int distributor_ID, int show_ID, int customer_ID, Show show) {
        Sold_Tickets = sold_Tickets;
        Price_Ticket = price_Ticket;
        Distributor_ID = distributor_ID;
        Show_ID = show_ID;
        Customer_ID = customer_ID;
        this.show = show;
    }

    public Form() {
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

    public int getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        Customer_ID = customer_ID;
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
                ", Distributor_ID=" + Distributor_ID +
                ", Show_ID=" + Show_ID +
                ", Customer_ID=" + Customer_ID +
                ", show=" + show +
                '}';
    }
}
