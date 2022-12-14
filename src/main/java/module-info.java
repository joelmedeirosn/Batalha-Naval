module com.example.batalhanaval {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.batalhanaval to javafx.fxml;
    exports com.example.batalhanaval;
    exports com.example.batalhanaval.model;
    opens com.example.batalhanaval.model to javafx.fxml;
    exports com.example.batalhanaval.controller;
    opens com.example.batalhanaval.controller to javafx.fxml;
}