public enum Season {
    WINTER, SPRING, SUMMER, FALL;
    // TODO: Add auxiliary functions.

    static public final Season[] values = values();

    public Season prev() {                                              //1111111
        return values[(ordinal() - 1  + values.length) % values.length];
    }

    public Season next() {                                               //111111
        return values[(ordinal() + 1) % values.length];
    }
}
