module com.example.github {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.github to javafx.fxml;
    exports com.example.github;
}