package enumeration;

public enum HowSpeed {
    SLOWLY,
    NORMAL,
    QUICKLY;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
