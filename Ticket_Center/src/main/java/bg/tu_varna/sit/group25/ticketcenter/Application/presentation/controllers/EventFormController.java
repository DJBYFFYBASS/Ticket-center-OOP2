package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers;

import bg.tu_varna.sit.group25.ticketcenter.Application.business.services.CustomerService;
//import bg.tu_varna.sit.group25.ticketcenter.Application.business.services.FormService;
import bg.tu_varna.sit.group25.ticketcenter.Application.business.services.ShowService;
import bg.tu_varna.sit.group25.ticketcenter.Application.common.Constants;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.access.Connection;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Customer;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Form;
// bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.FormRepository;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Show;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.FormUtils;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.LoginUtls;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.ShowListViewModel;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.w3c.dom.events.MouseEvent;

import java.net.URL;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class EventFormController implements Initializable {

    private final ShowService service=ShowService.getInstance();

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
    private Button buttonQuery;
    @FXML
    private Button buttonLoginReturn;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        buttonCreate.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if (tfEventLocation.getText()!=""&&tfEventType.getText()!=""&&tfEventType.getText()!=""&&tfEventStatus.getText()!=""&&tfEventDate.getText()!=""
                        &&tfEventTickets.getText()!=""&&tfEventTicketLimit.getText()!=""&&tfEventID.getText()!="")
                {
                    //FormUtils.EventFormCreate(tfEventLocation.getText(),Integer.parseInt(tfEventType.getText()),tfEventName.getText(), Integer.parseInt(tfEventStatus.getText()), tfEventDate.getText(),
                        //    Integer.parseInt(tfEventTickets.getText()), Integer.parseInt(tfEventTicketLimit.getText()),Integer.parseInt(tfEventID.getText()));
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
        buttonQuery.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (true)
                {
                    LoginUtls.EventQueryEntry(event,Constants.EventForm.EVENT_QUERY_VIEW,"Event Query");
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
