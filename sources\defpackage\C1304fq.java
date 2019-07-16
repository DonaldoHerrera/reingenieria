package defpackage;

import android.content.Context;

/* renamed from: fq reason: default package and case insensitive filesystem */
/* compiled from: DefaultDataSourceFactory */
public final class C1304fq implements a {
    private final Context a;
    private final C1702sq b;
    private final a c;

    public C1304fq(Context context, String str) {
        this(context, str, (C1702sq) null);
    }

    public C1304fq(Context context, String str, C1702sq sqVar) {
        this(context, sqVar, (a) new C1366hq(str, sqVar));
    }

    public C1273eq a() {
        C1273eq eqVar = new C1273eq(this.a, this.c.a());
        C1702sq sqVar = this.b;
        if (sqVar != null) {
            eqVar.a(sqVar);
        }
        return eqVar;
    }

    public C1304fq(Context context, C1702sq sqVar, a aVar) {
        this.a = context.getApplicationContext();
        this.b = sqVar;
        this.c = aVar;
    }
}
