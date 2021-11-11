package bg.tuvarna.sit.ticketcenter25.ticketcenter.presentaion.controllers;

import bg.tuvarna.sit.ticketcenter25.ticketcenter.presentaion.models.HelloModel;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class HelloController implements EventHandler<MouseEvent> {
    @FXML
    private Label welcomeText;

    @FXML
    private Button helloButton;

    private  final HelloModel model;

    public HelloController() {
        this.model = new HelloModel();
    }

    @FXML
    private void initialize() {
        helloButton.setOnMouseClicked(this::handle);
    }

    @Override
    public void handle(MouseEvent mouseEvent) {
        welcomeText.setText(model.getWelcomeMessage());
    }
}