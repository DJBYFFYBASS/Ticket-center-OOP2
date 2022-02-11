package bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories;

import bg.tu_varna.sit.group25.ticketcenter.Application.data.access.Connection;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Admin;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Customer;
import javafx.concurrent.Task;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class AdminRepository implements DAORepository<Admin> {
    private static final Logger log = Logger.getLogger(AdminRepository.class);

    public static AdminRepository getInstance() {
        return AdminRepository.AdminRepositoryHolder.INSTANCE;
    }
    public static class AdminRepositoryHolder
    {
        public static final AdminRepository INSTANCE=new AdminRepository();
    }

    @Override
    public void save(Admin obj) {

    }

    @Override
    public void update(Admin obj) {

    }

    @Override
    public void delete(Admin obj) {

    }

    @Override
    public Optional<Admin> getById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Admin> getAll() {
        return null;
    }

    @Override
    public List<Admin> getLogin(String User,String Pass) {
        Session session=Connection.openSession();
        Transaction transaction= session.beginTransaction();
        List<Admin> admin=new LinkedList<>();
        String name=User;
        String pass=Pass;
        try {
            String jpql = "SELECT t FROM Admin t where Admin_Name='"+name+"' and Admin_Pass='"+pass+"'";
            admin.addAll(session.createQuery(jpql, Admin.class).getResultList());
            log.info("get all customers");
        }
        catch (Exception ex)
        {
            log.error("Get Customer error: "+ex.getMessage());
        }
        finally {
            transaction.commit();
        }
        return admin;
    }

    @Override
    public List<Admin> getInfo(String name) {
        return null;
    }

    @Override
    public List<Admin> infoById(String id) {
        return null;
    }

    private static class CustomerRepositoryHolder {
        public static final CustomerRepository INSTANCE = new CustomerRepository();
    }
}

