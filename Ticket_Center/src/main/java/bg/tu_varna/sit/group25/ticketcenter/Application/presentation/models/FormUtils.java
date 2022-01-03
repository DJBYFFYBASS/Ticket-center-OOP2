package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models;

import bg.tu_varna.sit.group25.ticketcenter.Application.business.services.CustomerService;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Customer;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Form;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.CustomerRepository;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.FormRepository;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Customer;

public class FormUtils {

    FormRepository formRepository=new FormRepository();
    CustomerRepository customerRepository=new CustomerRepository();
    CustomerService customerService=new CustomerService();
    public static void TicketForm(String name,String phoneNumber,String eventName,String ticketCount,String ticketPrice)
    {

        if (phoneNumber.length()>10)
        {

        }
    }

    public static void EventFormCreate(String Location,String Type,String Name,String Status,String Date,String Tickets,String Ticket_limit,String ID)
    {//make DB connection and insert data

    }
    public static void EventFormUpdate(String Location,String Type,String Name,String Status,String Date,String Tickets,String Ticket_limit,String ID)
    {//make DB connection and update data at specified ID

    }
    public static void DisRateing(String Rateing)
    {//add the rateing to

    }
}
