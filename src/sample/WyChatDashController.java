/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Spark
 */
public class WyChatDashController implements Initializable {

    
    @FXML
    private Pane createUser;
    
    @FXML
    private Pane dashboard;
    
    @FXML
    private Pane videoCall;
    
    @FXML
    private Pane messages;
    
    @FXML
    private Pane settings;
   
    @FXML
    private Pane about;

    @FXML
    private Pane activeStatus_pane;

    @FXML
    private JFXButton dashBtn;

    @FXML
    private MaterialDesignIconView dashIcon;

    @FXML
    private JFXButton videoBtn;

    @FXML
    private MaterialDesignIconView videoIcon;

    @FXML
    private JFXButton messageBtn;

    @FXML
    private MaterialDesignIconView messageIcon;

    @FXML
    private JFXButton settingsBtn;

    @FXML
    private MaterialDesignIconView settingIcon;

    @FXML
    private JFXButton aboutBtn;

    @FXML
    private MaterialDesignIconView aboutIcon;
    
    @FXML
    private void saveProfile(ActionEvent event){
        FadeTransition fade = new FadeTransition();
        fade.setDuration(Duration.millis(300));
        fade.setNode(createUser);
        fade.setFromValue(1);
        fade.setToValue(0);
        fade.play();
        fade.setOnFinished((ActionEvent event1) -> {
            createUser.setVisible(false);
        });
        
    }
    
    @FXML
    private void openDash(ActionEvent event){
        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(500));
        translateTransition.setNode(activeStatus_pane);
        translateTransition.setToX(0);
        translateTransition.play();

        if (videoBtn.getStyleClass().size() == 2 && videoIcon.getStyleClass().size() == 2) {

        } else if (videoBtn.getStyleClass().size() == 4 && videoIcon.getStyleClass().size() == 4) {
            videoBtn.getStyleClass().remove(3);
            videoIcon.getStyleClass().remove(3);
        }

        if (messageBtn.getStyleClass().size() == 2 && messageIcon.getStyleClass().size() == 2) {

        } else if (messageBtn.getStyleClass().size() == 4 && messageIcon.getStyleClass().size() == 4) {
            messageBtn.getStyleClass().remove(3);
            messageIcon.getStyleClass().remove(3);
        }

        if (settingsBtn.getStyleClass().size() == 2 && settingIcon.getStyleClass().size() == 2) {

        } else if (settingsBtn.getStyleClass().size() == 4 && settingIcon.getStyleClass().size() == 4) {
            settingsBtn.getStyleClass().remove(3);
            settingIcon.getStyleClass().remove(3);
        }

        if (aboutBtn.getStyleClass().size() == 2 && aboutIcon.getStyleClass().size() == 2) {

        } else if (aboutBtn.getStyleClass().size() == 4 && aboutIcon.getStyleClass().size() == 4) {
            aboutBtn.getStyleClass().remove(3);
            aboutIcon.getStyleClass().remove(3);
        }

