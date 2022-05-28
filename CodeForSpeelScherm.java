package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.lang.reflect.Array;
import java.lang.Object;
import java.lang.*;

import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;





//import org.apache.commons.lang3.ArrayUtils;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.event.EventHandler;



public class CodeForSpeelScherm extends ControllenMain {

    private String naam;
    private String hoeveelheid_vragen;
    private String[] antwoordenlijst;
    Random random_getal = new Random();
    private String tijd;
    private String[] aminozuur_lijst;
    private String[] vragenlijst;
    private String goed_beantwoord;
    private String correct;
    private String yoyoyo = "Niet_check";
    private String antwoord_meenemen;

    private String[] antwoord_1_letter = {"G", "A", "V", "L", "I", "M", "P", "F", "Y", "W", "S",
            "T", "C", "N", "Q", "K", "R", "H", "D", "E"};
    private String[] antwoord_3_letter = {"GLY", "Ala", "Val", "Leu", "Ile", "Met", "Pro", "Phe",
            "Tyr", "Trp", "Ser", "Thr", "Cys", "Asn", "Gln", "Lys", "Arg", "His", "Asp", "Glu"};
    private String[] antwoord_volledig = {"Glycine", "Alanine", "Valine", "Leucine", "Isoleucine", "Methionine",
            "Proline", "Phenylalanine", "Tyrosine", "Tryptophan", "Serine", "Threonine", "Cysteine", "Asparagine ",
            "Glutamine", "Lysine", "Arginine", "Histidine", "Aspartic acid", "Glutamic acid"};
    private String[] antwoord_hydro = {"Moderate", "Hydrofoob", "Hydrofoob", "Hydrofoob", "Hydrofoob", "Hydrofoob", "Hydrofoob", "Hydrofoob", "Hydrofoob",
    "Hydrofoob", "Moderate", "Moderate", "Moderate", "Hydrofiel", "Hydrofiel", "Hydrofiel", "Hydrofiel", "Hydrofiel", "Hydrofiel", "Hydrofiel"};
    private String[] antwoord_lading = {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "+",  "+", "+", "-", "-"};
    private String[] antwoord_grote = {"Klein", "Klein", "Klein", "Middel", "Middel", "Groot", "Klein", "Groot", "Groot", "Groot", "Klein", "Klein", "Middel",
    "Middel", "Groot", "Groot", "Groot", "Groot", "Middel", "Groot"};
    private String[] antwoord_3D = {"T", "H", "S", "H", "S", "H", "T", "S", "S", "S", "T", "S", "S", "T", "Geen", "H", "Geen", "Geen", "H", "H"};
    private String[] antwoord_zijketen = {"G.JPG", "A.JPG", "V.JPG", "L.JPG", "I.JPG", "M.JPG", "P.JPG", "F.JPG", "Y.JPG", "W.JPG", "S.JPG",
            "T.JPG", "C.JPG", "N.JPG", "Q.JPG", "K.JPG", "R.JPG", "H.JPG", "D.JPG", "E.JPG"};

    private String[] aminozuur_lijst_alles = {"G", "A", "V", "L", "I", "M", "P", "F", "Y", "W", "S",
            "T", "C", "N", "Q", "K", "R", "H", "D", "E", "GLY", "Ala", "Val", "Leu", "Ile", "Met", "Pro", "Phe",
            "Tyr", "Trp", "Ser", "Thr", "Cys", "Asn", "Gln", "Lys", "Arg", "His", "Asp", "Glu", "Glycine", "Alanine", "Valine", "Leucine", "Isoleucine", "Methionine",
            "Proline", "Phenylalanine", "Tyrosine", "Tryptophan", "Serine", "Threonine", "Cysteine", "Asparagine ",
            "Glutamine", "Lysine", "Arginine", "Histidine", "Aspartic acid", "Glutamic acid"};

    private String[] antwoord_hydro_alles = {"Moderate", "Hydrofoob", "Hydrofoob", "Hydrofoob", "Hydrofoob", "Hydrofoob", "Hydrofoob", "Hydrofoob", "Hydrofoob",
            "Hydrofoob", "Moderate", "Moderate", "Moderate", "Hydrofiel", "Hydrofiel", "Hydrofiel", "Hydrofiel", "Hydrofiel", "Hydrofiel", "Hydrofiel","Moderate", "Hydrofoob", "Hydrofoob", "Hydrofoob", "Hydrofoob", "Hydrofoob", "Hydrofoob", "Hydrofoob", "Hydrofoob",
            "Hydrofoob", "Moderate", "Moderate", "Moderate", "Hydrofiel", "Hydrofiel", "Hydrofiel", "Hydrofiel", "Hydrofiel", "Hydrofiel", "Hydrofiel","Moderate", "Hydrofoob", "Hydrofoob", "Hydrofoob", "Hydrofoob", "Hydrofoob", "Hydrofoob", "Hydrofoob", "Hydrofoob",
            "Hydrofoob", "Moderate", "Moderate", "Moderate", "Hydrofiel", "Hydrofiel", "Hydrofiel", "Hydrofiel", "Hydrofiel", "Hydrofiel", "Hydrofiel"};

    private String[] volledige_naam_vragen = new String[] {"Wat is de 1-lettercode van", "Wat is de 3-lettercode van", "Wat is de hydrofobiciteit van", "Wat is de lading van",
            "Wat is de grootte van", "Wat is de 3D voorkeur van", "Wat is de zijketen van"};
    private String[] een_letter_code_vragen = new String[] {"Wat is de volledige naam van", "Wat is de 3-lettercode van", "Wat is de hydrofobiciteit van", "Wat is de lading van",
            "Wat is de grootte van", "Wat is de 3D voorkeur van", "Wat is de zijketen van"};
    private String[] drie_lettercode_vragen = new String[] {"Wat is de 1-lettercode van", "Wat is de volledige naam van", "Wat is de hydrofobiciteit van", "Wat is de lading van",
            "Wat is de grootte van", "Wat is de 3D voorkeur van", "Wat is de zijketen van"};

    private String[] hydro_vragen = new String[]{"Welk aminozuur is", "Welk aminozuur is niet", "Wat is de hydrofobiciteit van aminozuur", "Wat is de hydrofobiciteit van aminozuur"
    ,"Wat is de hydrofobiciteit van aminozuur", "Wat is de hydrofobiciteit van aminozuur", "Wat is de hydrofobiciteit van aminozuur met de volgende zijketen:"};

    private String[] lading_vragen = new String[] {"Welk aminozuur is .... geladen?", "Welk aminozuur niet is .... geladen?", "Wat is de lading van aminozuur",
    "Wat is de lading van aminozuur", "Wat is de lading van aminozuur", "Wat is de lading van aminozuur", "Wat is de lading van aminozuur met de volgende zijketen:"};

    private String[] grootte_vragen = new String[] {"Welk aminozuur is ", "Welk aminozuur is niet ", "Wat is de grootte van aminozuur",
            "Wat is de grootte van aminozuur", "Wat is de grootte van aminozuur", "Wat is de grootte van aminozuur", "Wat is de grootte van aminozuur met de volgende zijketen:"};

    private String[] drieD_vragen = new String[] {"Welk aminozuur heeft een voorkeur voor", "Welk aminozuur heeft geen voorkeur voor een",
    "Welk aminozuur heeft geen voorkeur voor een", "Wat is de 3D voorkeur van aminozuur", "Wat is de 3D voorkeur van aminozuur",
    "Wat is de 3D voorkeur van aminozuur", "Wat is de 3D voorkeur van aminozuur met de volgende zijketen:"};

