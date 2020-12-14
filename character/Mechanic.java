package character;

import actions.Car;

public class Mechanic extends Korotishki {
    int growth;

    //if there isn't name of character, his name is Mechanic
    public Mechanic() {
        this("Mechanic");
        this.thinks = new String[]{"screwdrivers", "nuts", "hammer" };
    }

    /**
     * constructor
     *
     * @param name
     */
    public Mechanic(String name) {
        super(name);
    }

    /**
     * Car method tinkering Car
     * create new car
     *
     * @return car
     */
    public Car tinkeringCar() {
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
