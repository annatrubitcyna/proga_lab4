package character;

public class Neighbors extends Korotishki {
    /**
     * constructor
     *
     * @brief neighbours don't have name
     */
    public Neighbors() {
        super("neighbours");
    }

    /**
     * ask to do something
     *
     * @param thing
     * @return word
     */
    public String askTo(String thing) {
        String word = this.name + " ask to " + thing;
        System.out.println(word);
        return word;
    }

    /**
     * kick out
     *
     * @return word
     */
    public String kickOut() {
        return this.askTo("go away");
    }

    /**
     * @return word;
     * @brief do less this mood
     */
    public String gotAngry() {
        this.mood -= 15;
        String word = this.name + " got angry";
        System.out.println(word);
        return word;
    }

    /**
     * run out
     *
     * @return word
     */
    public String runOut() {
        String word = this.name + " run out";
        System.out.println(word);
        return word;
    }

    /**
     * chased
     *
     * @return word
     */
    public String chased() {
        String word = this.name + " chased";
        System.out.println(word);
        return word;
    }
}
