package category;

public class Album extends Book {

    private String paperQuality;

    public Album(String nameB, int noPagesB, Author authorB, String albumPaperQuality) {
        super(nameB,noPagesB,authorB);
        paperQuality = albumPaperQuality;
    }

    public String getPaperQuality(){
        return paperQuality;
    }

    public String toString(){
        return "name: " + getName() + " number of pages " + getNoPages() + " paper quality " + getPaperQuality();
    }
    public static void peruse() {

    }
}