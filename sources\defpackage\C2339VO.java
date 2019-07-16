package defpackage;

/* renamed from: VO reason: default package and case insensitive filesystem */
/* compiled from: ApiModule_ProvideClientIdFactory */
public final class C2339VO implements C4961HMa<String> {
    private final C2264RO a;
    private final C7054oVa<C2322UP> b;

    public C2339VO(C2264RO ro, C7054oVa<C2322UP> ova) {
        this.a = ro;
        this.b = ova;
    }

    public static C2339VO a(C2264RO ro, C7054oVa<C2322UP> ova) {
        return new C2339VO(ro, ova);
    }

    public static String a(C2264RO ro, C2322UP up) {
        String a2 = ro.a(up);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public String get() {
        return a(this.a, (C2322UP) this.b.get());
    }
}
