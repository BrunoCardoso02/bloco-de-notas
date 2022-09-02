package br.com.fiap;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.FileChooser;

public class PrimaryController {

    @FXML TextArea textArea;

    public void save(){
        var open = new FileChooser();
        var file = open.showSaveDialog(null);
        try{
            String texto = Files.readString(file.toPath());
            textArea.setText(texto);
        } catch (IOException e){
            Alert alert = new Alert(AlertType.ERROR);
            alert.setContentText("Arquivo não econtrado");
            alert.show();
        }
    }
}
