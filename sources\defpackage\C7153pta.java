package defpackage;

/* renamed from: pta reason: default package and case insensitive filesystem */
/* compiled from: PolicySyncJob_Factory */
public final class C7153pta implements C4961HMa<C7084ota> {
    private final C7054oVa<C6334dta> a;
    private final C7054oVa<C5327TLa> b;

    public C7153pta(C7054oVa<C6334dta> ova, C7054oVa<C5327TLa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C7153pta a(C7054oVa<C6334dta> ova, C7054oVa<C5327TLa> ova2) {
        return new C7153pta(ova, ova2);
    }

    public C7084ota get() {
        return new C7084ota((C6334dta) this.a.get(), (C5327TLa) this.b.get());
    }
}
