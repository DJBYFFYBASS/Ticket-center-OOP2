package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers;

import bg.tu_varna.sit.group25.ticketcenter.Application.common.Constants;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.SceneUtls;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminLoginCotroller implements Initializable {
    @FXML
    private Button btAdminLogin;
    @FXML
    private TextField tfUserAdmin;
    @FXML
    private TextField tfPassAdmin;
    @FXML
    private Label lbAdminWarning;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btAdminLogin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (tfPassAdmin.getText()!=""&&tfUserAdmin.getText()!="")
                {
                    SceneUtls.AdminLogin(event, Constants.Admin.OPTIONS,"Admin options",tfUserAdmin.getText(),tfPassAdmin.getText());
                }
                else {
                    lbAdminWarning.setText(Constants.Warning.EMPTY_FIELDS_MESSAGE);
                }
            }
        });
    }
}
