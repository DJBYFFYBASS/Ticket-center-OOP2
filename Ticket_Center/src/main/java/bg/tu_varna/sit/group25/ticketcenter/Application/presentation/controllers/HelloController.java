package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers;

import bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models.LobbyModel;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class HelloController implements EventHandler <MouseEvent> {
    @FXML
    private Label welcomeText;

    @FXML
    private Button lobbyButton;

    @FXML
    private final LobbyModel model;

    public HelloController()
    {
        this.model=new LobbyModel();
    }
    @FXML
    private void initialize()
    {

        lobbyButton.setOnMouseClicked(this::handle);
    }

    @Override
    public void handle(MouseEvent mouseEvent) {
        welcomeText.setText(model.getWelcomeMessage());
    }
}