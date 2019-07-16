package defpackage;

/* renamed from: nta reason: default package and case insensitive filesystem */
/* compiled from: PolicyStorage_Factory */
public final class C7015nta implements C4961HMa<C6946mta> {
    private final C7054oVa<C5500ZKa> a;

    public C7015nta(C7054oVa<C5500ZKa> ova) {
        this.a = ova;
    }

    public static C7015nta a(C7054oVa<C5500ZKa> ova) {
        return new C7015nta(ova);
    }

    public C6946mta get() {
        return new C6946mta((C5500ZKa) this.a.get());
    }
}
