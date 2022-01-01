package bg.tu_varna.sit.group25.ticketcenter.Application.data.entities;

import javax.persistence.*;
import java.util.Set;

@Table(name="form")
@Entity
public class Form {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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


    @OneToMany(mappedBy = "Distributor_ID")
    private Set<Distributor>distributorSet;

    @OneToMany(mappedBy = "Customer_ID")
    private Set<Customer>customerSet;

    @OneToMany(mappedBy = "Show_ID")
    private Set<Show>showSet;

    public Form(String text, String text1, String text2, String text3, String text4, String text5, String text6, String text7) {
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

    public Set<Distributor> getDistributorSet() {
        return distributorSet;
    }

    public void setDistributorSet(Set<Distributor> distributorSet) {
        this.distributorSet = distributorSet;
    }

    public Set<Customer> getCustomerSet() {
        return customerSet;
    }

    public void setCustomerSet(Set<Customer> customerSet) {
        this.customerSet = customerSet;
    }

    public Set<Show> getShowSet() {
        return showSet;
    }

    public void setShowSet(Set<Show> showSet) {
        this.showSet = showSet;
    }

    @Override
    public String toString() {
        return "form{" +
                "Sold_Tickets=" + Sold_Tickets +
                ", Price_Ticket=" + Price_Ticket +
                ", Customer_ID=" + Customer_ID +
                ", Distributor_ID=" + Distributor_ID +
                ", Show_ID=" + Show_ID +
                ", distributorSet=" + distributorSet +
                ", customerSet=" + customerSet +
                ", showSet=" + showSet +
                '}';
    }
}
