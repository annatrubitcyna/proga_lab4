package character;

import actions.Portrait;
import enumeration.Colors;
import exceptions.ThingArrayIndexOutOfBoundsException;

public abstract class Korotishki {
    /**
     * field name
     */
    public final String name;
    /**
     * field mood
     */
    public int mood = 50;

    /**
     * field thinks
     */
    public String thinks[] = {};
    //usually characters has skin face and hasn't mustache
    /**
     * fields part of the face
     */
    private Colors nose = Colors.SKIN;
    private Colors ears = Colors.SKIN;
    private Colors lips = Colors.RED;
    private Colors eyes = Colors.BLUE;
    private Colors mustache = Colors.WHITE;

    /**
     * constructor for heirs
     *
     * @param name
     */
    public Korotishki(String name) {
        this.name = name;
    }

    //let create heroes story

    /**
     * void live
     */
    public String live() {
        return ("There is " + name + " in Sunny city. ");
    }

    /**
     * String method meet
     *
     * @param korotishka
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
        String word = this.name + " grab ";
        for (int i = 0; i < this.thinks.length - 1; i++) {
            word += this.thinks[i] + " and ";
        }
        word += this.thinks[this.thinks.length - 1];
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
     * void lauph
     * increases mood
     */
    public void laugh() {
        mood += 10;
    }

    //if his portrait look like he his mood is good, but else it is very bed and any character laugh

    /**
     * void viewPortrait
     * if his portrait look like he his mood is good, but else it is very bed and any character laugh
     *
     * @param portrait
     * @param person
     */
    public void viewPortrait(Portrait.Face portrait, Korotishki person) {
        if (portrait.eyes == this.eyes & portrait.nose == this.nose & portrait.ears == this.ears & portrait.lips == this.lips & portrait.mustache == this.mustache) {
            if (person.name == this.name) {
                this.mood += 50;
            }
        } else {
            if (person.name == this.name) {
                this.mood -= 50;
            } else {
                this.laugh();
            }
        }
        System.out.println(name + " view portrait ");
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
