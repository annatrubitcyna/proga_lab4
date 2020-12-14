package enumeration;

public enum Thickness {
    NOT,
    NORMAL,
    THICK,
    THIN;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
