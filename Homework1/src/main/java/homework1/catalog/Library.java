package homework1.catalog;

import homework1.models.ArtAlbum;
import homework1.models.Author;
import homework1.models.Book;
import homework1.models.Novel;

import java.util.ArrayList;
import java.util.List;

public class Library {

    public static void main(String... args) {

       Novel theSilentPatient = new Novel("The Silent Patient",251,new Author("W"), "Mystery");
       Novel braveNewWorld = new Novel("Brave New World",436, new Author("B"), "SF");
       Novel sapiens = new Novel("Sapiens", 676, new Author("H"), "History");
       Novel becomingMichelleObama = new Novel("Becoming Michelle Obama", 394, new Author("MO"), "Biography");

        //theSilentPatient.name = "The Silent Patient";
        //theSilentPatient.noPages = 251;

            theSilentPatient.open();

        //braveNewWorld.name = "Brave New World";
        //braveNewWorld.noPages = 436;

            braveNewWorld.close();

        //sapiens.name = "Sapiens";
        //sapiens.noPages = 527;

            sapiens.read();

        //becomingMichelleObama.name = "Becoming Michelle Obama";
        //becomingMichelleObama.noPages = 394;

            becomingMichelleObama.read();

        ArtAlbum internationalBeauty = new ArtAlbum("International Beauty",172, new Author("Jones"), "Thick");
        ArtAlbum whiteNoise = new ArtAlbum("White Noise",125, new Author("Parks"), "Thin");
        ArtAlbum naturalWonders = new ArtAlbum("Natural Wonders",282, new Author("Davis"), "Shiny");

        //internationalBeauty.name = "International Beauty";
        //internationalBeauty.noPages = 172;

            internationalBeauty.peruse();

        System.out.println("Details of the book I am reading now : " + internationalBeauty);

        //whiteNoise.name = "White Noise";
        //whiteNoise.noPages = 125;

        //naturalWonders.name = "Natural Wonders";
        //naturalWonders.noPages = 282;

            naturalWonders.peruse();

        List<Book> books = new ArrayList<>();
        books.add(naturalWonders);
        books.add(whiteNoise);
        books.add(braveNewWorld);
        books.add(becomingMichelleObama);

        System.out.println("Last month I added the following titles to my collection: " + books);


    }




}
