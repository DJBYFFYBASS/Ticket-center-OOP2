package bg.tu_varna.sit.group25.ticketcenter.Application.business.workflow;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FormUtils {

    private static final String DATABASE_URL="jdbc:mysql://127.0.0.1:3306/TicketCenter";
    private static final String DATABASE_USERNAME="root";
    private static final String DATABASE_PASSWORD="Kyuubi279";
    private static final String INSERT_SHOW="INSERT INTO show (Show_ID,Show_Title,Show_Date,Location,MaxPlaces,Tickets,Show_Status_ID," +
            "Show_Type_ID,Organizer_ID,Distributor_ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String INSERT_FORM="INSERT INTO form(Sold_Tickets,Price_Ticket,Distributor_ID"+
            "Customer_Name,Show_Show_ID)";
    public static void TicketForm(String tfClientName,String tfClientPhonenumber,String tfTicketCount,String tfEvent, String tfTicketPrice)
    {//submit the related data to the DB in the correct places
        try(Connection connection=DriverManager.getConnection(DATABASE_URL,DATABASE_USERNAME,DATABASE_PASSWORD);
        PreparedStatement preparedStatement=connection.prepareStatement(INSERT_FORM))
        {
            preparedStatement.setString(1,tfTicketCount);
            preparedStatement.setString(2,tfTicketPrice);
            preparedStatement.setString(3,tfClientPhonenumber);
            preparedStatement.setString(4,tfClientName);
            preparedStatement.setString(5,tfEvent);

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

    public static void EventFormCreate(String Show_Title,String Show_Date,String Location,String MaxPlaces,String Tickets,String Show_Status_ID,String Show_Type_ID)
    {//make DB connection and insert data


    }

    public static void EventFormUpdate(String text, String Location, String Type, String Name, String Status, String Date, String Tickets, String Ticket_limit)
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
