package defpackage;

import android.content.Context;
import com.soundcloud.android.offline.Jd;
import com.soundcloud.android.offline.Kd;

/* renamed from: uya reason: default package and case insensitive filesystem */
/* compiled from: SqlBriteDatabaseModule_ProvideOfflineDatabaseFactory */
public final class C7508uya implements C4961HMa<Jd> {
    private final C7054oVa<Context> a;
    private final C7054oVa<Kd> b;
    private final C7054oVa<HPa> c;

    public C7508uya(C7054oVa<Context> ova, C7054oVa<Kd> ova2, C7054oVa<HPa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C7508uya a(C7054oVa<Context> ova, C7054oVa<Kd> ova2, C7054oVa<HPa> ova3) {
        return new C7508uya(ova, ova2, ova3);
    }

    public static Jd a(Context context, Kd kd, HPa hPa) {
        Jd a2 = C7163pya.a(context, kd, hPa);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public Jd get() {
        return a((Context) this.a.get(), (Kd) this.b.get(), (HPa) this.c.get());
    }
}
