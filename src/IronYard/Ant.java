package IronYard;

import javafx.scene.paint.Color;

/**
 * Created by scofieldservices on 1/19/17.
 */
public class Ant {
    double x;
    double y;
    Color color;

    public Ant (double x, double y)  {
        this.x = x;
        this.y = y;
    }

    public Ant(double x, double y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
