package defpackage;

/* renamed from: iV reason: default package and case insensitive filesystem */
/* compiled from: CreatorsModule_ProvideUploadEventsFactory */
public final class C3061iV implements C4961HMa<C2350WH<Xaa>> {
    private static final C3061iV a = new C3061iV();

    public static C3061iV a() {
        return a;
    }

    public static C2350WH<Xaa> b() {
        C2350WH<Xaa> b = C3023gV.b();
        C5023JMa.a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public C2350WH<Xaa> get() {
        return b();
    }
}
