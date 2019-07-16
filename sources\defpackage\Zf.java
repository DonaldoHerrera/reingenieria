package defpackage;

/* renamed from: Zf reason: default package */
public final class Zf {
    private final C0522cg a;
    private final String b;

    public Zf(C0522cg cgVar, String str) {
        this.b = str;
        if (cgVar != null) {
            this.a = cgVar;
            return;
        }
        throw new NullPointerException();
    }

    public C0522cg a() {
        return this.a;
    }
}
