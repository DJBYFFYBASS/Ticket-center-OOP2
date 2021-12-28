package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models;

public class CustomerListViewModel {
    private int summary;
    private String description;
    private String customer;
    private int limit;

    public CustomerListViewModel(int summary, String description, String customer,int limit) {
        this.summary = summary;
        this.description = description;
        this.customer = customer;
        this.limit=limit;
    }

    @Override
    public String toString() {
        return String.format( "%d | %s | %s | %d",summary, description, customer,limit);
    }
}
