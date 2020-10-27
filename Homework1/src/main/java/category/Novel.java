package category;

public class Novel extends Book {

    private String type;

    public Novel(String nameB, int noPagesB, String novelType) {
        super(nameB,noPagesB);
        type = novelType;
    }

    public String getType(){
        return type;
    }

    public String toString(){
        return "name: " + getName() + " number of pages " + getNoPages() + " type " + getType();
    }
    public static void open() {
    }

}

