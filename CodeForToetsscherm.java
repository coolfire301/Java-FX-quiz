package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.fxml.Initializable;
import javafx.application.Application;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.swing.JFileChooser;
import java.lang.Object;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.*;
import java.util.Arrays;
import java.util.List;




import java.awt.*;
import java.time.LocalDateTime;
import java.io.FileWriter;


public class CodeForToetsscherm extends ControllenMain {

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
    private String[] antwoord_niet_lading = {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-",  "-", "-", "+", "+"};
    private String[] antwoord_grote = {"Klein", "Klein", "Klein", "Middel", "Middel", "Groot", "Klein", "Groot", "Groot", "Groot", "Klein", "Klein", "Middel",
            "Middel", "Groot", "Groot", "Groot", "Groot", "Middel", "Groot"};
    private String[] antwoord_niet_grote = {"Groot", "Groot", "Groot", "Klein", "Klein", "Middel", "Middel", "Klein", "Klein", "Klein", "Groot", "Middel", "Groot",
            "Klein", "Klein", "Middel", "Middel", "Middel", "Groot", "Middel"};
    private String[] antwoord_3D = {"T", "H", "S", "H", "S", "H", "T", "S", "S", "S", "T", "S", "S", "T", "Geen", "H", "Geen", "Geen", "H", "H"};
    private String[] antwoord_niet_3D = {"H", "T", "T", "S", "T", "S", "S", "T", "Geen", "Geen", "S", "T", "H", "H", "S", "Geen", "H", "T", "S", "S"};
    private String[] volledige_naam_vragen = new String[] {"Wat is de 1-lettercode van", "Wat is de 3-lettercode van", "Wat is de hydrofobiciteit van", "Wat is de lading van",
            "Wat is de grootte van", "Wat is de 3D voorkeur van", "Wat is de 3D voorkeur van"};
    private String[] een_letter_code_vragen = new String[] {"Wat is de volledige naam van", "Wat is de 3-lettercode van", "Wat is de hydrofobiciteit van", "Wat is de lading van",
            "Wat is de grootte van", "Wat is de 3D voorkeur van", "Wat is de 3D voorkeur van"};
    private String[] drie_lettercode_vragen = new String[] {"Wat is de 1-lettercode van ", "Wat is de volledige naam van ", "Wat is de hydrofobiciteit van ", "Wat is de lading van ",
            "Wat is de grootte van ", "Wat is de 3D voorkeur van ", "Wat is de 3D voorkeur van "};

    private String[] hydro_vragen = new String[]{"Welk aminozuur is", "Welk aminozuur is niet", "Wat is de hydrofobiciteit van aminozuur ", "Wat is de hydrofobiciteit van aminozuur"
            ,"Wat is de hydrofobiciteit van aminozuur", "Wat is de hydrofobiciteit van aminozuur ", "Wat is de hydrofobiciteit van het aminozuur"};

    private String[] lading_vragen = new String[] {"Welk aminozuur is .... geladen?", "Welk aminozuur niet is .... geladen?", "Wat is de lading van aminozuur",
            "Wat is de lading van aminozuur", "Wat is de lading van het aminozuur", "Wat is de lading van aminozuur ", "Wat is de lading van aminozuur "};

    private String[] grootte_vragen = new String[] {"Welk aminozuur is ", "Welk aminozuur is niet ", "Wat is de grootte van het aminozuur",
            "Wat is de grootte van aminozuur", "Wat is de grootte van aminozuur ", "Wat is de grootte van aminozuur ", "Wat is de grootte van aminozuur"};

    private String[] drieD_vragen = new String[] {"Welk aminozuur heeft een voorkeur voor", "Welk aminozuur heeft geen voorkeur voor een",
            "Welk aminozuur heeft geen voorkeur voor een", "Wat is de 3D voorkeur van het aminozuur", "Wat is de 3D voorkeur van aminozuur",
            "Wat is de 3D voorkeur van het aminozuur", "Wat is de 3D voorkeur van aminozuur "};


    Random random_getal = new Random();
    ArrayList hoeveel_files = new ArrayList<String>();

    private Stage testStage;

    @FXML
    private Button file_upload ;

    @FXML
    private Button antwoord_generen ;

    @FXML
    private Label File_label;

    @FXML
    private Label namen_label;

    @FXML
    private ToggleGroup hoeveel;

    public void welkom(Stage StageprimaryStage){
        this.testStage = StageprimaryStage;
    }

    public void File_Kiezen(ActionEvent event) throws Exception {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        File file = fileChooser.showOpenDialog( vb.testStage);

        try {
            ArrayList eerste_woord = new ArrayList<String>();
            File myObj = file;
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] a = data.split("\\n");
                for(String b:a){
                    String[] c = b.split("\\s");
                    this.hoeveel_files.add(c[0]);
                    if (eerste_woord.size() < 20){
                        eerste_woord.add(c[0]);}
                    else{;}}
            }
            Object[] array = eerste_woord.toArray();
            String[] items = Arrays.copyOf(array, array.length, String[].class);
            String totale_string = "";
            int teller = 0;
            for(String naam:items){
                teller = teller + 1;
                totale_string = totale_string + String.valueOf(teller) + ". " + naam  + "\n";
            }
            namen_label.setText(totale_string);









            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }}



        public void Antwoorden(ActionEvent event) throws Exception {
            RadioButton hoeveelheid = (RadioButton) hoeveel.getSelectedToggle();
            String aantal_vragen = hoeveelheid.getText().substring(0,2);
            int AA = Integer.parseInt(aantal_vragen);

            String vragen = "";
            int aantal_vragen_tellen = 0;
            String[] antwoorden_model = new String[AA];
            String[] vragen_model = new String[AA];
            while (aantal_vragen_tellen < AA){
                int v_getal = this.random_getal.nextInt(6);
                int w_getal = this.random_getal.nextInt(7);
                int a_getal = this.random_getal.nextInt(7);
                String[][]soort_vragen = new String[][]{volledige_naam_vragen, een_letter_code_vragen, drie_lettercode_vragen,  hydro_vragen,lading_vragen,grootte_vragen,drieD_vragen};
                String []a = soort_vragen[v_getal];

                if (a[w_getal].equals("Wat is de 1-lettercode van")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + a[w_getal] + " " + antwoord_volledig[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_1_letter[a_getal]; }
                else if (a[w_getal].equals("Wat is de 3-lettercode van")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + a[w_getal] + " " + antwoord_volledig[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_3_letter[a_getal];}
                else if (a[w_getal].equals("Wat is de hydrofobiciteit van")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + a[w_getal] + " " + antwoord_volledig[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_hydro[a_getal];}
                else if (a[w_getal].equals("Wat is de lading van")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + a[w_getal] + " " + antwoord_volledig[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_lading[a_getal];}
                else if (a[w_getal].equals("Wat is de grootte van")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + a[w_getal] + " " + antwoord_volledig[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_grote[a_getal];}
                else if (a[w_getal].equals("Wat is de grootte van ")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + a[w_getal] + " " + antwoord_volledig[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_grote[a_getal];}
                else if (a[w_getal].equals("Wat is de 3D voorkeur van")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + a[w_getal] + " " + antwoord_volledig[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_3D[a_getal];}
                else if (a[w_getal].equals("Wat is de 3D voorkeur van ")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + a[w_getal] + " " + antwoord_volledig[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_3D[a_getal];}

                else if (a[w_getal].equals("Wat is de volledigenaam van aminozuur")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +a[w_getal] + " " + antwoord_1_letter[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_volledig[a_getal];}
                else if (a[w_getal].equals("Wat is de volledige naam van ")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +a[w_getal] + " " + antwoord_1_letter[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_volledig[a_getal];}
                else if (a[w_getal].equals("Wat is de volledige naam van")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +a[w_getal] + " " + antwoord_3_letter[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_volledig[a_getal];}
                else if (a[w_getal].equals("Wat is de 3-lettercode van aminozuur")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) +". " + a[w_getal] + " " + antwoord_1_letter[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_3_letter[a_getal];}
                else if (a[w_getal].equals("Wat is de hydrofobiciteit van aminozuur")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +a[w_getal] + " " + antwoord_1_letter[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_hydro[a_getal];}
                else if (a[w_getal].equals("Wat is de lading van aminozuur")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +a[w_getal] + " " + antwoord_1_letter[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_lading[a_getal];}
                else if (a[w_getal].equals("Wat is de grootte van aminozuur")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +a[w_getal] + " " + antwoord_1_letter[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_grote[a_getal];}
                else if (a[w_getal].equals("Wat is 3D voorkeur van aminozuur")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +a[w_getal] + " " + antwoord_1_letter[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_3D[a_getal];}

                else if (a[w_getal].equals("Wat is de volledigenaam van aminozuur ")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +a[w_getal] + " " + antwoord_3_letter[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_volledig[a_getal];}
                else if (a[w_getal].equals("Wat is de 1-lettercode van aminozuur ")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +a[w_getal] + " " + antwoord_3_letter[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_1_letter[a_getal];}
                else if (a[w_getal].equals("Wat is de 1-lettercode van ")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +a[w_getal] + " " + antwoord_volledig[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_1_letter[a_getal];}
                else if (a[w_getal].equals("Wat is de hydrofobiciteit van aminozuur ")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +a[w_getal] + " " + antwoord_3_letter[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_hydro[a_getal];}
                else if (a[w_getal].equals("Wat is de hydrofobiciteit van aminozuur")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +a[w_getal] + " " + antwoord_volledig[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_hydro[a_getal];}
                else if (a[w_getal].equals("Wat is de hydrofobiciteit van ")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +a[w_getal] + " " + antwoord_3_letter[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_hydro[a_getal];}
                else if (a[w_getal].equals("Wat is de lading van aminozuur ")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + a[w_getal] + " " + antwoord_3_letter[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_lading[a_getal];}
                else if (a[w_getal].equals("Wat is de grootte van aminozuur ")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + a[w_getal] + " " + antwoord_3_letter[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_grote[a_getal];}
                else if (a[w_getal].equals("Wat is 3D voorkeur van aminozuur ")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + a[w_getal] + " " + antwoord_3_letter[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_3D[a_getal];}

                else if (a[w_getal].equals("Welk aminozuur is")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + a[w_getal] + " " + antwoord_hydro[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_volledig[a_getal];}
                else if (a[w_getal].equals("Welk aminozuur is niet")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + a[w_getal] + " " + antwoord_hydro[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_volledig[a_getal];}
                else if (a[w_getal].equals("Wat is de hydrofobiciteit van")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + a[w_getal] + " " + antwoord_volledig[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_hydro[a_getal];}
                else if (a[w_getal].equals("Wat is de hydrofobiciteit van aminozuur")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + a[w_getal] + " " + antwoord_volledig[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_hydro[a_getal];}
                else if (a[w_getal].equals("Wat is de hydrofobiciteit van aminozuur ")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + a[w_getal] + " " + antwoord_1_letter[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_hydro[a_getal];}
                else if (a[w_getal].equals("Wat is de hydrofobiciteit van het aminozuur")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + a[w_getal] + " " + antwoord_3_letter[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_hydro[a_getal];}

                else if (a[w_getal].equals("Welk aminozuur is .... geladen?")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + "Welk aminozuur is" + " " + antwoord_lading[a_getal] + " geladen";
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_volledig[a_getal];}
                else if (a[w_getal].equals("Welk aminozuur niet is .... geladen?")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + "Welk aminozuur is niet" + " " + antwoord_niet_lading[a_getal] + " geladen";
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_volledig[a_getal];}
                else if (a[w_getal].equals("Wat is de lading van ")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + a[w_getal] + " " + antwoord_3_letter[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_lading[a_getal];}
                else if (a[w_getal].equals("Wat is de lading van aminozuur ")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + a[w_getal] + " " + antwoord_3_letter[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_lading[a_getal];}

                else if (a[w_getal].equals("Wat is de lading van aminozuur")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + a[w_getal] + " " + antwoord_3_letter[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_lading[a_getal];}
                else if (a[w_getal].equals("Wat is de lading van aminozuur ")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + a[w_getal] + " " + antwoord_1_letter[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_lading[a_getal];}
                else if (a[w_getal].equals("Wat is de lading van het aminozuur")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + a[w_getal] + " " + antwoord_volledig[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_lading[a_getal];}

                else if (a[w_getal].equals("Welk aminozuur is ")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + "Welk aminozuur is" + " " + antwoord_grote[a_getal] + "";
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_volledig[a_getal];}
                else if (a[w_getal].equals("Welk aminozuur is niet ")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + "Welk aminozuur is niet" + " " + antwoord_niet_grote[a_getal] + "";
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_volledig[a_getal];}
                else if (a[w_getal].equals("Wat is de grootte van aminozuur")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + a[w_getal] + " " + antwoord_volledig[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_grote[a_getal];}
                else if (a[w_getal].equals("Wat is de grootte van aminozuur ")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + a[w_getal] + " " + antwoord_1_letter[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_grote[a_getal];}
                else if (a[w_getal].equals("Wat is de grootte van het aminozuur")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + a[w_getal] + " " + antwoord_3_letter[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_grote[a_getal];}

                else if (a[w_getal].equals("Welk aminozuur heeft een voorkeur voor")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + "Welk aminozuur heeft een voorkeur voor" + " " + antwoord_3D[a_getal] + "";
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_volledig[a_getal];}
                else if (a[w_getal].equals("Welk aminozuur heeft geen voorkeur voor")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + "Welk aminozuur heeft een voorkeur voor" + " " + antwoord_niet_3D[a_getal] + "";
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_volledig[a_getal];}
                else if (a[w_getal].equals("Wat is de 3D voorkeur van aminozuur")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + a[w_getal] + " " + antwoord_3_letter[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_grote[a_getal];}
                else if (a[w_getal].equals("Wat is de 3D voorkeur van aminozuur ")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + a[w_getal] + " " + antwoord_volledig[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_grote[a_getal];}
                else if (a[w_getal].equals("Wat is de 3D voorkeur van het aminozuur")){
                    vragen_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " + a[w_getal] + " " + antwoord_1_letter[a_getal];
                    antwoorden_model[aantal_vragen_tellen] = String.valueOf(aantal_vragen_tellen+1) + ". " +antwoord_grote[a_getal];}


                LocalDateTime myObj = LocalDateTime.now();





                aantal_vragen_tellen = aantal_vragen_tellen + 1;

}

            LocalDateTime myObj = LocalDateTime.now();
            String correcte_tijd = myObj.toString();
            correcte_tijd = correcte_tijd.substring(0,4) + "_" + correcte_tijd.substring(5,7) + "_" + correcte_tijd.substring(8,10) +
            "__" + correcte_tijd.substring(11,13) + "_" + correcte_tijd.substring(14,16);


            Object[] array = this.hoeveel_files.toArray();
            String[] items = Arrays.copyOf(array, array.length, String[].class);

            for (int i = 0; i < items.length; i++) {
            try {
                File bestandje = new File(items[i] + "_" + correcte_tijd + "_AAtest.txt");
                if (bestandje.createNewFile()) {
                    FileWriter myWriter = new FileWriter(items[i] + "_" + correcte_tijd + "_AAtest.txt");
                    for(String b:vragen_model){
                        myWriter.write(b);
                        myWriter.write("\r\n");}
                    myWriter.close();
                    System.out.println("");
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("");
                e.printStackTrace();
            }

}
            for (int i = 0; i < items.length; i++) {
                try {
                    File bestandje_antwoorden = new File(items[i] + "_" + correcte_tijd + "_AAant.txt");
                    if (bestandje_antwoorden.createNewFile()) {
                        FileWriter myWriter = new FileWriter(items[i] + "_" + correcte_tijd + "_AAant.txt");
                        for(String b:antwoorden_model){
                            myWriter.write(b);
                            myWriter.write("\r\n");}
                        myWriter.close();
                        System.out.println("");
                    } else {
                        System.out.println("File already exists.");
                    }
                } catch (IOException e) {
                    System.out.println("");
                    e.printStackTrace();}


}}}



