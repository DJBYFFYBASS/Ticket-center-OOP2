package bg.tu_varna.sit.group25.ticketcenter.Application.data.entities;
import javax.persistence.*;
import java.util.Set;

@Table(name="organizer")
@Entity
public class Organizer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name="Organizer_ID",nullable = false)
    private int Organizer_ID;

    @Column(name="Name_O",nullable = false)
    private String Name_O;

    @Column(name="Phone_Number_O",nullable = false)
    private int Phone_Number_O;

    @Column(name="Fee_O",nullable = false)
    private String Fee_O;

    @Column(name="UserName_O",nullable = false)
    private String UserName_O_O;

    @Column(name="Password_O",nullable = false)
    private int Password_O;

    @OneToMany(mappedBy = "Show_ID")
    private Set<Show> showSet;


}
