package character;

import actions.Dialogue;
import control.Time;

public class Steklashkin extends Korotishki implements Dialogue {
    //if there isn't name of character, his name is Steklashkin
    public Steklashkin() {
        this("Steklashkin");
    }

    /**
     * constructor
     *
     * @param name
     * @brief Creates Steklashkin with a certan name
     */
    public Steklashkin(String name) {
        super(name);
    }
    //Neznaika can speak, exclaim and ask in the story different words at different moments in story


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
