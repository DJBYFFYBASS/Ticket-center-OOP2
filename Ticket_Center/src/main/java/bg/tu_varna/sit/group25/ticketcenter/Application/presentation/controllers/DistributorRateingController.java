package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers;

import bg.tu_varna.sit.group25.ticketcenter.Application.common.Constants;
import bg.tu_varna.sit.group25.ticketcenter.Application.business.workflow.FormUtils;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.SceneUtls;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class DistributorRateingController implements Initializable {
    @FXML
    private Button buttonSubmmitRating;
    @FXML
    private TextField tfRateing;
    @FXML
    private Button btSkip;
    private String disName;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        buttonSubmmitRating.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (tfRateing.getText()!="") {
                    FormUtils.DisRateing(tfRateing.getText(),disName);
                }
                SceneUtls.chooseScene(event, Constants.Login.LOGIN_VIEW,"Login");
            }
        });
        btSkip.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SceneUtls.chooseScene(event,Constants.Distributor.DIS_OPTIONS,"Distributor options");
            }
        });
    }
    public void GetInfo(String name)
    {
        disName=name;
    }
}
