package defpackage;

/* renamed from: cta reason: default package and case insensitive filesystem */
/* compiled from: LoadPolicyUpdateTimeCommand_Factory */
public final class C6266cta implements C4961HMa<C5670bta> {
    private final C7054oVa<C5500ZKa> a;

    public C6266cta(C7054oVa<C5500ZKa> ova) {
        this.a = ova;
    }

    public static C6266cta a(C7054oVa<C5500ZKa> ova) {
        return new C6266cta(ova);
    }

    public static C5670bta a(C5500ZKa zKa) {
        return new C5670bta(zKa);
    }

    public C5670bta get() {
        return new C5670bta((C5500ZKa) this.a.get());
    }
}
