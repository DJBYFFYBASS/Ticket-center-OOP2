package bg.tu_varna.sit.group25.ticketcenter.Application.business.workflow;


import bg.tu_varna.sit.group25.ticketcenter.Application.business.services.OrganizerService;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Organizer;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.OrganizerRepository;

public class AdminOrgWF {
    OrganizerService service=  OrganizerService.getInstance();
    static OrganizerRepository repository=OrganizerRepository.getInstance();

    public static void Add(String Name, String PN, String User, String Pass, String Fee) {
        Organizer org=new Organizer();
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
        org.setName_O(Name);
        org.setPhone_Number_O(PN);
        org.setUserName_O(User);
        org.setPassword_O(pass);
        org.setFee_O(fee);
        repository.save(org);
        }

    }
    public static void Update(String Name, String PN, String User, String Pass, String Fee, String ID)
    { Organizer org=new Organizer();

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
            org.setOrganizer_ID(Integer.parseInt(ID));
            if (Name!="")
            {
                org.setName_O(Name);
            }
            if (PN!="")
            {
                org.setPhone_Number_O(PN);
            }
            if (User!="")
            {
                org.setUserName_O(User);
            }
            if (Pass!="")
            {
                org.setPassword_O(pass);
            }
            if (Fee!="")
            {
                org.setFee_O(fee);
            }
            repository.update(org);
        }
    }
    public static void Delete(String Name, String PN, String User, String Pass, String Fee,String ID)
    { Organizer org=new Organizer();
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
            org.setOrganizer_ID(Integer.parseInt(ID));
        org.setName_O(Name);
        org.setPhone_Number_O(PN);
        org.setUserName_O(User);
        org.setPassword_O(pass);
        org.setFee_O(fee);
            repository.delete(org);
    }
}
