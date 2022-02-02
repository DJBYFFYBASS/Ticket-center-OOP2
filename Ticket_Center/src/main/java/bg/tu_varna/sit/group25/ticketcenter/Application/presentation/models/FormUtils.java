package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models;

import bg.tu_varna.sit.group25.ticketcenter.Application.business.services.CustomerService;
import bg.tu_varna.sit.group25.ticketcenter.Application.business.services.ShowService;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Customer;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Form;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.CustomerRepository;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.FormRepository;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Customer;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.GregorianCalendar;

public class FormUtils {

    private static final String DATABASE_URL="jdbc:mysql://127.0.0.1:3306/TicketCenter";
    private static final String DATABASE_USERNAME="root";
    private static final String DATABASE_PASSWORD="Kyuubi279";
    private static final String INSERT_SHOW="INSERT INTO show (Show_ID,Show_Title,Show_Date,Location,MaxPlaces,Tickets,Show_Status_ID," +
            "Show_Type_ID,Organizer_ID,Distributor_ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String INSERT_FORM="INSERT INTO form(Form_ID,Sold_Tickets,Price_Ticket,Distributor_ID"+
            "Customer_Name,Show_Show_ID)";
    public static void TicketForm(String tfClientName,String tfClientPhonenumber,String tfTicketCount,String tfEvent, String tfTicketPrice)
    {//submit the related data to the DB in the correct places
        try(Connection connection=DriverManager.getConnection(DATABASE_URL,DATABASE_USERNAME,DATABASE_PASSWORD);
        PreparedStatement preparedStatement=connection.preparedStatement(INSERT_FORM))
        {
            preparedStatement.setString(1,tfClientName);
            preparedStatement.setString(2,tfClientPhonenumber);
            preparedStatement.setString(1,tfTicketCount);
            preparedStatement.setString(1,tfEvent);
            preparedStatement.setString(1,tfTicketPrice);

            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            printSQLException(e);
        }


    }

    public static void  printSQLException(SQLException ex)
    {
        for(Throwable e:ex)
        {
            if(e instanceof SQLException)
            {
                e.printStackTrace(System.err);
                System.err.println("SQL State: "+((SQLException)e).getSQLState());
                System.err.println("Error code: "+((SQLException)e).getErrorCode());
                System.err.println("Message: "+e.getMessage());
                Throwable t=ex.getCause();
                while (t !=null)
                {
                    System.out.println("Cause: "+t);
                    t=t.getCause();
                }
            }
        }
    }

    public static void EventFormCreate(int Show_ID,String Show_Title,GregorianCalendar Show_Date,String Location,int MaxPlaces,int Tickets,int Show_Status_ID,int Show_Type_ID,int Organizer_ID,int Distributor_ID)
    {//make DB connection and insert data


    }

    public static void EventFormUpdate(String Location,String Type,String Name,String Status,String Date,String Tickets,String Ticket_limit,String ID)
    {//make DB connection and update data at specified ID

    }

    public static void EventQry()
    {//make DB data display by eventName



    }

    public static void DisRateing(String Rateing,String disName)
    {//add the rateing to disName in the DB

    }

    public static void DisQuery(String name)
    {//make query by name in the DB

    }

}
