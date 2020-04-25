package it.polito.tdp.poweroutages;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ChoiceBox<?> nercChoice;

    @FXML
    private TextField maxYearsTxt;

    @FXML
    private TextField maxHoursTxt;

    @FXML
    private Button analysisBtn;

    @FXML
    private TextArea resultTxt;

    @FXML
    void doAnalysis(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert nercChoice != null : "fx:id=\"nercChoice\" was not injected: check your FXML file 'Scene.fxml'.";
        assert maxYearsTxt != null : "fx:id=\"maxYearsTxt\" was not injected: check your FXML file 'Scene.fxml'.";
        assert maxHoursTxt != null : "fx:id=\"maxHoursTxt\" was not injected: check your FXML file 'Scene.fxml'.";
        assert analysisBtn != null : "fx:id=\"analysisBtn\" was not injected: check your FXML file 'Scene.fxml'.";
        assert resultTxt != null : "fx:id=\"resultTxt\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}

