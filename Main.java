import actions.Dialogue;
import exceptions.NoSparklingWaterException;
import story.*;

public class Main {

    public static void main(String[] args) throws NoSparklingWaterException {
        /**
         * anonymous class
         */
        Dialogue dialogue = new Dialogue() {
            @Override
            public String speak() {
                String word = "Today we will get acquainted with the book by Nicolai Nosov: The Adventures of Neznaika and his friends";
                System.out.println(word);
                return word;
            }

            @Override
            public String exclaim() {
                String word = "Today we will get acquainted with the book by Nicolai Nosov: The Adventures of Neznaika and his friends!";
                System.out.println(word);
                return word;
            }

            @Override
            public String ask() {
                String word = " Do you want to will get acquainted with the book by Nicolai Nosov: "The Adventures of Neznaika and his friends" today? ";
                System.out.println(word);
                return word;
            }
        };
        //start story
        //it's speak, but he isn't author
        dialogue.speak();
        //there are 4 story
        StoryBeetles storyBeetles = new StoryBeetles();
        storyBeetles.story();
        StoryMusician storyMusician = new StoryMusician();
        storyMusician.story();
        StoryArtist storyArtist = new StoryArtist();
        storyArtist.story();
        StoryCar storyCar = new StoryCar();
        storyCar.story();
    }
}
