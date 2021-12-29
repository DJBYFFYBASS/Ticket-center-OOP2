package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers;

import bg.tu_varna.sit.group25.ticketcenter.Application.common.Constants;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.LoginUtls;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginFormController  implements Initializable {

    @FXML
    private Button OrganizerLoginButton;
    @FXML
    private Button DistributorLoginButton;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        OrganizerLoginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                LoginUtls.chooseLogin(actionEvent, Constants.Organizer.ORGANIZER_LOGIN,
                        "OrganizerLogin",null,null);
            }
        });
        DistributorLoginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                LoginUtls.chooseLogin(actionEvent, Constants.Distributor.DISTRIBUTOR_LOGIN,
                        "DistributorLogin",null,null);
            }
        });

    }

    public void setUserInformation(String username,String pass)
    {

    }


}
