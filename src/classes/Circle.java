package classes;

import java.awt.*;

public class Circle extends Rectangle{
    // Attributes
    private int diameter;

    // Constructors
    public Circle (int diameter){
        super(diameter,diameter);
        this.diameter=diameter;
    }

    public Circle (){
        super();
        super.setHeight(super.getWidth());
        this.diameter=super.getWidth();
    }

    // Methods
    @Override
    public void draw(Graphics g){
        g.setColor(super.getColor());
        g.fillOval(this.getX(),this.getY(),this.diameter,this.diameter);
    }

    // Getters and Setters
    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    // toString
    @Override
    public String toString() {
        return "Circle{" +
                "diameter=" + diameter +
                super.toString()+'}';
    }
}
