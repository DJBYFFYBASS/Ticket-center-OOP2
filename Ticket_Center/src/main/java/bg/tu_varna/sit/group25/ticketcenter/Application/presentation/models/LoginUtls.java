package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models;

import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers.LoginFormController;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginUtls {
    public static void chooseLogin(ActionEvent event,String fxmlFile,String title,String username,String pass)
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
    public static void DisLogin(ActionEvent event,String fxmlFile,String title,String username,String pass)
    {//add DB distributor user and pass check
        Parent root = null;

        try {
            FXMLLoader loader = new FXMLLoader(LoginUtls.class.getResource(fxmlFile));
            LoginFormController loginFormController=loader.getController();
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene((new Scene(root,600,400)));
        stage.show();
    }
}
