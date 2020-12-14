package character;

public class Toropigka extends Korotishki {
    //if there isn't name of character, his name is Pilulkin
    public Toropigka() {
        this("Toropigka");
        this.thinks = new String[]{"" };
    }

    /**
     * constructor
     *
     * @param name
     * @brief Creates Pilulkin with a certan name
     */
    public Toropigka(String name) {
        super(name);
    }
}
