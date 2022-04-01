package shape;

/**
 * @author Cintia
 * @since 31/03/2022
 */

public class Shape {
    private String color;
    private boolean filled;
    
    //constructor
    public Shape() {
        color = "green";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    //getter and setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    //method
    @Override
    public String toString() {
        return "A Shape with color of " + color + " and " + (filled ? "" : "Not ") + "filled.";
    }
}

