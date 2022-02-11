package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers;

import bg.tu_varna.sit.group25.ticketcenter.Application.common.Constants;
import bg.tu_varna.sit.group25.ticketcenter.Application.business.workflow.FormUtils;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Distributor;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Organizer;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.SceneUtls;
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

   // CustomerService customerService=new CustomerService();
    //FormRepository formRepository=new FormRepository();
    //CustomerRepository customerRepository=new CustomerRepository();


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
    private Button btBack;
    @FXML
    private Label lbWarning;


    public Distributor dis;
    public void SetDis(Distributor dis)
    {
        this.dis=dis;
    }
    private String disName;
    @Override

    public void initialize(URL url, ResourceBundle resourceBundle) {
        buttonSubmit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (tfClientName.getText() != "" && tfClientPhonenumber.getText() != "" && tfTicketCount.getText() != "" && tfEvent.getText() != ""&&tfTicketPrice.getText()!="") {
                    FormUtils.TicketForm(tfClientName.getText(),tfClientPhonenumber.getText(),tfEvent.getText(),tfTicketCount.getText(),tfTicketPrice.getText());

                    SceneUtls.DisRateing(event,Constants.RateingForm.RATING_FORM_VIEW,"Rateing Form",disName,dis);
                } else {
                    lbWarning.setText(Constants.Warning.EMPTY_FIELDS_MESSAGE);
                }
            }

        });
        btBack.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SceneUtls.DisToss(event,Constants.Distributor.DIS_OPTIONS,"Distributor options",dis);
            }
        });
    }
    public void SetDisName(String name)
    {
        DistributorInForm.setText(DistributorInForm.getText()+" "+name);
        disName=name;
    }
}
