package bg.tu_varna.sit.group25.ticketcenter.Application.data.entities;
import bg.tu_varna.sit.group25.ticketcenter.Application.common.Constants;

import java.util.GregorianCalendar;
import javax.persistence.*;

@Entity
@Table(name = "`show`")
public class Show {
    private static final long serialVersionUID=1L;
    private static final String sName="`show`";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "Show_ID")
    private  int Show_ID;

    @Column(name = "Show_Title")
    private String Show_Title;

    @Column(name = "Show_Date")
    private GregorianCalendar Show_Date;

    @Column(name = "Location")
    private String Location;

    @Column(name = "MaxPlaces")
    private int MaxPlaces;

    @Column(name = "Tickets")
    private int Tickets;

    @ManyToOne
    @JoinColumn(name = "Show_Status_ID",nullable = false)
    private Show_Status show_status;

    @ManyToOne
    @JoinColumn(name = "Show_Type_ID",nullable = false)
    private Show_Type show_type;

    @ManyToOne
    @JoinColumn(name = "Organizer_ID",nullable = false)
    private Organizer organizer;

    @ManyToOne
    @JoinColumn(name = "Distributor_ID",nullable = false)
    private Distributor distributor;

    public int getShow_ID() {
        return Show_ID;
    }

    public void setShow_ID(int show_ID) {
        Show_ID = show_ID;
    }

    public String getShow_Title() {
        return Show_Title;
    }

    public void setShow_Title(String show_Title) {
        Show_Title = show_Title;
    }

    public GregorianCalendar getShow_Date() {
        return Show_Date;
    }

    public void setShow_Date(GregorianCalendar show_Date) {
        Show_Date = show_Date;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public int getMaxPlaces() {
        return MaxPlaces;
    }

    public void setMaxPlaces(int maxPlaces) {
        MaxPlaces = maxPlaces;
    }

    public int getTickets() {
        return Tickets;
    }

    public void setTickets(int tickets) {
        Tickets = tickets;
    }

    public Show_Status getShow_status() {
        return show_status;
    }

    public void setShow_status(Show_Status show_status) {
        this.show_status = show_status;
    }

    public Show_Type getShow_type() {
        return show_type;
    }

    public void setShow_type(Show_Type show_type) {
        this.show_type = show_type;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    public Distributor getDistributor() {
        return distributor;
    }

    public void setDistributor(Distributor distributor) {
        this.distributor = distributor;
    }

    @Override
    public String toString() {
        return "Show{" +
                "Show_ID=" + Show_ID +
                ", Show_Title='" + Show_Title + '\'' +
                ", Show_Date=" + Show_Date +
                ", Location='" + Location + '\'' +
                ", MaxPlaces=" + MaxPlaces +
                ", Tickets=" + Tickets +
                ", show_status=" + show_status +
                ", show_type=" + show_type +
                ", organizer=" + organizer +
                ", distributor=" + distributor +
                '}';
    }
}
