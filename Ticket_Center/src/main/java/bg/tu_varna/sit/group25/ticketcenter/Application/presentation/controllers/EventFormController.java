package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers;

import bg.tu_varna.sit.group25.ticketcenter.Application.business.services.FormService;
import bg.tu_varna.sit.group25.ticketcenter.Application.business.services.ShowService;
import bg.tu_varna.sit.group25.ticketcenter.Application.business.workflow.OrgEventWF;
import bg.tu_varna.sit.group25.ticketcenter.Application.common.Constants;
// bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.FormRepository;
        import bg.tu_varna.sit.group25.ticketcenter.Application.business.workflow.FormUtils;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Organizer;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.SceneUtls;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.ShowListViewModel;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

        import java.net.URL;
import java.text.SimpleDateFormat;
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
    private TextField tfDis;
    @FXML
    private Label lbEventFormWarning;
    @FXML
    private Button buttonCreate;
    @FXML
    private Button buttonUpdate;
    @FXML
    private Button btBack;
    @FXML
    private Button buttonLoginReturn;
    @FXML
    private ListView lvEF;

    public String name;

    public Organizer org;
    public void SetOrg(Organizer org)
    {
        this.org=org;
    }
    private void loadList()
    {

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       //ObservableList<ShowListViewModel> showsListViewModels=service.getForOrg(org.getOrganizer_ID());
        ObservableList<ShowListViewModel> showsListViewModels=service.getAllShows();
        lvEF.setItems(showsListViewModels);
        buttonCreate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (tfEventLocation.getText()!=""&&tfEventType.getText()!=""&&tfEventType.getText()!=""&&tfEventStatus.getText()!=""&&tfEventDate.getText()!=""
                        &&tfEventTickets.getText()!=""&&tfEventTicketLimit.getText()!=""&&tfDis.getText()!="")
                {
                    OrgEventWF.Add(tfEventName.getText(),tfEventDate.getText(),tfEventLocation.getText(),tfEventTicketLimit.getText(),tfEventTickets.getText(),
                            tfEventStatus.getText(),tfEventType.getText(),org,tfDis.getText());
                }
                else
                {
                    lbEventFormWarning.setText(Constants.Warning.EMPTY_FIELDS_MESSAGE);
                }
                ObservableList<ShowListViewModel> showsListViewModels=service.getAllShows();
                lvEF.setItems(showsListViewModels);
            }
        });

        buttonUpdate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (tfEventID.getText()!="")
                {
                    OrgEventWF.Update(tfEventName.getText(),tfEventDate.getText(),tfEventLocation.getText(),tfEventTicketLimit.getText(),tfEventTickets.getText(),
                            tfEventStatus.getText(),tfEventType.getText(),org,tfDis.getText(),tfEventID.getText());
                }
                else
                {
                    lbEventFormWarning.setText(Constants.Warning.EMPTY_FIELDS_MESSAGE);
                }
                ObservableList<ShowListViewModel> showsListViewModels=service.getAllShows();
                lvEF.setItems(showsListViewModels);
            }
        });
        btBack.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SceneUtls.OrgToss(event,Constants.Organizer.Org_Options,"Organizer Options",org);
            }
        });
        buttonLoginReturn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SceneUtls.chooseScene(event,Constants.Login.LOGIN_VIEW,"Login choice");
            }
        });
    }


}
