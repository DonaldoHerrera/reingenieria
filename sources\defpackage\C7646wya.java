package defpackage;

import android.content.Context;
import com.soundcloud.android.search.history.l;
import com.soundcloud.android.search.history.m;

/* renamed from: wya reason: default package and case insensitive filesystem */
/* compiled from: SqlBriteDatabaseModule_ProvideSearchHistoryDatabaseFactory */
public final class C7646wya implements C4961HMa<l> {
    private final C7054oVa<Context> a;
    private final C7054oVa<m> b;
    private final C7054oVa<HPa> c;

    public C7646wya(C7054oVa<Context> ova, C7054oVa<m> ova2, C7054oVa<HPa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C7646wya a(C7054oVa<Context> ova, C7054oVa<m> ova2, C7054oVa<HPa> ova3) {
        return new C7646wya(ova, ova2, ova3);
    }

    public static l a(Context context, m mVar, HPa hPa) {
        l a2 = C7163pya.a(context, mVar, hPa);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public l get() {
        return a((Context) this.a.get(), (m) this.b.get(), (HPa) this.c.get());
    }
}
