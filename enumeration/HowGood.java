package enumeration;

public enum HowGood {
    GOOD,
    NORMAL,
    BAD;
    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
