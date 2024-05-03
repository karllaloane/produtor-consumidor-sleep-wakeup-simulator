module com.example.poducerconsumersleepwakeup {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.poducerconsumersleepwakeup to javafx.fxml;
    exports com.example.poducerconsumersleepwakeup;
}