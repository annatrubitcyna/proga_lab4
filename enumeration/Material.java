package enumeration;

public enum Material {
    LEATHER,
    IRON,
    COPPER,
    RUBBER,
    GLASS;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
