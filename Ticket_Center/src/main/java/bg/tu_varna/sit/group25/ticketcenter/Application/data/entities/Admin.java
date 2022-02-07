package bg.tu_varna.sit.group25.ticketcenter.Application.data.entities;


import javax.persistence.*;
import java.io.Serializable;

@Table(name="admin")
@Entity

public class Admin implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @JoinColumn(name = "Admin_id", nullable = false)
    private Long Admin_ID;


    @Column(name = "Name", table = "admin")
    private String Admin_Name;


    @Column(name = "Password", table = "admin")
    private String Admin_Pass;

    @Override
    public String toString() {
        return "Admin{" +
                "Admin_ID=" + Admin_ID +
                ", Name='" + Admin_Name +"\'"+
                ", Password='" + Admin_Pass +"\'"+
                '}';
    }
}
