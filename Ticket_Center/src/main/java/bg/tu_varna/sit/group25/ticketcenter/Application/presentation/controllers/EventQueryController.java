package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers;

import bg.tu_varna.sit.group25.ticketcenter.Application.business.services.FormService;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.FormListViewModel;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class EventQueryController implements Initializable {

    private final FormService service=FormService.getInstance();
    @FXML
    private Label lbEvent;
    @FXML
    private ListView<FormListViewModel>lvEvent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<FormListViewModel> formListViewModels=service.getAllForms();
        lvEvent.setItems(formListViewModels);
    }

    public void SetEventName(String eventName) {
        lbEvent.setText(lbEvent.getText()+eventName);
    }
}
