package bg.tu_varna.sit.group25.ticketcenter.Application.data.entities;
import javax.persistence.*;
import java.util.GregorianCalendar;
@Table(name="show")
@Entity
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name="Show_ID",nullable = false)
    private int Show_ID;

    @Column(name="Show_Title",nullable = false)
    private String Show_Title;


    @Column(name="Show_Date",nullable = false)
    private GregorianCalendar Show_Date;

    @Column(name="Location",nullable = false)
    private String Location;

    @Column(name="MaxPlaces",nullable = false)
    private int MaxPlaces;

    @Column(name="Tickets",nullable = false)
    private int Tickets;

    @ManyToOne
    @JoinColumn(name="Show_Status_ID",nullable = false)
    private Show_Status Status_ID;

    @ManyToOne
    @JoinColumn(name = "Show_Type_ID",nullable = false)
    private Show_Type Type_ID;


    @ManyToOne
    @JoinColumn(name="Organizer_ID",nullable = false)
    private Organizer Organizer_ID;

    @ManyToOne
    @JoinColumn(name="Distributor_ID",nullable = false)
    private Distributor Distributor_ID;
}
