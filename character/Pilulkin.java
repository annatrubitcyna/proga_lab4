package character;

public class Pilulkin extends Korotishki{
    /**
     * constructor
     *
     * @brief sets the parameters inherent Pilulkin
     */
    public Pilulkin() {
        super("Pilulkin");
        this.thinks= new String[]{"aid kit" };
        this.clothes= new String[]{"white coat", "white cap with a tassel" };
    }

    /**
     * treat
     * @brief can do korotishki healthy
     * @param korotishki
     * @return word
     */
    public String treat(Korotishki korotishki){
        if (korotishki.healthy==false){
            korotishki.healthy=true;
        }
        String word=this.name+" treat "+korotishki.name;
        System.out.println(word);
        return word;
    }
}
