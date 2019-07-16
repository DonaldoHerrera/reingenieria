package defpackage;

/* renamed from: qob reason: default package and case insensitive filesystem */
/* compiled from: DescriptorRenderer.kt */
public enum C7213qob {
    NO_ARGUMENTS(false, false, 3, null),
    UNLESS_EMPTY(true, false, 2, null),
    ALWAYS_PARENTHESIZED(true, true);
    
    private final boolean e;
    private final boolean f;

    private C7213qob(boolean z, boolean z2) {
        this.e = z;
        this.f = z2;
    }

    public final boolean a() {
        return this.e;
    }

    public final boolean b() {
        return this.f;
    }
}
