package defpackage;

import android.content.Context;

/* renamed from: sya reason: default package and case insensitive filesystem */
/* compiled from: SqlBriteDatabaseModule_ProvideFollowingDatabaseFactory */
public final class C7370sya implements C4961HMa<C3869sba> {
    private final C7054oVa<Context> a;
    private final C7054oVa<C3877tba> b;
    private final C7054oVa<HPa> c;

    public C7370sya(C7054oVa<Context> ova, C7054oVa<C3877tba> ova2, C7054oVa<HPa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C7370sya a(C7054oVa<Context> ova, C7054oVa<C3877tba> ova2, C7054oVa<HPa> ova3) {
        return new C7370sya(ova, ova2, ova3);
    }

    public static C3869sba a(Context context, C3877tba tba, HPa hPa) {
        C3869sba a2 = C7163pya.a(context, tba, hPa);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C3869sba get() {
        return a((Context) this.a.get(), (C3877tba) this.b.get(), (HPa) this.c.get());
    }
}
