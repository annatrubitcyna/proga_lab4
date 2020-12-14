package character;

public class Ponchik extends Korotishki{
    //if there isn't name of character, his name is Ponchik
    public Ponchik() {
        this("Ponchik");
        this.thinks= new String[]{"galoshes", "umbrella" };
    }

    /**
     * constructor
     *
     * @param name
     * @brief Creates Ponchik with a certan name
     */
    public Ponchik(String name) {
        super(name);
    }
}
