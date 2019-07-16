package defpackage;

import android.content.Context;
import com.soundcloud.android.collection.C2839u;
import com.soundcloud.android.collection.C2840v;

/* renamed from: qya reason: default package and case insensitive filesystem */
/* compiled from: SqlBriteDatabaseModule_ProvideCollectionDatabaseFactory */
public final class C7232qya implements C4961HMa<C2839u> {
    private final C7054oVa<Context> a;
    private final C7054oVa<C2840v> b;
    private final C7054oVa<HPa> c;

    public C7232qya(C7054oVa<Context> ova, C7054oVa<C2840v> ova2, C7054oVa<HPa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C7232qya a(C7054oVa<Context> ova, C7054oVa<C2840v> ova2, C7054oVa<HPa> ova3) {
        return new C7232qya(ova, ova2, ova3);
    }

    public static C2839u a(Context context, C2840v vVar, HPa hPa) {
        C2839u a2 = C7163pya.a(context, vVar, hPa);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C2839u get() {
        return a((Context) this.a.get(), (C2840v) this.b.get(), (HPa) this.c.get());
    }
}
