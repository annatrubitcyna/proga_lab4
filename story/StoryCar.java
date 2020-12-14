package story;

import actions.Car;
import actions.Portrait;
import character.*;
import control.Author;
import enumeration.Colors;
import enumeration.How;
import enumeration.Speed;
import exceptions.NoSparklingWaterException;

public class StoryCar implements Story {
    public String name = "How Neznaika rode a gas car";

    @Override
    public void story() throws NoSparklingWaterException {
        //there are conditions under which the cycle will break
        while (true) {
            Author narrator = new Author(); //create Author this story
            narrator.startStory(4, this.name); //author start story
            //create heroes story
            Neznaika neznaika = new Neznaika();
            Mechanic.Vintik vintik = new Mechanic.Vintik();
            Mechanic.Shpuntik spuntic = new Mechanic.Shpuntik();

            //they tinkering car
            Car newCar = vintik.tinkeringCar();
            //they fill car
            spuntic.fill(newCar);
            //car ride
            newCar.ride();

            //Author ask about Story Author finish Story
            narrator.ask();
            System.out.println(narrator.finishStory());
            break;
        }
    }
}
