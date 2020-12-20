package character;

public class Beetle {

    /**
     * constructor Bettle
     */
    public Beetle() {
    }

    /**
     * void fly
     *
     * @return word
     */
    public String fly() {
        String word = "Beetle fly.";
        System.out.println(word);
        return (word);
    }

    /**
     * void hit
     *
     * @param korotishka
     * @return word
     */
    public String hit(Korotishki korotishka) {
        String word = "Bettle hit " + korotishka.name + " on the head.";
        System.out.println(word);
        return (word);
    }
}
