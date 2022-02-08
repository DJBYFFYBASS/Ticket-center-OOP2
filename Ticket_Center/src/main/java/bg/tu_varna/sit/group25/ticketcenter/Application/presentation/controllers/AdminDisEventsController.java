package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers;

import bg.tu_varna.sit.group25.ticketcenter.Application.business.services.DistributorService;
import bg.tu_varna.sit.group25.ticketcenter.Application.common.Constants;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.DistributorListViewModel;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.SceneUtls;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminDisEventsController implements Initializable{

    private final DistributorService service=DistributorService.getInstance();
    @FXML
    private TextField tbDisName;
    @FXML
    private TextField tbDisPN;
    @FXML
    private TextField tbDisUser;
    @FXML
    private TextField tbDisPass;
    @FXML
    private TextField tbDisFee;
    @FXML
    private TextField tbRateing;
    @FXML
    private TextField tbRCount;
    @FXML
    private TextField tbSTickets;
    @FXML
    private Button btAdd;
    @FXML
    private Button btUpdate;
    @FXML
    private Button btDel;
    @FXML
    private Button btFind;
    @FXML
    private Button btBack;
    @FXML
    private ListView<DistributorListViewModel> lvAdminDis;
    @FXML


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        ObservableList<DistributorListViewModel>showsDistributorListViewModel=service.getAllDistributor();
        lvAdminDis.setItems(showsDistributorListViewModel);
        btBack.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SceneUtls.chooseScene(event, Constants.Admin.OPTIONS,"Admin Options");
            }
        });
    }


}
