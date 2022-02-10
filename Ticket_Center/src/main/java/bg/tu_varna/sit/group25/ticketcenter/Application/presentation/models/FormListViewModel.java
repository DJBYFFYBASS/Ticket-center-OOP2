package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models;

import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Customer;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Distributor;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Show;

public class FormListViewModel
{
    private int sold;
    private double price;
    private String distributor;
    private String customer;
    private String show;

    public FormListViewModel(int sold, double price, String distributor, String customer, String show) {
        this.sold = sold;
        this.price = price;
        this.distributor = distributor;
        this.customer = customer;
        this.show = show;
    }

    public FormListViewModel(int sold_tickets, double price_ticket, Distributor distributor, Customer customer, Show show) {
        this.sold=sold_tickets;
        this.price=price_ticket;
        this.distributor=distributor.getName_D();
        this.customer=customer.getCustomer_Name();
        this.show=show.getShow_Title();
    }


    public String toString()
    {
        return String.format(" %s | %s | %d | %f | %s |",customer,show,sold,price,distributor);
    }
}
