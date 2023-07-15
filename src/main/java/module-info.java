module com.guils.guils {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.guils.guils to javafx.fxml;
    exports com.guils.guils;
}