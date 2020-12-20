package character;

import actions.Poet;

public class Zvetik extends Korotishki implements Poet {
    /**
     * constructor
     *
     * @brief sets the parameters
     */
    public Zvetik() {
        super("Zvetik");
        this.profession = "poet";
    }

    @Override
    public void writePoety() {
        this.stoppedInTheMiddleOfTheRoom();
        this.foldedHisArms();
        this.cockedHisHeadToOneSide();
        this.beganToThink();
        this.raisedHisHead();
        this.lookUpAtTheCeiling();
        this.beganToThink();
        this.putHisHandsUnderHisChin();
        this.starAtTheFloor();
        this.beganToThink();
        this.beganToaWanderAboutTheRoom();
        this.mutteringToHimselfUnderHisBreath();
    }

    public final String normalName = "Pudik";
    public final String street = "Oduvanchikov";
}
