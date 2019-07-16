package defpackage;

/* renamed from: hhb reason: default package and case insensitive filesystem */
/* compiled from: context.kt */
public final class C6590hhb {
    static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(C6590hhb.class), "defaultTypeQualifiers", "getDefaultTypeQualifiers()Lorg/jetbrains/kotlin/load/java/lazy/JavaTypeQualifiersByElementType;"))};
    private final C7744yVa b = this.f;
    private final C7344sib c = new C7344sib(this, this.e);
    private final _gb d;
    private final C6998nhb e;
    private final C7744yVa<C5654bhb> f;

    public C6590hhb(_gb _gb, C6998nhb nhb, C7744yVa<C5654bhb> yva) {
        C7471uYa.b(_gb, "components");
        C7471uYa.b(nhb, "typeParameterResolver");
        C7471uYa.b(yva, "delegateForDefaultTypeQualifiers");
        this.d = _gb;
        this.e = nhb;
        this.f = yva;
    }

    public final _gb a() {
        return this.d;
    }

    public final C5654bhb b() {
        C7744yVa yva = this.b;
        DZa dZa = a[0];
        return (C5654bhb) yva.getValue();
    }

    public final C7744yVa<C5654bhb> c() {
        return this.f;
    }

    public final C6450fdb d() {
        return this.d.j();
    }

    public final Ssb e() {
        return this.d.r();
    }

    public final C6998nhb f() {
        return this.e;
    }

    public final C7344sib g() {
        return this.c;
    }
}
