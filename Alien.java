package debugger;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

public class Alien {

    private Ellipse _face;
    private Ellipse _leftEye;
    private Ellipse _rightEye;

    public Alien(Pane root) {
        _leftEye = new Ellipse(0, Constants.EYE_Y, Constants.EYE_RAD_X, Constants.EYE_RAD_Y);
        _rightEye = new Ellipse(0, Constants.EYE_Y, Constants.EYE_RAD_X, Constants.EYE_RAD_Y);
        root.getChildren().addAll(_face, _leftEye, _rightEye);
        _face.setCenterY(Constants.FACE_Y);
        _face.setFill(Color.CHARTREUSE);
        this.setXLoc(Constants.START_X_OFFSET);
    }

    public void setXLoc(double x) {
        _face.setCenterX(x);
        _leftEye.setCenterX(x - Constants.X_OFFSET);
        _rightEye.setCenterX(x + Constants.X_OFFSET);
    }

    public double getXLoc() {
        return _face.getCenterX();
    }
}
