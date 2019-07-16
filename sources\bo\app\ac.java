package bo.app;

public final class ac {
    private final cr a;

    public ac(cr crVar) {
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
