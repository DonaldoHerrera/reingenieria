package defpackage;

import java.util.Map;

/* 'enum' access flag removed */
/* renamed from: iDb reason: default package and case insensitive filesystem */
/* compiled from: IsoFields */
final class C6627iDb extends a {
    C6627iDb(String str, int i) {
        super(str, i, null);
    }

    public boolean a(C7036oDb odb) {
        return odb.b(C6423fDb.DAY_OF_YEAR) && odb.b(C6423fDb.MONTH_OF_YEAR) && odb.b(C6423fDb.YEAR) && a.e(odb);
    }

    public FDb b(C7036oDb odb) {
        if (odb.b(this)) {
            long d = odb.d(a.QUARTER_OF_YEAR);
            if (d == 1) {
                return C7034oCb.e.isLeapYear(odb.d(C6423fDb.YEAR)) ? FDb.a(1, 91) : FDb.a(1, 90);
            } else if (d == 2) {
                return FDb.a(1, 91);
            } else {
                if (d == 3 || d == 4) {
                    return FDb.a(1, 92);
                }
                return range();
            }
        } else {
            throw new EDb("Unsupported field: DayOfQuarter");
        }
    }

    public long c(C7036oDb odb) {
        if (odb.b(this)) {
            return (long) (odb.c(C6423fDb.DAY_OF_YEAR) - a.e[((odb.c(C6423fDb.MONTH_OF_YEAR) - 1) / 3) + (C7034oCb.e.isLeapYear(odb.d(C6423fDb.YEAR)) ? 4 : 0)]);
        }
        throw new EDb("Unsupported field: DayOfQuarter");
    }

    public FDb range() {
        return FDb.a(1, 90, 92);
    }

    public String toString() {
        return "DayOfQuarter";
    }

    public <R extends C6967nDb> R a(R r, long j) {
        long c = c(r);
        range().b(j, this);
        C6423fDb fdb = C6423fDb.DAY_OF_YEAR;
        return r.a((C7381tDb) fdb, r.d(fdb) + (j - c));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0079, code lost:
        if (r0 == 2) goto L_0x007b;
     */
    public C7036oDb a(Map<C7381tDb, Long> map, C7036oDb odb, XCb xCb) {
        C6827lBb lbb;
        Long l = (Long) map.get(C6423fDb.YEAR);
        Long l2 = (Long) map.get(a.QUARTER_OF_YEAR);
        if (l == null || l2 == null) {
            return null;
        }
        int a = C6423fDb.YEAR.a(l.longValue());
        long longValue = ((Long) map.get(a.DAY_OF_QUARTER)).longValue();
        if (xCb == XCb.LENIENT) {
            lbb = C6827lBb.a(a, 1, 1).e(C6355eDb.b(C6355eDb.f(l2.longValue(), 1), 3)).d(C6355eDb.f(longValue, 1));
        } else {
            int a2 = a.QUARTER_OF_YEAR.range().a(l2.longValue(), (C7381tDb) a.QUARTER_OF_YEAR);
            if (xCb == XCb.STRICT) {
                int i = 92;
                if (a2 == 1) {
                    if (!C7034oCb.e.isLeapYear((long) a)) {
                        i = 90;
                        FDb.a(1, (long) i).b(longValue, this);
                    }
                }
                i = 91;
                FDb.a(1, (long) i).b(longValue, this);
            } else {
                range().b(longValue, this);
            }
            lbb = C6827lBb.a(a, ((a2 - 1) * 3) + 1, 1).d(longValue - 1);
        }
        map.remove(this);
        map.remove(C6423fDb.YEAR);
        map.remove(a.QUARTER_OF_YEAR);
        return lbb;
    }
}
