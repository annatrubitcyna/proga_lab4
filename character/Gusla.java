package character;

import enumeration.HowGood;

public class Gusla extends Korotishki {
    /**
     * constructor
     *
     * @brief sets the parameters inherent Gunka
     */
    public Gusla() {
        super("Gusla");
        this.thinks = new String[]{"balalaika", "violin", "trumpet"};
        this.clothes = new String[]{"velvet jacket", "pink bow"};
        this.profession = "musician";
        this.howGoodProfessional = HowGood.GOOD;
    }

    /**
     * boolean void
     *
     * @return true
     */
    public boolean playMusic() {
        System.out.println(this.name + " play music ");
        return true;
    }

    /**
     * listen korotishka
     *
     * @param korotishka
     * @return word
     */
    public String listen(Korotishki korotishka) {
        String word = this.name + " listen " + korotishka.name;
        System.out.println(word);
        return word;
    }

    /**
     * tried of
     *
     * @return word
     */
    public String triedOf() {
        String word = this.name + " tried of this ";
        System.out.println(word);
        return word;
    }

    /**
     * go to visit
     *
     * @return word
     */
    public String goToVisit() {
        String word = this.name + " go to visit ";
        System.out.println(word);
        return word;
    }
}
