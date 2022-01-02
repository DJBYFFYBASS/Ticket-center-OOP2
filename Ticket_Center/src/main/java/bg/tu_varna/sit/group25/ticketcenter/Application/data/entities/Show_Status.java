package bg.tu_varna.sit.group25.ticketcenter.Application.data.entities;
import javax.persistence.*;
import java.util.Set;

@Table(name="show_status",schema = "ticketcenter")
@Entity
public class Show_Status {
    @Id
    @JoinColumn(name="Show_Status_ID",nullable = false)
    private int Show_Status_ID;

    @Column(name="Status",nullable = false)
    private String Status;


    @OneToMany(mappedBy = "Status_ID")
    private Set<Show> showSet;
}
