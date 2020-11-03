package homework1.models;

public class Book {

    private String name;

    private int numberOfPages;

    private Author author;

    public void read(){
    }

    public void close(){
    }


    public Book(String name, int numberOfPages, Author author) {
        this.name=name;
        this.numberOfPages = numberOfPages;
        this.author=author;
    }

    public String getName(){
        return name;
    }

    public int getNumberOfPages(){
        return numberOfPages;
    }

}
