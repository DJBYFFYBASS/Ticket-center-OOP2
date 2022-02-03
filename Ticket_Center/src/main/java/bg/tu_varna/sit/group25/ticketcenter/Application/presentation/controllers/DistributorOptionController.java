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

public class DistributorOptionController implements Initializable {
    @FXML
    private Button btTForm;
    @FXML
    private Button btQuery;
    @FXML
    private Button btBack;

    public String DisName;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btBack.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SceneUtls.chooseScene(event, Constants.Login.LOGIN_VIEW,"Login");
            }
        });
        btTForm.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SceneUtls.chooseScene(event,Constants.TicketForm.TICKET_FORM_VIEW,"Ticket form");
            }
        });
        btQuery.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SceneUtls.chooseScene(event,Constants.Distributor.DISTRIBUTOR_QUERY_VIEW,"Distributor query");
            }
        });
    }
}
