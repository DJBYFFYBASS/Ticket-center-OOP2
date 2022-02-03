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

public class AdminOptionsController implements Initializable {
    @FXML
    private Button btOrg;
    @FXML
    private Button btDis;
    @FXML
    private Button btBack;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btOrg.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SceneUtls.chooseScene(event, Constants.Admin.ORG_EVENTS,"Organizer events");
            }
        });
        btDis.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SceneUtls.chooseScene(event, Constants.Admin.DIS_EVENTS,"Distributor events");
            }
        });
        btBack.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SceneUtls.chooseScene(event, Constants.Login.LOGIN_VIEW,"Login");
            }
        });
    }
}
