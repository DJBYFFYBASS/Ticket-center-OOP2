package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models;

import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Customer;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Distributor;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Show;

public class FormListViewModel
{
    private int sold;
    private double price;
    private long distributor;
    private int customer;
    private int show;

    public FormListViewModel(int sold, double price, long distributor, int customer, int show) {
        this.sold = sold;
        this.price = price;
        this.distributor = distributor;
        this.customer = customer;
        this.show = show;
    }

    public FormListViewModel(int sold_tickets, double price_ticket, Distributor distributor, Customer customer, Show show) {
    }

    public FormListViewModel(long sold_tickets, double price_ticket, int distributor_id, Long customer_id, int show_id) {
    }

    public String toString()
    {
        return String.format(" %d | %f | %d | %d | %d |",sold,price,distributor,customer,show);
    }
}
