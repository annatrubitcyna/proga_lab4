package character;

public class Malishki extends Korotishki {
    /**
     * @brief constructor which create malishka without name
     */
    public Malishki() {
        this("Malishka");
    }

    /**
     * @param name
     * @brief constructor whith name
     */
    public Malishki(String name) {
        super(name);
    }

    /**
     * field power
     *
     * @brief used if there is fight or some people offends
     */
    int power = 1;

    /**
     * @param think
     * @return boolean
     */
    public boolean seeing(String think) {
        if (think.equals("orange shirt")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @return word
     */
    public String turned() {
        String word = "Malishkui immediately turned in the opposite direction and hid in their homes.";
        System.out.println(word);
        return word;
    }
}
