package enumeration;

public enum Thickness {
    NOT,
    NORMAL,
    THICK,
    THIN,
    SMALL;
    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
