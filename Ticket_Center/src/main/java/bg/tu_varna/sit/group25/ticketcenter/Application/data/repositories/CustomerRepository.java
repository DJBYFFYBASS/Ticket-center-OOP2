package bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories;

import bg.tu_varna.sit.group25.ticketcenter.Application.data.access.Connection;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Customer;
import javafx.concurrent.Task;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class CustomerRepository implements DAORepository<Customer>{
    private static final Logger log=Logger.getLogger(CustomerRepository.class);

    public static CustomerRepository getInstance()
    {
        return CustomerRepository.CustomerRepositoryHolder.INSTANCE;
    }

    private static class CustomerRepositoryHolder
    {
        public static final CustomerRepository INSTANCE=new CustomerRepository();
    }

    @Override
    public void save(Customer obj)
    {
        Session session= Connection.openSession();
        Transaction transaction=session.beginTransaction();
        try {
            session.save(obj);
            log.info("Customer saved successfully");
        }
        catch (Exception ex)
        {
            log.error("Customer save error"+ex.getMessage());
        }
        finally {
            transaction.commit();
        }
    }

    @Override
    public void update(Customer obj) {
        Session session1= Connection.openSession();
        Transaction transaction=session1.beginTransaction();
        try {
            session1.update(obj);
            log.info("Customer updated successfully");
        }
        catch (Exception ex)
        {
            log.error("Customer update error"+ex.getMessage());
        }
        finally {
            transaction.commit();
        }

    }

    @Override
    public void delete(Customer obj) {
        Session session3= Connection.openSession();
        Transaction transaction=session3.beginTransaction();
        try {
            session3.delete(obj);
            log.info("Customer deleted successfully");
        }
        catch (Exception ex)
        {
            log.error("Customer deleted error"+ex.getMessage());
        }
        finally {
            transaction.commit();
        }

    }

    @Override
    public Optional<Customer> getById(int id) {
        return Optional.empty();
    }



    @Override
    public List<Customer> getAll() {
        Session session=Connection.openSession();
        Transaction transaction= session.beginTransaction();
        List<Customer> customers=new LinkedList<>();
        try {
            String jpql = "SELECT t FROM Customer t";
            customers.addAll(session.createQuery(jpql, Customer.class).getResultList());
            log.info("get all customers");
        }
        catch (Exception ex)
        {
            log.error("Get Customer error: "+ex.getMessage());
        }
        finally {
            transaction.commit();
        }
        return customers;
    }

    @Override
    public List<Customer> getLogin(String User,String Pass) {
        return null;
    }

    @Override
    public List<Customer> getUser() {
        return null;
    }
}
