package character;

import actions.Portrait;
import enumeration.Colors;
import enumeration.HowComparison;
import enumeration.HowGood;
import enumeration.Thickness;
import exceptions.ThingArrayIndexOutOfBoundsException;

public abstract class Korotishki {
    /**
     * constructor for heirs
     *
     * @param name
     */
    public Korotishki(String name) {
        this.name = name;
    }

    public final String name;
    public String profession;
    public HowGood howGoodProfessional;
    public Korotishki friend;
    public int power = 5;
    public HowComparison famous;
    ;
    public int mood = 50;
    public String[] thinks = {};
    public String[] clothes = {};
    public boolean healthy = true;
    /**
     * fields part of the face
     */
    private final Colors nose = Colors.SKIN, ears = Colors.SKIN, lips = Colors.RED, eyes = Colors.BLUE, mustache = Colors.WHITE; //usually characters has skin face and hasn't mustach
    private final Thickness had = Thickness.NORMAL,arms = Thickness.NORMAL,legs = Thickness.NORMAL,belly = Thickness.NORMAL,tail = Thickness.NOT;

    /**
     * void live
     */
    public String live() {
        return ("There is " + name + " in Sunny city. ");
    }

    public boolean ill() {
        this.healthy = false;
        return this.healthy;
    }

    /**
     * void lauph
     * increases mood
     */
    public void laugh() {
        mood += 10;
    }

    /**
     * woke up
     * @return word
     */
    public String wokeUp() {
        String word = this.name + " woke up";
        System.out.println(word);
        return word;
    }

    /**
     * run to the noise
     * @return word
     */
    public String runToTheNoise() {
        String word = this.name + " run to the noise";
        System.out.println(word);
        return word;
    }

    /**
     * fight
     * @param korotishki -fight whith
     * @return word
     */
    public String fight(Korotishki korotishki) {
        String word = this.name + " start fight with " + korotishki.name;
        System.out.println(word);
        return word;
    }

    /**
     * love
     * @param think-what you love or not
     * @return boolean
     */
    public boolean love(String think) {
        return think.equals("music");
    }

    /**
     * praise
     * @param korotishki-who do you praise
     */
    public void praise(Korotishki korotishki) {
        korotishki.mood += 5;
    }

    /**
     * String method meet
     *
     * @param korotishka-who do you meet
     * @return word
     */
    public String meet(Korotishki korotishka) {
        String word = this.name + " meet " + korotishka.name;
        System.out.println(word);
        return word;
    }

    /**
     * String method grab thinks
     *
     * @return word
     */
    public String grabThinks() {
        String word;
        for (int i = 0; i < this.thinks.length - 1; i++) {
            word =  this.name + " grab "+this.thinks[i] + " and ";
        }
        word =  this.name + " grab "+this.thinks[this.thinks.length - 1];
        System.out.println(word);
        return word;
    }
    /**
     * void give
     *
     * @param korotishka
     * @param think
     */
    public void give(Korotishki korotishka, String think) {
        //if corotishka has thinks his first think is this else it will be exception
        try {
            System.out.println(this.name + " give " + think);
            korotishka.thinks[0] = think;
        } catch (ArrayIndexOutOfBoundsException a) {
            throw new ThingArrayIndexOutOfBoundsException("This character cannot be given a think!", a);
        }
    }

    /**
     * listen musik
     * @brief if korotishka love musik and gusla play korotishka praise him
     * @param gusla
     * @return word
     */
    public String listenMusic(Gusla gusla) {
        String word;
        if (gusla.playMusic() & this.love("music")) {
            this.mood += 5;
            this.praise(gusla);
            word = this.name + " listen to music and praise " + gusla.name;
        } else {
            word = this.name + " don't listen to music";
        }
        return word;
    }

    /**
     * going home
     * @return word
     */
    public String goingHome() {
        String word = this.name + " going home";
        System.out.println(word);
        return word;
    }

    /**
     * @param korFirst-korotishki who go home
     * @return word
     */
    public String goingHomeAll(Korotishki korFirst, Korotishki korSecond, Korotishki korThird, Korotishki korFourth, Korotishki korFiveth, Korotishki korSixth, Korotishki korSeventh) {
        this.goingHome();
        korFirst.goingHome();
        korSecond.goingHome();
        korThird.goingHome();
        korFourth.goingHome();
        korFiveth.goingHome();
        korSixth.goingHome();
        korSeventh.goingHome();
        String word = "all going home";
        System.out.println(word);
        return word;
    }


    /**
     * void viewPortrait
     * if his portrait look like he his mood is good, but else it is very bed and any character laugh
     *
     * @param portrait-portrait which dp you see
     * @param person-person whoes is thith portrait
     */
    public boolean viewPortrait(Portrait.Face portrait, Korotishki person) {
        if (portrait.eyes == this.eyes & portrait.nose == this.nose & portrait.ears == this.ears & portrait.lips == this.lips & portrait.mustache == this.mustache) {
            if (person.name.equals(this.name)) {
                this.mood += 50;
                return true;
            }
        } else {
            if (person.name.equals(this.name)) {
                this.mood -= 50;
                return false;
            } else {
                this.laugh();
                return true;
            }
        }
        System.out.println(name + " view portrait ");
        return true;
    }

    public boolean viewPortrait(Portrait.Body portrait, Korotishki person) {
        if (portrait.had == this.had & portrait.arms == this.arms & portrait.belly == this.belly & portrait.legs == this.legs & portrait.tail == this.tail) {
            if (person.name.equals(this.name)) {
                this.mood += 50;
                return true;
            }
        } else {
            if (person.name.equals(this.name)) {
                this.mood -= 50;
                return false;
            } else {
                this.laugh();
                return true;
            }
        }
        System.out.println(name + " view portrait ");
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        return this.getClass().equals(obj.getClass());
    }

    @Override
    public String toString() {
        return this.name;
    }
}
