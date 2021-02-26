package mesaggeapp.profil;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import mesaggeapp.bin.Config;

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
