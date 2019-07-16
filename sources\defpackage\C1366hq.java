package defpackage;

/* renamed from: hq reason: default package and case insensitive filesystem */
/* compiled from: DefaultHttpDataSourceFactory */
public final class C1366hq extends a {
    private final String b;
    private final C1702sq c;
    private final int d;
    private final int e;
    private final boolean f;

    public C1366hq(String str, C1702sq sqVar) {
        this(str, sqVar, 8000, 8000, false);
    }

    public C1366hq(String str, C1702sq sqVar, int i, int i2, boolean z) {
        C1852xq.a(str);
        this.b = str;
        this.c = sqVar;
        this.d = i;
        this.e = i2;
        this.f = z;
    }

    /* access modifiers changed from: protected */
    public C1335gq a(f fVar) {
        C1335gq gqVar = new C1335gq(this.b, null, this.d, this.e, this.f, fVar);
        C1702sq sqVar = this.c;
        if (sqVar != null) {
            gqVar.a(sqVar);
        }
        return gqVar;
    }
}
