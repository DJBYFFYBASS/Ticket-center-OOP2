package bg.tu_varna.sit.group25.ticketcenter.Application.data.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Table(name="show_type")
@Entity
public class Show_Type implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @JoinColumn(name="Show_Type_ID",nullable = false)
    private int Show_Type_ID;

    @Column(name="Type",nullable = false)
    private int Type;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "show_type")
    private Set<Show> showSet;

    public int getShow_Type_ID() {
        return Show_Type_ID;
    }

    public void setShow_Type_ID(int show_Type_ID) {
        Show_Type_ID = show_Type_ID;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public Set<Show> getShowSet() {
        return showSet;
    }

    public void setShowSet(Set<Show> showSet) {
        this.showSet = showSet;
    }

    @Override
    public String toString() {
        return "Show_Type{" +
                "Show_Type_ID=" + Show_Type_ID +
                ", Type=" + Type +
                ", showSet=" + showSet +
                '}';
    }
}
