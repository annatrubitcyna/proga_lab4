package story;

import actions.Portrait;
import character.Gunka;
import character.Gusla;
import character.Neznaika;
import character.Tubik;
import control.Author;
import enumeration.Colors;
import enumeration.How;
import enumeration.Speed;

public class StoryMusician implements Story {
    public String name = "How Neznaika was a musician";

    @Override
    public void story() {
        //there are conditions under which the cycle will break
        while (true) {
            Author narrator = new Author(); //create Author this story
            narrator.startStory(3, this.name); //author start story
            //create heroes story
            Neznaika neznaika = new Neznaika();
            Gusla gusla = new Gusla();
            //heroes enter into the story
            System.out.println(neznaika.live() + gusla.live());
            //Author speak
            String speakNarratorBegginer = narrator.speak();
            //if autor speak about Neznaika he doing something in the story
            if (speakNarratorBegginer.contains("Neznaika")) {
            } else {
                break;
            }
            //neznaika ask gusla to give him musician instruments and play in it
            if (neznaika.askToGive(gusla).contains("Gusla")) {
                gusla.give(neznaika, "balalaika");
            }
            for (String think : neznaika.thinks) {
                if (think.equals("balalaika")) {
                    neznaika.strum();
                }
            }
            if (neznaika.askToGive(gusla).contains("Gusla")) {
                gusla.give(neznaika, "violin");
            }
            for (String think : neznaika.thinks) {
                if (think.equals("violin")) {
                    neznaika.scrape();
                }
            }
            if (neznaika.askToGive(gusla).contains("Gusla")) {
                gusla.give(neznaika, "trumpet");
            }
            for (String think : neznaika.thinks) {
                if (think.equals("trumpet")) {
                    neznaika.blow();

                }
            }


            //Author ask about Story Author finish Story
            narrator.exclaim();
            narrator.ask();
            System.out.println(narrator.finishStory());
            break;
        }
    }
}