    private String[] zijketen_vragen = new String[] {"Wat is de volledigenaam van het volgende aminozuur met zijketen:", "Wat is de 1-lettercode van het volgende aminozuur met zijketen:"
    , "Wat is de hydrofobiciteit het volgende aminozuur met zijketen:", "Wat is de lading van het volgende aminozuur met zijketen:", "Wat is de grootte van het volgende aminozuur met zijketen:",
    "Wat is de 3D voorkeur van het volgende aminozuur met zijketen:", "Wat is de 3-lettercode van het volgende aminozuur met zijketen:"};

    private String[] test = new String[]{"Wat is de zijketen van", "Wat is de zijketen van", "Wat is de zijketen van", "Wat is de zijketen van", "Wat is de zijketen van",
    "Wat is de zijketen van", "Wat is de zijketen van", "Wat is de zijketen van"};



    @FXML
    private Label Naam_ophalen;

    @FXML
    private Button Start_knopje ;

    @FXML
    private Button Volgende_knopje ;

    @FXML
    private Button Stop_knopje ;

    @FXML
    private Button Resultaat_knopje;

    @FXML
    private Label vraag_tellen;

    @FXML
    private Label vraag_tellen1;

    @FXML
    private Label aantal_vragen;

    @FXML
    private ToggleGroup radio_antwoorden;

    @FXML
    private Label tijdsdruk_label;

    @FXML
    private Label Vragen_stel_label;

    @FXML
    private Label slash;

    @FXML
    private Label Welkoms_bericht;

    @FXML
    private Label Welkoms_bericht1;

    @FXML
    private Label Welkoms_bericht2;

    @FXML
    private Label Antwoord_A_label;

    @FXML
    private Label Antwoord_B_label;

    @FXML
    private Label Antwoord_C_label;

    @FXML
    private Label Antwoord_D_label;

    @FXML
    private RadioButton Antwoord_A;

    @FXML
    private RadioButton Antwoord_B;

    @FXML
    private RadioButton Antwoord_C;

    @FXML
    private RadioButton Antwoord_D;

    @FXML
    private ImageView z_A_afbeelding;

    @FXML
    private ImageView z_B_afbeelding;

    @FXML
    private ImageView z_C_afbeelding;

    @FXML
    private ImageView Vraag_afbeelding;




    private static final Integer STARTTIME = 15;
    private Timeline timeline;
    private Label timerLabel = new Label();
    private Integer timeSeconds = STARTTIME;

    public void myFuntion(String waarde){
        Naam_ophalen.setText(waarde);
    }

    public void tijd (String tijd_sec){
        tijdsdruk_label.setText(tijd_sec);
    }

    public void waardes_meenemen(String vragen_hoeveelheid, String sec, String soort_vraag, String soort_antwoord){
        this.goed_beantwoord = "0";
        Antwoord_A.setVisible(false);
        Antwoord_A_label.setText("");
        Antwoord_B.setVisible(false);
        Antwoord_B_label.setText("");
        Antwoord_C.setVisible(false);
        Antwoord_C_label.setText("");
        Antwoord_D.setVisible(false);
        Antwoord_D_label.setText("");
        this.hoeveelheid_vragen = vragen_hoeveelheid;
        this.tijd = sec;
        if (soort_vraag.equals("Volledige naam")){
            this.aminozuur_lijst = new String[]{"Glycine", "Alanine", "Valine", "Leucine", "Isoleucine", "Methionine",
            "Proline", "Phenylalanine", "Tyrosine", "Tryptophan", "Serine", "Threonine", "Cysteine", "Asparagine ",
            "Glutamine", "Lysine", "Arginine", "Histidine", "Aspartic acid", "Glutamic acid"}; }
        else if (soort_vraag.equals("1-lettercode")){
            this.aminozuur_lijst = new String[]{"G", "A", "V", "L", "I", "M", "P", "F", "Y", "W", "S",
            "T", "C", "N", "Q", "K", "R", "H", "D", "E"};}
        else if (soort_vraag.equals("3-lettercode")){
            this.aminozuur_lijst = new String[] {"Gly", "Ala", "Val", "Leu", "Ile", "Met", "Pro", "Phe",
            "Tyr", "Trp", "Ser", "Thr", "Cys", "Asn", "Gln", "Lys", "Arg", "His", "Asp", "Glu"};}

        else if (soort_vraag.equals("Hydrofibiciteit")){
            this.aminozuur_lijst = new String[] {"Moderate", "Hydrofoob","Hydrofoob", "Hydrofoob", "Hydrofoob", "Hydrofoob","Hydrofoob","Hydrofoob","Hydrofoob","Hydrofoob","Hydrofoob",
                    "Moderate", "Moderate", "Moderate", "Hydrofiel", "Hydrofiel", "Hydrofiel", "Hydrofiel", "Hydrofiel", "Hydrofiel", "Hydrofiel"};;}
        else if (soort_vraag.equals("Lading")){
            this.aminozuur_lijst = new String[] {"Glycine", "Alanine", "Valine", "Leucine", "Isoleucine", "Methionine",
                    "Proline", "Phenylalanine", "Tyrosine", "Tryptophan", "Serine", "Threonine", "Cysteine", "Asparagine ",
                    "Glutamine", "Lysine", "Arginine", "Histidine", "Aspartic acid", "Glutamic acid"}; }
        else if (soort_vraag.equals("Grootte")) {
            this.aminozuur_lijst = new String[]{"Klein", "Klein", "Klein", "Middel", "Middel", "Groot", "Klein", "Groot", "Groot", "Groot", "Klein", "Klein", "Middel",
                    "Middel", "Groot", "Groot", "Groot", "Groot", "Middel", "Groot"};
        }
        else if (soort_vraag.equals("3D-voorkeur")){
            this.aminozuur_lijst = new String[] {"T", "H", "S", "H", "S", "H", "T", "S",
                    "S", "S", "T", "S", "S", "T", "Geen", "H", "Geen", "Geen", "H", "H"};}
        else if (soort_vraag.equals("Structuur")){
            this.aminozuur_lijst = new String[] {"Glycine", "Alanine", "Valine", "Leucine", "Isoleucine", "Methionine",
                    "Proline", "Phenylalanine", "Tyrosine", "Tryptophan", "Serine", "Threonine", "Cysteine", "Asparagine ",
                    "Glutamine", "Lysine", "Arginine", "Histidine", "Aspartic acid", "Glutamic acid"};
        }


        if (soort_antwoord.equals("1-lettercode")){
            this.vragenlijst = this.een_letter_code_vragen; }

        if (soort_antwoord.equals("3-lettercode")){
            this.vragenlijst = this.drie_lettercode_vragen;}

        if (soort_antwoord.equals("Volledige naam")){
            //this.vragenlijst = this.volledige_naam_vragen;
            this.vragenlijst = this.volledige_naam_vragen;}

        if (soort_antwoord.equals("Hydrofibiciteit")){
            this.vragenlijst = this.hydro_vragen;}

        if (soort_antwoord.equals("Lading")){
        this.vragenlijst = this.lading_vragen;}

        if (soort_antwoord.equals("Grootte")){
            this.vragenlijst = this.grootte_vragen;}

        if (soort_antwoord.equals("3D-voorkeur")){
            this.vragenlijst = this.drieD_vragen;}

        if (soort_antwoord.equals("Structuur")){
            this.vragenlijst = this.zijketen_vragen; }
        }

    public void welkom(String naam){
        this.naam = naam;
        Welkoms_bericht.setText("Hallo " + naam + ",");
        Welkoms_bericht1.setText("Wanneer je op start klikt gaat");
        Welkoms_bericht2.setText("de kennisquiz over aminozuren beginnen");
        Volgende_knopje.setDisable(true);
    }

