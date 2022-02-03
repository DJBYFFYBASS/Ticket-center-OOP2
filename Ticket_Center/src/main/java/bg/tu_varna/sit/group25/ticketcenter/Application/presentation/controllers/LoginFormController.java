package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers;

import bg.tu_varna.sit.group25.ticketcenter.Application.common.Constants;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.SceneUtls;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginFormController  implements Initializable {

    //private Organizer organizer=new Organizer();
    //private Distributor distributor=new Distributor();

    @FXML
    private Button OrganizerLoginButton;
    @FXML
    private Button DistributorLoginButton;
    @FXML
    private Button btAdmin;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        OrganizerLoginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                SceneUtls.chooseScene(actionEvent, Constants.Organizer.ORGANIZER_LOGIN,
                        "OrganizerLogin");
            }
        });
        DistributorLoginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                    SceneUtls.chooseScene(actionEvent, Constants.Distributor.DISTRIBUTOR_LOGIN,
                            "DistributorLogin");

            }
        });
        btAdmin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                SceneUtls.chooseScene(actionEvent,Constants.Admin.LOGIN_VIEW,"Admin Login");
            }
        });

    }




}
