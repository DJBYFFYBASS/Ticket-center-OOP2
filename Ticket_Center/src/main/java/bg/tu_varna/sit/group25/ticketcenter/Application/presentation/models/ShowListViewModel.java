package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models;

import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Distributor;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Organizer;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Show_Status;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Show_Type;

import java.util.GregorianCalendar;

public class ShowListViewModel
{
    public int show_id;
    public String title;
    public String date;
    public String location;
    public int max;
    public int tickets;
    public String status;
    public String s_type;
    public String organizer;
    public String distributor;

    public ShowListViewModel(int s_id, String title, String date, String location, int max, int tickets, String status, String s_type, String organizer, String distributor) {
        this.show_id = s_id;
        this.title = title;
        this.date = date;
        this.location = location;
        this.max = max;
        this.tickets = tickets;
        this.status = status;
        this.s_type = s_type;
        this.organizer = organizer;
        this.distributor = distributor;
    }

    public ShowListViewModel(int show_id, String show_title, String show_date, String location, int maxPlaces, int tickets, Show_Status show_status, Show_Type show_type, Organizer organizer, Distributor distributor) {
        this.show_id = show_id;
        this.title = show_title;
        this.date = show_date;
        this.location = location;
        this.max = maxPlaces;
        this.tickets = tickets;
        this.status = show_status.getStatus();
        this.s_type = show_type.getType();
        this.organizer = organizer.getName_O();
        this.distributor = distributor.getName_D();
    }


    public String toString()
    {
        return String.format(" %d | %s | %s | %s | %d | %s | %s | %s | %s | %s ", this.show_id,title,date,location,max,title,status,s_type,organizer,distributor);
    }
}
