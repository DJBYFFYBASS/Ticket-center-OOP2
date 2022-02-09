package bg.tu_varna.sit.group25.ticketcenter.Application.business.workflow;

import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Distributor;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Organizer;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.DistributorRepository;

public class AdminDisWF {
    static DistributorRepository repository=DistributorRepository.getInstance();
    public static void Add(String Name, String PN, String User, String Pass, String Fee) {
        Distributor dis=new Distributor();
        int pass = 111;
        double fee = 0.0;
        boolean error = false;
        if (PN.length() != 10) {
            error = true;
        }
        try {
            pass = Integer.parseInt(Pass);
            fee = Double.parseDouble(Fee);
        } catch (Exception e) {
            error=true;
        }
        if (!error) {
            dis.setName_D(Name);
            dis.setPhone_Number_D(PN);
            dis.setUserName_D(User);
            dis.setPassword_D(pass);
            dis.setFee_D(fee);
            repository.save(dis);
        }

    }
    public static void Update(String Name, String PN, String User, String Pass, String Fee, String ID)
    { Distributor dis=new Distributor();

        int pass = 111;
        double fee = 0.0;
        boolean error = false;
        if (PN.length() != 10) {
            // error = true;
        }
        try {
            pass = Integer.parseInt(Pass);
            fee = Double.parseDouble(Fee);
        } catch (Exception e) {
            // error=true;
        }
        if (!error) {
            dis.setDistributor_ID(Integer.parseInt(ID));
            if (Name!="")
            {
                dis.setName_D(Name);
            }
            if (PN!="")
            {
                dis.setPhone_Number_D(PN);
            }
            if (User!="")
            {
                dis.setUserName_D(User);
            }
            if (Pass!="")
            {
                dis.setPassword_D(pass);
            }
            if (Fee!="")
            {
                dis.setFee_D(fee);
            }
            repository.update(dis);
        }
    }
    public static void Delete(String Name, String PN, String User, String Pass, String Fee,String ID)
    { Distributor dis=new Distributor();
        int pass = 111;
        double fee = 0.0;
        boolean error = false;
        if (PN.length() != 10) {
            // error = true;
        }
        try {
            pass = Integer.parseInt(Pass);
            fee = Double.parseDouble(Fee);
        } catch (Exception e) {
            // error=true;
        }
        dis.setDistributor_ID(Integer.parseInt(ID));
        dis.setName_D(Name);
        dis.setPhone_Number_D(PN);
        dis.setUserName_D(User);
        dis.setPassword_D(pass);
        dis.setFee_D(fee);
        repository.delete(dis);
    }
}
