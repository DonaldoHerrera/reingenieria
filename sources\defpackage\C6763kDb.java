package defpackage;

import java.util.Map;

/* 'enum' access flag removed */
/* renamed from: kDb reason: default package and case insensitive filesystem */
/* compiled from: IsoFields */
final class C6763kDb extends a {
    C6763kDb(String str, int i) {
        super(str, i, null);
    }

    public boolean a(C7036oDb odb) {
        return odb.b(C6423fDb.EPOCH_DAY) && a.e(odb);
    }

    public FDb b(C7036oDb odb) {
        if (odb.b(this)) {
            return a.f(C6827lBb.a(odb));
        }
        throw new EDb("Unsupported field: WeekOfWeekBasedYear");
    }

    public long c(C7036oDb odb) {
        if (odb.b(this)) {
            return (long) a.d(C6827lBb.a(odb));
        }
        throw new EDb("Unsupported field: WeekOfWeekBasedYear");
    }

    public FDb range() {
        return FDb.a(1, 52, 53);
    }

    public String toString() {
        return "WeekOfWeekBasedYear";
    }

    public <R extends C6967nDb> R a(R r, long j) {
        range().b(j, this);
        return r.b(C6355eDb.f(j, c(r)), C6491gDb.WEEKS);
    }

    public C7036oDb a(Map<C7381tDb, Long> map, C7036oDb odb, XCb xCb) {
        C6827lBb lbb;
        Map<C7381tDb, Long> map2 = map;
        XCb xCb2 = xCb;
        Long l = (Long) map2.get(a.WEEK_BASED_YEAR);
        Long l2 = (Long) map2.get(C6423fDb.DAY_OF_WEEK);
        if (l == null || l2 == null) {
            return null;
        }
        int a = a.WEEK_BASED_YEAR.range().a(l.longValue(), (C7381tDb) a.WEEK_BASED_YEAR);
        long longValue = ((Long) map2.get(a.WEEK_OF_WEEK_BASED_YEAR)).longValue();
        if (xCb2 == XCb.LENIENT) {
            long longValue2 = l2.longValue();
            long j = 0;
            if (longValue2 > 7) {
                long j2 = longValue2 - 1;
                j = j2 / 7;
                longValue2 = (j2 % 7) + 1;
            } else if (longValue2 < 1) {
                j = (longValue2 / 7) - 1;
                longValue2 = (longValue2 % 7) + 7;
            }
            lbb = C6827lBb.a(a, 1, 4).f(longValue - 1).f(j).a((C7381tDb) C6423fDb.DAY_OF_WEEK, longValue2);
        } else {
            int a2 = C6423fDb.DAY_OF_WEEK.a(l2.longValue());
            if (xCb2 == XCb.STRICT) {
                a.f(C6827lBb.a(a, 1, 4)).b(longValue, this);
            } else {
                range().b(longValue, this);
            }
            lbb = C6827lBb.a(a, 1, 4).f(longValue - 1).a((C7381tDb) C6423fDb.DAY_OF_WEEK, (long) a2);
        }
        map2.remove(this);
        map2.remove(a.WEEK_BASED_YEAR);
        map2.remove(C6423fDb.DAY_OF_WEEK);
        return lbb;
    }
}
