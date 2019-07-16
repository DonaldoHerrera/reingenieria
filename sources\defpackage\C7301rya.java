package defpackage;

import android.content.Context;

/* renamed from: rya reason: default package and case insensitive filesystem */
/* compiled from: SqlBriteDatabaseModule_ProvideDiscoveryDatabaseFactory */
public final class C7301rya implements C4961HMa<C3826nY> {
    private final C7054oVa<Context> a;
    private final C7054oVa<C3834oY> b;
    private final C7054oVa<HPa> c;

    public C7301rya(C7054oVa<Context> ova, C7054oVa<C3834oY> ova2, C7054oVa<HPa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C7301rya a(C7054oVa<Context> ova, C7054oVa<C3834oY> ova2, C7054oVa<HPa> ova3) {
        return new C7301rya(ova, ova2, ova3);
    }

    public static C3826nY a(Context context, C3834oY oYVar, HPa hPa) {
        C3826nY a2 = C7163pya.a(context, oYVar, hPa);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C3826nY get() {
        return a((Context) this.a.get(), (C3834oY) this.b.get(), (HPa) this.c.get());
    }
}
