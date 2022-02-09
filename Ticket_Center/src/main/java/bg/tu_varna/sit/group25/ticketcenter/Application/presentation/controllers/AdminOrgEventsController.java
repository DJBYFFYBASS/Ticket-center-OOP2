package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers;

import bg.tu_varna.sit.group25.ticketcenter.Application.business.services.OrganizerService;
import bg.tu_varna.sit.group25.ticketcenter.Application.business.workflow.AdminOrgWF;
import bg.tu_varna.sit.group25.ticketcenter.Application.common.Constants;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.OrganizerListViewModel;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.SceneUtls;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminOrgEventsController implements Initializable {
    private final OrganizerService service=OrganizerService.getInstance();
    @FXML
    private TextField tbOrgName;
    @FXML
    private TextField tbOrgPN;
    @FXML
    private TextField tbOrgUser;
    @FXML
    private TextField tbOrgPass;
    @FXML
    private TextField tbOrgFee;
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
    private ListView<OrganizerListViewModel> lvAdminOrg;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<OrganizerListViewModel> showsListViewModels=service.getAllOrganizers();
        lvAdminOrg.setItems(showsListViewModels);
        btBack.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SceneUtls.chooseScene(event, Constants.Admin.OPTIONS,"Event Form");
            }
        });
        btAdd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (tbOrgName.getText()!=""&&tbOrgPN.getText()!=""&&tbOrgUser.getText()!=""&&tbOrgPass.getText()!=""&&tbOrgFee.getText()!="")
                {
                    AdminOrgWF.Add(tbOrgName.getText(),tbOrgPN.getText(),tbOrgUser.getText(),tbOrgPass.getText(),tbOrgFee.getText());
                }
            }
        });
        btFind.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ObservableList<OrganizerListViewModel> showsListViewModels=service.getAllOrganizers();
                lvAdminOrg.setItems(showsListViewModels);
            }
        });
    }
}
