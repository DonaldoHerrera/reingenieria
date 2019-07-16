package defpackage;

/* renamed from: fub reason: default package and case insensitive filesystem */
/* compiled from: Variance.kt */
public enum C6473fub {
    INVARIANT("", true, true, 0),
    IN_VARIANCE("in", true, false, -1),
    OUT_VARIANCE("out", false, true, 1);
    
    private final String e;
    private final boolean f;
    private final boolean g;
    private final int h;

    private C6473fub(String str, boolean z, boolean z2, int i) {
        this.e = str;
        this.f = z;
        this.g = z2;
        this.h = i;
    }

    public final boolean a() {
        return this.g;
    }

    public final String b() {
        return this.e;
    }

    public String toString() {
        return this.e;
    }
}
