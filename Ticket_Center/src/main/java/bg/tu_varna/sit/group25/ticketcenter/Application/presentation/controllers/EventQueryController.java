package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers;

import bg.tu_varna.sit.group25.ticketcenter.Application.business.services.FormService;
import bg.tu_varna.sit.group25.ticketcenter.Application.business.services.ShowService;
import bg.tu_varna.sit.group25.ticketcenter.Application.common.Constants;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.FormListViewModel;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.SceneUtls;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.ShowListViewModel;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class EventQueryController implements Initializable {

    private final ShowService service=ShowService.getInstance();
    @FXML
    private Label lbEvent;
    @FXML
    private ListView<ShowListViewModel>lvEvent;
    @FXML
    private Button btBack;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<ShowListViewModel>showsListViewModels=service.getAllShows();
        lvEvent.setItems(showsListViewModels);
        btBack.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SceneUtls.chooseScene(event, Constants.Organizer.Org_Options,"Distributor options");
            }
        });
    }

    public void SetEventName(String eventName) {
        lbEvent.setText(lbEvent.getText()+eventName);
    }
}
