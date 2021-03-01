package debugger;

import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class PaneOrganizer {

    private BorderPane _root;

    public PaneOrganizer() {
        _root = new BorderPane();
        Pane alienPane = new Pane();
        _root.setCenter(alienPane);
        HBox buttonPane = new HBox();
        buttonPane.setAlignment(Pos.CENTER);
        _root.setBottom(buttonPane);
        new AlienMover(alienPane, buttonPane);
    }

    public Pane getRoot() {
        return _root;
    }
}
