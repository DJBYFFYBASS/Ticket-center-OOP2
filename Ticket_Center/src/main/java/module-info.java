module bg.tu_varna.sit.group25.ticketcenter {
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
    requires org.hibernate.orm.core;
    requires java.persistence;

    exports bg.tu_varna.sit.group25.ticketcenter.Application.application;
    opens bg.tu_varna.sit.group25.ticketcenter.Application.application to javafx.fxml;

    exports bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers;
    opens bg.tu_varna.sit.group25.ticketcenter.Application.presentation.controllers to javafx.fxml;
}