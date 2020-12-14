package character;

public class Pilulkin extends Korotishki{
    //if there isn't name of character, his name is Pilulkin
    public Pilulkin() {
        this("Pilulkin");
        this.thinks= new String[]{"aid kit" };
    }

    /**
     * constructor
     *
     * @param name
     * @brief Creates Pilulkin with a certan name
     */
    public Pilulkin(String name) {
        super(name);
    }
}
