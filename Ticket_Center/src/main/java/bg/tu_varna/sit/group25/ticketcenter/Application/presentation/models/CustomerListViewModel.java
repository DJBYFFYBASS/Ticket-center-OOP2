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

    public CustomerListViewModel(int distributor_id, String name_d, String phone_number_d, double fee_d, double rating, double rating_count, String userName_d, String password_d) {
    }

    @Override
    public String toString() {
        return String.format( "%d | %s | %s | %d",summary, description, customer,limit);
    }
}
