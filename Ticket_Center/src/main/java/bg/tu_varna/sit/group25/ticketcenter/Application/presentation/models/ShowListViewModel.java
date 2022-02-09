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
    public GregorianCalendar date;
    public String location;
    public int max;
    public int tickets;
    public long status;
    public String s_type;
    public int organizer;
    public int distributor;

    public ShowListViewModel(int s_id, String title, GregorianCalendar date, String location, int max, int tickets, int status, String s_type, int organizer, int distributor) {
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

    public ShowListViewModel(int show_id, String show_title, GregorianCalendar show_date, String location, int maxPlaces, int tickets, Show_Status show_status, Show_Type show_type, Organizer organizer, Distributor distributor) {
    }


    public String toString()
    {
        return String.format(" %d | %s | %s | %s | %d | %s | %d | %s | %d | %d ", show_id,title,date,location,max,title,status,s_type,organizer,distributor);
    }
}
