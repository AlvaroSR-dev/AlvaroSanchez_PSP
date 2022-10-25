package com.example.securityutilities;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Button ipconfig;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ipconfig.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    Process process = Runtime.getRuntime().exec("ping www.stackabuse.com");

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}