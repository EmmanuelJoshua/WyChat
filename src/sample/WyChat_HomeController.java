/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXSpinner;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 *
 * @author Spark
 */
public class WyChat_HomeController implements Initializable {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private FontAwesomeIconView connected;

    @FXML
    private JFXSpinner spinner;

    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    private Text connection;

    @FXML
    private Pane setWiFi;

    @FXML
    private Pane getStarted;

    @FXML
    private Pane createPane;

    @FXML
    private Pane joinPane;

    @FXML
    private JFXButton start;

    @FXML
    private void createConnection(ActionEvent event) throws IOException {
        createPane.setVisible(true);
        FadeTransition fade = new FadeTransition();
        fade.setDuration(Duration.millis(500));
        fade.setNode(createPane);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.play();
    }

    @FXML
    private void joinConnection(ActionEvent event) {
        joinPane.setVisible(true);
        FadeTransition fade2 = new FadeTransition();
        fade2.setDuration(Duration.millis(500));
        fade2.setNode(joinPane);
        fade2.setFromValue(0);
        fade2.setToValue(1);
        fade2.play();
    }

    @FXML
    private void create(ActionEvent event) throws IOException {
        PauseTransition pause = new PauseTransition(Duration.seconds(5));
        getStarted.setVisible(true);
        FadeTransition fade2 = new FadeTransition();
        fade2.setDuration(Duration.millis(500));
        fade2.setNode(getStarted);
        fade2.setFromValue(0);
        fade2.setToValue(1);
        fade2.play();
        pause.play();
        pause.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                spinner.setVisible(false);
                connection.setText("Connection Succesfull!");
                connected.setVisible(true);
                start.setVisible(true);
                FadeTransition fade3 = new FadeTransition();
                fade3.setDuration(Duration.millis(1000));
                fade3.setNode(start);
                fade3.setFromValue(0);
                fade3.setToValue(1);
                fade3.play();

            }
        });

    }

    @FXML
    private void exitButton(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    private void backButton1(MouseEvent event) {
        FadeTransition fade3 = new FadeTransition();
        fade3.setDuration(Duration.millis(500));
        fade3.setNode(createPane);
        fade3.setFromValue(1);
        fade3.setToValue(0);
        fade3.play();
        fade3.setOnFinished((ActionEvent event1) -> {
            createPane.setVisible(false);
        });
    }

    @FXML
    private void backButton2(MouseEvent event) {
        FadeTransition fade3 = new FadeTransition();
        fade3.setDuration(Duration.millis(500));
        fade3.setNode(joinPane);
        fade3.setFromValue(1);
        fade3.setToValue(0);
        fade3.play();
        fade3.setOnFinished((ActionEvent event1) -> {
            joinPane.setVisible(false);
        });
    }

    @FXML
    private void getStarted(ActionEvent event) {
        PauseTransition pause = new PauseTransition(Duration.seconds(1));
        pause.play();
        pause.setOnFinished((ActionEvent e) -> {
            ((Stage) rootPane.getScene().getWindow()).close();
            try {
                Parent parent = FXMLLoader.load(getClass().getResource("WyChatDash.fxml"));

                Stage stage = new Stage(StageStyle.UNDECORATED);
                stage.setTitle("Home");
//                stage.setResizable(false);
                stage.setScene(new Scene(parent));
                stage.initOwner(((Stage) rootPane.getScene().getWindow()));
                stage.initModality(Modality.WINDOW_MODAL);
                stage.centerOnScreen();
                stage.show();
            } catch (IOException ex) {
//            AlertMaker.showErrorMessage(ex);
            }

        });

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
