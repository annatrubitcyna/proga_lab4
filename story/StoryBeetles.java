package story;

import actions.Portrait;
import character.*;
import control.Author;
import control.Time;
import enumeration.Colors;
import enumeration.HowCalmly;
import enumeration.HowSpeed;

import java.io.PipedOutputStream;

public class StoryBeetles implements Story {
    public String name = "Korotishki from flower city";

    @Override
    public void story() {
        //there are conditions under which the cycle will break
        while (true) {
            Author narrator = new Author(); //create Author this story
            System.out.println(narrator.startStory(2, this.name)); //author start story
            //create heroes story
            Neznaika neznaika = new Neznaika();
            Beetle beetle = new Beetle();
            Gunka gunka = new Gunka();
            Tubik tubik = new Tubik();
            Gusla gusla = new Gusla();
            Ponchik ponchik = new Ponchik();
            Pilulkin pilulkin = new Pilulkin();
            Steklashkin steklashkin = new Steklashkin();
            Malishki malishka = new Malishki();

            //heroes enter into the story
            System.out.println(gunka.live() + neznaika.live() + tubik.live() + gusla.live() + pilulkin.live() + steklashkin.live());
            //Introduction
            neznaika.dress();
            neznaika.hangArround("whole days", "the city");
            String story = neznaika.composing();
            if (neznaika.offend(malishka).equals("offend malishka")) {
                if (malishka.seeing("orange shirt")) {
                    malishka.turned();
                }
            }
            neznaika.friend = gunka;
            gunka.friend = neznaika;
            neznaika.chat(gunka);
            neznaika.befriends(gunka);

            String neznaikaBecameFamous = neznaika.becameFamous();
            //Author speak
            String speakNarratorBegginer = narrator.speak();
            //if autor speak about Neznaika he doing something in the story
            if (speakNarratorBegginer.contains("Neznaika")) {
            } else {
                break;
            }
            //Neznaika walk
            String neznaikaWalk = neznaika.walk();
            //Beetle fly
            beetle.fly();
            String beetleHit = "";
            //if Neznaika walk on field beetle hit him
            if (neznaikaWalk.contains("field")) {
                beetleHit = beetle.hit(neznaika);
            }
            String neznaikaTrundle = "";
            //if Beetle hit him neznaika trundle
            if (beetleHit.contains("hit")) {
                neznaikaTrundle = neznaika.trundle();
            }
            //if neznaika trundle neznaika ask and speak
            if (neznaikaTrundle.contains("trundle")) {
                neznaika.ask();
                neznaika.speak();
            }
            //neznaika go home
            neznaika.goHome();
            //neznaika meet Steklashkin
            String neznaikaMeet = neznaika.meet(steklashkin);
            String steklashkinSpeak = "";
            //if neznaika meet Steklashkin he speak and steklashkin speak him
            if (neznaikaMeet.contains("Neznaika meet Steklashkin")) {
                String neznaika_about_sun = neznaika.speak();
                if (neznaika_about_sun.contains("sun")) {
                    steklashkinSpeak = steklashkin.speak();
                }
            }
            //then neznaika run and cry
            neznaika.run();
            String neznaika_cry = neznaika.cry(steklashkinSpeak);
            //if neznaika cry all of korotiski grab their thinks
            if (neznaika_cry.contains("sun")) {
                tubik.grabThinks();
                gusla.grabThinks();
                pilulkin.grabThinks();
                ponchik.grabThinks();
            }
            //then all of korotishki laugh
            tubik.laugh();
            gusla.laugh();
            pilulkin.laugh();
            ponchik.laugh();
            //Author ask about Story Author finish Story
            narrator.exclaim();
            narrator.ask();
            System.out.println(narrator.finishStory());
            break;
        }
    }
}
