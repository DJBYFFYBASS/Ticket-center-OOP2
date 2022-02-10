package bg.tu_varna.sit.group25.ticketcenter.Application.business.workflow;

import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Distributor;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Organizer;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.DistributorRepository;

public class AdminDisWF {
    static DistributorRepository repository=DistributorRepository.getInstance();

    public static void Add(String Name, String PN, String User, String Pass, String Fee,String Rateing,String Rcount,String STickets) {
        Distributor dis=new Distributor();
        double fee = 0.0;
        double rate=0.0;
        int sTicket=0;
        int rcount=0;
        boolean error = false;
        if (PN.length() != 10) {
            error = true;
        }
        try {
            rate=Double.parseDouble(Rateing);
            sTicket=Integer.parseInt(STickets);
            rcount=Integer.parseInt(Rcount);
            fee = Double.parseDouble(Fee);
        } catch (Exception e) {
            error=true;
        }
        if (!error) {
            dis.setName_D(Name);
            dis.setPhone_Number_D(PN);
            dis.setUserName_D(User);
            dis.setPassword_D(Pass);
            dis.setFee_D(fee);
            dis.setRating(rate);
            dis.setRating_Count(rcount);
            dis.setSold_Tickets_D(sTicket);
            repository.save(dis);
        }

    }
    public static void Update(String Name, String PN, String User, String Pass, String Fee,String Rateing,String Rcount,String STickets,String ID)
    { Distributor dis=new Distributor();
        double fee = 0.0;
        double rate=0.0;
        int sTicket=0;
        int rcount=0;
        boolean error = false;
        if (PN.length() != 10) {
            error = true;
        }
        try {
            rate=Double.parseDouble(Rateing);
            sTicket=Integer.parseInt(STickets);
            rcount=Integer.parseInt(Rcount);
            fee = Double.parseDouble(Fee);
        } catch (Exception e) {
            error=true;
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
                dis.setPassword_D(Pass);
            }
            if (Fee!="")
            {
                dis.setFee_D(fee);
            }
            if (Rateing!="")
            {
                dis.setRating(rate);
            }
            if(Rcount!="")
            {
                dis.setRating_Count(rcount);
            }
            if(STickets!="")
            {
                dis.setSold_Tickets_D(sTicket);
            }
            repository.update(dis);
        }
    }
    public static void Delete(String Name, String PN, String User, String Pass, String Fee,String Rateing,String Rcount,String STickets,String ID)
    { Distributor dis=new Distributor();
        double fee = 0.0;
        double rate=0.0;
        int sTicket=0;
        int rcount=0;
        boolean error = false;
        if (PN.length() != 10) {
            error = true;
        }
        try {
            rate=Double.parseDouble(Rateing);
            sTicket=Integer.parseInt(STickets);
            rcount=Integer.parseInt(Rcount);
            fee = Double.parseDouble(Fee);
        } catch (Exception e) {
            error=true;
        }
        dis.setDistributor_ID(Integer.parseInt(ID));
        dis.setName_D(Name);
        dis.setPhone_Number_D(PN);
        dis.setUserName_D(User);
        dis.setPassword_D(Pass);
        dis.setFee_D(fee);
        dis.setRating(rate);
        dis.setRating_Count(rcount);
        dis.setSold_Tickets_D(sTicket);
        repository.delete(dis);
    }
}
