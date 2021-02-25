/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesaggeapp.bin;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;

/**
 *
 * @author Cüneyt
 */
public class Config {
    public static void setAnchorPaneSize(Region region, double bottom, double left, double right, double top){
        AnchorPane.setBottomAnchor(region, bottom);
        AnchorPane.setTopAnchor(region, top);
        AnchorPane.setRightAnchor(region, right);
        AnchorPane.setLeftAnchor(region, left);
    }
}
