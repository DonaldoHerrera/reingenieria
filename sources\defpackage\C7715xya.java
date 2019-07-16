package defpackage;

import android.content.Context;
import com.soundcloud.android.stations.Ia;
import com.soundcloud.android.stations.Ja;

/* renamed from: xya reason: default package and case insensitive filesystem */
/* compiled from: SqlBriteDatabaseModule_ProvideStationDatabaseFactory */
public final class C7715xya implements C4961HMa<Ia> {
    private final C7054oVa<Context> a;
    private final C7054oVa<Ja> b;
    private final C7054oVa<HPa> c;

    public C7715xya(C7054oVa<Context> ova, C7054oVa<Ja> ova2, C7054oVa<HPa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C7715xya a(C7054oVa<Context> ova, C7054oVa<Ja> ova2, C7054oVa<HPa> ova3) {
        return new C7715xya(ova, ova2, ova3);
    }

    public static Ia a(Context context, Ja ja, HPa hPa) {
        Ia a2 = C7163pya.a(context, ja, hPa);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public Ia get() {
        return a((Context) this.a.get(), (Ja) this.b.get(), (HPa) this.c.get());
    }
}
