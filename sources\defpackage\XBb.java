package defpackage;

import java.util.Comparator;

/* renamed from: XBb reason: default package */
/* compiled from: ChronoLocalDate */
public abstract class XBb extends C5691cDb implements C6967nDb, C7105pDb, Comparable<XBb> {
    private static final Comparator<XBb> a = new WBb();

    public abstract XBb a(C7381tDb tdb, long j);

    public abstract XBb b(long j, DDb dDb);

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XBb)) {
            return false;
        }
        if (compareTo((XBb) obj) != 0) {
            z = false;
        }
        return z;
    }

    public abstract C6625iCb getChronology();

    public C6693jCb getEra() {
        return getChronology().eraOf(c(C6423fDb.ERA));
    }

    public int hashCode() {
        long epochDay = toEpochDay();
        return getChronology().hashCode() ^ ((int) (epochDay ^ (epochDay >>> 32)));
    }

    public long toEpochDay() {
        return d(C6423fDb.EPOCH_DAY);
    }

    public String toString() {
        long d = d(C6423fDb.YEAR_OF_ERA);
        long d2 = d(C6423fDb.MONTH_OF_YEAR);
        long d3 = d(C6423fDb.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(getChronology().toString());
        String str = " ";
        sb.append(str);
        sb.append(getEra());
        sb.append(str);
        sb.append(d);
        String str2 = "-0";
        String str3 = "-";
        sb.append(d2 < 10 ? str2 : str3);
        sb.append(d2);
        if (d3 >= 10) {
            str2 = str3;
        }
        sb.append(str2);
        sb.append(d3);
        return sb.toString();
    }

    public boolean b(C7381tDb tdb) {
        if (tdb instanceof C6423fDb) {
            return tdb.isDateBased();
        }
        return tdb != null && tdb.a(this);
    }

    public XBb a(C7105pDb pdb) {
        return getChronology().a(super.a(pdb));
    }

    public XBb a(C7312sDb sdb) {
        return getChronology().a(super.a(sdb));
    }

    public boolean b(XBb xBb) {
        return toEpochDay() < xBb.toEpochDay();
    }

    public XBb a(long j, DDb dDb) {
        return getChronology().a(super.a(j, dDb));
    }

    public <R> R a(CDb<R> cDb) {
        if (cDb == BDb.a()) {
            return getChronology();
        }
        if (cDb == BDb.e()) {
            return C6491gDb.DAYS;
        }
        if (cDb == BDb.b()) {
            return C6827lBb.c(toEpochDay());
        }
        if (cDb == BDb.c() || cDb == BDb.f() || cDb == BDb.g() || cDb == BDb.d()) {
            return null;
        }
        return super.a(cDb);
    }

    public C6967nDb a(C6967nDb ndb) {
        return ndb.a((C7381tDb) C6423fDb.EPOCH_DAY, toEpochDay());
    }

    public ZBb<?> a(C7239rBb rbb) {
        return C5553aCb.a(this, rbb);
    }

    /* renamed from: a */
    public int compareTo(XBb xBb) {
        int a2 = C6355eDb.a(toEpochDay(), xBb.toEpochDay());
        return a2 == 0 ? getChronology().compareTo(xBb.getChronology()) : a2;
    }
}
