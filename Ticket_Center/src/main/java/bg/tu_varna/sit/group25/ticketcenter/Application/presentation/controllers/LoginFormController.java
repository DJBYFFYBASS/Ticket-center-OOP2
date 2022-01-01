package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers;

import bg.tu_varna.sit.group25.ticketcenter.Application.business.services.OrganizerService;
import bg.tu_varna.sit.group25.ticketcenter.Application.common.Constants;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Distributor;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Organizer;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.OrganizerRepository;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.DistributorListViewModel;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.LoginUtls;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginFormController  implements Initializable {

    private Organizer organizer=new Organizer();
    private Distributor distributor=new Distributor();

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
                        "OrganizerLogin", String.valueOf(organizer.getPassword_O()), organizer.getUserName_O_O());
            }
        });
        DistributorLoginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                    LoginUtls.chooseLogin(actionEvent, Constants.Distributor.DISTRIBUTOR_LOGIN,
                            "DistributorLogin", distributor.getUserName_D(), distributor.getPassword_D());

            }
        });

    }




}
