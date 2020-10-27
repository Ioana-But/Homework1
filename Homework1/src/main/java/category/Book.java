package category;

public class Book {

    private String name;

    private int noPages;

    public Author author;

    public void read(){
    }

    public void close(){
    }


    public Book(String nameB, int noPagesB, Author authorB) {
        name=nameB;
        noPages = noPagesB;
        author=authorB;
    }

    public String getName(){
        return name;
    }

    public int getNoPages(){
        return noPages;
    }
}
