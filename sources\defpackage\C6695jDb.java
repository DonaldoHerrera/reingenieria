package defpackage;

/* 'enum' access flag removed */
/* renamed from: jDb reason: default package and case insensitive filesystem */
/* compiled from: IsoFields */
final class C6695jDb extends a {
    C6695jDb(String str, int i) {
        super(str, i, null);
    }

    public boolean a(C7036oDb odb) {
        return odb.b(C6423fDb.MONTH_OF_YEAR) && a.e(odb);
    }

    public FDb b(C7036oDb odb) {
        return range();
    }

    public long c(C7036oDb odb) {
        if (odb.b(this)) {
            return (odb.d(C6423fDb.MONTH_OF_YEAR) + 2) / 3;
        }
        throw new EDb("Unsupported field: QuarterOfYear");
    }

    public FDb range() {
        return FDb.a(1, 4);
    }

    public String toString() {
        return "QuarterOfYear";
    }

    public <R extends C6967nDb> R a(R r, long j) {
        long c = c(r);
        range().b(j, this);
        C6423fDb fdb = C6423fDb.MONTH_OF_YEAR;
        return r.a((C7381tDb) fdb, r.d(fdb) + ((j - c) * 3));
    }
}
