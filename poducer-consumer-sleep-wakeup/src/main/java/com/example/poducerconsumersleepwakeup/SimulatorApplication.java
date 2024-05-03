package com.example.poducerconsumersleepwakeup;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SimulatorApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        ProducerConsumerSimulator producerConsumerSimulator = new ProducerConsumerSimulator();
        producerConsumerSimulator.start(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}