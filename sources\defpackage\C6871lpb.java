package defpackage;

/* renamed from: lpb reason: default package and case insensitive filesystem */
/* compiled from: OverridingStrategy.kt */
public abstract class C6871lpb extends C6939mpb {
    public void a(C4935Gcb gcb, C4935Gcb gcb2) {
        C7471uYa.b(gcb, "first");
        C7471uYa.b(gcb2, "second");
        c(gcb, gcb2);
    }

    public void b(C4935Gcb gcb, C4935Gcb gcb2) {
        C7471uYa.b(gcb, "fromSuper");
        C7471uYa.b(gcb2, "fromCurrent");
        c(gcb, gcb2);
    }

    /* access modifiers changed from: protected */
    public abstract void c(C4935Gcb gcb, C4935Gcb gcb2);
}
