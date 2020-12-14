package character;

import character.Korotishki;
import enumeration.How;
import enumeration.Speed;

public class Beetle {

    //constructor Bettle
    public Beetle() {
    }

    /**
     * void fly
     */
    public String fly() {
        String word = "Beetle fly.";
        System.out.println(word);
        return (word);
    }

    /**
     * void hit
     */
    public String hit(Korotishki korotishka) {
        String word = "Bettle hit " + korotishka.name + " on the head.";
        System.out.println(word);
        return (word);
    }
}
