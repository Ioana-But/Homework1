package course_2_intro_to_java;

// Compile exceptions: warnings by definitions / compiler issues (cannot start the application)
// Runtime exceptions: issues when running the application

// class declaration
public class IntroToJavaMain {

    // single declaration
    int secondExampleVariable;

    // multiple declarations
    int a, b, c;

    // SHIFT + F10
    public static void main(String... args) {

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);

        int mainVariable;

        System.out.print("Test");
        System.out.println("Test");

        // logic...5000 lines of code
    }

    // return type
    // name of the method
    void test() {

        int testVariable;
    }

    int test2() {

        int testVariable;

        return 2;
    }

    // method declaration with parameters
    public void printStringAndIncrementAnotherString(String abc) {

        System.out.println(abc);
        secondExampleVariable += 2;
    }

    public void printTest() {

        System.out.println("Test");
    }
}
