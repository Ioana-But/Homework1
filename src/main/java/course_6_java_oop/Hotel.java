package course_6_java_oop;

// extends Object (not visible)
public class Hotel {

    private String name;

    // overload (same method different parameters) -> constructors
    public Hotel(String name) {
        this.name = name;
        System.out.println(super.toString());
    }

    public Hotel(String name, String randomString) {

    }

    // overload (same method different parameters) -> methods
    public int howMany(int count) {
        return 10;
    }

    public int howMany(String randomString, int count) {
        return 30;
    }

    public int howMany(int count, String randomString) {
        return 20;
    }

    // override (make a different implementation of a method)
    // signature => access modifier / return type / name / parameters
    // method must be inherited (in this case from Object)
    @Override
    public String toString() {
        return "Hotel name is " + name;
    }

    // doesn't match the method you want to override
//    @Override
//    String toString() {
//        return "ABC";
//    }
}
