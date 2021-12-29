package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginUtls {
    public static void chooseLogin(ActionEvent event,String fxmlFile,String title)
    {
        Parent root=null;
        try {
            FXMLLoader loader=new FXMLLoader(LoginUtls.class.getResource(fxmlFile));
            root = loader.load();
            /*
        root=FXMLLoader.load(LoginUtls.class.getResource(fxmlFile));
         */
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene((new Scene(root,600,400)));
        stage.show();
    }
}
