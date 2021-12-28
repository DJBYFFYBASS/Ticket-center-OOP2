package bg.tu_varna.sit.group25.ticketcenter.Application.data.access;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Connection
{
    private static final Logger log=Logger.getLogger(Connection.class);
    private static SessionFactory sessionFactory;

    static
    {
        try {
            sessionFactory=new Configuration().configure().buildSessionFactory();
        }
        catch (Throwable ex)
        {
            log.error("Initial SessionFactory created fail"+ex);

        }

    }

    public static Session openSession()
    {
        return sessionFactory.openSession();
    }

    public static void openSessionClose() {
        sessionFactory.close();
    }
}
