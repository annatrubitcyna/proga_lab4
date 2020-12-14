package actions;

import enumeration.Colors;
import enumeration.Material;
import exceptions.NoSparklingWaterException;

public class Car {
    /**
     * car components
     */
    private Material seat;
    private Material tank;
    private Material tube;
    private Material cylinder;
    private Material wheel;
    private Material syrupCan;
    private Material tubeWithCock;
    //amount of Fuel
    public int amountOfWater = 0;

    //Constructor usual normal car
    public Car() {
        this(Material.LEATHER, Material.IRON, Material.COPPER, Material.IRON, Material.RUBBER, Material.GLASS, Material.RUBBER);
    }

    /**
     * constructor of any car
     *
     * @param seat
     * @param tank
     * @param tube
     * @param cylinder
     * @param wheel
     * @param syrupCan
     * @param tubeWithCock
     */
    public Car(Material seat, Material tank, Material tube, Material cylinder, Material wheel, Material syrupCan, Material tubeWithCock) {
        this.seat = seat;
        this.tank = tank;
        this.tube = tube;
        this.cylinder = cylinder;
        this.wheel = wheel;
        this.syrupCan = syrupCan;
        this.tubeWithCock = tubeWithCock;
    }

    /**
     * inner class Gas, Piston and wheel: gear components
     */
    public class Gas {
        /**
         * String flows()
         *
         * @return word
         */
        String flows() {
            String word = "Gas flows throught the tube";
            return word;
        }

        /**
         * String pushes()
         *
         * @return word
         */
        String pushes() {
            String word = "Gas pushes piston";
            return word;
        }
    }

    public class Piston {
        /**
         * String move()
         *
         * @return word
         */
        String move() {
            String word = "Piston goes back and forth";
            return word;
        }
    }

    public class Wheel {
        /**
         * String rotate()
         *
         * @return word
         */
        String rotate() {
            String word = "Wheels rotate";
            return word;
        }
    }

    //The car drives after the mechanism is running
    private String go() {
        String word = "Car rides";
        System.out.println(word);
        return (word);
    }

    /**
     * The movement of the machine taking into account the operation of the mechanism
     */
    public String ride() throws NoSparklingWaterException {
        Gas gas = new Gas();
        Piston piston = new Piston();
        Wheel wheel = new Wheel();
        gas.flows();
        String push = gas.pushes();
        String move = "";
        //if gas pushes piston piston goes
        if (push.contains("piston")) {
            move = piston.move();
        }
        String rotate = "";
        //if piston goes wheels rotate
        if (move.contains("Piston goes")) {
            rotate = wheel.rotate();
        }
        String go = "";
        //if wheels rotate car go
        if (rotate.contains("rotate")) {
            if (this.amountOfWater >= 5) go = this.go();
            else {
                throw new NoSparklingWaterException("Not enough fuel, refuel the car!");
            }
        }
        return go;
    }

}
