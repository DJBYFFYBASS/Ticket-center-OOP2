package bg.tu_varna.sit.group25.ticketcenter.Application.data.entities;
import javax.persistence.*;
import java.util.GregorianCalendar;
import java.util.List;

@Table(name="show",schema = "ticketcenter")
@Entity
public class Show {
    @Id
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

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "Show_ID")
    private List<Form> forms;

    @ManyToOne
    @JoinColumn(name="Distributor_ID",nullable = false)
    private Distributor Distributor_ID;

    @Embedded
    Status_Show status_show;

    @Embedded
    Type_Show type_show;
}
