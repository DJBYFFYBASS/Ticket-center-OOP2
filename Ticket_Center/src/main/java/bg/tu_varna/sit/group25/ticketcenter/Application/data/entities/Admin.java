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

    public Long getAdmin_ID(){ return Admin_ID;}
    public void setAdmin_ID(long ID){Admin_ID=ID;}

    public String getAdmin_Name(){return Admin_Name;}
    public void setAdmin_Name(String name){Admin_Name=name;}

    public String getAdmin_Pass(){return Admin_Pass;}
    public void setAdmin_Pass(String pass){Admin_Pass=pass;}

    @Override
    public String toString() {
        return "Admin{" +
                "Admin_ID=" + Admin_ID +
                ", Name='" + Admin_Name +"\'"+
                ", Password='" + Admin_Pass +"\'"+
                '}';
    }
}
