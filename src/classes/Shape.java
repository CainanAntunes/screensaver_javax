package classes;

import java.awt.*;
import java.util.Random;

public abstract class Shape {

    // Attributes
    private Color color;
    private int x;
    private int y;
    private int speedX;
    private int speedY;
    Random r = new Random();

    // Constructors
    public Shape(){
        this.color = this.colorGenerate();
        this.x = r.nextInt(250)+250;
        this.y = r.nextInt(250)+250;
        this.speedX = r.nextInt(3)+1;
        this.speedY = r.nextInt(3)+1;
        // Gera direções aleatórias
        if(r.nextBoolean())
            this.speedX*=-1;
        if(r.nextBoolean())
            this.speedY*=-1;
    }

    public Shape(Color color, int x, int y, int speedX, int speedY){
        this.color=color;
        this.x=x;
        this.y=y;
        this.speedX=speedX;
        this.speedY=speedY;
    }

    // Methods
    public void move(int screenWidth, int screenHeight){
        this.x+=speedX;
        this.y+=speedY;
    }

    protected Color colorGenerate(){
        return new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256));
    }

    public abstract void  draw(Graphics g);

    // Getters & Setters
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpeedX() {
        return speedX;
    }

    public void setSpeedX(int speedX) {
        this.speedX = speedX;
    }

    public int getSpeedY() {
        return speedY;
    }

    public void setSpeedY(int speedY) {
        this.speedY = speedY;
    }

    // toString
    @Override
    public String toString() {
        return "Shape{" +
                "speedY=" + speedY +
                ", speedX=" + speedX +
                ", y=" + y +
                ", x=" + x +
                ", color=" + color +
                '}';
    }
}
