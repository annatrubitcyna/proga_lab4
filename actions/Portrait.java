package actions;

import enumeration.Colors;
import enumeration.Thickness;

import java.util.Objects;

public class Portrait {
    //portrait can't do something, but it is used by characters
    public String name;
    public String subscribe;

    //there are 2 inner static class face and body portrait
    public static class Face extends Portrait {
        /**
         * fields part of the face
         */
        public Colors nose, ears, lips, eyes, mustache;

        /**
         * initially, everything in the portrait is white
         */
        public Face() {
            this("Portrait", Colors.WHITE, Colors.WHITE, Colors.WHITE, Colors.WHITE, Colors.WHITE);
        }

        /**
         * initially, everything in the portrait is white
         */
        public Face(String name) {
            this(name, Colors.WHITE, Colors.WHITE, Colors.WHITE, Colors.WHITE, Colors.WHITE);
        }

        /**
         * constructor
         *
         * @param nose
         * @param ears
         * @param lips
         * @param eyes
         * @param mustache
         */
        public Face(String name, Colors nose, Colors ears, Colors lips, Colors eyes, Colors mustache) {
        }

        /**
         * equals parts of portrait
         *
         * @param obj
         * @return boolean
         */
        public boolean equals(Face obj) {
            return this.nose.equals(obj.nose) & this.ears.equals(obj.ears) & this.lips.equals(obj.lips) & this.eyes.equals(obj.eyes) & this.mustache.equals(obj.mustache);
        }
    }

    public static class Body extends Portrait.Face {
        /**
         * fields part of the body portrait
         */
        public Thickness had, legs, arms, belly, tail;

        /**
         * initially, everything in the portrait is white
         */
        public Body() {
            this("Portrait", Thickness.NOT, Thickness.NOT, Thickness.NOT, Thickness.NOT, Thickness.NOT);
        }

        /**
         * initially, everything in the portrait is white
         */
        public Body(String name) {
            this(name, Thickness.NOT, Thickness.NOT, Thickness.NOT, Thickness.NOT, Thickness.NOT);
        }

        /**
         * constructor
         *
         * @param name
         * @param had
         * @param legs
         * @param arms
         * @param belly
         * @param tail
         */
        public Body(String name, Thickness had, Thickness legs, Thickness arms, Thickness belly, Thickness tail) {
            this.name = name;
            this.had = had;
            this.legs = legs;
            this.arms = arms;
            this.belly = belly;
            this.tail = tail;
        }

        /**
         * equals parts of portrait
         *
         * @param obj
         * @return boolean
         */
        public boolean equals(Body obj) {
            return this.had.equals(obj.had) & this.legs.equals(obj.legs) & this.arms.equals(obj.arms) & this.belly.equals(obj.belly) & this.tail.equals(obj.tail);
        }
    }


    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return this.name;
    }
}
