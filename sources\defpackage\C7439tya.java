package defpackage;

import android.content.Context;
import com.soundcloud.android.tracks.W;
import com.soundcloud.android.tracks.X;

/* renamed from: tya reason: default package and case insensitive filesystem */
/* compiled from: SqlBriteDatabaseModule_ProvideMediaStreamsDatabaseFactory */
public final class C7439tya implements C4961HMa<W> {
    private final C7054oVa<Context> a;
    private final C7054oVa<X> b;
    private final C7054oVa<HPa> c;

    public C7439tya(C7054oVa<Context> ova, C7054oVa<X> ova2, C7054oVa<HPa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C7439tya a(C7054oVa<Context> ova, C7054oVa<X> ova2, C7054oVa<HPa> ova3) {
        return new C7439tya(ova, ova2, ova3);
    }

    public static W a(Context context, X x, HPa hPa) {
        W a2 = C7163pya.a(context, x, hPa);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public W get() {
        return a((Context) this.a.get(), (X) this.b.get(), (HPa) this.c.get());
    }
}
