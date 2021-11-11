module bg.tuvarna.sit.ticketcenter25.ticketcenter {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires log4j;

    exports bg.tuvarna.sit.ticketcenter25.ticketcenter.application;
    opens bg.tuvarna.sit.ticketcenter25.ticketcenter.application to javafx.fxml;

    exports bg.tuvarna.sit.ticketcenter25.ticketcenter.presentaion.controllers;
    opens bg.tuvarna.sit.ticketcenter25.ticketcenter.presentaion.controllers to javafx.fxml;
}