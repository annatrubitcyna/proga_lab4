package story;

import actions.Portrait;
import character.*;
import control.Author;
import enumeration.Colors;
import enumeration.HowCalmly;
import enumeration.HowCalmly;
import enumeration.HowSpeed;
import enumeration.HowSpeed;

public class StoryArtist implements Story {
    public String name = "How Neznaika was an artist";

    @Override
    public void story() {
        //there are conditions under which the cycle will break
        while (true) {
            Author narrator = new Author(); //create Author this story
            narrator.startStory(1, this.name); //author start story
            //create heroes story
            Neznaika neznaika = new Neznaika();
            Gunka gunka = new Gunka();
            Tubik tubik = new Tubik();
            Ponchik ponchik = new Ponchik();
            Toropigka toropigka = new Toropigka();
            Pilulkin pilulkin = new Pilulkin();
            Znaika znaika = new Znaika();

            //heroes enter into the story
            System.out.println(gunka.live() + neznaika.live() + tubik.live());
            //Author speak
            String speakNarratorBegginer = narrator.speak();
            //if autor speak about Neznaika he doing something in the story
            if (speakNarratorBegginer.contains("Neznaika")) {
            } else {
                break;
            }
            if (neznaika.askToGive(tubik).contains("Gusla")) {
                tubik.give(neznaika, "balalaika");
            }
            //Neznaika speak
            String neznaikaAboutDraw = neznaika.speak();
            //if Neznaika want to draw Gunka he rejoced
            if (neznaikaAboutDraw.contains("I'll draw you")) {
                gunka.rejoiced();
            }
            //if Neznaika said sat to Gunka he sit to chair
            Boolean hasGunkaSat = false;
            if (neznaikaAboutDraw.contains("Sit")) {
                hasGunkaSat = gunka.sitTo(HowSpeed.QUICKLY, "chair");
            }
            //if Gunka sat Neznaika draw him
            Portrait.Face portraitGunki = null;
            if (hasGunkaSat) {
                portraitGunki = neznaika.draw(gunka);
            }
            //if Neznaika draw Portrait Gunka wanted to see
            if (portraitGunki != null) {
                gunka.wantedToSee(HowSpeed.QUICKLY);
            }
            //Gunka sit restlessly and spin if his patience is small
            if (gunka.patience == 0) {
                gunka.sit(HowCalmly.RESTLESSLY);
                gunka.spin();
                //if Gunka spin Neznaika said about it
                String neznaikaAboutLooklike = neznaika.speak();
                //if Neznaika speak it doesn't look like it's going to work Gunka ask about now and Neznaika answer
                if (neznaikaAboutLooklike.contains("It doesn't look like it's going to work")) {
                    String gunkaAskLooklike = gunka.ask();
                    if (gunkaAskLooklike.contains("Does it look like this now")) {
                        neznaika.exclaim();
                    }
                }
            } else {
                gunka.sit(HowCalmly.CALMLY);
            }
            //Neznaika add something to the portrait
            neznaika.drawDetail(portraitGunki, Colors.PURPLE);
            //if portrait finished gunka want to see it and then Neznaika show it
            if (portraitGunki.mustache != Colors.WHITE) {
            } else {
                break;
            }
            String gunkaExclaimShow = gunka.exclaim();
            if (gunkaExclaimShow.contains("Show me what happened")) {
                gunka.viewPortrait(portraitGunki, gunka);
            }
            //if portrait is bed Gunka mood is bed and small, Neznaika starts to annoy him and they start fight
            String gunkaFight = "";
            if (gunka.mood < 30) {
                neznaika.annoy(gunka);
                String gunkaExclaimAboutportrait = gunka.exclaim();
                if (gunkaExclaimAboutportrait.contains("Now erase what you drew!")) {
                    gunkaFight = gunka.fight(neznaika);
                }
            }
            //if they fight korotishki run to the noise
            if (gunkaFight.contains("fight")) {
                znaika.runToTheNoise();
                pilulkin.runToTheNoise();
            }
            neznaika.subscribe(portraitGunki);
            neznaika.hangUp(portraitGunki, "wall");
            String gunkaGoingHome = gunka.goingHome();
            //neznaika paint korotishki and makes an exhibition
            Portrait.Body portraitPonchik = neznaika.drawBodyPortrait(ponchik);
            ;
            Portrait.Body portraitToropigka = neznaika.drawBodyPortrait(toropigka);
            Portrait.Face portraitPilulkin = neznaika.draw(pilulkin);
            //neznaika hand up and subscribe portraits
            if (gunkaGoingHome.contains("going")) {
                neznaika.hangUp(portraitPonchik, "wall");neznaika.hangUp(portraitToropigka, "wall");neznaika.hangUp(portraitPilulkin, "wall");
                neznaika.subscribe(portraitPonchik);neznaika.subscribe(portraitToropigka);neznaika.subscribe(portraitPilulkin);
            }
            //korotishki wokeUp and saw portraits, neznaika shoots portraits if they don't like them
            pilulkin.wokeUp();
            pilulkin.viewPortrait(portraitGunki, gunka);
            pilulkin.viewPortrait(portraitGunki, ponchik);
            pilulkin.viewPortrait(portraitToropigka, toropigka);
            if (pilulkin.viewPortrait(portraitPilulkin, pilulkin)) {
                neznaika.hangUp(portraitPilulkin, "floor");
            }
            toropigka.wokeUp();
            toropigka.viewPortrait(portraitGunki, gunka);
            pilulkin.viewPortrait(portraitGunki, ponchik);
            if (toropigka.viewPortrait(portraitToropigka, toropigka)) {
                neznaika.hangUp(portraitToropigka, "floor");
            }
            ponchik.wokeUp();
            ponchik.viewPortrait(portraitGunki, gunka);
            if (ponchik.viewPortrait(portraitPonchik, ponchik)) {
                neznaika.hangUp(portraitPonchik, "floor");
            }
            tubik.wokeUp();
            //tubik picked up a brush and paints
            neznaika.thinks[0] = "";
            //neznaika hang up portrait gunki
            neznaika.hangUp(portraitGunki, "floor");
            //Author ask about Story Author finish Story
            narrator.exclaim();
            narrator.ask();
            System.out.println(narrator.finishStory());
            break;
        }
    }
}
