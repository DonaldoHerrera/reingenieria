package defpackage;

/* renamed from: iua reason: default package and case insensitive filesystem */
/* compiled from: DatabaseReporter.kt */
public final class C6676iua {
    private final C6880lua a;
    private final C3824mea b;
    private final C5606ava c;
    private final HPa d;

    public C6676iua(C6880lua lua, C3824mea mea, C5606ava ava, HPa hPa) {
        C7471uYa.b(lua, "databaseReporting");
        C7471uYa.b(mea, "technicalReporter");
        C7471uYa.b(ava, "observerFactory");
        C7471uYa.b(hPa, "scheduler");
        this.a = lua;
        this.b = mea;
        this.c = ava;
        this.d = hPa;
    }

    /* access modifiers changed from: private */
    public final void b() {
        int a2 = this.a.a();
        this.b.a(C3816lea.a.a("core_db_record_count", C3808kea.a.a("tracks", (Number) Integer.valueOf(a2))));
        C4928GKa b2 = this.a.b();
        C7471uYa.a((Object) b2, "report");
        if (b2.c()) {
            C3824mea mea = this.b;
            Object b3 = b2.b();
            C7471uYa.a(b3, "report.get()");
            C3816lea a3 = ((Uea) b3).a();
            C7471uYa.a((Object) a3, "report.get().metric");
            mea.a(a3);
        }
    }

    public final void a() {
        C6979nPa.b((C6368eQa) new C6540gua(this)).b(this.d).c(this.c.a((PXa<RVa>) C6608hua.a));
    }
}
