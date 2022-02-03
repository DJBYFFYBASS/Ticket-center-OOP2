package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers;

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
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btOrg.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });
        btDis.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });
    }
}
