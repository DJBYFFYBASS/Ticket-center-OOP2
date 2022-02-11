package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models;

import bg.tu_varna.sit.group25.ticketcenter.Application.common.Transition;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.access.Connection;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Admin;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Distributor;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Organizer;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.AdminRepository;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.DistributorRepository;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.OrganizerRepository;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers.*;
import bg.tu_varna.sit.group25.ticketcenter.Application.business.services.DistributorService;
import bg.tu_varna.sit.group25.ticketcenter.Application.business.services.OrganizerService;
import bg.tu_varna.sit.group25.ticketcenter.Application.common.Transition;
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
import java.util.List;

public class SceneUtls {

    Session session8 = Connection.openSession();
    Transaction transaction = session8.beginTransaction();
    public static DistributorService service = new DistributorService();
    private static AdminRepository Arepository =AdminRepository.getInstance();
    private static OrganizerRepository Orepository =OrganizerRepository.getInstance();
    private static DistributorRepository Drepository =DistributorRepository.getInstance();
    private static boolean log = true;

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
    public static void DisToss(ActionEvent event, String fxmlFile, String title,Distributor dis) {
        Parent root = null;

            try {
                FXMLLoader loader = new FXMLLoader(SceneUtls.class.getResource(fxmlFile));
                root = loader.load();
                DistributorOptionController controller=loader.getController();
                controller.SetDis(dis);

            } catch (IOException e) {
                e.printStackTrace();
            }
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene((new Scene(root, 600, 400)));
        stage.show();
    }
    public static void DisQry(ActionEvent event, String fxmlFile, String title,Distributor dis) {
        Parent root = null;

            try {
                FXMLLoader loader = new FXMLLoader(SceneUtls.class.getResource(fxmlFile));
                root = loader.load();
                DistributorQueryController controller=loader.getController();
                controller.SetDis(dis);

            } catch (IOException e) {
                e.printStackTrace();
            }
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene((new Scene(root, 600, 400)));
        stage.show();
    }
    public static void DisTF(ActionEvent event, String fxmlFile, String title,Distributor dis) {
        Parent root = null;

            try {
                FXMLLoader loader = new FXMLLoader(SceneUtls.class.getResource(fxmlFile));
                root = loader.load();
                TicketFormController controller=loader.getController();
                controller.SetDis(dis);

            } catch (IOException e) {
                e.printStackTrace();
            }
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene((new Scene(root, 600, 400)));
        stage.show();
    }
    public static void OrgToss(ActionEvent event, String fxmlFile, String title,Organizer org) {
        Parent root = null;

            try {
                FXMLLoader loader = new FXMLLoader(SceneUtls.class.getResource(fxmlFile));
                root = loader.load();
                OrganizerOptionsController controller=loader.getController();
                controller.SetOrg(org);

            } catch (IOException e) {
                e.printStackTrace();
            }
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene((new Scene(root, 600, 400)));
        stage.show();
    }
    public static void OrgEvent(ActionEvent event, String fxmlFile, String title,Organizer org) {
        Parent root = null;

            try {
                FXMLLoader loader = new FXMLLoader(SceneUtls.class.getResource(fxmlFile));
                root = loader.load();
                EventFormController controller=loader.getController();
                controller.SetOrg(org);

            } catch (IOException e) {
                e.printStackTrace();
            }
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene((new Scene(root, 600, 400)));
        stage.show();
    }
    public static void OrgEQuery(ActionEvent event, String fxmlFile, String title,Organizer org) {
        Parent root = null;

            try {
                FXMLLoader loader = new FXMLLoader(SceneUtls.class.getResource(fxmlFile));
                root = loader.load();
                EventQueryController controller=loader.getController();
                controller.SetOrg(org);

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
        /**/
        List<Organizer> orgList= Orepository.getLogin(username,pass);
        Organizer org=new Organizer();
        try{
            org=orgList.get(0);
            log=true;
        }catch (Exception e)
        {
            log=false;
        }



        if (log == true) {
            Parent root1 = null;
            try {
                FXMLLoader loader = new FXMLLoader(SceneUtls.class.getResource(fxmlFile));
                root1 = loader.load();
                OrganizerOptionsController controller=loader.getController();
                controller.SetOrg(org);


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
        /**/
        List<Admin> adminList= Arepository.getLogin(username,pass);
        Admin admin=new Admin();
        try{
            admin=adminList.get(0);
            log=true;
        }catch (Exception e)
        {
            log=false;
        }

        if (log) {
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
        else {

        }
    }


        public static void DisLogin (ActionEvent event, String fxmlFile, String title, String username, String pass)
        //add DB distributor user and pass check
        {
            /**/
            List<Distributor> disList= Drepository.getLogin(username,pass);
            Distributor dis=new Distributor();
            try{
                dis=disList.get(0);
                log=true;
            }catch (Exception e)
            {
                log=false;
            }



            if (log == true) {
                Parent root = null;
                try {
                    FXMLLoader loader = new FXMLLoader(SceneUtls.class.getResource(fxmlFile));

                    DistributorOptionController controller=loader.getController();
                    controller.SetDis(dis);
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

        public static void DisRateing(ActionEvent event,String fxmlFile,String title,String disName,Distributor dis)
        {Parent root = null;

            try {
                FXMLLoader loader = new FXMLLoader(SceneUtls.class.getResource(fxmlFile));
                root = FXMLLoader.load(SceneUtls.class.getResource(fxmlFile));
                DistributorRateingController controller=loader.getController();
                controller.SetDis(dis);

            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle(title);
            stage.setScene((new Scene(root, 600, 400)));
            stage.show();
        }
    public static void DisQueryEntry(ActionEvent event,String fxmlFile,String title, String disName)
    {
        Parent root = null;
        if (disName != null ) {
            try {
                FXMLLoader loader = new FXMLLoader(SceneUtls.class.getResource(fxmlFile));
                DistributorQueryController distributorQueryController=loader.getController();
                //distributorQueryController.SetUserInfo(disName);
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














