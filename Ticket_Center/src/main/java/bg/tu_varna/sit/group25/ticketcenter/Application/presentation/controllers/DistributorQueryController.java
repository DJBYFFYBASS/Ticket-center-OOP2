package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers;

import bg.tu_varna.sit.group25.ticketcenter.Application.business.services.FormService;
import bg.tu_varna.sit.group25.ticketcenter.Application.common.Constants;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Distributor;
import bg.tu_varna.sit.group25.ticketcenter.Application.data.entities.Organizer;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.DistributorListViewModel;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.FormListViewModel;
import bg.tu_varna.sit.group25.ticketcenter.Application.business.workflow.FormUtils;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.SceneUtls;
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

    public Distributor dis;
    public void SetDis(Distributor dis)
    {
        this.dis=dis;
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<FormListViewModel> showsDistributorListViewModel=service.getAllForms();
        lvDistributor.setItems(showsDistributorListViewModel);
        btQuery.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FormUtils.DisQuery(disName);
            }
        });

        btBack.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SceneUtls.DisToss(event, Constants.Distributor.DIS_OPTIONS,"Distributor options",dis);
            }
        });
    }

}
