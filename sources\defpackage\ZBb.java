package defpackage;

import defpackage.XBb;
import java.util.Comparator;

/* renamed from: ZBb reason: default package */
/* compiled from: ChronoLocalDateTime */
public abstract class ZBb<D extends XBb> extends C5691cDb implements C6967nDb, C7105pDb, Comparable<ZBb<?>> {
    private static final Comparator<ZBb<?>> a = new YBb();

    public abstract ZBb<D> a(C7381tDb tdb, long j);

    public abstract C6353eCb<D> a(NBb nBb);

    public abstract ZBb<D> b(long j, DDb dDb);

    public boolean c(ZBb<?> zBb) {
        int i = (toLocalDate().toEpochDay() > zBb.toLocalDate().toEpochDay() ? 1 : (toLocalDate().toEpochDay() == zBb.toLocalDate().toEpochDay() ? 0 : -1));
        return i < 0 || (i == 0 && toLocalTime().M() < zBb.toLocalTime().M());
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZBb)) {
            return false;
        }
        if (compareTo((ZBb) obj) != 0) {
            z = false;
        }
        return z;
    }

    public C6625iCb getChronology() {
        return toLocalDate().getChronology();
    }

    public int hashCode() {
        return toLocalDate().hashCode() ^ toLocalTime().hashCode();
    }

    public abstract D toLocalDate();

    public abstract C7239rBb toLocalTime();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(toLocalDate().toString());
        sb.append('T');
        sb.append(toLocalTime().toString());
        return sb.toString();
    }

    public C6623iBb b(PBb pBb) {
        return C6623iBb.a(a(pBb), (long) toLocalTime().K());
    }

    public boolean b(ZBb<?> zBb) {
        int i = (toLocalDate().toEpochDay() > zBb.toLocalDate().toEpochDay() ? 1 : (toLocalDate().toEpochDay() == zBb.toLocalDate().toEpochDay() ? 0 : -1));
        return i > 0 || (i == 0 && toLocalTime().M() > zBb.toLocalTime().M());
    }

    public ZBb<D> a(C7105pDb pdb) {
        return toLocalDate().getChronology().b(super.a(pdb));
    }

    public ZBb<D> a(long j, DDb dDb) {
        return toLocalDate().getChronology().b(super.a(j, dDb));
    }

    public <R> R a(CDb<R> cDb) {
        if (cDb == BDb.a()) {
            return getChronology();
        }
        if (cDb == BDb.e()) {
            return C6491gDb.NANOS;
        }
        if (cDb == BDb.b()) {
            return C6827lBb.c(toLocalDate().toEpochDay());
        }
        if (cDb == BDb.c()) {
            return toLocalTime();
        }
        if (cDb == BDb.f() || cDb == BDb.g() || cDb == BDb.d()) {
            return null;
        }
        return super.a(cDb);
    }

    public C6967nDb a(C6967nDb ndb) {
        return ndb.a((C7381tDb) C6423fDb.EPOCH_DAY, toLocalDate().toEpochDay()).a((C7381tDb) C6423fDb.NANO_OF_DAY, toLocalTime().M());
    }

    public long a(PBb pBb) {
        C6355eDb.a(pBb, "offset");
        return ((toLocalDate().toEpochDay() * 86400) + ((long) toLocalTime().N())) - ((long) pBb.d());
    }

    /* renamed from: a */
    public int compareTo(ZBb<?> zBb) {
        int a2 = toLocalDate().compareTo(zBb.toLocalDate());
        if (a2 != 0) {
            return a2;
        }
        int a3 = toLocalTime().compareTo(zBb.toLocalTime());
        return a3 == 0 ? getChronology().compareTo(zBb.getChronology()) : a3;
    }
}
