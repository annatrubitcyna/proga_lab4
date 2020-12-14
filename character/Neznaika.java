package character;

import actions.Dialogue;
import actions.Drawable;
import actions.Portrait;
import control.Time;
import enumeration.Colors;
import enumeration.Thickness;

import java.util.HashMap;
import java.util.Map;

import static enumeration.Colors.*;

public class Neznaika extends Korotishki implements Drawable, Dialogue {
    //if there isn't name of character, his name is Neznaika
    public Neznaika() {
        this("Neznaika");
        this.thinks = new String[]{"" };
    }

    /**
     * constructor
     *
     * @param name
     * @brief Creates Neznaika with a certan name
     */
    public Neznaika(String name) {
        super(name);
    }


    /**
     * a lot of String methods: walk, trundle, goHome, run, cry
     *
     * @return word
     */
    public String walk() {
        String word = "Neznaika walk and go to field.";
        System.out.println(word);
        return (word);
    }

    public String trundle() {
        String word = "Neznaika trundle.";
        System.out.println(word);
        return (word);
    }

    public String goHome() {
        String word = "Neznaika go home.";
        System.out.println(word);
        return (word);
    }

    public String run() {
        String word = "Neznaika run.";
        System.out.println(word);
        return (word);
    }

    public String cry(String word) {
        System.out.println(word);
        return (word);
    }

    /**
     * String methods (play in Musician instruments): strum, scrape, blow
     *
     * @return word
     */
    public void strum() {
        System.out.println("Neznaika start to strum.");
    }

    public void scrape() {
        System.out.println("Neznaika start to scrape.");
    }

    /**
     * void blow
     */
    public void blow() {
        System.out.println("Neznaika start to blow.");
        /**
         * lockal class Tumped
         * doing something if Dunno blow
         */
        class Tumpet {
            public Tumpet() {
            }

            public void roar() {
                System.out.println("Tumpet roar.");
            }

            public void roared() {
                System.out.println("Tumpet roared.");
            }

            public void wheezed() {
                System.out.println("Tumpet wheezed.");
            }

            public void screamed() {
                System.out.println("Tumpet scremed.");
            }

            public void grunted() {
                System.out.println("Tumpet grunted.");
            }
        }
        Tumpet tumpet = new Tumpet();
        tumpet.grunted();
        tumpet.roar();
        tumpet.roared();
        tumpet.wheezed();
        tumpet.screamed();
    }

    /**
     * String method ask to give
     *
     * @param korotishka
     * @return word
     */
    public String askToGive(Korotishki korotishka) {
        String word = "Neznaika began to ask the " + korotishka.name + " to give him tool";
        System.out.println(word);
        return word;
    }

    //Neznaika create new portrait and draw some character
    @Override
    public Portrait.Face draw(Korotishki korotishka) {
        if (korotishka.name == "Gunka") {
            System.out.println(", and " + name + " began to draw it.");
            Portrait.Face portraitGunki = new Portrait.Face("PortraitGunki");
            portraitGunki.nose = RED;
            portraitGunki.ears = GREEN;
            portraitGunki.lips = BLUE;
            portraitGunki.eyes = ORANGE;
            System.out.println(name + " wanted to make Gunka look prettier, so he drew him a " + portraitGunki.nose.toString() + " nose, " + portraitGunki.ears.toString() + " ears, " + portraitGunki.lips.toString() + " lips, and " + portraitGunki.eyes.toString() + " eyes.");
            return portraitGunki;
        }
        if (korotishka.name == "Pilulkin") {
            System.out.println(name + " began to draw " + korotishka.name);
            Portrait.Face portraitPilulkin = new Portrait.Face("PortraitPilulkin");
            portraitPilulkin.nose = RED;
            portraitPilulkin.ears = SKIN;
            portraitPilulkin.lips = RED;
            portraitPilulkin.eyes = BLUE;
            return portraitPilulkin;
        }
        return null;
    }

    @Override
    public Portrait.Body drawBodyPortrait(Korotishki korotishki) {
        if (korotishki.name == "Ponchik") {
            System.out.println(name + " began to draw " + korotishki.name);
            Portrait.Body portraitPonchik = new Portrait.Body("PortraitPonchik", Thickness.THICK, Thickness.THICK, Thickness.THICK, Thickness.THICK, Thickness.THICK);
            return portraitPonchik;
        }
        if (korotishki.name == "Toropigka") {
            System.out.println(name + " began to draw " + korotishki.name);
            Portrait.Body portraitToropigka = new Portrait.Body("PortraitToropigka");
            portraitToropigka.arms = Thickness.NORMAL;
            portraitToropigka.belly = Thickness.NORMAL;
            portraitToropigka.had = Thickness.NORMAL;
            portraitToropigka.legs = Thickness.THIN;
            return portraitToropigka;
        }
        return null;
    }

    //Neznaika add something to the portrait
    @Override
    public Portrait.Face drawDetail(Portrait.Face portrait, Colors color) {
        portrait.mustache = color;
        System.out.println(" and added a " + portrait.mustache.toString().toLowerCase() + " mustache.");
        return portrait;
    }

    //Neznaika can speak, exclaim and ask in the story different words at different moments in story


    @Override
    public String speak() {
        String word = "";
        System.out.print(name + " said:    ");
        Time.getInstance().time += 1;
        if (Time.getInstance().time == 2) {
            word = "- Sit down Gunka, I'll draw you now.";
        }
        if (Time.getInstance().time == 3) {
            word = "- Don't move, don't move. It doesn't look like it's going to work.";
        }
        if (Time.getInstance().time == 8) {
            word = "- Ok, ok, don't worry";
        }
        if (Time.getInstance().time == 103) {
            word = "So it was something that fell on me from the sun. A piece of the sun must have come off and hit me on the head";
        }
        if (Time.getInstance().time == 104) {
            word = "Listen, Steklyashkin. You know what the story is: a piece of the sun broke off and hit me on the head.";
        }
        System.out.println(word);
        return word;
    }

    @Override
    public String exclaim() {
        String word = "";
        System.out.print(name + " exclaim:    ");
        Time.getInstance().time += 1;
        if (Time.getInstance().time == 5) {
            word = "- It looks like it!";
        }
        System.out.println(word);
        return word;
    }

    @Override
    public String ask() {
        String word = "";
        System.out.print(name + " ask:    ");
        Time.getInstance().time += 1;
        if (Time.getInstance().time == 102) {
            word = "Who hit me? Did something fall from above?";
        }
        System.out.println(word);
        return word;
    }

    /**
     * void annoy
     * reduces Gunka's mood
     *
     * @param gunka
     */
    public void annoy(Gunka gunka) {
        gunka.mood -= 10;
    }
}
