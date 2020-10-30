package course_5_java_oop;

public class Book {

    private String title;

    public Book() {

    }

    public Book(String title) {
//        title = newTitle;
        this.title = title;
    }

    @Deprecated
    public void printMe() {
        System.out.println("This is my book");
    }

    public void printSomething() {
        System.out.println("This is my book");
    }

}
