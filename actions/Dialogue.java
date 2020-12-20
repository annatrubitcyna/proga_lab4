package actions;

//Heroes of Story can speak and comments the Story
public interface Dialogue {
    /**
     * speak
     *
     * @return word
     */
    String speak();

    /**
     * exclaim
     *
     * @return word!
     */
    String exclaim();

    /**
     * ask
     *
     * @return
     */
    String ask();
}