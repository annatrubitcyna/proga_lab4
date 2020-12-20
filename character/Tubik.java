package character;

import actions.Drawable;
import actions.Portrait;
import enumeration.Colors;
import enumeration.HowGood;

public class Tubik extends Korotishki implements Drawable {
    /**
     * constructor
     *
     * @brief sets the parameters
     */
    public Tubik() {
        super("Tubik");
        this.thinks = new String[]{"paint", "brush", "easel", "palette" };
        this.clothes=new String[]{"long blouse-hoodie", "long hair"};
        this.profession="artist";
        this.howGoodProfessional= HowGood.GOOD;
    }


    //Tubik create new portrait and draw some character
    @Override
    public Portrait.Face draw(Korotishki korotishka) {
        Portrait.Face portraitGunki = new Portrait.Face();
        portraitGunki.nose = Colors.SKIN;
        portraitGunki.ears = Colors.SKIN;
        portraitGunki.lips = Colors.RED;
        portraitGunki.eyes = Colors.BLUE;
        System.out.println(name + " wanted to make Gunka look prettier, so he drew him a " + portraitGunki.nose.toString() + " nose, " + portraitGunki.ears.toString() + " ears, " + portraitGunki.lips.toString() + " lips, and " + portraitGunki.eyes.toString() + " eyes.");
        return portraitGunki;
    }

    @Override
    public Portrait.Body drawBodyPortrait(Korotishki korotishki) {
        return null;
    }

    //Tubik add something to the portrait
    @Override
    public Portrait.Face drawDetail(Portrait.Face portrait, Colors color) {
        portrait.mustache = color;
        System.out.println(name + " added a " + portrait.mustache.toString().toLowerCase() + " mustache.");
        return portrait;
    }
}