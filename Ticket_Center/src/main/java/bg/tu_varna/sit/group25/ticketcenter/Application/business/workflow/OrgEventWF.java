package bg.tu_varna.sit.group25.ticketcenter.Application.business.workflow;

import bg.tu_varna.sit.group25.ticketcenter.Application.business.services.OrganizerService;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.*;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.*;

import java.util.List;

public class OrgEventWF {
    OrganizerService service=  OrganizerService.getInstance();
    static ShowRepository repository=ShowRepository.getInstance();

    private static DistributorRepository Drepository =DistributorRepository.getInstance();
    private static StatusRepository statusrepository =StatusRepository.getInstance();
    private static TypeRepository typeepository =TypeRepository.getInstance();
    static boolean chk=true;

    public static void Add(String Title, String Date, String Location, String Max, String Tickets,String Status,String Type,Organizer Org ,String Distributor) {
        Show show=new Show();
        /*
        List<Organizer> orgList= Orepository.getLogin(username,pass);
        Organizer org=new Organizer();
        try{
            org=orgList.get(0);
            log=true;
        }catch (Exception e)
        {
            log=false;
        }
         */
        List<Show_Status> show_statusList= statusrepository.getInfo(Status);
        Show_Status status=new Show_Status();
        try{
            status=show_statusList.get(0);
            chk=true;
        }catch (Exception e)
        {
            chk=false;
        }
        List<Show_Type> show_types= typeepository.getInfo(Type);
        Show_Type type=new Show_Type();
        try{
            type=show_types.get(0);
            chk=true;
        }catch (Exception e)
        {
            chk=false;
        }
        Organizer organizer=new Organizer();
        organizer=Org;
        List<Distributor> disList= Drepository.getInfo(Distributor);
        Distributor distributor=new Distributor();
        try{
            distributor=disList.get(0);
            chk=true;
        }catch (Exception e)
        {
            chk=false;
        }
        int max=0;
        int tickets=0;
        boolean error = false;
        try {
            max = Integer.parseInt(Max);
            tickets = Integer.parseInt(Tickets);
        } catch (Exception e) {
            error=true;
        }
        if (!error) {
            show.setShow_Title(Title);
            show.setShow_Date(Date);
            show.setLocation(Location);
            show.setMaxPlaces(max);
            show.setTickets(tickets);
            show.setShow_status(status);
            show.setShow_type(type);
            show.setOrganizer(organizer);
            show.setDistributor(distributor);
            repository.save(show);
        }

    }
    public static void Update(String Title, String Date, String Location, String Max, String Tickets,String Status,String Type,String Organizer,String Distributor, String ID)
    { Show show=new Show();

        Show_Status status=new Show_Status();
        Show_Type type=new Show_Type();
        Organizer organizer=new Organizer();
        Distributor distributor= new Distributor();
        int max=0;
        int tickets=0;
        boolean error = false;
        try {
            max = Integer.parseInt(Max);
            tickets = Integer.parseInt(Tickets);
        } catch (Exception e) {
            error=true;
        }
        if (!error) {
            show.setShow_ID(Integer.parseInt(ID));
            if (Title!="")
            {
                show.setShow_Title(Title);
            }
            if (Date!="")
            {
                show.setShow_Date(Date);
            }
            if (Location!="")
            {
                show.setLocation(Location);
            }
            if (Max!="")
            {
                show.setMaxPlaces(max);
            }
            if (Tickets!="")
            {
                show.setTickets(tickets);
            }
            repository.update(show);
        }
    }
    public static void Delete(String Title, String Date, String Location, String Max, String Tickets,String Status,String Type,String Organizer,String Distributor,String ID)
    { Show show=new Show();
        Show_Status status=new Show_Status();
        Show_Type type=new Show_Type();
        Organizer organizer=new Organizer();
        Distributor distributor= new Distributor();
        int max=0;
        int tickets=0;
        boolean error = false;

        try {
            max = Integer.parseInt(Max);
            tickets = Integer.parseInt(Tickets);
        } catch (Exception e) {
            error=true;
        }
        show.setShow_ID(Integer.parseInt(ID));
        show.setShow_Title(Title);
        show.setShow_Date(Date);
        show.setLocation(Location);
        show.setMaxPlaces(max);
        show.setTickets(tickets);
        show.setShow_status(status);
        show.setShow_type(type);
        show.setOrganizer(organizer);
        show.setDistributor(distributor);
        repository.delete(show);
    }
}
