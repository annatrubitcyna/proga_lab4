package character;

public class Siropchik extends Korotishki {
    boolean polite = true;

    /**
     * constructor
     *
     * @brief sets the parameters
     */
    public Siropchik() {
        super("Saccharin Saccharinich Siropchik");
    }

    String famos = "being very fond of carbonated water with syrup";

    /**
     * became famous
     * depends of field famous
     *
     * @return word
     */
    public String becameFamous() {
        String word = this.famos;
        System.out.println(word);
        return word;
    }

    @Override
    public boolean love(String food) {
        if (food.equals("carbonated water with syrup")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * call
     *
     * @param name-haw his called
     * @return boolean
     */
    public boolean call(String name) {
        if (name.equals("Saccharin Saccharinich")) {
            return true;
        } else {
            return false;
        }
    }
}
