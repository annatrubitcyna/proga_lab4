package story;

import actions.Portrait;
import character.*;
import control.Author;
import enumeration.Colors;
import enumeration.How;
import enumeration.Speed;

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
                hasGunkaSat = gunka.sitTo(Speed.QUICKLY, "chair");
            }
            //if Gunka sat Neznaika draw him
            Portrait.Face PortraitGunki = null;
            if (hasGunkaSat) {
                PortraitGunki = neznaika.draw(gunka);
            }
            //if Neznaika draw Portrait Gunka wanted to see
            if (PortraitGunki != null) {
                gunka.wantedToSee(Speed.QUICKLY);
            }
            //Gunka sit restlessly and spin if his patience is small
            if (gunka.patience == 0) {
                gunka.sit(How.RESTLESSLY);
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
                gunka.sit(How.CALMLY);
            }
            //Neznaika add something to the portrait
            neznaika.drawDetail(PortraitGunki, Colors.PURPLE);
            //if portrait finished gunka want to see it and then Neznaika show it
            if (PortraitGunki.mustache != Colors.WHITE) {
            } else {
                break;
            }
            String gunkaExclaimShow = gunka.exclaim();
            if (gunkaExclaimShow.contains("Show me what happened")) {
                gunka.viewPortrait(PortraitGunki, gunka);
            }
            //if portrait is bed Gunka mood is bed and small, Neznaika starts to annoy him and if Neznaika say Ok he erases Portrait
            if (gunka.mood < 30) {
                neznaika.annoy(gunka);
                String gunkaExclaimAboutportrait = gunka.exclaim();
                if (gunkaExclaimAboutportrait.contains("Now erase what you drew!")) {
                    String neznaikaOk = neznaika.speak();
                    if (neznaikaOk.contains("Ok")) {
                        neznaika.erases(PortraitGunki);
                    }
                }
            }
            //Tubik draw Gunka when he wanted it
            String gunkaSaidTubik = gunka.speak();
            Portrait.Face NormalPortraitGunki = null;
            if (gunkaSaidTubik.contains("let the Tubik draw me")) {
                //Tubik draw new Gunka's portrait
                NormalPortraitGunki = tubik.draw(gunka);
            }
            //Gunka watch potret nif it's reddy
            if (NormalPortraitGunki != null) {
                gunka.viewPortrait(NormalPortraitGunki, gunka);
            }
            //if portrait is good Gunka mood is good and big
            if (gunka.mood > 30) {
                System.out.println(gunka.exclaim());
            }
            //neznaika draw any portrait
            neznaika.drawBodyPortrait(ponchik);
            neznaika.drawBodyPortrait(toropigka);
            neznaika.draw(pilulkin);


            //Author ask about Story Author finish Story
            narrator.exclaim();
            narrator.ask();
            System.out.println(narrator.finishStory());
            break;
        }
    }
}
