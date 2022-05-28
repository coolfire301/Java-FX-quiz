package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.fxml.Initializable;
import javafx.application.Application;


import java.awt.*;

public class ControllenMain {

    @FXML
    private Label Naam_label;

    @FXML
    private TextField Naam_invullen;

    @FXML
    private Label error_id;

    @FXML
    private ToggleGroup Aantal_vragen;

    @FXML
    private ToggleGroup Aantal_sec;

    @FXML
    private ToggleGroup soort_vraag;

    @FXML
    private ToggleGroup soort_antwoord;

    String vragen_aantal = this.vragen_aantal;

    @FXML
    public void OptieSchermKlik(ActionEvent event) throws Exception {
        Parent scherm1 = FXMLLoader.load(getClass().getResource("OptieScherm.fxml"));
        Scene NewScene = new Scene(scherm1);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(NewScene);
        window.show();
    }

    @FXML
    public void BeginSchermKlik(ActionEvent event) throws Exception {
        Parent scherm1 = FXMLLoader.load(getClass().getResource("Beginscherm.fxml"));
        Scene NewScene = new Scene(scherm1);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(NewScene);
        window.show();
    }

    @FXML
    public void ToetsschermKlik(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Toetsscherm.fxml"));
        Parent root = (Parent) loader.load();
        CodeForToetsscherm toetsController=loader.getController();
        Stage stage= new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        toetsController.welkom(stage);

        //Zorgt ervoor dat het scherm sluit
        Parent scherm2 = FXMLLoader.load(getClass().getResource("Beginscherm.fxml"));
        Scene NewScene2 = new Scene(scherm2);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(NewScene2);
        window.close();}

    @FXML
    public void SpeelSchermKlik(ActionEvent event) throws Exception {
        String sec_aantal = "Niet van toepassing";
        RadioButton aantal_vraagjes = (RadioButton) Aantal_vragen.getSelectedToggle();
        vragen_aantal = aantal_vraagjes.getText();
        if (Aantal_sec.getSelectedToggle() != null){
            RadioButton aantal_seconden = (RadioButton) Aantal_sec.getSelectedToggle();
            sec_aantal = aantal_seconden.getText();}
        else{ ; }


        RadioButton type_vraag = (RadioButton) soort_vraag.getSelectedToggle();
        try{
        String type_vragen = type_vraag.getText();

        RadioButton type_antwoord = (RadioButton) soort_antwoord.getSelectedToggle();
        String type_antwoorden = type_antwoord.getText();
        //String type_antwoorden = "Test";
        System.out.println(type_antwoorden);


        String naam = Naam_invullen.getText();
        if (naam.equals("")){
            error_id.setText("VUL EEN NAAM IN!");}
        else{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SpeelScherm.fxml"));
            Parent root = (Parent) loader.load();
            CodeForSpeelScherm speelschermController=loader.getController();
            speelschermController.welkom(Naam_invullen.getText().toUpperCase());
            speelschermController.waardes_meenemen(vragen_aantal, sec_aantal, type_vragen, type_antwoorden);

            Stage stage= new Stage();
            stage.setScene(new Scene(root));
            stage.show();

            //Zorgt ervoor dat het scherm sluit
            Parent scherm2 = FXMLLoader.load(getClass().getResource("Beginscherm.fxml"));
            Scene NewScene2 = new Scene(scherm2);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(NewScene2);
            window.close();}}
        catch (Exception e){
            error_id.setText("Kies minimaal 1 type vraag en antwoord!");
        }
    }


    @FXML
    public void AfsluitenKlik(ActionEvent event) throws Exception {
        Parent scherm1 = FXMLLoader.load(getClass().getResource("Beginscherm.fxml"));
        Scene NewScene = new Scene(scherm1);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(NewScene);
        window.close();

    }
    @FXML
    public void NaamKnop(ActionEvent event) throws Exception {
        String waarde = Naam_invullen.getText();
        System.out.println(waarde);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SpeelScherm.fxml"));
        Parent root = (Parent) loader.load();

        CodeForSpeelScherm speelschermController=loader.getController();
        speelschermController.myFuntion(Naam_invullen.getText().toUpperCase());
        Stage stage= new Stage();
        stage.setScene(new Scene(root));
        stage.show();

    }
    public void welkom(String naam){
        System.out.println(naam);
    }
}

