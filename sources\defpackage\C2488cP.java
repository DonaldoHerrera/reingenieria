package defpackage;

/* renamed from: cP reason: default package and case insensitive filesystem */
/* compiled from: ApiModule_SafeProvideJsonTransformerFactory */
public final class C2488cP implements C4961HMa<Nea> {
    private static final C2488cP a = new C2488cP();

    public static C2488cP a() {
        return a;
    }

    public static Nea b() {
        Nea c = C2264RO.c();
        C5023JMa.a(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }

    public Nea get() {
        return b();
    }
}
