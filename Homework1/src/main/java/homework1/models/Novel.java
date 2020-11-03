package homework1.models;

public class Novel extends Book {

    private String type;

    public Novel(String name, int numberOfPages, Author author, String novelType) {
        super(name,numberOfPages,author);
        type = novelType;
    }

    public String getType(){
        return type;
    }

    public String toString(){
        return "name: " + getName() + " number of pages " + getNumberOfPages() + " type " + getType();
    }
    public static void open() {
    }

}

