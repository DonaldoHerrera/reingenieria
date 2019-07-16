package bo.app;

public final class cf {
    private final ch a;
    private final cj b;

    public cf(ch chVar, cj cjVar) {
        if (chVar != null) {
            this.a = chVar;
            this.b = cjVar;
            return;
        }
        throw new NullPointerException();
    }

    public cj a() {
        return this.b;
    }
}
