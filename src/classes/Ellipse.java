package classes;

import java.awt.*;

public class Ellipse extends Rectangle {
    // Methods
    @Override
    public void draw(Graphics g){
        g.setColor(super.getColor());
        g.fillOval(super.getX(),super.getY(),super.getWidth(),super.getHeight());
    }
}