    public void start_knop(ActionEvent event) throws Exception {
        Antwoord_A.setVisible(true);
        Antwoord_B.setVisible(true);
        Antwoord_C.setVisible(true);
        vraag_tellen.setText("0");
        vraag_tellen1.setText(this.hoeveelheid_vragen);
        slash.setText("/");
        aantal_vragen.setText(this.vragen_aantal);
        Welkoms_bericht1.setText("De kennisquiz is begonnen!");
        Welkoms_bericht2.setText("Succes");
        Start_knopje.setDisable(true);
        Volgende_knopje.setDisable(false);
        aantal_vragen.setText(this.hoeveelheid_vragen);
        tijdsdruk_label.setText(this.tijd);
        String[] maat_lijst = {"Klein", "Middel", "Groot"};
            Vraag_afbeelding.setImage(new Image((getClass().getResourceAsStream("LEEG.JPG"))));
            z_A_afbeelding.setImage(new Image((getClass().getResourceAsStream("LEEG.JPG"))));
            z_B_afbeelding.setImage(new Image((getClass().getResourceAsStream("LEEG.JPG"))));
            z_C_afbeelding.setImage(new Image((getClass().getResourceAsStream("LEEG.JPG"))));
            Antwoord_D.setVisible(false);
            Antwoord_D_label.setText("");
            String vraag_nr = vraag_tellen.getText();
            Integer nr = Integer.valueOf(vraag_nr) + 1;
            String nieuw_nr = String.valueOf(nr);
            vraag_tellen.setText(nieuw_nr);
            String a = this.hoeveelheid_vragen;
            Integer result = Integer.valueOf(a.trim());
            if (result == nr){
                Start_knopje.setVisible(false);
                Volgende_knopje.setDisable(true);
                Resultaat_knopje.setVisible(true);
            }
            RadioButton A_antwoord = (RadioButton) Antwoord_A;
            RadioButton B_antwoord = (RadioButton)  Antwoord_B;
            RadioButton C_antwoord = (RadioButton) Antwoord_C;
            RadioButton D_antwoord = (RadioButton)  Antwoord_D;

            Antwoord_A_label.setText("");
            Antwoord_B_label.setText("");
            Antwoord_C_label.setText("");



            int a_getal = this.random_getal.nextInt(19);
            int v_getal = this.random_getal.nextInt(7);
            //String complete_vraag = String.valueOf(this.vragenlijst[v_getal]) + " " + String.valueOf(this.aminozuur_lijst[a_getal]);
            String complete_vraag = String.valueOf(this.vragenlijst[v_getal]) + " " + String.valueOf(this.aminozuur_lijst[a_getal]);
            int random1 = this.random_getal.nextInt(19);
            int random2 = this.random_getal.nextInt(19);

            if (this.vragenlijst[v_getal].equals("Wat is de 1-lettercode van")) {
                antwoordenlijst = new String[]{this.antwoord_1_letter[a_getal], this.antwoord_1_letter[random1], this.antwoord_1_letter[random2]};
                this.correct = this.antwoord_1_letter[a_getal];
                ArrayList<String> mylist = new ArrayList<String>();
                mylist.add(antwoordenlijst[0]);
                mylist.add(antwoordenlijst[1]);
                mylist.add(antwoordenlijst[2]);
                Collections.shuffle(mylist);
                String[] objArray = mylist.toArray(new String[mylist.size()]);
                A_antwoord.setText(objArray[0]);
                B_antwoord.setText(objArray[1]);
                C_antwoord.setText(objArray[2]);
            }
            if (this.vragenlijst[v_getal].equals("Wat is de 3-lettercode van")) {
                antwoordenlijst = new String[]{this.antwoord_3_letter[a_getal], this.antwoord_3_letter[random1], this.antwoord_3_letter[random2]};
                this.correct = this.antwoord_3_letter[a_getal];
                ArrayList<String> mylist = new ArrayList<String>();
                mylist.add(antwoordenlijst[0]);
                mylist.add(antwoordenlijst[1]);
                mylist.add(antwoordenlijst[2]);
                Collections.shuffle(mylist);
                String[] objArray = mylist.toArray(new String[mylist.size()]);
                A_antwoord.setText(objArray[0]);
                B_antwoord.setText(objArray[1]);
                C_antwoord.setText(objArray[2]);
            }
            if (this.vragenlijst[v_getal].equals("Wat is de volledige naam van")) {
                this.correct = this.antwoord_volledig[a_getal];
                antwoordenlijst = new String[]{this.antwoord_volledig[a_getal], this.antwoord_volledig[random1], this.antwoord_volledig[random2]};
                ArrayList<String> mylist = new ArrayList<String>();
                mylist.add(antwoordenlijst[0]);
                mylist.add(antwoordenlijst[1]);
                mylist.add(antwoordenlijst[2]);
                Collections.shuffle(mylist);
                String[] objArray = mylist.toArray(new String[mylist.size()]);
                A_antwoord.setText(objArray[0]);
                B_antwoord.setText(objArray[1]);
                C_antwoord.setText(objArray[2]);
            }
            if (this.vragenlijst[v_getal].equals("Wat is de hydrofobiciteit van")) {
                correct = this.antwoord_hydro[a_getal];
                A_antwoord.setText("Hydrofiel");
                B_antwoord.setText("Moderate");
                C_antwoord.setText("Hydrofoob");
            }
            if (this.vragenlijst[v_getal].equals("Wat is de lading van")) {
                correct = this.antwoord_lading[a_getal];
                antwoordenlijst = new String[]{this.antwoord_lading[a_getal], this.antwoord_lading[random1], this.antwoord_lading[random2]};
                A_antwoord.setText("-");
                B_antwoord.setText("0");
                C_antwoord.setText("+");
            }
            if (this.vragenlijst[v_getal].equals("Wat is de grootte van")) {
                correct = this.antwoord_grote[a_getal];
                antwoordenlijst = new String[]{this.antwoord_grote[a_getal], this.antwoord_grote[random1], this.antwoord_grote[random2]};
                A_antwoord.setText("Klein");
                B_antwoord.setText("Middel");
                C_antwoord.setText("Groot");
            }
            if (this.vragenlijst[v_getal].equals("Wat is de 3D voorkeur van")) {
                correct = this.antwoord_3D[a_getal];
                antwoordenlijst = new String[]{this.antwoord_3D[a_getal], this.antwoord_3D[random1], this.antwoord_3D[random2]};
                Antwoord_D.setVisible(true);
                A_antwoord.setText("T");
                B_antwoord.setText("H");
                C_antwoord.setText("S");
                D_antwoord.setText("Geen");
            }
            if (this.vragenlijst[v_getal].equals("Wat is de zijketen van")) {
                this.yoyoyo = "Check";
                //antwoordenlijst = new String[]{this.antwoord_volledig[a_getal], this.antwoord_volledig[random1], this.antwoord_volledig[random2]};
                z_A_afbeelding.setImage(new Image((getClass().getResourceAsStream(this.antwoord_zijketen[a_getal]))));
                z_B_afbeelding.setImage(new Image((getClass().getResourceAsStream(this.antwoord_zijketen[random1]))));
                z_C_afbeelding.setImage(new Image((getClass().getResourceAsStream(this.antwoord_zijketen[random2]))));
                A_antwoord.setText("A");
                B_antwoord.setText("B");
                C_antwoord.setText("C");}


            if (this.vragenlijst[v_getal].equals("Welk aminozuur is")){
                correct = this.antwoord_hydro[a_getal];
                complete_vraag = this.vragenlijst[v_getal] + " " + antwoord_hydro[a_getal];
                A_antwoord.setText("Hydrofiel");
                B_antwoord.setText("Neutraal");
                C_antwoord.setText("Hydrofoob"); }
            if (this.vragenlijst[v_getal].equals("Welk aminozuur is niet")) {
                complete_vraag = this.vragenlijst[v_getal] + " " + antwoord_hydro[a_getal];
                correct = this.antwoord_hydro[a_getal];
                A_antwoord.setText("Hydrofiel");
                B_antwoord.setText("Neutraal");
                C_antwoord.setText("Hydrofoob");}
            if (this.vragenlijst[v_getal].equals("Wat is de hydrofobiciteit van aminozuur")) {
                int hydro_random = this.random_getal.nextInt(60);
                correct = this.antwoord_hydro_alles[hydro_random];
                complete_vraag = this.vragenlijst[v_getal] + " " + this.aminozuur_lijst_alles[hydro_random];
                A_antwoord.setText("Hydrofiel");
                B_antwoord.setText("Neutraal");
                C_antwoord.setText("Hydrofoob");
            }
            if (this.vragenlijst[v_getal].equals("Wat is de hydrofobiciteit van aminozuur met de volgende zijketen:")) {
                complete_vraag = this.vragenlijst[v_getal];
                correct = this.antwoord_volledig[a_getal];
                Vraag_afbeelding.setImage(new Image((getClass().getResourceAsStream(this.antwoord_zijketen[a_getal]))));
                antwoordenlijst = new String[]{this.antwoord_volledig[a_getal], this.antwoord_volledig[random1], this.antwoord_volledig[random2]};
                ArrayList<String> mylist = new ArrayList<String>();
                mylist.add(antwoordenlijst[0]);
                mylist.add(antwoordenlijst[1]);
                mylist.add(antwoordenlijst[2]);
                Collections.shuffle(mylist);
                String[] objArray = mylist.toArray(new String[mylist.size()]);
                A_antwoord.setText(objArray[0]);
                B_antwoord.setText(objArray[1]);
                C_antwoord.setText(objArray[2]);}
            if (this.vragenlijst[v_getal].equals("Welk aminozuur is .... geladen?")){
                correct = this.antwoord_volledig[a_getal];
                complete_vraag = this.vragenlijst[v_getal];
                Antwoord_A_label.setText("Positief");
                Antwoord_B_label.setText("Negatief");
                Antwoord_C_label.setText("Neutraal"); }
            if (this.vragenlijst[v_getal].equals("Welk aminozuur is niet .... geladen?")){
                correct = this.antwoord_lading[v_getal];
                complete_vraag = this.vragenlijst[v_getal];
                Antwoord_A_label.setText("Positief");
                Antwoord_B_label.setText("Negatief");
                Antwoord_C_label.setText("Neutraal"); }
            if (this.vragenlijst[v_getal].equals("Wat is de lading van aminozuur")){
                correct = antwoord_lading[v_getal];
                complete_vraag = this.vragenlijst[v_getal] + " " + this.aminozuur_lijst[a_getal];
                antwoordenlijst = new String[]{this.antwoord_lading[a_getal], this.antwoord_lading[random1], antwoord_lading[random2]};
                ArrayList<String> mylist = new ArrayList<String>();
                mylist.add(antwoordenlijst[0]);
                mylist.add(antwoordenlijst[1]);
                mylist.add(antwoordenlijst[2]);
                Collections.shuffle(mylist);
                String[] objArray = mylist.toArray(new String[mylist.size()]);
                Antwoord_A_label.setText(objArray[0]);
                Antwoord_B_label.setText(objArray[1]);
                Antwoord_C_label.setText(objArray[2]);}
            if (this.vragenlijst[v_getal].equals("Wat is de lading van aminozuur met de volgende zijketen:")){
                correct = antwoord_lading[v_getal];
                A_antwoord.setText("Positief");
                B_antwoord.setText("Neutraal");
                C_antwoord.setText("Negatief"); }

            if (this.vragenlijst[v_getal].equals("Welk aminozuur is ")){
                correct = this.antwoord_grote[v_getal];
                int maat_getal = this.random_getal.nextInt(2);
                String maat = this.aminozuur_lijst[a_getal];
                complete_vraag = "Welke aminozuur is" + " " + maat;
                antwoordenlijst = new String[]{this.antwoord_volledig[a_getal], this.antwoord_volledig[random1], antwoord_volledig[random2]};
                ArrayList<String> mylist = new ArrayList<String>();
                mylist.add(antwoordenlijst[0]);
                mylist.add(antwoordenlijst[1]);
                mylist.add(antwoordenlijst[2]);
                Collections.shuffle(mylist);
                String[] objArray = mylist.toArray(new String[mylist.size()]);
                A_antwoord.setText(objArray[0]);
                B_antwoord.setText(objArray[1]);
                C_antwoord.setText(objArray[2]);}

            if (this.vragenlijst[v_getal].equals("Welk aminozuur is niet ")){
                correct = this.antwoord_grote[a_getal];
                int maat_getal = this.random_getal.nextInt(2);
                String maat = this.aminozuur_lijst[a_getal];
                complete_vraag = "Welke aminozuur is" + " " + maat;
                antwoordenlijst = new String[]{this.antwoord_volledig[a_getal], this.antwoord_volledig[random1], antwoord_volledig[random2]};
                ArrayList<String> mylist = new ArrayList<String>();
                mylist.add(antwoordenlijst[0]);
                mylist.add(antwoordenlijst[1]);
                mylist.add(antwoordenlijst[2]);
                Collections.shuffle(mylist);
                String[] objArray = mylist.toArray(new String[mylist.size()]);
                A_antwoord.setText(objArray[0]);
                B_antwoord.setText(objArray[1]);
                C_antwoord.setText(objArray[2]);}

            if (this.vragenlijst[v_getal].equals("Wat is de grootte van aminozuur")){
                correct = this.antwoord_grote[v_getal];
                complete_vraag = this.vragenlijst[v_getal] + " " + this.aminozuur_lijst[a_getal];
                antwoordenlijst = new String[]{this.antwoord_grote[a_getal], this.antwoord_grote[random1], antwoord_grote[random2]};
                ArrayList<String> mylist = new ArrayList<String>();
                mylist.add(antwoordenlijst[0]);
                mylist.add(antwoordenlijst[1]);
                mylist.add(antwoordenlijst[2]);
                Collections.shuffle(mylist);
                String[] objArray = mylist.toArray(new String[mylist.size()]);
                A_antwoord.setText(objArray[0]);
                B_antwoord.setText(objArray[1]);
                C_antwoord.setText(objArray[2]);}

            if (this.vragenlijst[v_getal].equals("Wat is de grootte van aminozuur met de volgende zijketen:")) {
                complete_vraag = this.vragenlijst[v_getal];
                correct = this.antwoord_grote[v_getal];
                Vraag_afbeelding.setImage(new Image((getClass().getResourceAsStream(this.antwoord_zijketen[a_getal]))));
                A_antwoord.setText("Klein");
                B_antwoord.setText("Middel");
                C_antwoord.setText("Groot");}

            if (this.vragenlijst[v_getal].equals("Welk aminozuur is ")){
                int maat_getal = this.random_getal.nextInt(2);
                String maat = this.aminozuur_lijst[a_getal];
                correct = this.antwoord_volledig[a_getal];
                complete_vraag = "Welke aminozuur is" + " " + maat;
                antwoordenlijst = new String[]{this.antwoord_volledig[a_getal], this.antwoord_volledig[random1], antwoord_volledig[random2]};
                ArrayList<String> mylist = new ArrayList<String>();
                mylist.add(antwoordenlijst[0]);
                mylist.add(antwoordenlijst[1]);
                mylist.add(antwoordenlijst[2]);
                Collections.shuffle(mylist);
                String[] objArray = mylist.toArray(new String[mylist.size()]);
                A_antwoord.setText(objArray[0]);
                B_antwoord.setText(objArray[1]);
                C_antwoord.setText(objArray[2]);}

            if (this.vragenlijst[v_getal].equals("Welk aminozuur heeft een voorkeur voor")) {
                String voorkeur = this.antwoord_3D[a_getal];
                correct = this.antwoord_volledig[a_getal];
                complete_vraag = this.vragenlijst[v_getal] + " " + voorkeur;
                antwoordenlijst = new String[]{this.antwoord_volledig[a_getal], this.antwoord_volledig[random1], antwoord_volledig[random2]};
                ArrayList<String> mylist = new ArrayList<String>();
                mylist.add(antwoordenlijst[0]);
                mylist.add(antwoordenlijst[1]);
                mylist.add(antwoordenlijst[2]);
                Collections.shuffle(mylist);
                String[] objArray = mylist.toArray(new String[mylist.size()]);
                A_antwoord.setText(objArray[0]);
                B_antwoord.setText(objArray[1]);
                C_antwoord.setText(objArray[2]);}

            if (this.vragenlijst[v_getal].equals("Welk aminozuur heeft geen voorkeur voor een")) {
                correct = this.antwoord_3D[v_getal];
                String voorkeur = this.antwoord_3D[a_getal];
                complete_vraag = this.vragenlijst[v_getal] + " " + voorkeur;
                A_antwoord.setText("H");
                B_antwoord.setText("T");
                C_antwoord.setText("S");
                D_antwoord.setText("Geen");}

            if (this.vragenlijst[v_getal].equals("Wat is de 3D voorkeur van aminozuur")){
                correct = this.antwoord_3D[v_getal];
                complete_vraag = this.vragenlijst[v_getal] + " " + this.aminozuur_lijst[a_getal];
                antwoordenlijst = new String[]{this.antwoord_grote[a_getal], this.antwoord_grote[random1], antwoord_grote[random2]};
                A_antwoord.setText("H");
                B_antwoord.setText("T");
                C_antwoord.setText("S");
                D_antwoord.setText("Geen");}

            if (this.vragenlijst[v_getal].equals("Wat is de 3D voorkeur van aminozuur met de volgende zijketen:")) {
                complete_vraag = this.vragenlijst[v_getal];
                correct = this.antwoord_3D[v_getal];
                Vraag_afbeelding.setImage(new Image((getClass().getResourceAsStream(this.antwoord_zijketen[a_getal]))));
                A_antwoord.setText("H");
                B_antwoord.setText("T");
                C_antwoord.setText("S");
                D_antwoord.setText("Geen");}

            if (this.vragenlijst[v_getal].equals("Wat is de volledigenaam van het volgende aminozuur met zijketen:")) {
                complete_vraag = this.vragenlijst[v_getal];
                correct = this.antwoord_volledig[v_getal];
                Vraag_afbeelding.setImage(new Image((getClass().getResourceAsStream(this.antwoord_zijketen[a_getal]))));
                antwoordenlijst = new String[]{this.antwoord_volledig[a_getal], this.antwoord_volledig[random1], antwoord_volledig[random2]};
                ArrayList<String> mylist = new ArrayList<String>();
                mylist.add(antwoordenlijst[0]);
                mylist.add(antwoordenlijst[1]);
                mylist.add(antwoordenlijst[2]);
                Collections.shuffle(mylist);
                String[] objArray = mylist.toArray(new String[mylist.size()]);
                A_antwoord.setText(objArray[0]);
                B_antwoord.setText(objArray[1]);
                C_antwoord.setText(objArray[2]);}

            if (this.vragenlijst[v_getal].equals("Wat is de 1-lettercode van het volgende aminozuur met zijketen:")) {
                complete_vraag = this.vragenlijst[v_getal];
                correct = this.antwoord_1_letter[v_getal];
                Vraag_afbeelding.setImage(new Image((getClass().getResourceAsStream(this.antwoord_zijketen[a_getal]))));
                antwoordenlijst = new String[]{this.antwoord_1_letter[a_getal], this.antwoord_1_letter[random1], antwoord_1_letter[random2]};
                ArrayList<String> mylist = new ArrayList<String>();
                mylist.add(antwoordenlijst[0]);
                mylist.add(antwoordenlijst[1]);
                mylist.add(antwoordenlijst[2]);
                Collections.shuffle(mylist);
                String[] objArray = mylist.toArray(new String[mylist.size()]);
                A_antwoord.setText(objArray[0]);
                B_antwoord.setText(objArray[1]);
                C_antwoord.setText(objArray[2]);}

            if (this.vragenlijst[v_getal].equals("Wat is de 3-lettercode van het volgende aminozuur met zijketen:")) {
                complete_vraag = this.vragenlijst[v_getal];
                correct = this.antwoord_3_letter[v_getal];
                Vraag_afbeelding.setImage(new Image((getClass().getResourceAsStream(this.antwoord_zijketen[a_getal]))));
                antwoordenlijst = new String[]{this.antwoord_3_letter[a_getal], this.antwoord_3_letter[random1], antwoord_3_letter[random2]};
                ArrayList<String> mylist = new ArrayList<String>();
                mylist.add(antwoordenlijst[0]);
                mylist.add(antwoordenlijst[1]);
                mylist.add(antwoordenlijst[2]);
                Collections.shuffle(mylist);
                String[] objArray = mylist.toArray(new String[mylist.size()]);
                A_antwoord.setText(objArray[0]);
                B_antwoord.setText(objArray[1]);
                C_antwoord.setText(objArray[2]);}

            if (this.vragenlijst[v_getal].equals("Wat is de hydrofobiciteit het volgende aminozuur met zijketen:")) {
                complete_vraag = this.vragenlijst[v_getal];
                correct = this.antwoord_hydro[v_getal];
                Vraag_afbeelding.setImage(new Image((getClass().getResourceAsStream(this.antwoord_zijketen[a_getal]))));
                A_antwoord.setText("Moderate");
                B_antwoord.setText("Hydrofiel");
                C_antwoord.setText("Hydrofoob");}

            if (this.vragenlijst[v_getal].equals("Wat is de lading het volgende aminozuur met zijketen:")) {
                complete_vraag = this.vragenlijst[v_getal];
                correct = this.antwoord_lading[v_getal];
                Vraag_afbeelding.setImage(new Image((getClass().getResourceAsStream(this.antwoord_zijketen[a_getal]))));
                A_antwoord.setText("-");
                B_antwoord.setText("0");
                C_antwoord.setText("+");}

            if (this.vragenlijst[v_getal].equals("Wat is de grootte van het volgende aminozuur met zijketen:")) {
                complete_vraag = this.vragenlijst[v_getal];
                correct = this.antwoord_grote[v_getal];
                Vraag_afbeelding.setImage(new Image((getClass().getResourceAsStream(this.antwoord_zijketen[a_getal]))));
                A_antwoord.setText("Klein");
                B_antwoord.setText("Middel");
                C_antwoord.setText("Groot");}

            if (this.vragenlijst[v_getal].equals("Wat is de 3D voorkeur van het volgende aminozuur met zijketen:")){
                complete_vraag = this.vragenlijst[v_getal];
                correct = this.antwoord_3D[v_getal];
                Vraag_afbeelding.setImage(new Image((getClass().getResourceAsStream(this.antwoord_zijketen[a_getal]))));
                A_antwoord.setText("H");
                B_antwoord.setText("T");
                C_antwoord.setText("S");
                D_antwoord.setText("Geen");}
            Vragen_stel_label.setText(complete_vraag);
        }

