package bg.tu_varna.sit.group25.ticketcenter.Application.data.entities;
import javax.persistence.*;
import java.util.Set;

@Table(name="FORM")
public class Form
{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "SOLD_TICKETS",nullable = false)
    private int SOLD_TICKETS;

    @Column(name="PRICE_TICKET",nullable = false)
    private double PRICE_TICKET;

    @Column(name="TICKET_TYPE",nullable = false)
    private String TICKET_TYPE;

    @Column(name="CUSTOMER_ID",nullable = false)
    private int CUSTOMER_ID;

    @Column(name="PLACE_ID",nullable = false)
    private int PLACE_ID;

    @Column(name="DISTRIBUTOR_ID",nullable = false)
    private int DISTRIBUTOR_ID;

    @Column(name="SHOW_ID",nullable = false)
    private int SHOW_ID;

    @OneToMany(mappedBy = "Task")
    private Set<Distributor>distributorSet;

    @OneToMany(mappedBy = "Task")
    private Set<Customer>customerSet;

    @OneToMany(mappedBy = "Task")
    private Set<SHOW>showSet;

    @OneToMany(mappedBy = "Task")
    private Set<LOCATION_SHOW>location_showSet;

    @OneToMany(mappedBy = "Task")
    private Set<SHOW>placeSet;

    public int getSOLD_TICKETS() {
        return SOLD_TICKETS;
    }

    public void setSOLD_TICKETS(int SOLD_TICKETS) {
        this.SOLD_TICKETS = SOLD_TICKETS;
    }

    public double getPRICE_TICKET() {
        return PRICE_TICKET;
    }

    public void setPRICE_TICKET(double PRICE_TICKET) {
        this.PRICE_TICKET = PRICE_TICKET;
    }

    public String getTICKET_TYPE() {
        return TICKET_TYPE;
    }

    public void setTICKET_TYPE(String TICKET_TYPE) {
        this.TICKET_TYPE = TICKET_TYPE;
    }

    public int getCUSTOMER_ID() {
        return CUSTOMER_ID;
    }

    public void setCUSTOMER_ID(int CUSTOMER_ID) {
        this.CUSTOMER_ID = CUSTOMER_ID;
    }

    public int getPLACE_ID() {
        return PLACE_ID;
    }

    public void setPLACE_ID(int PLACE_ID) {
        this.PLACE_ID = PLACE_ID;
    }

    public int getDISTRIBUTOR_ID() {
        return DISTRIBUTOR_ID;
    }

    public void setDISTRIBUTOR_ID(int DISTRIBUTOR_ID) {
        this.DISTRIBUTOR_ID = DISTRIBUTOR_ID;
    }

    public int getSHOW_ID() {
        return SHOW_ID;
    }

    public void setSHOW_ID(int SHOW_ID) {
        this.SHOW_ID = SHOW_ID;
    }

    public Set<Distributor> getDistributorSet() {
        return distributorSet;
    }

    public void setDistributorSet(Set<Distributor> distributorSet) {
        this.distributorSet = distributorSet;
    }

    public void setCustomerSet(Set<Customer> customerSet) {
        this.customerSet = customerSet;
    }

    public void setShowSet(Set<SHOW> showSet) {
        this.showSet = showSet;
    }

    public void setLocation_showSet(Set<LOCATION_SHOW> location_showSet) {
        this.location_showSet = location_showSet;
    }

    public void setPlaceSet(Set<SHOW> placeSet) {
        this.placeSet = placeSet;
    }

    @Override
    public String toString() {
        return "Form{" +
                "SOLD_TICKETS=" + SOLD_TICKETS +
                ", PRICE_TICKET=" + PRICE_TICKET +
                ", TICKET_TYPE='" + TICKET_TYPE + '\'' +
                ", CUSTOMER_ID=" + CUSTOMER_ID +
                ", PLACE_ID=" + PLACE_ID +
                ", DISTRIBUTOR_ID=" + DISTRIBUTOR_ID +
                ", SHOW_ID=" + SHOW_ID +
                '}';
    }
}
