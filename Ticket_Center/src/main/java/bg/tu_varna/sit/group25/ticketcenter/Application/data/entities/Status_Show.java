package bg.tu_varna.sit.group25.ticketcenter.Application.data.entities;

import javax.persistence.*;
import java.util.List;

@Table(name = "status_show")
@Entity
public class Status_Show
{
    private static final long serialVersionUID=1L;

    @Id
    @Column(name = "Show_Status_ID",nullable = false)
    private int Show_Status_ID;

    @Column(name = "Status",nullable = false)
    private String Status;

    public int getShow_Status_ID() {
        return Show_Status_ID;
    }

    public void setShow_Status_ID(int show_Status_ID) {
        Show_Status_ID = show_Status_ID;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "Show_Status_ID")
    private List<Show>shows;
}
