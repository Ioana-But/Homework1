package course_6_java_oop.interface_example;

// ALT + ENTER
// you can extend and then implement
// you cannot extend multiple classes
// you can implement multiple interfaces
public class ICatalogOperationsImpl implements ICatalogOperations {

    @Override
    public void add() {
        // method body
        System.out.println("Add method in ICatalogOperationsImpl");
    }

    @Override
    public void delete() {

    }

    @Override
    public void list() {

    }

    @Override
    public void search() {

    }
}
