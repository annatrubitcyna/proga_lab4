package character;

import actions.Car;
import actions.Think;

public class Mechanic extends Korotishki {
    int growth;

    /**
     * constructor
     *
     * @param name
     */
    public Mechanic(String name) {
        super(name);
    }

    /**
     * constructor
     *
     * @brief sets the parameters inherent Mechanic
     */
    public Mechanic() {
        this("Mechanic");
        this.thinks = new String[]{"screwdrivers", "nuts", "hammer", "wrenches", "pliers", "files"};
        this.clothes = new String[]{"leather jacket", "leathers hats with gasses canned food"};
    }

    /**
     * repair
     *
     * @param think
     * @brief do think not broken
     */
    public void repair(Think think) {
        if (think.isBroken == false) {
            think.isBroken = true;
        }
    }

    /**
     * doing
     *
     * @param name
     * @return
     * @brief create new think
     */
    public Think doing(String name) {
        Think think = new Think(name);
        return think;
    }

    /**
     * a lot of method for doing something
     */
    void saw() {
        System.out.println(this.name + " saw");
    }

    void plan() {
        System.out.println(this.name + " plan");
    }

    void rivet() {
        System.out.println(this.name + " rivet");
    }

    void solder() {
        System.out.println(this.name + " solder");
    }

    void closed() {
        System.out.println(this.name + " didn't say anything to anyone, closed in their workshop and didn't live for a month");
    }

    /**
     * Car method tinkering Car
     * create new car
     *
     * @return car
     */
    public Car tinkeringCar() {
        this.closed();
        this.saw();
        this.plan();
        this.rivet();
        this.solder();
        System.out.println(this.name + " turing car");
        Car new_car = new Car();
        return new_car;
    }

    /**
     * fill car
     * enlarge amount of water
     *
     * @param car
     */
    public void fill(Car car) {
        car.amountOfWater += 10;
    }

    /**
     * two irrin class Vintik and Spuntik
     * it's different growth
     */
    public static class Vintik extends Mechanic {
        //if there isn't name of character, his name is Vintik
        public Vintik() {
            this("Vintik");
        }

        /**
         * constructor
         *
         * @param name
         */
        public Vintik(String name) {
            super(name);
            this.growth = 10;
        }
    }

    public static class Shpuntik extends Mechanic {
        //if there isn't name of character, his name is Spuntik
        public Shpuntik() {
            this("Shpuntik");
        }

        /**
         * constructor
         *
         * @param name
         */
        public Shpuntik(String name) {
            super(name);
            this.growth = 9;
        }
    }

}
