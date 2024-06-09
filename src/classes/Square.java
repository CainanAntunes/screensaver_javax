package classes;

import java.util.Random;

public class Square extends Rectangle{
    // Attributes
    private int size;
    private Random r = new Random();

    // Constructors
    public Square(int size){
        super(size,size);
        this.size=size;
    }

    public Square(){
        super();
        super.setHeight(super.getWidth());
        this.size=super.getWidth();
    }

    // Getters and Setters
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // toString
    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                ", r=" + r +
                super.toString()+'}';
    }
}
