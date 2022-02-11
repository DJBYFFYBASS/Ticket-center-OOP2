package bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories;

import bg.tu_varna.sit.group25.ticketcenter.Application.data.access.Connection;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Customer;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Form;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class FormRepository implements DAORepository<Form>
{
    private static final Logger log=Logger.getLogger(CustomerRepository.class);

    public static  FormRepository getInstance()
    {
        return  FormRepository. FormRepositoryHolder.INSTANCE;
    }

    private static class  FormRepositoryHolder
    {
        public static final  FormRepository INSTANCE=new  FormRepository();
    }

    @PersistenceContext
    private EntityManager entityManager;

    public void insertForm(Form form)
    {
        entityManager.createNativeQuery("INSERT INTO FROM (Sold_Tickets,Price_Ticket,Distributor_ID,Customer_ID,Show_ID) VALUES (?,?,?,?,?)")
                .setParameter(1,form.getSold_Tickets())
                .setParameter(2,form.getPrice_Ticket())
                .setParameter(3,form.getDistributor().getDistributor_ID())
                .setParameter(4,form.getCustomer().getCustomer_ID())
                .setParameter(5,form.getShow().getShow_ID())
                .executeUpdate();
    }

    public void insertF(Form form)
    {
        this.entityManager.persist(form);
    }


    @Override
    public void save(Form obj) {
        Session session= Connection.openSession();
        Transaction transaction=session.beginTransaction();
        try {
            session.save(obj);
            log.info("Form saved successfully");
        }
        catch (Exception ex)
        {
            log.error(" Form save error"+ex.getMessage());
        }
        finally {
            transaction.commit();
        }
    }

    @Override
    public void update(Form obj) {
        Session session1= Connection.openSession();
        Transaction transaction=session1.beginTransaction();
        try {
            session1.update(obj);
            log.info("Form updated successfully");
        }
        catch (Exception ex)
        {
            log.error("Form update error"+ex.getMessage());
        }
        finally {
            transaction.commit();
        }

    }

    @Override
    public void delete(Form obj) {
        Session session3= Connection.openSession();
        Transaction transaction=session3.beginTransaction();
        try {
            session3.delete(obj);
            log.info("Form deleted successfully");
        }
        catch (Exception ex)
        {
            log.error("Form deleted error"+ex.getMessage());
        }
        finally {
            transaction.commit();
        }

    }

    @Override
    public Optional<Form> getById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Form> getAll() {
        Session session=Connection.openSession();
        Transaction transaction= session.beginTransaction();
        List<Form> forms=new LinkedList<>();
        try {
            String jpql = "SELECT t FROM Form t";
            forms.addAll(session.createQuery(jpql, Form.class).getResultList());
            log.info("get all Forms");
        }
        catch (Exception ex)
        {
            log.error("Get Form error: "+ex.getMessage());
        }
        finally {
            transaction.commit();
        }
        return forms;
    }

    @Override
    public List<Form> getLogin(String User,String Pass) {
        return null;
    }

    @Override
    public List<Form> getInfo(String name) {
        return null;
    }

    @Override
    public List<Form> infoById(String id) {
        return null;
    }
}
