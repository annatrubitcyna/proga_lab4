package enumeration;

public enum HowCalmly {
    CALMLY,
    RESTLESSLY;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
