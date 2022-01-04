package bg.tu_varna.sit.group25.ticketcenter.Application.data.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Entity
@Table(name="organizer")
public class Organizer implements Serializable {
    private static final long serialVersionUID=1L;


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @JoinColumn(name = "Organizer_ID",nullable = false)
    private int Organizer_ID;

    @Column(name = "Name_O",nullable = false)
    private String Name_O;

    @Column(name = "Phone_Number_O",nullable = false)
    private String Phone_Number_O;

    @Column(name = "Fee_O",nullable = false)
    private double Fee_O;

    @Column(name = "UserName_O",nullable = false)
    private String UserName_O;

    @Column(name = "Password_O",nullable = false)
    private int Password_O;

    @OneToMany(mappedBy = "organizer")
    private List<Show> shows;

    public Organizer(int organizer_ID, String name_O, String phone_Number_O, double fee_O, String userName_O, int password_O) {
       this.Organizer_ID = organizer_ID;
        this.Name_O = name_O;
        this.Phone_Number_O = phone_Number_O;
        this.Fee_O = fee_O;
        this.UserName_O = userName_O;
        this.Password_O = password_O;
    }

    public Organizer() {
    }

    public int getOrganizer_ID() {
        return Organizer_ID;
    }

    public void setOrganizer_ID(int organizer_ID) {
        Organizer_ID = organizer_ID;
    }

    public String getName_O() {
        return Name_O;
    }

    public void setName_O(String name_O) {
        Name_O = name_O;
    }

    public String getPhone_Number_O() {
        return Phone_Number_O;
    }

    public void setPhone_Number_O(String phone_Number_O) {
        Phone_Number_O = phone_Number_O;
    }

    public double getFee_O() {
        return Fee_O;
    }

    public void setFee_O(double fee_O) {
        Fee_O = fee_O;
    }

    public String getUserName_O() {
        return UserName_O;
    }

    public void setUserName_O(String userName_O) {
        UserName_O = userName_O;
    }

    public int getPassword_O() {
        return Password_O;
    }

    public void setPassword_O(int password_O) {
        Password_O = password_O;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }

    @Override
    public String toString() {
        return "Organizer{" +
                "Organizer_ID=" + Organizer_ID +
                ", Name_O='" + Name_O + '\'' +
                ", Phone_Number_O='" + Phone_Number_O + '\'' +
                ", Fee_O=" + Fee_O +
                ", UserName_O='" + UserName_O + '\'' +
                ", Password_O='" + Password_O + '\'' +
                ", shows=" + shows +
                '}';
    }
}
