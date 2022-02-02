package bg.tu_varna.sit.group25.ticketcenter.Application.data.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Table(name="customer")
@Entity

public class Customer implements Serializable{
private static final long serialVersionUID=1L;


    @Id
    @JoinColumn(name="Customer_ID",nullable = false)
    private Long Customer_ID;


    @Column(name = "Customer_Name",table = "customer")
    private String Customer_Name;


    @Column(name = "Phone_Number",table = "customer")
    private String Phone_Number;


    @Column(name = "Ticket_Limit",table = "customer")
    private int Ticket_Limit;

    @OneToMany(mappedBy = "customer")
    private Set<Form> forms;


    public Long getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(Long customer_ID) {
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

    public Set<Form> getForms() {
        return forms;
    }

    public void setForms(Set<Form> forms) {
        this.forms = forms;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Customer_ID=" + Customer_ID +
                ", Customer_Name='" + Customer_Name + '\'' +
                ", Phone_Number='" + Phone_Number + '\'' +
                ", Ticket_Limit=" + Ticket_Limit +
                ", forms=" + forms +
                '}';
    }
}
