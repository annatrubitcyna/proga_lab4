package character;

import actions.Dialogue;
import control.Time;
import enumeration.HowCalmly;
import enumeration.HowSpeed;

public class Gunka extends Korotishki implements Dialogue {
    /**
     * constructor Gunka
     */
    public Gunka() {
        super("Gunka");
    }

    /**
     * Field patience
     */
    public int patience = 50;

    /**
     * void rejoiced increases mood
     */
    public void rejoiced() {
        mood += 10;
        System.out.print("Gunka rejoced");
    }

    /**
     * void sitTo
     *
     * @param speed
     * @param place
     */
    public Boolean sitTo(HowSpeed speed, String place) {
        System.out.print(", " + speed.toString() + " sit down" + " on a " + place);
        return true;
    }

    /**
     * void wantedToSee changes patient
     *
     * @param speed
     */
    public void wantedToSee(HowSpeed speed) {
        System.out.println("Gunka wanted to see his portrait " + speed.toString());
        //if Gunka wanted to see his portrait quickly his patience is small
        if (speed == HowSpeed.QUICKLY) {
            patience = 0;
        }
        if (speed == HowSpeed.NORMAL) {
            patience = 50;
        }
        if (speed == HowSpeed.SLOWLY) {
            patience = 100;
        }
    }

    /**
     * void sit
     *
     * @param how
     */
    public void sit(HowCalmly how) {
        if (how == HowCalmly.RESTLESSLY) {
            System.out.print("Impatient, he couldn't sit " + HowCalmly.CALMLY.toString() + " in his chair");
        }
    }

    /**
     * void spin
     */
    public void spin() {
        System.out.println(" and kept turning around.");
    }


    //Gunka can speak, exclaim and ask in the story different words at different moments in story

    @Override
    public String speak() {
        String word = "";
        System.out.print(name + " said:    ");
        Time.getInstance().time += 1;
        if (Time.getInstance().time == 9) {
            word = "- Better let the Tubik draw me.";
        }
        System.out.println(word);
        return word;
    }

    @Override
    public String exclaim() {
        String word = "";
        Time.getInstance().time += 1;
        System.out.print(name + " exclaim:    ");
        if (Time.getInstance().time == 6) {
            word = "- Show me what happened!";
        }
        if (Time.getInstance().time == 7) {
            word = "- Am I like that? Now erase what you drew!";
        }
        if (Time.getInstance().time == 10) {
            word = "- There is a good portrait!";
        }

        System.out.println(word);
        return word;
    }

    @Override
    public String ask() {
        String word = "";
        Time.getInstance().time += 1;
        System.out.print(name + " ask:    ");
        if (Time.getInstance().time == 4) {
            word = "— Does it look like this now?";
        }
        System.out.println(word);
        return word;
    }

}
