package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class DistributorRateingController implements Initializable {
    @FXML
    private Button buttonSubmmitRating;
    @FXML
    private TextField tfRateing;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        buttonSubmmitRating.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });
    }
}
