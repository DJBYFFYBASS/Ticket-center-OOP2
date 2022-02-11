package bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories;

import bg.tu_varna.sit.group25.ticketcenter.Application.common.Constants;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.access.Connection;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Admin;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Customer;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Distributor;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class DistributorRepository implements DAORepository<Distributor>
{
    private static final Logger log=Logger.getLogger(CustomerRepository.class);

    public static DistributorRepository getInstance()
    {
        return DistributorRepository.DistributorRepositoryHolder.INSTANCE;
    }
    private static class DistributorRepositoryHolder
    {
        public static final DistributorRepository INSTANCE=new DistributorRepository();
    }

    @Override
    public void save(Distributor obj) {
        Session session= Connection.openSession();
        Transaction transaction=session.beginTransaction();
        try {
            session.save(obj);
            log.info("Distributor saved successfully");
        }
        catch (Exception ex)
        {
            log.error("Distributor save error"+ex.getMessage());
        }
        finally {
            transaction.commit();
        }
    }

    @Override
    public void update(Distributor obj) {
        Session session1= Connection.openSession();
        Transaction transaction=session1.beginTransaction();
        try {
            session1.update(obj);
            log.info("Distributor updated successfully");
        }
        catch (Exception ex)
        {
            log.error("Distributor update error"+ex.getMessage());
        }
        finally {
            transaction.commit();
        }
    }

    @Override
    public void delete(Distributor obj) {
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
    public Optional<Distributor> getById(int id) {
        return Optional.empty();
    }


    @Override
    public List<Distributor> getAll() {

            Session session=Connection.openSession();
            Transaction transaction= session.beginTransaction();
            List<Distributor> distributors=new LinkedList<>();
            try {
                String jpql = "SELECT t FROM Distributor t";
                distributors.addAll(session.createQuery(jpql, Distributor.class).getResultList());
                log.info("get all customers");
            }
            catch (Exception ex)
            {
                log.error("Get Customer error: "+ex.getMessage());
            }
            finally {
                transaction.commit();
            }
            return distributors;
    }

    @Override
    public List<Distributor> getLogin(String User,String Pass) {
        Session session=Connection.openSession();
        Transaction transaction= session.beginTransaction();
        List<Distributor> distributors=new LinkedList<>();
        String name=User;
        String pass=Pass;
        try {
            String jpql = "SELECT t FROM Distributor t where UserName_D='"+name+"' and Password_D='"+pass+"'";
            distributors.addAll(session.createQuery(jpql, Distributor.class).getResultList());
            log.info("get all customers");
        }
        catch (Exception ex)
        {
            log.error("Get Customer error: "+ex.getMessage());
        }
        finally {
            transaction.commit();
        }
        return distributors;
    }

    @Override
    public List<Distributor> getInfo(String Name) {
        Session session=Connection.openSession();
        Transaction transaction= session.beginTransaction();
        List<Distributor> distributors=new LinkedList<>();
        String name=Name;
        try {
            String jpql = "SELECT t FROM Distributor t where Name_D='"+name+"'";
            distributors.addAll(session.createQuery(jpql, Distributor.class).getResultList());
            log.info("get all customers");
        }
        catch (Exception ex)
        {
            log.error("Get Customer error: "+ex.getMessage());
        }
        finally {
            transaction.commit();
        }
        return distributors;
    }

    @Override
    public List<Distributor> infoById(String id) {
        return null;
    }


}
