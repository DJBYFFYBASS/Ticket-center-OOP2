package bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories;

import bg.tu_varna.sit.group25.ticketcenter.Application.data.access.Connection;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Show_Status;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Show_Type;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class TypeRepository implements DAORepository<Show_Type> {
    private static class  TypeRepositoryHolder
    {
        public static final  TypeRepository INSTANCE=new  TypeRepository();
    }
    public static TypeRepository getInstance()
    {
        return TypeRepository.TypeRepositoryHolder.INSTANCE;
    }
    private static final Logger log=Logger.getLogger(TypeRepository.class);

    @Override
    public void save(Show_Type obj) {

    }

    @Override
    public void update(Show_Type obj) {

    }

    @Override
    public void delete(Show_Type obj) {

    }

    @Override
    public Optional<Show_Type> getById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Show_Type> getAll() {
        return null;
    }

    @Override
    public List<Show_Type> getLogin(String User, String Pass) {
        return null;
    }

    @Override
    public List<Show_Type> getInfo(String Name) {
        Session session= Connection.openSession();
        Transaction transaction= session.beginTransaction();
        List<Show_Type> list=new LinkedList<>();
        String name=Name;
        try {
            String jpql = "SELECT t FROM Show_Type t where Type='"+name+"'";
            list.addAll(session.createQuery(jpql, Show_Type.class).getResultList());
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
    public List<Show_Type> infoById(String id) {
        return null;
    }

}
