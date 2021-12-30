package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers;

import bg.tu_varna.sit.group25.ticketcenter.Application.common.Constants;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.FormUtils;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.LoginUtls;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class EventFormController implements Initializable {

    @FXML
    private TextField tfEventLocation;
    @FXML
    private TextField tfEventType;
    @FXML
    private TextField tfEventName;
    @FXML
    private TextField tfEventStatus;
    @FXML
    private TextField tfEventDate;
    @FXML
    private TextField tfEventTickets;
    @FXML
    private TextField tfEventTicketLimit;
    @FXML
    private TextField tfEventID;
    @FXML
    private Label lbEventFormWarning;
    @FXML
    private Button buttonCreate;
    @FXML
    private Button buttonUpdate;
    @FXML
    private Button buttonLoginReturn;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        buttonCreate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (tfEventLocation.getText()!=""&&tfEventType.getText()!=""&&tfEventName.getText()!=""&&tfEventStatus.getText()!=""&&tfEventDate.getText()!=""
                        &&tfEventTickets.getText()!=""&&tfEventTicketLimit.getText()!=""&&tfEventID.getText()!="")
                {
                    FormUtils.EventFormCreate(tfEventLocation.getText(),tfEventType.getText(),tfEventName.getText(),tfEventStatus.getText(),tfEventDate.getText(),
                            tfEventTickets.getText(), tfEventTicketLimit.getText(),tfEventID.getText());
                }
                else
                {
                    lbEventFormWarning.setText(Constants.Warning.EMPTY_FIELDS_MESSAGE);
                }
            }
        });
        buttonUpdate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (tfEventLocation.getText()!=""&&tfEventType.getText()!=""&&tfEventName.getText()!=""&&tfEventStatus.getText()!=""&&tfEventDate.getText()!=""
                        &&tfEventTickets.getText()!=""&&tfEventTicketLimit.getText()!=""&&tfEventID.getText()!="")
                {
                    FormUtils.EventFormUpdate(tfEventLocation.getText(),tfEventType.getText(),tfEventName.getText(),tfEventStatus.getText(),tfEventDate.getText(),
                            tfEventTickets.getText(), tfEventTicketLimit.getText(),tfEventID.getText());
                }
                else
                {
                    lbEventFormWarning.setText(Constants.Warning.EMPTY_FIELDS_MESSAGE);
                }
            }
        });
        buttonLoginReturn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                LoginUtls.chooseLogin(event,Constants.Login.LOGIN_VIEW,"Login choice",null,null);
            }
        });
    }
}
