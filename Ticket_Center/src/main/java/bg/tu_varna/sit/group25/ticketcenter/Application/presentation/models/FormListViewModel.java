package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models;

import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Customer;

public class FormListViewModel
{
    private int sold;
    private double price;
    private int distributor;
    private int customer;
    private int show;

    public FormListViewModel(int sold, double price, int distributor, int customer, int show) {
        this.sold = sold;
        this.price = price;
        this.distributor = distributor;
        this.customer = customer;
        this.show = show;
    }

    public String toString()
    {
        return String.format(" %d | %f | %d | %d | %d |",sold,price,distributor,customer,show);
    }
}
