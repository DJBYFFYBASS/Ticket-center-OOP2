package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers;

import bg.tu_varna.sit.group25.ticketcenter.Application.business.services.FormService;
import bg.tu_varna.sit.group25.ticketcenter.Application.common.Constants;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.FormListViewModel;
import bg.tu_varna.sit.group25.ticketcenter.Application.business.workflow.FormUtils;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.SceneUtls;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class DistributorQueryController implements Initializable {

    private final FormService service=FormService.getInstance();
    @FXML
    private Label lbDisQry;
    @FXML
    private ListView<FormListViewModel> lvDistributor;
    @FXML
    private Button btBack;
    @FXML
    private Button btQuery;

    private String disName;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        btQuery.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FormUtils.DisQuery(disName);
            }
        });

        btBack.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SceneUtls.chooseScene(event, Constants.Distributor.DIS_OPTIONS,"Distributor options");
            }
        });
    }

    public void SetUserInfo(String username)
    {
        lbDisQry.setText("Distributor: "+username);
        disName=username;

    }
}
