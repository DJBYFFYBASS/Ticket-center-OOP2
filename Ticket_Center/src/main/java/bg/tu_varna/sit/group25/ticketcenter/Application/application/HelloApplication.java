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

public class HelloApplication extends Application {
    private static final Logger log=Logger.getLogger(HelloApplication.class);
    @Override
    public void start(Stage stage) throws IOException {

        PropertyConfigurator.configure(HelloApplication.class.getResource(Constants.Configurations.LOG4J_PROPERTIES));
        URL path=getClass().getResource(Constants.View.HELLO_VIEW);

        if(path !=null)
        {
            Parent root=FXMLLoader.load(path);

            Scene scene =new Scene(root);
            scene.setFill(Color.TRANSPARENT);

            stage.setTitle(Constants.Values.TITTLE);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.setMaxWidth(780);
            stage.setMaxHeight(630);
            stage.setWidth(320);
            stage.setHeight(240);
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