        if (dashBtn.getStyleClass().toString().contains("btns_active") && dashIcon.getStyleClass().toString().contains("icons_active")) {

        } else {
            dashBtn.getStyleClass().add("btns_active");
            dashIcon.getStyleClass().add("icons_active");
            dashboard.setVisible(true);
            FadeTransition fade = new FadeTransition();
            fade.setDuration(Duration.millis(500));
            fade.setNode(dashboard);
            fade.setFromValue(0);
            fade.setToValue(1);
            fade.play();
            videoCall.setVisible(false);
            messages.setVisible(false);
            settings.setVisible(false);
            about.setVisible(false);
        }
    }
    
    @FXML
    private void openVideoCall(ActionEvent event){
        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(500));
        translateTransition.setNode(activeStatus_pane);
        translateTransition.setToX(240);
        translateTransition.play();

        if (dashBtn.getStyleClass().size() == 2 && dashIcon.getStyleClass().size() == 2) {

        } else if (dashBtn.getStyleClass().size() == 3 && dashIcon.getStyleClass().size() == 3) {
            dashBtn.getStyleClass().remove(2);
            dashIcon.getStyleClass().remove(2);
        }

        if (messageBtn.getStyleClass().size() == 2 && messageIcon.getStyleClass().size() == 2) {

        } else if (messageBtn.getStyleClass().size() == 4 && messageIcon.getStyleClass().size() == 4) {
            messageBtn.getStyleClass().remove(3);
            messageIcon.getStyleClass().remove(3);
        }

        if (settingsBtn.getStyleClass().size() == 2 && settingIcon.getStyleClass().size() == 2) {

        } else if (settingsBtn.getStyleClass().size() == 4 && settingIcon.getStyleClass().size() == 4) {
            settingsBtn.getStyleClass().remove(3);
            settingIcon.getStyleClass().remove(3);
        }

        if (aboutBtn.getStyleClass().size() == 2 && aboutIcon.getStyleClass().size() == 2) {

        } else if (aboutBtn.getStyleClass().size() == 4 && aboutIcon.getStyleClass().size() == 4) {
            aboutBtn.getStyleClass().remove(3);
            aboutIcon.getStyleClass().remove(3);
        }

        if (videoBtn.getStyleClass().toString().contains("btns_active") && videoIcon.getStyleClass().toString().contains("icons_active")) {

        } else {
            videoBtn.getStyleClass().add("btns_active");
            videoIcon.getStyleClass().add("icons_active");
            videoCall.setVisible(true);
            FadeTransition fade = new FadeTransition();
            fade.setDuration(Duration.millis(500));
            fade.setNode(videoCall);
            fade.setFromValue(0);
            fade.setToValue(1);
            fade.play();
            messages.setVisible(false);
            settings.setVisible(false);
            about.setVisible(false);
            dashboard.setVisible(false);
        }
    }
    
    @FXML
    private void openMessages(ActionEvent event){
        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(500));
        translateTransition.setNode(activeStatus_pane);
        translateTransition.setToX(480);
        translateTransition.play();

        if (dashBtn.getStyleClass().size() == 2 && dashIcon.getStyleClass().size() == 2) {

        } else if (dashBtn.getStyleClass().size() == 3 && dashIcon.getStyleClass().size() == 3) {
            dashBtn.getStyleClass().remove(2);
            dashIcon.getStyleClass().remove(2);
        }

        if (videoBtn.getStyleClass().size() == 2 && videoIcon.getStyleClass().size() == 2) {

        } else if (videoBtn.getStyleClass().size() == 4 && videoIcon.getStyleClass().size() == 4) {
            videoBtn.getStyleClass().remove(3);
            videoIcon.getStyleClass().remove(3);
        }

        if (settingsBtn.getStyleClass().size() == 2 && settingIcon.getStyleClass().size() == 2) {

        } else if (settingsBtn.getStyleClass().size() == 4 && settingIcon.getStyleClass().size() == 4) {
            settingsBtn.getStyleClass().remove(3);
            settingIcon.getStyleClass().remove(3);
        }

        if (aboutBtn.getStyleClass().size() == 2 && aboutIcon.getStyleClass().size() == 2) {

        } else if (aboutBtn.getStyleClass().size() == 4 && aboutIcon.getStyleClass().size() == 4) {
            aboutBtn.getStyleClass().remove(3);
            aboutIcon.getStyleClass().remove(3);
        }


        if (messageBtn.getStyleClass().toString().contains("btns_active") && messageIcon.getStyleClass().toString().contains("icons_active")) {

        } else {
            messageBtn.getStyleClass().add("btns_active");
            messageIcon.getStyleClass().add("icons_active");
            messages.setVisible(true);
            FadeTransition fade = new FadeTransition();
            fade.setDuration(Duration.millis(500));
            fade.setNode(messages);
            fade.setFromValue(0);
            fade.setToValue(1);
            fade.play();
            settings.setVisible(false);
            about.setVisible(false);
            dashboard.setVisible(false);
            videoCall.setVisible(false);
        }
    }
    
    @FXML
    private void openSettings(ActionEvent event){
        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(500));
        translateTransition.setNode(activeStatus_pane);
        translateTransition.setToX(720);
        translateTransition.play();

        if (dashBtn.getStyleClass().size() == 2 && dashIcon.getStyleClass().size() == 2) {

        } else if (dashBtn.getStyleClass().size() == 3 && dashIcon.getStyleClass().size() == 3) {
            dashBtn.getStyleClass().remove(2);
            dashIcon.getStyleClass().remove(2);
        }

        if (videoBtn.getStyleClass().size() == 2 && videoIcon.getStyleClass().size() == 2) {

        } else if (videoBtn.getStyleClass().size() == 4 && videoIcon.getStyleClass().size() == 4) {
            videoBtn.getStyleClass().remove(3);
            videoIcon.getStyleClass().remove(3);
        }

        if (messageBtn.getStyleClass().size() == 2 && messageIcon.getStyleClass().size() == 2) {

        } else if (messageBtn.getStyleClass().size() == 4 && messageIcon.getStyleClass().size() == 4) {
            messageBtn.getStyleClass().remove(3);
            messageIcon.getStyleClass().remove(3);
        }

        if (aboutBtn.getStyleClass().size() == 2 && aboutIcon.getStyleClass().size() == 2) {

        } else if (aboutBtn.getStyleClass().size() == 4 && aboutIcon.getStyleClass().size() == 4) {
            aboutBtn.getStyleClass().remove(3);
            aboutIcon.getStyleClass().remove(3);
        }

        if (settingsBtn.getStyleClass().toString().contains("btns_active") && settingIcon.getStyleClass().toString().contains("icons_active")) {

        } else {
            settingsBtn.getStyleClass().add("btns_active");
            settingIcon.getStyleClass().add("icons_active");
            settings.setVisible(true);
            FadeTransition fade = new FadeTransition();
            fade.setDuration(Duration.millis(500));
            fade.setNode(settings);
            fade.setFromValue(0);
            fade.setToValue(1);
            fade.play();
            about.setVisible(false);
            dashboard.setVisible(false);
            videoCall.setVisible(false);
            messages.setVisible(false);
        }
    }
    
    @FXML
    private void openAbout(ActionEvent event){
        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(500));
        translateTransition.setNode(activeStatus_pane);
        translateTransition.setToX(960);
        translateTransition.play();

        if (dashBtn.getStyleClass().size() == 2 && dashIcon.getStyleClass().size() == 2) {

        } else if (dashBtn.getStyleClass().size() == 3 && dashIcon.getStyleClass().size() == 3) {
            dashBtn.getStyleClass().remove(2);
            dashIcon.getStyleClass().remove(2);
        }

        if (videoBtn.getStyleClass().size() == 2 && videoIcon.getStyleClass().size() == 2) {

        } else if (videoBtn.getStyleClass().size() == 4 && videoIcon.getStyleClass().size() == 4) {
            videoBtn.getStyleClass().remove(3);
            videoIcon.getStyleClass().remove(3);
        }

        if (messageBtn.getStyleClass().size() == 2 && messageIcon.getStyleClass().size() == 2) {

        } else if (messageBtn.getStyleClass().size() == 4 && messageIcon.getStyleClass().size() == 4) {
            messageBtn.getStyleClass().remove(3);
            messageIcon.getStyleClass().remove(3);
        }

        if (settingsBtn.getStyleClass().size() == 2 && settingIcon.getStyleClass().size() == 2) {

        } else if (settingsBtn.getStyleClass().size() == 4 && settingIcon.getStyleClass().size() == 4) {
            settingsBtn.getStyleClass().remove(3);
            settingIcon.getStyleClass().remove(3);
        }

        if (aboutBtn.getStyleClass().toString().contains("btns_active") && aboutIcon.getStyleClass().toString().contains("icons_active")) {

        } else {
            aboutBtn.getStyleClass().add("btns_active");
            aboutIcon.getStyleClass().add("icons_active");
            about.setVisible(true);
            FadeTransition fade = new FadeTransition();
            fade.setDuration(Duration.millis(500));
            fade.setNode(about);
            fade.setFromValue(0);
            fade.setToValue(1);
            fade.play();
            dashboard.setVisible(false);
            videoCall.setVisible(false);
            messages.setVisible(false);
            settings.setVisible(false);
        }
    }
    
    @FXML
    private void exitApp(MouseEvent event){
        System.exit(0);
    }
    
    @FXML
    private void minimize(MouseEvent event){
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
