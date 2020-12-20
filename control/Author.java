package control;

import actions.Dialogue;

public class Author implements Dialogue {
    public String name;

    /**
     * constructor
     *
     * @brief if there isn't name of Author, his name is Nikolay Nosov
     */
    public Author() {
        this("Nikolay Nosov");
    }

    /**
     * constructor
     *
     * @param name
     * @brief Creates Author with a certan name
     */
    public Author(String name) {
        this.name = name;
    }

    /**
     * String method startStory
     *
     * @param num_story
     * @param story
     * @return word
     * @brief changes time depending on the num os story and speak a word at the beginning of Story
     */
    public String startStory(int num_story, String story) {
        if (num_story == 1) {
            Time.getInstance().time = 0;
        }
        if (num_story == 2) {
            Time.getInstance().time = 100;
        }
        if (num_story == 3) {
            Time.getInstance().time = 200;
        }
        if (num_story == 4) {
            Time.getInstance().time = 300;
        }
        if (num_story == 5) {
            Time.getInstance().time = 400;
        }
        String word = "Today I will tell you a story about the shorties from Sunny city." + "\n" + story;
        System.out.println(word);
        return (word);
    }

    /**
     * finish Story
     *
     * @brief speak a word at the end of Story
     */
    public String finishStory() {
        return ("That's all for today.");
    }

    //Author can speak and comments the Story
    @Override
    public String speak() {
        String word = "";
        Time.getInstance().time += 1;
        if (Time.getInstance().time == 1) {
            word = "One day Neznaika decided to become an artist.";
        }
        if (Time.getInstance().time == 101) {
            word = "This story happened once day with Neznaika.";
        }
        if (Time.getInstance().time == 201) {
            word = "One day Neznaika wanted to become a musician.";
        }
        if (Time.getInstance().time == 401) {
            word = "One day Neznaika wanted to become a poet.";
        }
        System.out.println(word);
        return word;
    }

    //Author can exclaim
    @Override
    public String exclaim() {
        String word = "";
        Time.getInstance().time += 1;
        if (Time.getInstance().time == 11) {
            word = "So the Neznaika didn't become an artist! ";
        }
        if (Time.getInstance().time == 106) {
            word = "That's how strange this Neznaika was!";
        }
        if (Time.getInstance().time == 202) {
            word = "Neznaika has since stopped playing the trumpet!";
        }
        System.out.println(word);
        return word;
    }

    //Author can ask people
    @Override
    public String ask() {
        String word = "";
        Time.getInstance().time += 1;
        word = "Do you like the Story?";
        System.out.println(word);
        return word;
    }

    @Override
    public boolean equals(Object obj) {
        return this.getClass().equals(getClass());
    }

    @Override
    public String toString() {
        return name;
    }
}
