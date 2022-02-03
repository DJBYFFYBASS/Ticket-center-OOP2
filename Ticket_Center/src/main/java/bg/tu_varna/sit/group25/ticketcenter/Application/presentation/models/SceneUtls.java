package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models;

import bg.tu_varna.sit.group25.ticketcenter.Application.data.access.Connection;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers.*;
import bg.tu_varna.sit.group25.ticketcenter.Application.business.services.DistributorService;
import bg.tu_varna.sit.group25.ticketcenter.Application.business.services.OrganizerService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;


//commented the 5th line //import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Organizer; remove the "//" when fixed
public class SceneUtls {
    @FXML
    private static TextField tfUserDis;
    @FXML
    private static PasswordField tfPassDis;
    Session session8 = Connection.openSession();
    Transaction transaction = session8.beginTransaction();
    public static DistributorService service = new DistributorService();
    public static OrganizerService service1 = new OrganizerService();
    private static boolean log = true;

    public static void EventQueryEntry(ActionEvent event,String fxmlFile,String title,String eventName)
    {
        Parent root = null;
        if (eventName != null ) {

            try {
                FXMLLoader loader = new FXMLLoader(SceneUtls.class.getResource(fxmlFile));
                EventQueryController eventQueryController=loader.getController();
                eventQueryController.SetEventName(eventName);
                root = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle(title);
            stage.setScene((new Scene(root, 600, 400)));
            stage.show();
        }

    }
    public static void chooseScene(ActionEvent event, String fxmlFile, String title) {
        Parent root = null;

            try {
                root = FXMLLoader.load(SceneUtls.class.getResource(fxmlFile));
            } catch (IOException e) {
                e.printStackTrace();
            }


        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene((new Scene(root, 600, 400)));
        stage.show();
    }


    public static void OrgLogin(ActionEvent event, String fxmlFile, String title, String username, String pass)
    {//add DB distributor user and pass check

        /*OrganizerListViewModel organizerListViewModel = new OrganizerListViewModel();
        ObservableList<OrganizerListViewModel> organizer = service1.getAllOrganizers();
        for (OrganizerListViewModel o : organizer) {
            if (o.equals(organizer)) {

                log = true;
            }
        }
        *
         */
        if (log == true) {
            Parent root1 = null;
            try {
                FXMLLoader loader = new FXMLLoader(SceneUtls.class.getResource(fxmlFile));
                LoginFormController loginFormController = loader.getController();
                root1 = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle(title);
            stage.setScene((new Scene(root1, 600, 400)));
            stage.show();
        }
    }
    public static void AdminLogin(ActionEvent event, String fxmlFile, String title, String username, String pass)
    {//add DB distributor user and pass check

        /*OrganizerListViewModel organizerListViewModel = new OrganizerListViewModel();
        ObservableList<OrganizerListViewModel> organizer = service1.getAllOrganizers();
        for (OrganizerListViewModel o : organizer) {
            if (o.equals(organizer)) {

                log = true;
            }
        }
        *
         */
        if (log == true) {
            Parent root1 = null;
            try {
                FXMLLoader loader = new FXMLLoader(SceneUtls.class.getResource(fxmlFile));
                root1 = loader.load();

            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle(title);
            stage.setScene((new Scene(root1, 600, 400)));
            stage.show();
        }
    }


        public static void DisLogin (ActionEvent event, String fxmlFile, String title, String username, String pass)
        //add DB distributor user and pass check
        {
            /*
            DistributorListViewModel distributorListViewModel = new DistributorListViewModel();
            ObservableList<DistributorListViewModel> distributor = service.getAllDistributor();
            for (DistributorListViewModel o : distributor) {
                if (o.equals(distributor))
                {

                    log = true;
                }
            }

*/
            if (log == true) {
                Parent root = null;
                try {
                    FXMLLoader loader = new FXMLLoader(SceneUtls.class.getResource(fxmlFile));
                    root = loader.load();
                    //TicketFormController ticketFormController=loader.getController();
                    //ticketFormController.SetDisName(username);

                } catch (IOException e) {
                    e.printStackTrace();
                }
                finally {
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setTitle(title);
                    stage.setScene((new Scene(root, 600, 400)));
                    stage.show();
                }
            }

/*
            if (log == true) {
                Parent root1 = null;
                try {
                    FXMLLoader loader = new FXMLLoader(LoginUtls.class.getResource(fxmlFile));
                    root1 = loader.load();
                    TicketFormController ticketFormController=loader.getController();
                    ticketFormController.SetDisName(username);

                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setTitle(title);
                stage.setScene((new Scene(root1, 600, 400)));
                stage.show();
            }
*/

        }

        public static void DisRateing(ActionEvent event,String fxmlFile,String title,String disName)
        {
            Parent root = null;
            if (disName != null ) {
                try {
                    FXMLLoader loader = new FXMLLoader(SceneUtls.class.getResource(fxmlFile));
                    DistributorRateingController distributorRateingController=loader.getController();
                    distributorRateingController.GetInfo(disName);
                    root = loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setTitle(title);
                stage.setScene((new Scene(root, 600, 400)));
                stage.show();

            }
        }
    public static void DisQueryEntry(ActionEvent event,String fxmlFile,String title, String disName)
    {
        Parent root = null;
        if (disName != null ) {
            try {
                FXMLLoader loader = new FXMLLoader(SceneUtls.class.getResource(fxmlFile));
                DistributorQueryController distributorQueryController=loader.getController();
                distributorQueryController.SetUserInfo(disName);
                root = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle(title);
            stage.setScene((new Scene(root, 600, 400)));
            stage.show();
        }
    }
}














