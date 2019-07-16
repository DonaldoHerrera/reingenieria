package defpackage;

/* renamed from: eP reason: default package and case insensitive filesystem */
/* compiled from: ApiUrlBuilder_Factory */
public final class C2980eP implements C4961HMa<C2961dP> {
    private final C7054oVa<String> a;
    private final C7054oVa<String> b;
    private final C7054oVa<String> c;

    public C2980eP(C7054oVa<String> ova, C7054oVa<String> ova2, C7054oVa<String> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C2980eP a(C7054oVa<String> ova, C7054oVa<String> ova2, C7054oVa<String> ova3) {
        return new C2980eP(ova, ova2, ova3);
    }

    public C2961dP get() {
        return new C2961dP((String) this.a.get(), (String) this.b.get(), (String) this.c.get());
    }
}
