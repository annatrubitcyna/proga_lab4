package character;

public class Gusla extends Korotishki {
    //if there isn't name of character, his name is Gusla
    //he has any thinks
    public Gusla() {
        this("Gusla");
        this.thinks = new String[]{"balalaika", "violin", "trumpet" };
    }


    /**
     * constructor
     *
     * @param name
     * @brief Creates Gusla with a certan name
     */
    public Gusla(String name) {
        super(name);
    }

}
