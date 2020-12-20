package enumeration;

public enum HowComparison {
    VERY,
    AVERAGE,
    LITTLE;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
