package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers;

import bg.tu_varna.sit.group25.ticketcenter.Application.business.services.FormService;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.repositories.FormRepository;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.FormListViewModel;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.FormUtils;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class DistributorQueryController implements Initializable {

    @FXML
    private Label lbDisQry;
    @FXML
    private ListView lvDistributor;

    private String disName;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        FormUtils.DisQuery(disName);
    }

    public void SetUserInfo(String username)
    {
        lbDisQry.setText("Distributor: "+username);
        disName=username;

    }
}
