package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models;

import bg.tu_varna.sit.group25.ticketcenter.Application.data.access.Connection;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Distributor;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Organizer;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.DistributorRepository;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.OrganizerRepository;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers.*;
import bg.tu_varna.sit.group25.ticketcenter.Application.business.services.DistributorService;
import bg.tu_varna.sit.group25.ticketcenter.Application.business.services.OrganizerService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;


//commented the 5th line //import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Organizer; remove the "//" when fixed
public class LoginUtls {
    @FXML
    private static TextField tfUserDis;
    @FXML
    private static PasswordField tfPassDis;
    Session session8 = Connection.openSession();
    Transaction transaction = session8.beginTransaction();
    public static DistributorService service = new DistributorService();
    public static OrganizerService service1 = new OrganizerService();
    private static boolean log = true;

    public static void EventQueryEntry(ActionEvent actionEvent,String fxmlFile,String title,String eventName)
    {
        Parent root = null;
        if (eventName != null ) {

            try {
                FXMLLoader loader = new FXMLLoader(LoginUtls.class.getResource(fxmlFile));
                EventQueryController eventQueryController=loader.getController();
                eventQueryController.SetEventName(eventName);
                root = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void chooseLogin(ActionEvent event, String fxmlFile, String title, String username, String pass) {
        Parent root = null;
        if (username != null && pass != null) {

            try {
                FXMLLoader loader = new FXMLLoader(LoginUtls.class.getResource(fxmlFile));
                LoginFormController loginFormController = loader.getController();
                root = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                root = FXMLLoader.load(LoginUtls.class.getResource(fxmlFile));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene((new Scene(root, 600, 400)));
        stage.show();
    }


    public static void OrgLogin(ActionEvent event, String fxmlFile, String title, String username, String pass)
    {//add DB distributor user and pass check
        OrganizerListViewModel organizerListViewModel = new OrganizerListViewModel();
        ObservableList<OrganizerListViewModel> organizer = service1.getAllOrganizers();
        for (OrganizerListViewModel o : organizer) {
            if (o.equals(organizer)) {

                log = true;
            }
        }
        if (log == true) {
            Parent root1 = null;
            try {
                FXMLLoader loader = new FXMLLoader(LoginUtls.class.getResource(fxmlFile));
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


        public static void DisLogin (ActionEvent event, String fxmlFile, String title, String username, String pass) //add DB distributor user and pass check
        {
            DistributorListViewModel distributorListViewModel = new DistributorListViewModel();
            ObservableList<DistributorListViewModel> distributor = service.getAllDistributor();
            for (DistributorListViewModel o : distributor) {
                if (o.equals(distributor))
                {

                    log = true;
                }
            }
            if (log == true) {
                Parent root = null;
                try {
                    FXMLLoader loader = new FXMLLoader(LoginUtls.class.getResource(fxmlFile));
                    TicketFormController ticketFormController=loader.getController();
                    ticketFormController.SetDisName(username);
                    root = loader.load();
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
        }

        public static void DisRateing(ActionEvent event,String fxmlFile,String title,String disName)
        {
            Parent root = null;
            if (disName != null ) {
                try {
                    FXMLLoader loader = new FXMLLoader(LoginUtls.class.getResource(fxmlFile));
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
                FXMLLoader loader = new FXMLLoader(LoginUtls.class.getResource(fxmlFile));
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














