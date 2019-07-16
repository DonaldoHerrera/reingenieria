package defpackage;

/* renamed from: mrb reason: default package and case insensitive filesystem */
/* compiled from: DeserializedClassDataFinder.kt */
public final class C6943mrb implements C6399erb {
    private final C6858ldb a;

    public C6943mrb(C6858ldb ldb) {
        C7471uYa.b(ldb, "packageFragmentProvider");
        this.a = ldb;
    }

    public C6331drb a(C7280rnb rnb) {
        C7471uYa.b(rnb, "classId");
        C6858ldb ldb = this.a;
        C7349snb d = rnb.d();
        C7471uYa.a((Object) d, "classId.packageFqName");
        for (C6790kdb kdb : ldb.a(d)) {
            if (kdb instanceof C7012nrb) {
                C6331drb a2 = ((C7012nrb) kdb).ta().a(rnb);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return null;
    }
}
