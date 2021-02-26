package mesaggeapp.bin;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;

public class Config {
    public static void setAnchorPaneSize(Region region, double bottom, double left, double right, double top){
        AnchorPane.setBottomAnchor(region, bottom);
        AnchorPane.setTopAnchor(region, top);
        AnchorPane.setRightAnchor(region, right);
        AnchorPane.setLeftAnchor(region, left);
    }
}
