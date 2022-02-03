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

public class OrganizerOptionsController implements Initializable {
    @FXML
    private Button btView;
    @FXML
    private Button btUpdate;
    @FXML
    private Button btCreate;
    @FXML
    private Button btBack;

    public String OrgName;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btCreate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            SceneUtls.chooseScene(event,Constants.EventForm.EVENT_FORM_VIEW,"Event Form");
            }
        });
        btUpdate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });
        btView.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            SceneUtls.chooseScene(event,Constants.EventForm.EVENT_QUERY_VIEW,"Event query");
            }
        });
        btBack.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SceneUtls.chooseScene(event, Constants.Login.LOGIN_VIEW,"Login");
            }
        });

    }
    public void SetOrgName(String name)
    {
        OrgName=name;
    }
}
