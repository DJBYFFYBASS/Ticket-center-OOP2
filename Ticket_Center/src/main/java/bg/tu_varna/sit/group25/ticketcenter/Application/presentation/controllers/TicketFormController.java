package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers;

import bg.tu_varna.sit.group25.ticketcenter.Application.business.services.CustomerService;
import bg.tu_varna.sit.group25.ticketcenter.Application.common.Constants;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.access.Connection;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Customer;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Form;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.CustomerRepository;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.FormRepository;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.FormUtils;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.LoginUtls;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.hibernate.PropertyValueException;

import java.net.URL;
import java.time.format.FormatStyle;
import java.util.ResourceBundle;

public class TicketFormController implements Initializable {

    CustomerService customerService=new CustomerService();
    FormRepository formRepository=new FormRepository();
    CustomerRepository customerRepository=new CustomerRepository();


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
    private TextField tfTicketPrice;
    @FXML
    private Button buttonSubmit;
    @FXML
    private Button buttonDisQuery;
    @FXML
    private Label lbWarning;

    private String disName;
    @Override

    public void initialize(URL url, ResourceBundle resourceBundle) {
        buttonSubmit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (tfClientName.getText() != "" && tfClientPhonenumber.getText() != "" && tfTicketCount.getText() != "" && tfEvent.getText() != ""&&tfTicketPrice.getText()!="") {
                    FormUtils.TicketForm(tfClientName.getText(),tfClientPhonenumber.getText(),tfEvent.getText(),tfTicketCount.getText(),tfTicketPrice.getText());

                    LoginUtls.chooseLogin(event,Constants.RateingForm.RATING_FORM_VIEW,"Rating Form",null,null);
                } else {
                    lbWarning.setText(Constants.Warning.EMPTY_FIELDS_MESSAGE);
                }
            }

        });
        buttonDisQuery.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });
    }
    public void SetDisName(String name)
    {
        DistributorInForm.setText(DistributorInForm.getText()+" "+name);
        disName=name;
    }
}
