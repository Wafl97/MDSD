package wafl.dsl;

/**
 * @author Marc L. W. Bertelsen
 */
public enum PrintMode {
    TESTING(-1),
    MINIMAL(0),
    NORMAL(1),
    MAXIMAL(2);
    public final int order;
    PrintMode(int order) {
        this.order = order;
    }
}
