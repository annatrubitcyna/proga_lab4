package story;

import character.*;
import control.Author;

public class StoryPoet implements Story {
    public String name = "How Neznaika was a poet";

    @Override
    public void story() {
        //there are conditions under which the cycle will break
        while (true) {
            Author narrator = new Author(); //create Author this story
            narrator.startStory(5, this.name); //author start story
            //create heroes story
            Neznaika neznaika = new Neznaika();
            Zvetik zvetik = new Zvetik();
            //heroes enter into the story
            System.out.println(neznaika.live() + zvetik.live());
            //Author speak
            String speakNarratorBegginer = narrator.speak();
            //if autor speak about Neznaika he doing something in the story
            if (speakNarratorBegginer.contains("Neznaika")) {
            } else {
                break;
            }
            zvetik.writePoety();
            neznaika.goHome();
            neznaika.writePoety();

            //Author ask about Story Author finish Story
            narrator.exclaim();
            narrator.ask();
            System.out.println(narrator.finishStory());
            break;
        }
    }
}
