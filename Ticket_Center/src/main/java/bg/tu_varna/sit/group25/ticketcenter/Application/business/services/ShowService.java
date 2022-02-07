package bg.tu_varna.sit.group25.ticketcenter.Application.business.services;

import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Show;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.ShowRepository;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.ShowListViewModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;
import java.util.stream.Collectors;

public class ShowService {
    private static ShowRepository repository=ShowRepository.getInstance();
    //private final ShowRepository repository= ShowRepository.getInstance();

    public static ShowService getInstance()
    {
        return ShowService. ShowServiceHolder.INSTANCE;
    }

    private static class  ShowServiceHolder {
        public static final ShowService INSTANCE =new ShowService();
}
/*



    static Session sessionObj;
    static SessionFactory buildSessionFactory;
    static SessionFactory sessionFactoryObj;

    public final static Logger logger = Logger.getLogger(ShowService.class);
    private static SessionFactory buildSessionFactory() {
        // Creating Configuration Instance & Passing Hibernate Configuration File
        Configuration configObj = new Configuration();
        configObj.configure("hibernate.cfg.xml");

        // Since Hibernate Version 4.x, ServiceRegistry Is Being Used
        ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build();

        // Creating Hibernate SessionFactory Instance
        sessionFactoryObj = configObj.buildSessionFactory(serviceRegistryObj);
        return sessionFactoryObj;
    }

    public static ObservableList<ShowListViewModel> displayRecords() {
        List<Show> shows = new ArrayList();
        try {
            // Getting Session Object From SessionFactory
            sessionObj = buildSessionFactory().openSession();
            // Getting Transaction Object From Session Object
            sessionObj.beginTransaction();
            shows=repository.getAll();
            shows = sessionObj.createQuery("FROM Show ").list();
            String fileName="bg/tu_varna/sit/group25/ticketcenter/Application/common/dataTest";
            try
            {
                System.out.print("");
                for (shows :
                     ) {

                }
                Scanner scanner=new Scanner(new File(fileName));

                //scanner.useDelimiter(",");//okazva se chrez koe shte se razdelq potoka ot faila
                int i=0;
                while (scanner.hasNextLine())
                {
                    if (i==books.length) break;
                    books[i++]=new Book(scanner.next(),scanner.next(),scanner.nextInt(), scanner.nextInt());
                }
                scanner.close();
            }
            catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
        } catch(Exception sqlException) {
            if(null != sessionObj.getTransaction()) {
                logger.info("\n.......Transaction Is Being Rolled Back.......\n");
                sessionObj.getTransaction().rollback();
            }
            sqlException.printStackTrace();
        } finally {
            if(sessionObj != null) {
                sessionObj.close();
            }
        }
        return FXCollections.observableList(shows.stream().map(s -> new ShowListViewModel(
                s.getShow_ID(),
                s.getShow_Title(),
                s.getShow_Date(),
                s.getLocation(),
                s.getMaxPlaces(),
                s.getTickets(),
                s.getShow_status(),
                s.getShow_type(),
                s.getOrganizer(),
                s.getDistributor()
        )).collect(Collectors.toList()));
    }

 */


public ObservableList<ShowListViewModel>getAllShows()
{
    List<Show> shows=repository.getAll();

    return FXCollections.observableList(shows.stream().map(s -> new ShowListViewModel(
            s.getShow_ID(),
            s.getShow_Title(),
            s.getShow_Date(),
            s.getLocation(),
            s.getMaxPlaces(),
            s.getTickets(),
            s.getShow_status(),
            s.getShow_type(),
            s.getOrganizer(),
            s.getDistributor()
    )).collect(Collectors.toList()));
}
    }
