package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers;

import bg.tu_varna.sit.group25.ticketcenter.Application.common.Constants;
import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.SceneUtls;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class OrganizerLoginController implements Initializable {
    @FXML
    private Button OrganizerLoginButton;
    @FXML
    private TextField tfUserOrg;
    @FXML
    private PasswordField tfPassOrg;
    @FXML
    private Label lbOrgWarning;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        OrganizerLoginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (tfPassOrg.getText()!=""&&tfUserOrg.getText()!="")
                {
                    SceneUtls.OrgLogin(event,Constants.Organizer.Org_Options,"Organizer options",tfUserOrg.getText(),tfPassOrg.getText());
                }
                else {
                    lbOrgWarning.setText(Constants.Warning.EMPTY_FIELDS_MESSAGE);
                }
            }
        });
    }

    public void setUserInformation(String username,String pass)
    {
        username=tfUserOrg.getText();
        pass=tfPassOrg.getText();
    }
}
