package actions;

import enumeration.Material;

public class Think {
    public String name;

    /**
     * constructor think
     *
     * @param name
     */
    public Think(String name) {
        this.name = name;
    }

    /**
     * field
     *
     * @brief broken or not broken
     */
    public boolean isBroken = true;

    /**
     * @brief think can break and will be broken
     */
    public void breaked() {
        this.isBroken = false;
    }
}

