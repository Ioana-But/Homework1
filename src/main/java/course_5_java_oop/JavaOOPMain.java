package course_5_java_oop;

public class JavaOOPMain {

    public static void main(String[] args) {

        // check class methods: CTRL + F12

        int a = 10;
        int a1 = 0; // assign default value

        String b = "abc";
        int c = 1 + 3;
        Book aBook;

        // new instance, reference created to object in HEAP memory
        Book randomBook = new Book();
        // ...
        Book randomBook2 = new Book();

        // force garbage collector to clean-up
//        System.gc();

        // an instance randomBook points to NULL
        // new Book() -> still exists in HEAP ?
        randomBook = null;

        Book bBook = null; // assign default value

        // null._ () -> (call method) will never work
//        System.out.println(bBook.toString());
        System.out.println(randomBook);
        System.out.println(randomBook.toString());

        // TODO(rflueras) I will do this at some point...
        randomBook2.printMe();
        randomBook2.printMe();
        randomBook2.printMe();

        int primitiveValue = 1;

        // contains the primitive it was constructed for
        Integer wrapperValueInteger = 1;
        Long wrapperValueLong = 1L;

        char aCharacter = 'C';

        // a new instance, REFERENCES a new book in the HEAP memory
        Book exampleBook = new Book();

        // list of characters (no primitive to match it)
        // will be exactly the same as creating a new instance
        String exampleString = "abc";
        String exampleString2 = new String("abc");

        // LVL 0 -> Circle (SUPER -> Constructor Shape)
        // LVL 1 -> Shape (SUPER -> Constructor SpecialMathematics)
        // LVL 2 -> SpecialMathematics
    }
}
