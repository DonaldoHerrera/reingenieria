package bo.app;

public enum hy {
    STRICT(false, true),
    LENIENT(true, false),
    NON_EXTENSIBLE(false, false),
    STRICT_ORDER(true, true);
    
    private final boolean e;
    private final boolean f;

    private hy(boolean z, boolean z2) {
        this.e = z;
        this.f = z2;
    }

    public boolean a() {
        return this.e;
    }

    public boolean b() {
        return this.f;
    }
}
