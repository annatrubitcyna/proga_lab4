package story;

import actions.Car;
import actions.Portrait;
import character.*;
import control.Author;
import enumeration.Colors;
import enumeration.HowCalmly;
import enumeration.HowSpeed;

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
            Gunka gunka = new Gunka();
            Tubik tubik = new Tubik();
            Gusla gusla = new Gusla();
            Ponchik ponchik = new Ponchik();
            Pilulkin pilulkin = new Pilulkin();
            Steklashkin steklashkin = new Steklashkin();
            Znaika znaika=new Znaika();
            //heroes enter into the story
            System.out.println(neznaika.live() + gusla.live());
            //Author speak
            String speakNarratorBegginer = narrator.speak();
            //if autor speak about Neznaika he doing something in the story
            if (speakNarratorBegginer.contains("Neznaika")) {
            } else {
                break;
            }
            String neznaikaJealous = "";
            if (pilulkin.listenMusic(gusla).equals("prise Gunki")){
                neznaikaJealous=neznaika.jealous(gusla);
            }
            String neznaikaAskToGive="";
            if (neznaikaJealous.contains("Neznaika equals Gunka")) {
                neznaikaAskToGive=neznaika.askToGive(gusla);
            }
            if (neznaikaAskToGive.contains("Gusla")) {
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
            String guslaListen=gusla.listen(neznaika);
            String guslaTriedOf="";
            if(guslaListen.contains("Neznaika")){
                guslaTriedOf=gusla.triedOf();
            }
            if (guslaTriedOf.contains("")){
                gusla.goToVisit();
            }
            String allGoingHome=neznaika.goingHomeAll(gunka,tubik,gusla,ponchik,pilulkin,steklashkin, znaika);
            if (allGoingHome.contains("all going home")){
                neznaika.blow();
            }
            String neznaikaGoOutside=neznaika.goOutside();
            String neznaikaPlayTube="";
            if (neznaikaGoOutside.contains("go out")){
                neznaikaPlayTube=neznaika.playTube("at the next house");
            }
            Neighbors firstNeigbours=new Neighbors();
            String neigboursAskTo="";
            if (neznaikaPlayTube.contains("at the next house")){
                neigboursAskTo=firstNeigbours.askTo("do not make noise under the windows");
            }
            if (neigboursAskTo.contains("do not make noise under the windows")){
                neznaikaPlayTube=neznaika.playTube("at the second house");
            }
            Neighbors secondNeigbours=new Neighbors();
            if (neznaikaPlayTube.contains("at the second house")){
                neigboursAskTo=secondNeigbours.kickOut();
            }
            if (neigboursAskTo.contains("go away")){
                neznaikaPlayTube=neznaika.playTube("at the third house");;
            }
            Neighbors thirdNeigbours=new Neighbors();
            if (neznaikaPlayTube.contains("at the third house")){
                neigboursAskTo=thirdNeigbours.kickOut();
            }

            if (neigboursAskTo.contains("go away")){
                neznaikaPlayTube=neznaika.playTube("this");
            }
            String neigboursGotAngry="";
            if (neznaikaPlayTube.contains("this")){
                neigboursGotAngry=thirdNeigbours.gotAngry()+thirdNeigbours.runOut()+thirdNeigbours.chased();
            }
            if (neigboursGotAngry.contains("chased")) {
                neznaika.run();
            }
            //Author ask about Story Author finish Story
            narrator.exclaim();
            narrator.ask();
            System.out.println(narrator.finishStory());
            break;
        }
    }
}
