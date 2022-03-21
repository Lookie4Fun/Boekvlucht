module com.example.boekvlucht {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.boekvlucht to javafx.fxml;
    exports com.example.boekvlucht;
}