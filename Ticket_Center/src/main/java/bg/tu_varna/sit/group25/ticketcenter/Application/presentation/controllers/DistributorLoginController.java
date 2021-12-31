package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers;

import bg.tu_varna.sit.group25.ticketcenter.Application.common.Constants;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.access.Connection;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.DistributorRepository;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.DistributorListViewModel;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.LoginUtls;
import bg.tu_varna.sit.group25.ticketcenter.Application.business.services.DistributorService;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.DatabaseMetaData;
import java.util.ResourceBundle;

public class DistributorLoginController implements Initializable {

    @FXML
    private TextField tfUserDis;
    @FXML
    private PasswordField tfPassDis;
    @FXML
    private Label lbDisWarning;
    @FXML
    private Button DistributorLoginButton;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        DistributorLoginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               if (tfPassDis.getText().isBlank()==false&&tfUserDis.getText().isBlank()==false)
                {
                    LoginUtls.DisLogin(event,Constants.TicketForm.TICKET_FORM_VIEW,"Ticket Form",tfUserDis.getText(), Integer.parseInt(tfPassDis.getText()));
               }
               else {
                    lbDisWarning.setText(Constants.Warning.EMPTY_FIELDS_MESSAGE);
               }
            }
        });
    }

}
