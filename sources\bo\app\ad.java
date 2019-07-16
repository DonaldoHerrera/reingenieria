package bo.app;

public final class ad {
    private final cr a;

    public ad(cr crVar) {
        if (crVar != null) {
            this.a = crVar;
            return;
        }
        throw new NullPointerException();
    }

    public cr a() {
        return this.a;
    }
}
