package bg.tu_varna.sit.group25.ticketcenter.Application.business.workflow;


import bg.tu_varna.sit.group25.ticketcenter.Application.business.services.OrganizerService;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Organizer;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.OrganizerRepository;

public class AdminOrgWF {
    OrganizerService service=  OrganizerService.getInstance();
    static OrganizerRepository repository=OrganizerRepository.getInstance();
    static Organizer org=new Organizer();
    public static void Add(String Name, String PN, String User, String Pass, String Fee)
    {
        int pass=111;
        double fee=0.0;
        try
        {
            pass=Integer.parseInt(Pass);
            fee=Double.parseDouble(Fee);
        }
        catch (Exception e ) {

        }

        org.setName_O(Name);
        org.setPhone_Number_O(PN);
        org.setUserName_O(User);
        org.setPassword_O(pass);
        org.setFee_O(fee);
        repository.save(org);

    }
    public static void Update(String Name, String PN, String User, String Pass, String Fee)
    {

    }
}
