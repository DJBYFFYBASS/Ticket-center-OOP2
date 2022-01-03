package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers;

import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.FormUtils;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class EventQueryController implements Initializable {

    @FXML
    private Label lbEvent;
    @FXML
    private ListView lvEvent;

    private String eventName;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        FormUtils.EventQry(eventName);
    }
    public void SetEventName(String event)
    {
        lbEvent.setText(lbEvent.getText()+event);
        eventName=event;
    }
}
