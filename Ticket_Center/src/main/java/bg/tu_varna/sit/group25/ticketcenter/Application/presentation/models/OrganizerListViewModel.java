package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models;

public class OrganizerListViewModel
{
    private int id;
    private String name;
    private String phone;
    private double fee;
    private String username;
    private int password;

    public OrganizerListViewModel(int id, String name, String phone, double fee, String username, int password) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.fee = fee;
        this.username = username;
        this.password = password;
    }

    public OrganizerListViewModel(int organizer_id, String name_o, String getPhone_number_o, double fee_o, double fee_o1, String userName_o_o, int password_o) {
    }

    public OrganizerListViewModel() {

    }

    public String toString()
    {
        return String.format("%d | %s | %s | %f | %s | %d |",id,name,phone,fee,username,password);
    }
}
