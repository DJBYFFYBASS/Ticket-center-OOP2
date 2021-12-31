package bg.tu_varna.sit.group25.ticketcenter.Application.data.entities;
import javax.persistence.*;
import java.util.Set;

@Table(name="distributor")
@Entity
public class Distributor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name="Distributor_ID",nullable = false)
    private int Distributor_ID;

    @Column(name="Name_D",nullable = false)
    private String Name_D;

    @Column(name="Phone_Number_D",nullable = false)
    private String Phone_Number_D;

    @Column(name="Fee_D",nullable = false)
    private double Fee_D;

    @Column(name="Rating",nullable = false)
    private double Rating;

    @Column(name="Rating_Count",nullable = false)
    private int Rating_Count;


    @Column(name="UserName_D",nullable = false)
    private String UserName_D;

    @Column(name="Password_D",nullable = false)
    private int Password_D;

    @OneToMany(mappedBy = "Distributor_ID")
    private Set<Show> showSet;

    @OneToMany(mappedBy = "Distributor_ID")
    private Set<Form>formSet;

    public Distributor(String userName_D, int password_D) {
        UserName_D = userName_D;
        Password_D = password_D;
    }
    public Distributor(){}


    public int getDistributor_ID() {
        return Distributor_ID;
    }

    public void setDistributor_ID(int distributor_ID) {
        Distributor_ID = distributor_ID;
    }

    public String getName_D() {
        return Name_D;
    }

    public void setName_D(String name_D) {
        Name_D = name_D;
    }

    public String getPhone_Number_D() {
        return Phone_Number_D;
    }

    public void setPhone_Number_D(String phone_Number_D) {
        Phone_Number_D = phone_Number_D;
    }

    public double getFee_D() {
        return Fee_D;
    }

    public void setFee_D(double fee_D) {
        Fee_D = fee_D;
    }

    public double getRating() {
        return Rating;
    }

    public void setRating(double rating) {
        Rating = rating;
    }

    public double getRating_Count() {
        return Rating_Count;
    }

    public void setRating_Count(int rating_Count) {
        Rating_Count = rating_Count;
    }

    public String getUserName_D() {
        return UserName_D;
    }

    public void setUserName_D(String userName_D) {
        UserName_D = userName_D;
    }

    public int getPassword_D() {
        return Password_D;
    }

    public void setPassword_D(int password_D) {
        Password_D = password_D;
    }

    public Set<Show> getShowSet() {
        return showSet;
    }

    public void setShowSet(Set<Show> showSet) {
        this.showSet = showSet;
    }


    @Override
    public String toString() {
        return "Distributor{" +
                "Distributor_ID=" + Distributor_ID +
                ", Name_D='" + Name_D + '\'' +
                ", Phone_Number_D='" + Phone_Number_D + '\'' +
                ", Fee_D=" + Fee_D +
                ", Rating=" + Rating +
                ", Rating_Count=" + Rating_Count +
                ", UserName_D='" + UserName_D + '\'' +
                ", Password_D=" + Password_D +
                ", showSet=" + showSet +
                ", formSet=" + formSet +
                '}';
    }
}
