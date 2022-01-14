package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models;

public class DistributorListViewModel
{
    private int id;
    private String name;
    private String phone;
    private double fee;
    private double rating;
    private int rating_count;
    private String username;
    private String password;

    public DistributorListViewModel(int id, String name, String phone, double fee, double rating, int rating_count, String username, String password) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.fee = fee;
        this.rating = rating;
        this.rating_count = rating_count;
        this.username = username;
        this.password = password;
    }

    public DistributorListViewModel() {

    }

    public DistributorListViewModel(String userName_d) {
    }

    public String toString()
    {return String.format(" %d | %s | %s | %f | %f | %d | %s | %s |",id,name,phone,fee,rating,rating_count,username,password);}
}
