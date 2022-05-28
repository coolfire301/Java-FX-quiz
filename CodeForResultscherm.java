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

public class CodeForResultscherm extends ControllenMain {

    @FXML
    private Label Naam_label;

    @FXML
    private Label totaal;

    @FXML
    private Label goed;

    public void welkom(String naam, String totaal_goed, String totaal_vragen){
        Naam_label.setText(naam);
        totaal.setText(totaal_vragen);
        goed.setText(totaal_goed);
    }
}


