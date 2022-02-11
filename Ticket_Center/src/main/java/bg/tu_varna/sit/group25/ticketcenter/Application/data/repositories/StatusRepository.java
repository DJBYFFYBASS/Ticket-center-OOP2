package bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories;

import bg.tu_varna.sit.group25.ticketcenter.Application.data.access.Connection;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Distributor;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Show_Status;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class StatusRepository implements DAORepository<Show_Status> {
    private static class  ShowRepositoryHolder
    {
        public static final  StatusRepository INSTANCE=new  StatusRepository();
    }
    public static StatusRepository getInstance()
    {
        return StatusRepository.ShowRepositoryHolder.INSTANCE;
    }
    private static final Logger log=Logger.getLogger(StatusRepository.class);
    @Override
    public void save(Show_Status obj) {

    }

    @Override
    public void update(Show_Status obj) {

    }

    @Override
    public void delete(Show_Status obj) {

    }

    @Override
    public Optional<Show_Status> getById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Show_Status> getAll() {
        return null;
    }

    @Override
    public List<Show_Status> getLogin(String User, String Pass) {
        return null;
    }

    @Override
    public List<Show_Status> getInfo(String Name) {
        Session session= Connection.openSession();
        Transaction transaction= session.beginTransaction();
        List<Show_Status> list=new LinkedList<>();
        String name=Name;
        try {
            String jpql = "SELECT t FROM Show_Status t where Status='"+name+"'";
            list.addAll(session.createQuery(jpql, Show_Status.class).getResultList());
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
    public List<Show_Status> infoById(String id) {
        return null;
    }
}
