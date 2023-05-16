module com.example.umldiyagram {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.umldiyagram to javafx.fxml;
    exports com.example.umldiyagram;
}