    public void stop_knopje(ActionEvent event) throws Exception {
        Parent scherm1 = FXMLLoader.load(getClass().getResource("Beginscherm.fxml"));
        Scene NewScene = new Scene(scherm1);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(NewScene);
        window.show();
    }


    public void resultaten_knop(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Resultatenscherm.fxml"));
        Parent root = (Parent) loader.load();
        CodeForResultscherm resultController=loader.getController();
        if (this.antwoord_meenemen.equals(this.correct)){
            int tellen = Integer.parseInt(this.goed_beantwoord) + 1;
            this.goed_beantwoord = String.valueOf(tellen);}
        else if (this.yoyoyo.equals("Check") && this.antwoord_meenemen.equals("A")){
            int tellen = Integer.parseInt(this.goed_beantwoord) + 1;
            this.goed_beantwoord = String.valueOf(tellen);}
        resultController.welkom(this.naam, this.goed_beantwoord, this.hoeveelheid_vragen);
        Stage stage= new Stage();
        stage.setScene(new Scene(root));
        stage.show();

        //Zorgt ervoor dat het scherm sluit
        Parent scherm2 = FXMLLoader.load(getClass().getResource("Beginscherm.fxml"));
        Scene NewScene2 = new Scene(scherm2);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(NewScene2);
        window.close();}


