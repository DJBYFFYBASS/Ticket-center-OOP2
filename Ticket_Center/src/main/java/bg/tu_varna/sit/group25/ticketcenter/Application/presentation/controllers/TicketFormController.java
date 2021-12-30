package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers;

import bg.tu_varna.sit.group25.ticketcenter.Application.common.Constants;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.FormUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class TicketFormController implements Initializable {
    @FXML
    private Label DistributorInForm;
    @FXML
    private TextField tfClientName;
    @FXML
    private TextField tfClientPhonenumber;
    @FXML
    private TextField tfEvent;
    @FXML
    private TextField tfTicketCount;
    @FXML
    private Button buttonSubmit;
    @FXML
    private Label lbWarning;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        buttonSubmit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (tfClientName.getText() != "" && tfClientPhonenumber.getText() != "" && tfTicketCount.getText() != "" && tfEvent.getText() != "") {
                    FormUtils.TicketForm(tfClientName.getText(),tfClientPhonenumber.getText(),tfEvent.getText(),tfTicketCount.getText());
                } else {
                    lbWarning.setText(Constants.Warning.EMPTY_FIELDS_MESSAGE);
                }
            }

        });
    }
}
