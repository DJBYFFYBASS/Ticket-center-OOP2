package bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories;

import bg.tu_varna.sit.group25.ticketcenter.Application.data.access.Connection;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Organizer;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class OrganizerRepository implements DAORepository<Organizer>
{
    private static class  OrganizerRepositoryHolder
    {
        public static final  OrganizerRepository INSTANCE=new  OrganizerRepository();
    }
    public static OrganizerRepository getInstance()
    {
        return OrganizerRepository.OrganizerRepositoryHolder.INSTANCE;
    }
    private static final Logger log=Logger.getLogger(OrganizerRepository.class);

    @Override
    public void save(Organizer obj) {
        Session session= Connection.openSession();
        Transaction transaction=session.beginTransaction();
        try {
            session.save(obj);
            log.info("Organizer saved successfully");
        }
        catch (Exception ex)
        {
            log.error("Organizer save error"+ex.getMessage());
        }
        finally {
            transaction.commit();
        }
    }

    @Override
    public void update(Organizer obj) {
        Session session1= Connection.openSession();
        Transaction transaction=session1.beginTransaction();
        try {
            session1.update(obj);
            log.info("Organizer updated successfully");
        }
        catch (Exception ex)
        {
            log.error("Organizer update error"+ex.getMessage());
        }
        finally {
            transaction.commit();
        }
    }

    @Override
    public void delete(Organizer obj) {
        Session session3= Connection.openSession();
        Transaction transaction=session3.beginTransaction();
        try {
            session3.delete(obj);
            log.info("Distributor deleted successfully");
        }
        catch (Exception ex)
        {
            log.error("Distributor deleted error"+ex.getMessage());
        }
        finally {
            transaction.commit();
        }
    }

    @Override
    public Optional<Organizer> getById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Organizer> getAll() {
        Session session=Connection.openSession();
        Transaction transaction= session.beginTransaction();
        List<Organizer> organizers=new LinkedList<>();
        try {
            String jpql = "SELECT t FROM Organizer t";
            organizers.addAll(session.createQuery(jpql, Organizer.class).getResultList());
            log.info("get all customers");
        }
        catch (Exception ex)
        {
            log.error("Get Customer error: "+ex.getMessage());
        }
        finally {
            transaction.commit();
        }
        return organizers;
    }



}
