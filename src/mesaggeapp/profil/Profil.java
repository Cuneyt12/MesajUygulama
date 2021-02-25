/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mesaggeapp.profil;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import mesaggeapp.bin.Config;

/**
 *
 * @author Cüneyt
 */
public class Profil extends AnchorPane {
    
    public Profil() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Profil.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        
        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
    
    @FXML
    private void initialize() {
        Config.setAnchorPaneSize(this, 0.0, 0.0, 0.0, 0.0);
    }
}
