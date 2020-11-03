package homework1.models;

public class ArtAlbum extends Book {

    private String paperQuality;

    public ArtAlbum(String name, int numberOfPages, Author author, String albumPaperQuality) {
        super(name,numberOfPages,author);
        paperQuality = albumPaperQuality;
    }

    public String getPaperQuality(){
        return paperQuality;
    }

    public String toString(){
        return "name: " + getName() + " number of pages " + getNumberOfPages() + " paper quality " + getPaperQuality();
    }
    public static void peruse() {

    }
}