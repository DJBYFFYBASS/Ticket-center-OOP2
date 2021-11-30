package bg.tu_varna.sit.group25.ticketcenter.Application.data.entities;

import javax.persistence.*;
import java.util.Set;

@Table(name="DISTRIBUTOR")
@Entity
public class Distributor
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="DISTRIBUTOR_ID",nullable = false)
    private int DISTRIBUTOR_ID;

    @Column(name="NAME_D",nullable = false)
    private String NAME_D;

    @Column(name="PHONE_NUMBER_D",nullable = false)
    private String PHONE_NUMBER_D;

    @Column(name="FEE_D",nullable = false)
    private double FEE_D;

    @Column(name="RATING",nullable = false)
    private double RATING;

    @Column(name="USERNAME_D",nullable = false)
    private String USERNAME_D;

    @Column(name="PASSWOR_D",nullable = false)
    private int PASSWOR_D;



    public int getDISTRIBUTOR_ID() {
        return DISTRIBUTOR_ID;
    }

    public void setDISTRIBUTOR_ID(int DISTRIBUTOR_ID) {
        this.DISTRIBUTOR_ID = DISTRIBUTOR_ID;
    }

    public String getNAME_D() {
        return NAME_D;
    }

    public void setNAME_D(String NAME_D) {
        this.NAME_D = NAME_D;
    }

    public String getPHONE_NUMBER_D() {
        return PHONE_NUMBER_D;
    }

    public void setPHONE_NUMBER_D(String PHONE_NUMBER_D) {
        this.PHONE_NUMBER_D = PHONE_NUMBER_D;
    }

    public double getFEE_D() {
        return FEE_D;
    }

    public void setFEE_D(double FEE_D) {
        this.FEE_D = FEE_D;
    }

    public double getRATING() {
        return RATING;
    }

    public void setRATING(double RATING) {
        this.RATING = RATING;
    }

    public String getUSERNAME_D() {
        return USERNAME_D;
    }

    public void setUSERNAME_D(String USERNAME_D) {
        this.USERNAME_D = USERNAME_D;
    }

    public int getPASSWOR_D() {
        return PASSWOR_D;
    }

    public void setPASSWOR_D(int PASSWOR_D) {
        this.PASSWOR_D = PASSWOR_D;
    }

    @Override
    public String toString() {
        return "Distributor info"+"\n"+"[" +
                " Distributor's id= " + DISTRIBUTOR_ID +"\n"+
                "Name= " + NAME_D + '\n' +
                "Phone number= " + PHONE_NUMBER_D + '\n' +
                "RATING=" + RATING +"\n"+
                "USERNAME_D='" + USERNAME_D + ']';
    }
}
