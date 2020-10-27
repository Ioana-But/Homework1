package catalog;

import category.Album;
import category.Author;
import category.Novel;

public class Library {

    public static void main(String... args) {

       Novel theSilentPatient = new Novel("The Silent Patient",  251, "Mystery");
       Novel braveNewWorld = new Novel("Brave New World",   436, "SF");
       Novel sapiens = new Novel("Sapiens", 676, "History");
       Novel becomingMichelleObama = new Novel("Becoming Michelle Obama", 394, "Biography");

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

        Album internationalBeauty = new Album("International Beauty",  172, new Author("Jones"), "Thick");
        Album whiteNoise = new Album("White Noise", 125, new Author("Parks"), "Thin");
        Album naturalWonders = new Album("Natural Wonders",282, new Author("Davis"), "Shiny");

        //internationalBeauty.name = "International Beauty";
        //internationalBeauty.noPages = 172;

            internationalBeauty.peruse();

        //whiteNoise.name = "White Noise";
        //whiteNoise.noPages = 125;

        //naturalWonders.name = "Natural Wonders";
        //naturalWonders.noPages = 282;

            naturalWonders.peruse();


    }




}
