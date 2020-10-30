package course_6_java_oop.interface_example;

/**
 * Define method signatures
 *
 * By default: public
 */
public interface ICatalogOperations {

    // default: public, no need to add it
    public void add();

    void delete();

    void list();

    void search();
}
