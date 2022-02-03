package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers;

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

    private String OrgName;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btCreate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

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

            }
        });


    }
    public void SetOrgName(String name)
    {
        OrgName=name;
    }
}
