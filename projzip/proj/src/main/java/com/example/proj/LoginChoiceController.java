package com.example.proj;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginChoiceController {

    @FXML
    private void handleStudentLogin(ActionEvent event) {
        navigateToLogin(event, "StudentLogin.fxml", "Student Login");
    }

    @FXML
    private void BacktoLoginPage(ActionEvent event) {
        navigateToLogin(event, "LoginChoice.fxml", "LoginChoice");
    }

    @FXML
    private void handleFacultyLogin(ActionEvent event) {
        navigateToLogin(event, "FacultyLogin.fxml", "Faculty Login");
    }

    private void navigateToLogin(ActionEvent event, String fxmlFile, String title) {
        try {
            Stage stage = (Stage) ((javafx.scene.Node) (event.getSource())).getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
            stage.setTitle(title);
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
