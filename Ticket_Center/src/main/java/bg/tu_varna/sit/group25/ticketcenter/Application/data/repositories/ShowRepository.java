package bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories;

import bg.tu_varna.sit.group25.ticketcenter.Application.data.access.Connection;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Organizer;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Show;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Show_Status;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.net.PortUnreachableException;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class ShowRepository implements DAORepository<Show>
{

    private static class  ShowRepositoryHolder
    {
        public static final  ShowRepository INSTANCE=new  ShowRepository();
    }
    public static ShowRepository getInstance()
    {
        return ShowRepository.ShowRepositoryHolder.INSTANCE;
    }
    private static final Logger log=Logger.getLogger(ShowRepository.class);

    @Override
    public void save(Show obj) {
        Session session= Connection.openSession();
        Transaction transaction=session.beginTransaction();
        try {
            session.save(obj);
            log.info("Show saved successfully");
        }
        catch (Exception ex)
        {
            log.error("Show save error"+ex.getMessage());
        }
        finally {
            transaction.commit();
        }
    }

    @Override
    public void update(Show obj) {
        Session session= Connection.openSession();
        Transaction transaction=session.beginTransaction();
        try {
            session.update(obj);
            log.info("Show saved successfully");
        }
        catch (Exception ex)
        {
            log.error("Show save error"+ex.getMessage());
        }
        finally {
            transaction.commit();
        }
    }

    @Override
    public void delete(Show obj) {
        Session session= Connection.openSession();
        Transaction transaction=session.beginTransaction();
        try {
            session.delete(obj);
            log.info("Show saved successfully");
        }
        catch (Exception ex)
        {
            log.error("Show save error"+ex.getMessage());
        }
        finally {
            transaction.commit();
        }
    }

    @Override
    public Optional<Show> getById(int id) {
        return Optional.empty();
    }


    @Override
    public List<Show> getAll()
    {
        Session session1=Connection.openSession();
        Transaction transaction= session1.beginTransaction();
        List<Show> shows=new LinkedList<>();
        try
        {
//            String jpql = "SELECT s FROM Show s";
            String jpql = "FROM Show ";
            Query<Show> query = session1.createQuery(jpql, Show.class);
            shows.addAll(query.list());
            log.info("get all customers");
        }
        catch (Exception ex)
        {
            log.error(ex.getMessage());
        }
        finally
        {
            transaction.commit();
        }
        return shows;
    }

    @Override
    public List<Show> getLogin(String User,String Pass) {
        return null;
    }

    @Override
    public List<Show> getInfo(String Name) {
        Session session= Connection.openSession();
        Transaction transaction= session.beginTransaction();
        List<Show> list=new LinkedList<>();
        String name=Name;
        try {
            String jpql = "SELECT t FROM Show t where organizer ='"+name+"'";
            list.addAll(session.createQuery(jpql, Show.class).getResultList());
            log.info("get all customers");
        }
        catch (Exception ex)
        {
            log.error("Get Customer error: "+ex.getMessage());
        }
        finally {
            transaction.commit();
        }
        return list;
    }
    public List<Show> getInfo(int Name) {
        Session session= Connection.openSession();
        Transaction transaction= session.beginTransaction();
        List<Show> list=new LinkedList<>();
        int name=Name;
        try {
            String jpql = "SELECT t FROM Show t where organizer ='"+name+"'";
            list.addAll(session.createQuery(jpql, Show.class).getResultList());
            log.info("get all customers");
        }
        catch (Exception ex)
        {
            log.error("Get Customer error: "+ex.getMessage());
        }
        finally {
            transaction.commit();
        }
        return list;
    }

    @Override
    public List<Show> infoById(String id) {
        Session session= Connection.openSession();
        Transaction transaction= session.beginTransaction();
        List<Show> list=new LinkedList<>();
        String name=id;
        try {
            String jpql = "SELECT t FROM Show t where Show_ID='"+name+"'";
            list.addAll(session.createQuery(jpql, Show.class).getResultList());
            log.info("get all customers");
        }
        catch (Exception ex)
        {
            log.error("Get Customer error: "+ex.getMessage());
        }
        finally {
            transaction.commit();
        }
        return list;
    }
}
