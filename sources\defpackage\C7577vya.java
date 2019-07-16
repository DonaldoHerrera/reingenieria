package defpackage;

import android.content.Context;

/* renamed from: vya reason: default package and case insensitive filesystem */
/* compiled from: SqlBriteDatabaseModule_ProvidePlayQueueDatabaseFactory */
public final class C7577vya implements C4961HMa<C3758eca> {
    private final C7054oVa<Context> a;
    private final C7054oVa<C3766fca> b;
    private final C7054oVa<HPa> c;

    public C7577vya(C7054oVa<Context> ova, C7054oVa<C3766fca> ova2, C7054oVa<HPa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C7577vya a(C7054oVa<Context> ova, C7054oVa<C3766fca> ova2, C7054oVa<HPa> ova3) {
        return new C7577vya(ova, ova2, ova3);
    }

    public static C3758eca a(Context context, C3766fca fca, HPa hPa) {
        C3758eca a2 = C7163pya.a(context, fca, hPa);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C3758eca get() {
        return a((Context) this.a.get(), (C3766fca) this.b.get(), (HPa) this.c.get());
    }
}
