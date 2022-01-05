package bg.tu_varna.sit.group25.ticketcenter.Application.application;

import bg.tu_varna.sit.group25.ticketcenter.Application.common.Constants;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.IOException;
import java.net.URL;
import java.util.PropertyPermission;

public class TestApp extends Application {
    private static final Logger log=Logger.getLogger(TestApp.class);
    @Override
    public void start(Stage stage) throws IOException {

        PropertyConfigurator.configure(TestApp.class.getResource(Constants.Configurations.LOG4J_PROPERTIES));
        URL path=getClass().getResource(Constants.Login.LOGIN_VIEW);

        if(path !=null)
        {
            Parent root=FXMLLoader.load(path);

            Scene scene =new Scene(root);
            scene.setFill(Color.TRANSPARENT);

            stage.setTitle(Constants.Values.TITTLE);
            stage.setScene(scene);
            stage.show();
        }
        else
        {
            log.error("Sorry the main fxm could not be loaded");
            System.exit(-1);
        }


    }

    public static void main(String[] args) {
        launch();
    }
}