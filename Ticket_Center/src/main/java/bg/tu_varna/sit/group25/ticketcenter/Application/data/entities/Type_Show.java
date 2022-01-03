package bg.tu_varna.sit.group25.ticketcenter.Application.data.entities;

import javax.persistence.*;
import java.util.List;

@Table(name = "show_type",schema = "ticketcenter")
@Entity
@Embeddable
public class Type_Show {
    private static final long serialVersionUID=1L;
    @Id
    @JoinColumn(name = "Show_Type_ID",nullable = false)
    private int Show_Type_ID;

    @Column(name = "Type",nullable = false)
    private String Type;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "Show_Type_ID")
    private List<Show>shows;

    public int getShow_Type_ID() {
        return Show_Type_ID;
    }

    public void setShow_Type_ID(int show_Type_ID) {
        Show_Type_ID = show_Type_ID;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }


}
