package defpackage;

/* 'enum' access flag removed */
/* renamed from: lDb reason: default package and case insensitive filesystem */
/* compiled from: IsoFields */
final class C6831lDb extends a {
    C6831lDb(String str, int i) {
        super(str, i, null);
    }

    public boolean a(C7036oDb odb) {
        return odb.b(C6423fDb.EPOCH_DAY) && a.e(odb);
    }

    public FDb b(C7036oDb odb) {
        return C6423fDb.YEAR.range();
    }

    public long c(C7036oDb odb) {
        if (odb.b(this)) {
            return (long) a.e(C6827lBb.a(odb));
        }
        throw new EDb("Unsupported field: WeekBasedYear");
    }

    public FDb range() {
        return C6423fDb.YEAR.range();
    }

    public String toString() {
        return "WeekBasedYear";
    }

    public <R extends C6967nDb> R a(R r, long j) {
        if (a(r)) {
            int a = range().a(j, (C7381tDb) a.WEEK_BASED_YEAR);
            C6827lBb a2 = C6827lBb.a((C7036oDb) r);
            int c = a2.c((C7381tDb) C6423fDb.DAY_OF_WEEK);
            int b = a.d(a2);
            if (b == 53 && a.b(a) == 52) {
                b = 52;
            }
            C6827lBb a3 = C6827lBb.a(a, 1, 4);
            return r.a(a3.d((long) ((c - a3.c((C7381tDb) C6423fDb.DAY_OF_WEEK)) + ((b - 1) * 7))));
        }
        throw new EDb("Unsupported field: WeekBasedYear");
    }
}
