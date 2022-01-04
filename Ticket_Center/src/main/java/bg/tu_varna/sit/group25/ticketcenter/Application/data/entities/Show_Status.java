package bg.tu_varna.sit.group25.ticketcenter.Application.data.entities;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Table(name="show_status")
@Entity
public class Show_Status implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @JoinColumn(name="Show_Status_ID",nullable = false)
    private long Show_Status_ID;

    @Column(name="Status",nullable = false)
    private String Status;


    @OneToMany(mappedBy = "show_status")
    private Set<Show> showSet;

    public long getShow_Status_ID() {
        return Show_Status_ID;
    }

    public void setShow_Status_ID(long show_Status_ID) {
        Show_Status_ID = show_Status_ID;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Set<Show> getShowSet() {
        return showSet;
    }

    public void setShowSet(Set<Show> showSet) {
        this.showSet = showSet;
    }

    @Override
    public String toString() {
        return "Show_Status{" +
                "Show_Status_ID=" + Show_Status_ID +
                ", Status='" + Status + '\'' +
                ", showSet=" + showSet +
                '}';
    }
}
