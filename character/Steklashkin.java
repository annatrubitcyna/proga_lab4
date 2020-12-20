package character;

import actions.Dialogue;
import control.Time;
import enumeration.HowComparison;
import enumeration.Material;

public class Steklashkin extends Korotishki implements Dialogue {
    /**
     * constructor
     *
     * @brief sets the parameters
     */
    public Steklashkin() {
        super("Steklashkin");
        this.famous = HowComparison.VERY;
    }


    static class Glasses {
        public boolean magnifying;

        /**
         * constructor
         *
         * @param magnifying
         */
        public Glasses(boolean magnifying) {
            this.magnifying = magnifying;
        }

        public void doObjectLarger() {
            String word = "The objects seemed larger.";
        }
    }

    /**
     * make magnifying glasses
     *
     * @return glasses
     */
    public Glasses makeMagnifyingGlasses() {
        class Bottle {
            boolean whole = true;

            /**
             * @brief if bootle broke whole will be false
             */
            public void broke() {
                this.whole = false;
            }
        }
        Bottle bottle = new Bottle();
        bottle.broke();
        if (bottle.whole == false) {
            Glasses magnifyingGlasses = new Glasses(true);
            return magnifyingGlasses;
        } else {
            Glasses normalGlasses = new Glasses(false);
            return normalGlasses;
        }
    }

    /**
     * make telescope
     *
     * @param glassFirst-material
     * @param glassSecond-material
     * @return word
     */
    public String makeTelescope(Glasses glassFirst, Glasses glassSecond) {
        String word;
        if (glassFirst.magnifying & glassSecond.magnifying) {
            word = "Steklyashkin made a large telescope, through which one could look at the moon and the stars.";
        } else {
            word = "Steklyashkin can't made a large telescope, through which one couldn't look at the moon and the stars.";
        }
        return word;
    }

    /**
     * became astronomer
     *
     * @return word
     */
    public String becameAstronomer() {
        String word = " Thus he became an astronomer.";
        System.out.println(word);
        return word;
    }

    //Steklashkin can speak, exclaim and ask in the story different words at different moments in story
    @Override
    public String speak() {
        String word = "";
        System.out.print(name + " said:    ");
        Time.getInstance().time += 1;
        if (Time.getInstance().time == 105) {
            word = "If a chunk of the sun came off, it would crush you to a pulp. The sun is very big. It is bigger than our entire Earth.";
        }
        System.out.println(word);
        return word;
    }

    @Override
    public String exclaim() {
        String word = "";
        System.out.print(name + " exclaim:    ");
        Time.getInstance().time += 1;
        System.out.println(word);
        return word;
    }

    @Override
    public String ask() {
        String word = "";
        System.out.print(name + " ask:    ");
        Time.getInstance().time += 1;
        System.out.println(word);
        return word;
    }

}
