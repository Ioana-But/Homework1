package course_3_oop;

import course_2_intro_to_java.Car;

/**
 * Comment example (class)
 * <p>
 * Created at: 20.15.2020
 *
 * @author rares
 */
public class OOPMain {

    /**
     * Comment example (variable): unnecessary case since the name pretty much says everything
     * <p>
     * Number of tires
     */
    int numberOfTires = 4;

    public static void main(String... args) {

        // CTRL click
        // different instances
        // same properties
        Car audiA1 = new Car();
        Car audiA4 = new Car();

        String aString = "abc";
        String aSecondString = aString;

        Car audiA2 = new Car();

        // Person definition
        Person firstHuman = new Person();

        // Call methods
        firstHuman.toString();
        firstHuman.brushTeeth();
        firstHuman.eat();
        firstHuman.run();

        // Assignation class variable and instance variable
        int aNumber = 40;
        firstHuman.age = 40;

        // Person flows
        System.out.println("First person:");

        System.out.println(firstHuman.name);
        System.out.println(firstHuman.surname);
        System.out.println(firstHuman.age);
        System.out.println(firstHuman.isHungry);

        System.out.println("------------------------");
        System.out.println("Second person:");

        Person secondHuman = new Person();

        secondHuman.isHungry = true;

        System.out.println(secondHuman.name);
        System.out.println(secondHuman.surname);
        System.out.println(secondHuman.age);
        System.out.println(secondHuman.isHungry);

        System.out.println("------------------------");
        System.out.println("Third person:");

        Person thirdHuman = new Person("abc", "bcd", 10, true);

        System.out.println(thirdHuman.name);
        System.out.println(thirdHuman.surname);

        Person fourthHuman = new Person("xyz", "whatever", 20, false);
    }

    /**
     * Comment example (method): necessary because the logic in the method body cannot be defined in the name
     * and thus, must be explained properly
     * <p>
     * Do an addition
     * Do 2 subtractions
     * Multiply and return
     */
    public void doRandomCalculations() {

        // We can define a new Car instance anywhere
        Car audiA3 = new Car();
    }
}
