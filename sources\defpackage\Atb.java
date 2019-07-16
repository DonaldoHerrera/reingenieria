package defpackage;

/* renamed from: Atb reason: default package */
/* compiled from: SpecialTypes.kt */
public final class Atb extends C6541gub {
    private final Psb<C7706xtb> a;

    public Atb(Ssb ssb, PXa<? extends C7706xtb> pXa) {
        C7471uYa.b(ssb, "storageManager");
        C7471uYa.b(pXa, "computation");
        this.a = ssb.a(pXa);
    }

    /* access modifiers changed from: protected */
    public C7706xtb Ca() {
        return (C7706xtb) this.a.d();
    }

    public boolean Da() {
        return this.a.a();
    }
}
