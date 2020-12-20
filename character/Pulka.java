package character;

import enumeration.Thickness;

public class Pulka extends Korotishki {
    /**
     * constructor
     *
     * @brief sets the parameters
     */
    public Pulka() {
        super("Pulka");
        Dog bulka = new Dog();
        Gun gun = new Gun();
        this.thinks = new String[]{bulka.name, gun.name};
    }

    public static class Dog {
        public String name;
        Thickness size = Thickness.SMALL;

        public Dog() {
            this.name = "Bulka";
        }
    }

    public static class Gun {
        String name = "a gun that shot corks";
        String bullets = "corks";

        public Gun() {
        }

        /**
         * shoot
         *
         * @return word
         * @brief depends of bullets
         */
        String shoot() {
            String word = "gun shoot " + bullets;
            System.out.println(word);
            return word;
        }
    }
}