    public void volgende_knop(ActionEvent event) throws Exception {
        String[] maat_lijst = {"Klein", "Middel", "Groot"};
        String type_antwoorden;
        RadioButton ABCD_antwoord = (RadioButton) radio_antwoorden.getSelectedToggle();
        try{
            type_antwoorden = ABCD_antwoord.getText();
            this.antwoord_meenemen = type_antwoorden;
        Vraag_afbeelding.setImage(new Image((getClass().getResourceAsStream("LEEG.JPG"))));
        z_A_afbeelding.setImage(new Image((getClass().getResourceAsStream("LEEG.JPG"))));
        z_B_afbeelding.setImage(new Image((getClass().getResourceAsStream("LEEG.JPG"))));
        z_C_afbeelding.setImage(new Image((getClass().getResourceAsStream("LEEG.JPG"))));
        Antwoord_D.setVisible(false);
        Antwoord_D_label.setText("");
        String vraag_nr = vraag_tellen.getText();
        Integer nr = Integer.valueOf(vraag_nr) + 1;
        String nieuw_nr = String.valueOf(nr);
        vraag_tellen.setText(nieuw_nr);
        String a = this.hoeveelheid_vragen;
        Integer result = Integer.valueOf(a.trim());
        if (result == nr){
            Start_knopje.setVisible(false);
            Volgende_knopje.setDisable(true);
            Resultaat_knopje.setVisible(true);
        }

        if (type_antwoorden.equals(this.correct)){
            int tellen = Integer.parseInt(this.goed_beantwoord) + 1;
            this.goed_beantwoord = String.valueOf(tellen);}
        else if (this.yoyoyo.equals("Check") && type_antwoorden.equals("A")){
            int tellen = Integer.parseInt(this.goed_beantwoord) + 1;
            this.goed_beantwoord = String.valueOf(tellen);}
        this.yoyoyo = "niet_Check";

        RadioButton A_antwoord = (RadioButton) Antwoord_A;
        RadioButton B_antwoord = (RadioButton)  Antwoord_B;
        RadioButton C_antwoord = (RadioButton) Antwoord_C;
        RadioButton D_antwoord = (RadioButton)  Antwoord_D;

        Antwoord_A_label.setText("");
        Antwoord_B_label.setText("");
        Antwoord_C_label.setText("");



        int a_getal = this.random_getal.nextInt(19);
        int v_getal = this.random_getal.nextInt(7);
        //String complete_vraag = String.valueOf(this.vragenlijst[v_getal]) + " " + String.valueOf(this.aminozuur_lijst[a_getal]);
        String complete_vraag = String.valueOf(this.vragenlijst[v_getal]) + " " + String.valueOf(this.aminozuur_lijst[a_getal]);
        int random1 = this.random_getal.nextInt(19);
        int random2 = this.random_getal.nextInt(19);

        if (this.vragenlijst[v_getal].equals("Wat is de 1-lettercode van")) {
            antwoordenlijst = new String[]{this.antwoord_1_letter[a_getal], this.antwoord_1_letter[random1], this.antwoord_1_letter[random2]};
            this.correct = this.antwoord_1_letter[a_getal];
            ArrayList<String> mylist = new ArrayList<String>();
            mylist.add(antwoordenlijst[0]);
            mylist.add(antwoordenlijst[1]);
            mylist.add(antwoordenlijst[2]);
            Collections.shuffle(mylist);
            String[] objArray = mylist.toArray(new String[mylist.size()]);
            A_antwoord.setText(objArray[0]);
            B_antwoord.setText(objArray[1]);
            C_antwoord.setText(objArray[2]);
        }
        if (this.vragenlijst[v_getal].equals("Wat is de 3-lettercode van")) {
            antwoordenlijst = new String[]{this.antwoord_3_letter[a_getal], this.antwoord_3_letter[random1], this.antwoord_3_letter[random2]};
            this.correct = this.antwoord_3_letter[a_getal];
            ArrayList<String> mylist = new ArrayList<String>();
            mylist.add(antwoordenlijst[0]);
            mylist.add(antwoordenlijst[1]);
            mylist.add(antwoordenlijst[2]);
            Collections.shuffle(mylist);
            String[] objArray = mylist.toArray(new String[mylist.size()]);
            A_antwoord.setText(objArray[0]);
            B_antwoord.setText(objArray[1]);
            C_antwoord.setText(objArray[2]);
        }
        if (this.vragenlijst[v_getal].equals("Wat is de volledige naam van")) {
            this.correct = this.antwoord_volledig[a_getal];
            antwoordenlijst = new String[]{this.antwoord_volledig[a_getal], this.antwoord_volledig[random1], this.antwoord_volledig[random2]};
            ArrayList<String> mylist = new ArrayList<String>();
            mylist.add(antwoordenlijst[0]);
            mylist.add(antwoordenlijst[1]);
            mylist.add(antwoordenlijst[2]);
            Collections.shuffle(mylist);
            String[] objArray = mylist.toArray(new String[mylist.size()]);
            A_antwoord.setText(objArray[0]);
            B_antwoord.setText(objArray[1]);
            C_antwoord.setText(objArray[2]);
        }
        if (this.vragenlijst[v_getal].equals("Wat is de hydrofobiciteit van")) {
            correct = this.antwoord_hydro[a_getal];
            A_antwoord.setText("Hydrofiel");
            B_antwoord.setText("Moderate");
            C_antwoord.setText("Hydrofoob");
        }
        if (this.vragenlijst[v_getal].equals("Wat is de lading van")) {
            correct = this.antwoord_lading[a_getal];
            antwoordenlijst = new String[]{this.antwoord_lading[a_getal], this.antwoord_lading[random1], this.antwoord_lading[random2]};
            A_antwoord.setText("-");
            B_antwoord.setText("0");
            C_antwoord.setText("+");
        }
        if (this.vragenlijst[v_getal].equals("Wat is de grootte van")) {
            correct = this.antwoord_grote[a_getal];
            antwoordenlijst = new String[]{this.antwoord_grote[a_getal], this.antwoord_grote[random1], this.antwoord_grote[random2]};
            A_antwoord.setText("Klein");
            B_antwoord.setText("Middel");
            C_antwoord.setText("Groot");
        }
        if (this.vragenlijst[v_getal].equals("Wat is de 3D voorkeur van")) {
            correct = this.antwoord_3D[a_getal];
            antwoordenlijst = new String[]{this.antwoord_3D[a_getal], this.antwoord_3D[random1], this.antwoord_3D[random2]};
            Antwoord_D.setVisible(true);
            A_antwoord.setText("T");
            B_antwoord.setText("H");
            C_antwoord.setText("S");
            D_antwoord.setText("Geen");
        }
        if (this.vragenlijst[v_getal].equals("Wat is de zijketen van")) {
            this.yoyoyo = "Check";
            //antwoordenlijst = new String[]{this.antwoord_volledig[a_getal], this.antwoord_volledig[random1], this.antwoord_volledig[random2]};
            z_A_afbeelding.setImage(new Image((getClass().getResourceAsStream(this.antwoord_zijketen[a_getal]))));
            z_B_afbeelding.setImage(new Image((getClass().getResourceAsStream(this.antwoord_zijketen[random1]))));
            z_C_afbeelding.setImage(new Image((getClass().getResourceAsStream(this.antwoord_zijketen[random2]))));
            A_antwoord.setText("A");
            B_antwoord.setText("B");
            C_antwoord.setText("C");}


        if (this.vragenlijst[v_getal].equals("Welk aminozuur is")){
            correct = this.antwoord_hydro[a_getal];
            complete_vraag = this.vragenlijst[v_getal] + " " + antwoord_hydro[a_getal];
            A_antwoord.setText("Hydrofiel");
            B_antwoord.setText("Neutraal");
            C_antwoord.setText("Hydrofoob"); }
        if (this.vragenlijst[v_getal].equals("Welk aminozuur is niet")) {
            complete_vraag = this.vragenlijst[v_getal] + " " + antwoord_hydro[a_getal];
            correct = this.antwoord_hydro[a_getal];
            A_antwoord.setText("Hydrofiel");
            B_antwoord.setText("Neutraal");
            C_antwoord.setText("Hydrofoob");}
        if (this.vragenlijst[v_getal].equals("Wat is de hydrofobiciteit van aminozuur")) {
            int hydro_random = this.random_getal.nextInt(60);
            correct = this.antwoord_hydro_alles[hydro_random];
            complete_vraag = this.vragenlijst[v_getal] + " " + this.aminozuur_lijst_alles[hydro_random];
            A_antwoord.setText("Hydrofiel");
            B_antwoord.setText("Neutraal");
            C_antwoord.setText("Hydrofoob");
        }
        if (this.vragenlijst[v_getal].equals("Wat is de hydrofobiciteit van aminozuur met de volgende zijketen:")) {
            complete_vraag = this.vragenlijst[v_getal];
            correct = this.antwoord_volledig[a_getal];
            Vraag_afbeelding.setImage(new Image((getClass().getResourceAsStream(this.antwoord_zijketen[a_getal]))));
            antwoordenlijst = new String[]{this.antwoord_volledig[a_getal], this.antwoord_volledig[random1], this.antwoord_volledig[random2]};
            ArrayList<String> mylist = new ArrayList<String>();
            mylist.add(antwoordenlijst[0]);
            mylist.add(antwoordenlijst[1]);
            mylist.add(antwoordenlijst[2]);
            Collections.shuffle(mylist);
            String[] objArray = mylist.toArray(new String[mylist.size()]);
            A_antwoord.setText(objArray[0]);
            B_antwoord.setText(objArray[1]);
            C_antwoord.setText(objArray[2]);}
        if (this.vragenlijst[v_getal].equals("Welk aminozuur is .... geladen?")){
            correct = this.antwoord_volledig[a_getal];
            complete_vraag = this.vragenlijst[v_getal];
            Antwoord_A_label.setText("Positief");
            Antwoord_B_label.setText("Negatief");
            Antwoord_C_label.setText("Neutraal"); }
        if (this.vragenlijst[v_getal].equals("Welk aminozuur is niet .... geladen?")){
            correct = this.antwoord_lading[v_getal];
            complete_vraag = this.vragenlijst[v_getal];
            Antwoord_A_label.setText("Positief");
            Antwoord_B_label.setText("Negatief");
            Antwoord_C_label.setText("Neutraal"); }
        if (this.vragenlijst[v_getal].equals("Wat is de lading van aminozuur")){
            correct = antwoord_lading[v_getal];
            complete_vraag = this.vragenlijst[v_getal] + " " + this.aminozuur_lijst[a_getal];
            antwoordenlijst = new String[]{this.antwoord_lading[a_getal], this.antwoord_lading[random1], antwoord_lading[random2]};
            ArrayList<String> mylist = new ArrayList<String>();
            mylist.add(antwoordenlijst[0]);
            mylist.add(antwoordenlijst[1]);
            mylist.add(antwoordenlijst[2]);
            Collections.shuffle(mylist);
            String[] objArray = mylist.toArray(new String[mylist.size()]);
            Antwoord_A_label.setText(objArray[0]);
            Antwoord_B_label.setText(objArray[1]);
            Antwoord_C_label.setText(objArray[2]);}
        if (this.vragenlijst[v_getal].equals("Wat is de lading van aminozuur met de volgende zijketen:")){
            correct = antwoord_lading[v_getal];
            A_antwoord.setText("Positief");
            B_antwoord.setText("Neutraal");
            C_antwoord.setText("Negatief"); }

        if (this.vragenlijst[v_getal].equals("Welk aminozuur is ")){
            correct = this.antwoord_grote[v_getal];
            int maat_getal = this.random_getal.nextInt(2);
            String maat = this.aminozuur_lijst[a_getal];
            complete_vraag = "Welke aminozuur is" + " " + maat;
            antwoordenlijst = new String[]{this.antwoord_volledig[a_getal], this.antwoord_volledig[random1], antwoord_volledig[random2]};
            ArrayList<String> mylist = new ArrayList<String>();
            mylist.add(antwoordenlijst[0]);
            mylist.add(antwoordenlijst[1]);
            mylist.add(antwoordenlijst[2]);
            Collections.shuffle(mylist);
            String[] objArray = mylist.toArray(new String[mylist.size()]);
            A_antwoord.setText(objArray[0]);
            B_antwoord.setText(objArray[1]);
            C_antwoord.setText(objArray[2]);}

        if (this.vragenlijst[v_getal].equals("Welk aminozuur is niet ")){
            correct = this.antwoord_grote[a_getal];
            int maat_getal = this.random_getal.nextInt(2);
            String maat = this.aminozuur_lijst[a_getal];
            complete_vraag = "Welke aminozuur is" + " " + maat;
            antwoordenlijst = new String[]{this.antwoord_volledig[a_getal], this.antwoord_volledig[random1], antwoord_volledig[random2]};
            ArrayList<String> mylist = new ArrayList<String>();
            mylist.add(antwoordenlijst[0]);
            mylist.add(antwoordenlijst[1]);
            mylist.add(antwoordenlijst[2]);
            Collections.shuffle(mylist);
            String[] objArray = mylist.toArray(new String[mylist.size()]);
            A_antwoord.setText(objArray[0]);
            B_antwoord.setText(objArray[1]);
            C_antwoord.setText(objArray[2]);}

        if (this.vragenlijst[v_getal].equals("Wat is de grootte van aminozuur")){
            correct = this.antwoord_grote[v_getal];
            complete_vraag = this.vragenlijst[v_getal] + " " + this.aminozuur_lijst[a_getal];
            antwoordenlijst = new String[]{this.antwoord_grote[a_getal], this.antwoord_grote[random1], antwoord_grote[random2]};
            ArrayList<String> mylist = new ArrayList<String>();
            mylist.add(antwoordenlijst[0]);
            mylist.add(antwoordenlijst[1]);
            mylist.add(antwoordenlijst[2]);
            Collections.shuffle(mylist);
            String[] objArray = mylist.toArray(new String[mylist.size()]);
            A_antwoord.setText(objArray[0]);
            B_antwoord.setText(objArray[1]);
            C_antwoord.setText(objArray[2]);}

        if (this.vragenlijst[v_getal].equals("Wat is de grootte van aminozuur met de volgende zijketen:")) {
            complete_vraag = this.vragenlijst[v_getal];
            correct = this.antwoord_grote[v_getal];
            Vraag_afbeelding.setImage(new Image((getClass().getResourceAsStream(this.antwoord_zijketen[a_getal]))));
            A_antwoord.setText("Klein");
            B_antwoord.setText("Middel");
            C_antwoord.setText("Groot");}

        if (this.vragenlijst[v_getal].equals("Welk aminozuur is ")){
            int maat_getal = this.random_getal.nextInt(2);
            String maat = this.aminozuur_lijst[a_getal];
            correct = this.antwoord_volledig[a_getal];
            complete_vraag = "Welke aminozuur is" + " " + maat;
            antwoordenlijst = new String[]{this.antwoord_volledig[a_getal], this.antwoord_volledig[random1], antwoord_volledig[random2]};
            ArrayList<String> mylist = new ArrayList<String>();
            mylist.add(antwoordenlijst[0]);
            mylist.add(antwoordenlijst[1]);
            mylist.add(antwoordenlijst[2]);
            Collections.shuffle(mylist);
            String[] objArray = mylist.toArray(new String[mylist.size()]);
            A_antwoord.setText(objArray[0]);
            B_antwoord.setText(objArray[1]);
            C_antwoord.setText(objArray[2]);}

        if (this.vragenlijst[v_getal].equals("Welk aminozuur heeft een voorkeur voor")) {
            String voorkeur = this.antwoord_3D[a_getal];
            correct = this.antwoord_volledig[a_getal];
            complete_vraag = this.vragenlijst[v_getal] + " " + voorkeur;
            antwoordenlijst = new String[]{this.antwoord_volledig[a_getal], this.antwoord_volledig[random1], antwoord_volledig[random2]};
            ArrayList<String> mylist = new ArrayList<String>();
            mylist.add(antwoordenlijst[0]);
            mylist.add(antwoordenlijst[1]);
            mylist.add(antwoordenlijst[2]);
            Collections.shuffle(mylist);
            String[] objArray = mylist.toArray(new String[mylist.size()]);
            A_antwoord.setText(objArray[0]);
            B_antwoord.setText(objArray[1]);
            C_antwoord.setText(objArray[2]);}

        if (this.vragenlijst[v_getal].equals("Welk aminozuur heeft geen voorkeur voor een")) {
            correct = this.antwoord_3D[v_getal];
            String voorkeur = this.antwoord_3D[a_getal];
            complete_vraag = this.vragenlijst[v_getal] + " " + voorkeur;
            A_antwoord.setText("H");
            B_antwoord.setText("T");
            C_antwoord.setText("S");
            D_antwoord.setText("Geen");}

        if (this.vragenlijst[v_getal].equals("Wat is de 3D voorkeur van aminozuur")){
            correct = this.antwoord_3D[v_getal];
            complete_vraag = this.vragenlijst[v_getal] + " " + this.aminozuur_lijst[a_getal];
            antwoordenlijst = new String[]{this.antwoord_grote[a_getal], this.antwoord_grote[random1], antwoord_grote[random2]};
            A_antwoord.setText("H");
            B_antwoord.setText("T");
            C_antwoord.setText("S");
            D_antwoord.setText("Geen");}

        if (this.vragenlijst[v_getal].equals("Wat is de 3D voorkeur van aminozuur met de volgende zijketen:")) {
            complete_vraag = this.vragenlijst[v_getal];
            correct = this.antwoord_3D[v_getal];
            Vraag_afbeelding.setImage(new Image((getClass().getResourceAsStream(this.antwoord_zijketen[a_getal]))));
            A_antwoord.setText("H");
            B_antwoord.setText("T");
            C_antwoord.setText("S");
            D_antwoord.setText("Geen");}

        if (this.vragenlijst[v_getal].equals("Wat is de volledigenaam van het volgende aminozuur met zijketen:")) {
            complete_vraag = this.vragenlijst[v_getal];
            correct = this.antwoord_volledig[v_getal];
            Vraag_afbeelding.setImage(new Image((getClass().getResourceAsStream(this.antwoord_zijketen[a_getal]))));
            antwoordenlijst = new String[]{this.antwoord_volledig[a_getal], this.antwoord_volledig[random1], antwoord_volledig[random2]};
            ArrayList<String> mylist = new ArrayList<String>();
            mylist.add(antwoordenlijst[0]);
            mylist.add(antwoordenlijst[1]);
            mylist.add(antwoordenlijst[2]);
            Collections.shuffle(mylist);
            String[] objArray = mylist.toArray(new String[mylist.size()]);
            A_antwoord.setText(objArray[0]);
            B_antwoord.setText(objArray[1]);
            C_antwoord.setText(objArray[2]);}

        if (this.vragenlijst[v_getal].equals("Wat is de 1-lettercode van het volgende aminozuur met zijketen:")) {
            complete_vraag = this.vragenlijst[v_getal];
            correct = this.antwoord_1_letter[v_getal];
            Vraag_afbeelding.setImage(new Image((getClass().getResourceAsStream(this.antwoord_zijketen[a_getal]))));
            antwoordenlijst = new String[]{this.antwoord_1_letter[a_getal], this.antwoord_1_letter[random1], antwoord_1_letter[random2]};
            ArrayList<String> mylist = new ArrayList<String>();
            mylist.add(antwoordenlijst[0]);
            mylist.add(antwoordenlijst[1]);
            mylist.add(antwoordenlijst[2]);
            Collections.shuffle(mylist);
            String[] objArray = mylist.toArray(new String[mylist.size()]);
            A_antwoord.setText(objArray[0]);
            B_antwoord.setText(objArray[1]);
            C_antwoord.setText(objArray[2]);}

        if (this.vragenlijst[v_getal].equals("Wat is de 3-lettercode van het volgende aminozuur met zijketen:")) {
            complete_vraag = this.vragenlijst[v_getal];
            correct = this.antwoord_3_letter[v_getal];
            Vraag_afbeelding.setImage(new Image((getClass().getResourceAsStream(this.antwoord_zijketen[a_getal]))));
            antwoordenlijst = new String[]{this.antwoord_3_letter[a_getal], this.antwoord_3_letter[random1], antwoord_3_letter[random2]};
            ArrayList<String> mylist = new ArrayList<String>();
            mylist.add(antwoordenlijst[0]);
            mylist.add(antwoordenlijst[1]);
            mylist.add(antwoordenlijst[2]);
            Collections.shuffle(mylist);
            String[] objArray = mylist.toArray(new String[mylist.size()]);
            A_antwoord.setText(objArray[0]);
            B_antwoord.setText(objArray[1]);
            C_antwoord.setText(objArray[2]);}

        if (this.vragenlijst[v_getal].equals("Wat is de hydrofobiciteit het volgende aminozuur met zijketen:")) {
            complete_vraag = this.vragenlijst[v_getal];
            correct = this.antwoord_hydro[v_getal];
            Vraag_afbeelding.setImage(new Image((getClass().getResourceAsStream(this.antwoord_zijketen[a_getal]))));
            A_antwoord.setText("Moderate");
            B_antwoord.setText("Hydrofiel");
            C_antwoord.setText("Hydrofoob");}

        if (this.vragenlijst[v_getal].equals("Wat is de lading het volgende aminozuur met zijketen:")) {
            complete_vraag = this.vragenlijst[v_getal];
            correct = this.antwoord_lading[v_getal];
            Vraag_afbeelding.setImage(new Image((getClass().getResourceAsStream(this.antwoord_zijketen[a_getal]))));
            A_antwoord.setText("-");
            B_antwoord.setText("0");
            C_antwoord.setText("+");}

        if (this.vragenlijst[v_getal].equals("Wat is de grootte van het volgende aminozuur met zijketen:")) {
            complete_vraag = this.vragenlijst[v_getal];
            correct = this.antwoord_grote[v_getal];
            Vraag_afbeelding.setImage(new Image((getClass().getResourceAsStream(this.antwoord_zijketen[a_getal]))));
            A_antwoord.setText("Klein");
            B_antwoord.setText("Middel");
            C_antwoord.setText("Groot");}

        if (this.vragenlijst[v_getal].equals("Wat is de 3D voorkeur van het volgende aminozuur met zijketen:")){
            complete_vraag = this.vragenlijst[v_getal];
            correct = this.antwoord_3D[v_getal];
            Vraag_afbeelding.setImage(new Image((getClass().getResourceAsStream(this.antwoord_zijketen[a_getal]))));
            A_antwoord.setText("H");
            B_antwoord.setText("T");
            C_antwoord.setText("S");
            D_antwoord.setText("Geen");}
        Vragen_stel_label.setText(complete_vraag);}

        catch (Exception e){
            type_antwoorden = "NEEP";
        }

    }




}