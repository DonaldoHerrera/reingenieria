package defpackage;

import defpackage.XBb;
import java.util.Comparator;

/* renamed from: eCb reason: default package and case insensitive filesystem */
/* compiled from: ChronoZonedDateTime */
public abstract class C6353eCb<D extends XBb> extends C5691cDb implements C6967nDb, Comparable<C6353eCb<?>> {
    private static Comparator<C6353eCb<?>> a = new C5689cCb();

    public abstract C6353eCb<D> a(NBb nBb);

    public abstract C6353eCb<D> a(C7381tDb tdb, long j);

    public abstract C6353eCb<D> b(long j, DDb dDb);

    public int c(C7381tDb tdb) {
        if (!(tdb instanceof C6423fDb)) {
            return super.c(tdb);
        }
        int i = C6285dCb.a[((C6423fDb) tdb).ordinal()];
        if (i == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Field too large for an int: ");
            sb.append(tdb);
            throw new EDb(sb.toString());
        } else if (i != 2) {
            return toLocalDateTime().c(tdb);
        } else {
            return getOffset().d();
        }
    }

    public long d(C7381tDb tdb) {
        if (!(tdb instanceof C6423fDb)) {
            return tdb.c(this);
        }
        int i = C6285dCb.a[((C6423fDb) tdb).ordinal()];
        if (i == 1) {
            return toEpochSecond();
        }
        if (i != 2) {
            return toLocalDateTime().d(tdb);
        }
        return (long) getOffset().d();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6353eCb)) {
            return false;
        }
        if (compareTo((C6353eCb) obj) != 0) {
            z = false;
        }
        return z;
    }

    public abstract PBb getOffset();

    public abstract NBb getZone();

    public int hashCode() {
        return (toLocalDateTime().hashCode() ^ getOffset().hashCode()) ^ Integer.rotateLeft(getZone().hashCode(), 3);
    }

    public long toEpochSecond() {
        return ((toLocalDate().toEpochDay() * 86400) + ((long) toLocalTime().N())) - ((long) getOffset().d());
    }

    public D toLocalDate() {
        return toLocalDateTime().toLocalDate();
    }

    public abstract ZBb<D> toLocalDateTime();

    public C7239rBb toLocalTime() {
        return toLocalDateTime().toLocalTime();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(toLocalDateTime().toString());
        sb.append(getOffset().toString());
        String sb2 = sb.toString();
        if (getOffset() == getZone()) {
            return sb2;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append('[');
        sb3.append(getZone().toString());
        sb3.append(']');
        return sb3.toString();
    }

    public FDb a(C7381tDb tdb) {
        if (!(tdb instanceof C6423fDb)) {
            return tdb.b(this);
        }
        if (tdb == C6423fDb.INSTANT_SECONDS || tdb == C6423fDb.OFFSET_SECONDS) {
            return tdb.range();
        }
        return toLocalDateTime().a(tdb);
    }

    public C6353eCb<D> a(C7105pDb pdb) {
        return toLocalDate().getChronology().c(super.a(pdb));
    }

    public C6353eCb<D> a(long j, DDb dDb) {
        return toLocalDate().getChronology().c(super.a(j, dDb));
    }

    public <R> R a(CDb<R> cDb) {
        if (cDb == BDb.g() || cDb == BDb.f()) {
            return getZone();
        }
        if (cDb == BDb.a()) {
            return toLocalDate().getChronology();
        }
        if (cDb == BDb.e()) {
            return C6491gDb.NANOS;
        }
        if (cDb == BDb.d()) {
            return getOffset();
        }
        if (cDb == BDb.b()) {
            return C6827lBb.c(toLocalDate().toEpochDay());
        }
        if (cDb == BDb.c()) {
            return toLocalTime();
        }
        return super.a(cDb);
    }

    /* renamed from: a */
    public int compareTo(C6353eCb<?> ecb) {
        int a2 = C6355eDb.a(toEpochSecond(), ecb.toEpochSecond());
        if (a2 != 0) {
            return a2;
        }
        int K = toLocalTime().K() - ecb.toLocalTime().K();
        if (K != 0) {
            return K;
        }
        int a3 = toLocalDateTime().compareTo(ecb.toLocalDateTime());
        if (a3 != 0) {
            return a3;
        }
        int compareTo = getZone().getId().compareTo(ecb.getZone().getId());
        return compareTo == 0 ? toLocalDate().getChronology().compareTo(ecb.toLocalDate().getChronology()) : compareTo;
    }
}
