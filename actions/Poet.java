package actions;

public interface Poet {
    /**
     * a lot of methods which do poet when he wrote poem
     *
     * @return word
     */
    default String stoppedInTheMiddleOfTheRoom() {
        String word = "he stopped in the middle of the room";
        System.out.println(word);
        return word;
    }

    default String foldedHisArms() {
        String word = "he folded his arms";
        System.out.println(word);
        return word;
    }

    default String cockedHisHeadToOneSide() {
        String word = "he cocked his head to one side";
        System.out.println(word);
        return word;
    }

    default String beganToThink() {
        String word = "he began to think";
        System.out.println(word);
        return word;
    }

    default String raisedHisHead() {
        String word = "he raised his head";
        System.out.println(word);
        return word;
    }

    default String lookUpAtTheCeiling() {
        String word = "he look up at the ceiling";
        System.out.println(word);
        return word;
    }

    default String putHisHandsUnderHisChin() {
        String word = "he put his hands under his chin";
        System.out.println(word);
        return word;
    }

    default String starAtTheFloor() {
        String word = "he star at the floor";
        System.out.println(word);
        return word;
    }

    default String beganToaWanderAboutTheRoom() {
        String word = "he began to wander about the room";
        System.out.println(word);
        return word;
    }

    default String mutteringToHimselfUnderHisBreath() {
        String word = "he muttering to himself under his breath";
        System.out.println(word);
        return word;
    }

    void writePoety();
}
