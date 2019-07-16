package bo.app;

public final class ce {
    private final cs a;

    public ce(cs csVar) {
        if (csVar != null) {
            this.a = csVar;
            return;
        }
        throw new NullPointerException();
    }

    public cs a() {
        return this.a;
    }
}
