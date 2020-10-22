package course_4_oop;

public class Circle extends Shape {

    // public: everywhere (classes, variables, methods)
    public int publicValue;

//    public int calculate() {
//        return publicValue;
//    }

    // default / package-private: only in the package
    int defaultValue;

    // private: only in the class
    private int radius;

    public Circle(int newRadius) {
        radius = newRadius;
    }

    // protected: only in the class and subclasses
//    protected int protectedValue;

    public int getRadius() {
        classPurposeMethod();

        return radius;
    }

//    public void setRadius(int newRadius) {
//        radius = newRadius;
//    }

    public int getComputedValue() {
        classPurposeMethod();

        return radius * 2;
    }

    public double area() {
        return 3.14 * radius * radius;
    }

    // repeated multiple times
    // never accessed from external class (it concern the class)
    private void classPurposeMethod() {

        // calculation

        System.out.println("Method for class purposes");
        System.out.println("Method for class purposes");
        System.out.println("Method for class purposes");
        System.out.println("Method for class purposes");
        System.out.println("Method for class purposes");
    }
}
