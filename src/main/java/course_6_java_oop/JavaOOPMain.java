package course_6_java_oop;

import course_6_java_oop.abstract_example.ACatalogOperationsImpl;
import course_6_java_oop.interface_example.ICatalogOperationsImpl;

public class JavaOOPMain {

    // changes
    int currentHour = 19;

    // will never change
    private final int NUMBER_OF_MONTHS = 12;
    private final double PI = 3.14;

    public static void main(String... args) {

        Hotel firstHotel = new Hotel("Hilton");
        System.out.println(firstHotel.toString());
        // by default it calls the .toString() method
        System.out.println(firstHotel);

        Object secondHotel = new Hotel("AnotherHotel");
        System.out.println(secondHotel.toString());

        // overload
        firstHotel.howMany(1);
        firstHotel.howMany(1, "BCD");

//        System.exit(0);

        // implements interface (inheritance)
        // interface has only method signatures (no body)
        // predefined access modified: public (no need to specify it
        ICatalogOperationsImpl catalogOperations = new ICatalogOperationsImpl();
        catalogOperations.add(); // has body
        catalogOperations.toString(); // Object
        catalogOperations.delete(); // has body

        // extends abstract class (inheritance)
        // can have method with bodies
        // abstract keyword defines method signatures
        // must define access modifier (if needed)
        ACatalogOperationsImpl catalogOperations1 = new ACatalogOperationsImpl();
        catalogOperations1.add();
        catalogOperations1.toString();
        catalogOperations1.delete();

        // not final, can assign new values
        int a = 1;
        a = 2;
        a = 4;
    }
}
