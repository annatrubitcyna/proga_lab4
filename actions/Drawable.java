package actions;

import character.Korotishki;
import enumeration.Colors;

public interface Drawable {
    /**
     * draw
     *
     * @param korotishki
     * @return Portrait.Face
     */
    Portrait.Face draw(Korotishki korotishki);

    /**
     * drawBodyPortrait
     *
     * @param korotishki
     * @return Portrait.Body
     */
    Portrait.Body drawBodyPortrait(Korotishki korotishki);

    /**
     * @param portrait
     * @param color
     * @return Portrait
     */
    Portrait.Face drawDetail(Portrait.Face portrait, Colors color);

    /**
     * erases portrait
     *
     * @param portrait
     * @return white portrait
     */
    default Portrait erases(Portrait.Face portrait) {
        portrait.nose = Colors.WHITE;
        portrait.ears = Colors.WHITE;
        portrait.lips = Colors.WHITE;
        portrait.eyes = Colors.WHITE;
        //if character erases the portrait the all in the portraits is white
        return portrait;
    }

}
