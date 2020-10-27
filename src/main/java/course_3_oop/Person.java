package course_3_oop;

public class Person {

    String name;

    String surname;

    int age;

    // boolean hungry;
    boolean isHungry; // true, false

    // move to Address (composition)
    // don't forget to read about Strong / Weak composition in the presentation
    private Address address;

    // shouldn't be here! can later be hard to remove
    // class creation should always match real life scenarios / objects
    private Engine engine;

    // by default if no constructors are declared there is A DEFAULT CONSTRUCTOR for each class
    public Person() {

    }

    // 1...n constructors
    public Person(String firstName, String lastName, int age, boolean isHungry) {
        name = firstName;
        surname = lastName;

        System.out.println(firstName);
        System.out.println(lastName);
    }

    public String toString() {
        return name + " " + surname;
    }

    public void brushTeeth() {

    }

    public void eat() {
        isHungry = false;
    }

    public void eat(String randomValue) {

    }

    public void run() {

    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address newAddress) {
        address = newAddress;
    }
}
