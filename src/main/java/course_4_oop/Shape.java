package course_4_oop;

public class Shape extends SpecialMathematics {

    // multiple characters: RED, YELLOW, BLUE
    private String color;

    // access modifier (1)
    // return type (2)
    // method name (3)
    // () -> parameters (4)
    public void draw() {
        System.out.println("Draw something");
        // implementation here...
    }

    public void erase() {

    }

    public void move() {

    }

    public String getColor() {
        return color;
    }

    // void => no return type
    public void setColor(String newColor) {
        color = newColor;
    }
}
