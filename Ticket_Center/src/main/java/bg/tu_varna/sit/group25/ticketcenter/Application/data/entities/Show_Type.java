package bg.tu_varna.sit.group25.ticketcenter.Application.data.entities;

import javax.persistence.*;
import java.util.Set;

@Table(name="show_type",schema = "ticketcenter")
@Entity
public class Show_Type {
    @Id
    @JoinColumn(name="Show_Type_ID",nullable = false)
    private int Show_Type_ID;

    @Column(name="Type",nullable = false)
    private int Type;

    @OneToMany(mappedBy = "Show_ID")
    private Set<Show> showSet;

}
