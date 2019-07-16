package defpackage;

/* renamed from: CJ reason: default package and case insensitive filesystem */
/* compiled from: VideoAdsModule_ProvidesVideoLoadSchedulerFactory */
public final class C1969CJ implements C4961HMa<HPa> {
    private static final C1969CJ a = new C1969CJ();

    public static C1969CJ a() {
        return a;
    }

    public static HPa b() {
        HPa a2 = C1949BJ.a();
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public HPa get() {
        return b();
    }
}
