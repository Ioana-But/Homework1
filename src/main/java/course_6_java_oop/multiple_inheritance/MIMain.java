package course_6_java_oop.multiple_inheritance;

public class MIMain {

    // who is created first ? always the parent, because technically that's the class you define first and then
    // use it as an extend to other children. C cannot exist without B and B cannot exist without A.
    public static void main(String... args) {
        C c = new C();
    }
}
