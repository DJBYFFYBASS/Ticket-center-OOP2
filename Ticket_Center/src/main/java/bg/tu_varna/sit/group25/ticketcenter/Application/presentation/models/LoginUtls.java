package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models;

import bg.tu_varna.sit.group25.ticketcenter.Application.data.access.Connection;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Distributor;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.DistributorRepository;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers.DistributorLoginController;
import bg.tu_varna.sit.group25.ticketcenter.Application.business.services.DistributorService;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers.LoginFormController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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

public class LoginUtls {
    Session session8=Connection.openSession();
    Transaction transaction=session8.beginTransaction();
   public static DistributorService service = new DistributorService();
    private static boolean log=false;

    public static void chooseLogin(ActionEvent event, String fxmlFile, String title, String username, String pass)
    {
        Parent root = null;
        if (username!=null&&pass!=null) {

            try {
                FXMLLoader loader = new FXMLLoader(LoginUtls.class.getResource(fxmlFile));
                LoginFormController loginFormController=loader.getController();
                root = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            try{
                root=FXMLLoader.load(LoginUtls.class.getResource(fxmlFile));
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

        }
        Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene((new Scene(root,600,400)));
        stage.show();
    }


    public static void OrgLogin(ActionEvent event,String fxmlFile,String title,String username,String pass)
    {//add DB distributor user and pass check
        Parent root = null;
        try {
            FXMLLoader loader = new FXMLLoader(LoginUtls.class.getResource(fxmlFile));
            LoginFormController loginFormController = loader.getController();
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene((new Scene(root,600,400)));
        stage.show();
    }
    public static void DisLogin(ActionEvent event,String fxmlFile,String title,String username,int pass) //add DB distributor user and pass check
    {
        DistributorListViewModel distributor = new DistributorListViewModel();
       
        ObservableList<DistributorListViewModel> distributors = service.getAllDistributor();
        for (DistributorListViewModel a : distributors) {
            if (a.equals(distributor)) {
                log = true;

            }
            if(log=true) {
                Parent root =null;
                try {

                    FXMLLoader loader = new FXMLLoader(LoginUtls.class.getResource(fxmlFile));
                    LoginFormController loginFormController = loader.getController();
                    root = loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setTitle(title);
                assert root != null;
                stage.setScene((new Scene(root, 600, 400)));
                stage.show();
            }

        }
    }






}




