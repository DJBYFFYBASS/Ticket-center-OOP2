package bg.tu_varna.sit.group25.ticketcenter.Application.business.workflow;

import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.service.ServiceRegistry;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import org.apache.log4j.Logger;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class FormUtils {


    static Session session;
    static SessionFactory sessionFactory;
    public final static Logger logger=Logger.getLogger(FormUtils.class);

    public static SessionFactory buildSessionFactory()
    {
        Configuration configuration=new Configuration();

        configuration.configure("jdbc:mysql://127.0.0.1:3306/TicketCenter");

        ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().applySettings(configuration.getNamedSQLQueries()).build();
        sessionFactory=configuration.buildSessionFactory(serviceRegistry);
        return sessionFactory;
        }

/*
    private static final String DATABASE_URL="jdbc:mysql://127.0.0.1:3306/TicketCenter";
    private static final String DATABASE_USERNAME="root";
    private static final String DATABASE_PASSWORD="Kyuubi279";
    private static final String INSERT_SHOW="INSERT INTO show (Show_ID,Show_Title,Show_Date,Location,MaxPlaces,Tickets,Show_Status_ID," +
            "Show_Type_ID,Organizer_ID,Distributor_ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String INSERT_FORM="INSERT INTO form(Sold_Tickets,Price_Ticket,Distributor_ID"+
            "Customer_Name,Show_Show_ID)";
 */
    public static void TicketForm(String tfClientName,String tfClientPhonenumber,String tfTicketCount,String tfEvent, String tfTicketPrice)
    {//submit the related data to the DB in the correct places
        /*try(Connection connection=DriverManager.getConnection(DATABASE_URL,DATABASE_USERNAME,DATABASE_PASSWORD);
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

         */
    }
/*
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

    public static void EventFormCreate(String Show_Title,String Show_Date,String Location,String MaxPlaces,String Tickets,String Show_Status_ID,String Show_Type_ID,String Distributor)
    {//make DB connection and insert data
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

        int count=0;
        Show show;
        try{
        session= buildSessionFactory().openSession();

        Location=sdf.format(DateFormat.getDateInstance());

        session.beginTransaction();

        for(int j=1; j<=15;j++)
        {
         count=count+1;
         show=new Show();
         show.setShow_ID(Show_ID);
         show.setShow_Title(Show_Title);
         show.setShow_Date(Show_Date);
         show.setLocation(Location);
         show.setMaxPlaces(MaxPlaces);
         show.setTickets(Tickets);
         show.setShow_status(Show_Status_ID);
         show.setShow_type(Show_Type_ID);
         show.setOrganizer(Organizer_ID);
         show.setDistributor(Distributor_ID);
         session.save(show);
        }

        session.getTransaction().commit();
        logger.info("Success");
        }
        catch (Exception sqlException)
        {
            if(null !=session.getTransaction())
            {
                logger.info("....");
                session.getTransaction().rollback();
            }
            sqlException.printStackTrace();
        }
        finally {
            if(session !=null)
            {
                session.close();
            }
        }
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
