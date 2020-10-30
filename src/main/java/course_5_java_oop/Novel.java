package course_5_java_oop;

public class Novel extends Book {

    private String type;

    public Novel(String type, String title) {
        super(title);
        this.type = type;

//        super.printSomething()
    }
}
