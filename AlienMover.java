package debugger;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class AlienMover {

    private Alien _alien;

    public AlienMover(Pane alienPane, HBox buttonPane) {
        _alien = new Alien(alienPane);
        this.setupButtons(buttonPane);
    }

    private void setupButtons(HBox buttonPane) {
        Button b1 = new Button("Move Left!");
        Button b2 = new Button("Move Right!");
        buttonPane.getChildren().addAll(b1, b2);
        buttonPane.setSpacing(Constants.BUTTON_SPACING);
    }

    private class MoveHandler implements EventHandler<ActionEvent> {
        private double _distance;

        public MoveHandler(boolean isLeft) {
            _distance = Constants.DISTANCE_X;
            if (isLeft) {
                _distance += -1;
            }
        }

        public void handle(ActionEvent event) {
            _alien.setXLoc(_alien.getXLoc() + _distance);
        }
    }
}
