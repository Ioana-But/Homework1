package course_4_oop;

import java.util.ArrayList;
import java.util.List;

public class OOP2Main {

    public static void main(String... args) {

        // 1 word: type-ul Circle
        // 2 word: variable name
        // 3 group: instantiate a new Circle() (based on blueprint)
        Circle firstCircle = new Circle(20);
//        firstCircle.publicValue = 10;
//        firstCircle.defaultValue = 20;

//        firstCircle.setRadius(20);
        System.out.println(firstCircle.getRadius());

        Circle secondCircle = new Circle(30);

        secondCircle.area();

        // NOT OK for public access, no ENCAPSULATION
//        secondCircle.radius = 20;
//        int a = secondCircle.radius * secondCircle.radius - 3;

        // 500 lines of code (you get lost in the details and instance modifications)

//        secondCircle.radius = 40;
//        a = secondCircle.radius * secondCircle.radius - 3;

//        test(1024);

        Square firstSquare = new Square();
        firstSquare.draw();
        Triangle firstTriangle = new Triangle();
        firstTriangle.draw();

        firstTriangle.test();

        // Polymorphism
        // i++ = i+1
        for (int i = 0; i < 10; i++) {
            // here
        }

        List<Shape> shapes = new ArrayList<>();
        shapes.add(firstCircle);
        shapes.add(secondCircle);
        shapes.add(firstSquare);
        shapes.add(firstTriangle);
//        shapes.add(1);
//        shapes.add("abc")

        // 1...n
        // 3 (firstCircle, secondCircle, firstTriangle, firstSquare)
        for (Shape shape : shapes) {
            // here

            // child - parent (Shape - SpecialMathematics)
        }

        List<Circle> circles = new ArrayList<>();
        circles.add(firstCircle);
        circles.add(secondCircle);
//        circles.add(firstTriangle);

        for (Circle circle : circles) {
            // whatever works...
        }

        // Lvl 1 -> Shape -> SpecialMathematics
        Circle thirdCircle = new Circle(100);
        // Lvl 2 -> SpecialMathematics
        Shape fourthCircle = new Circle(200);
        Shape secondTriangle = new Triangle();

        shapes.add(thirdCircle);
        shapes.add(fourthCircle);

        Shape firstShape = new Shape();

//        Shape nullShape = null;
//        nullShape.draw();
    }

//    public static void test(int abc) {
//
//    }
}
