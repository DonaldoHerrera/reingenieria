package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Comparator;

/* renamed from: BBb reason: default package */
/* compiled from: OffsetDateTime */
public final class BBb extends C5691cDb implements C6967nDb, C7105pDb, Comparable<BBb>, Serializable {
    public static final BBb a = C7032oBb.b.c(PBb.h);
    public static final BBb b = C7032oBb.c.c(PBb.g);
    public static final CDb<BBb> c = new C7722yBb();
    private static final Comparator<BBb> d = new C7791zBb();
    private final C7032oBb e;
    private final PBb f;

    private BBb(C7032oBb obb, PBb pBb) {
        C6355eDb.a(obb, "dateTime");
        this.e = obb;
        C6355eDb.a(pBb, "offset");
        this.f = pBb;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new FBb(69, this);
    }

    public int J() {
        return this.e.J();
    }

    public int c(C7381tDb tdb) {
        if (!(tdb instanceof C6423fDb)) {
            return super.c(tdb);
        }
        int i = ABb.a[((C6423fDb) tdb).ordinal()];
        if (i == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Field too large for an int: ");
            sb.append(tdb);
            throw new C5687cBb(sb.toString());
        } else if (i != 2) {
            return this.e.c(tdb);
        } else {
            return getOffset().d();
        }
    }

    public long d(C7381tDb tdb) {
        if (!(tdb instanceof C6423fDb)) {
            return tdb.c(this);
        }
        int i = ABb.a[((C6423fDb) tdb).ordinal()];
        if (i == 1) {
            return toEpochSecond();
        }
        if (i != 2) {
            return this.e.d(tdb);
        }
        return (long) getOffset().d();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BBb)) {
            return false;
        }
        BBb bBb = (BBb) obj;
        if (!this.e.equals(bBb.e) || !this.f.equals(bBb.f)) {
            z = false;
        }
        return z;
    }

    public PBb getOffset() {
        return this.f;
    }

    public int hashCode() {
        return this.e.hashCode() ^ this.f.hashCode();
    }

    public long toEpochSecond() {
        return this.e.a(this.f);
    }

    public C6827lBb toLocalDate() {
        return this.e.toLocalDate();
    }

    public C7032oBb toLocalDateTime() {
        return this.e;
    }

    public C7239rBb toLocalTime() {
        return this.e.toLocalTime();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.e.toString());
        sb.append(this.f.toString());
        return sb.toString();
    }

    private BBb b(C7032oBb obb, PBb pBb) {
        if (this.e != obb || !this.f.equals(pBb)) {
            return new BBb(obb, pBb);
        }
        return this;
    }

    public static BBb a(C7032oBb obb, PBb pBb) {
        return new BBb(obb, pBb);
    }

    public boolean b(C7381tDb tdb) {
        return (tdb instanceof C6423fDb) || (tdb != null && tdb.a(this));
    }

    public static BBb a(C6623iBb ibb, NBb nBb) {
        C6355eDb.a(ibb, "instant");
        C6355eDb.a(nBb, "zone");
        PBb a2 = nBb.b().a(ibb);
        return new BBb(C7032oBb.a(ibb.J(), ibb.K(), a2), a2);
    }

    public BBb b(long j, DDb dDb) {
        if (dDb instanceof C6491gDb) {
            return b(this.e.b(j, dDb), this.f);
        }
        return (BBb) dDb.a(this, j);
    }

    /* JADX INFO: used method not loaded: iBb.a(oDb):null, types can be incorrect */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        return a(defpackage.C6623iBb.a(r3), (defpackage.NBb) r0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0014 */
    public static BBb a(C7036oDb odb) {
        if (odb instanceof BBb) {
            return (BBb) odb;
        }
        try {
            PBb a2 = PBb.a(odb);
            return a(C7032oBb.a(odb), a2);
        } catch (C5687cBb unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to obtain OffsetDateTime from TemporalAccessor: ");
            sb.append(odb);
            sb.append(", type ");
            sb.append(odb.getClass().getName());
            throw new C5687cBb(sb.toString());
        }
    }

    public FDb a(C7381tDb tdb) {
        if (!(tdb instanceof C6423fDb)) {
            return tdb.b(this);
        }
        if (tdb == C6423fDb.INSTANT_SECONDS || tdb == C6423fDb.OFFSET_SECONDS) {
            return tdb.range();
        }
        return this.e.a(tdb);
    }

    public BBb a(C7105pDb pdb) {
        if ((pdb instanceof C6827lBb) || (pdb instanceof C7239rBb) || (pdb instanceof C7032oBb)) {
            return b(this.e.a(pdb), this.f);
        }
        if (pdb instanceof C6623iBb) {
            return a((C6623iBb) pdb, (NBb) this.f);
        }
        if (pdb instanceof PBb) {
            return b(this.e, (PBb) pdb);
        }
        if (pdb instanceof BBb) {
            return (BBb) pdb;
        }
        return (BBb) pdb.a(this);
    }

    public BBb a(C7381tDb tdb, long j) {
        if (!(tdb instanceof C6423fDb)) {
            return (BBb) tdb.a(this, j);
        }
        C6423fDb fdb = (C6423fDb) tdb;
        int i = ABb.a[fdb.ordinal()];
        if (i == 1) {
            return a(C6623iBb.a(j, (long) J()), (NBb) this.f);
        }
        if (i != 2) {
            return b(this.e.a(tdb, j), this.f);
        }
        return b(this.e, PBb.a(fdb.a(j)));
    }

    public BBb a(long j, DDb dDb) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, dDb).b(1, dDb) : b(-j, dDb);
    }

    public <R> R a(CDb<R> cDb) {
        if (cDb == BDb.a()) {
            return C7034oCb.e;
        }
        if (cDb == BDb.e()) {
            return C6491gDb.NANOS;
        }
        if (cDb == BDb.d() || cDb == BDb.f()) {
            return getOffset();
        }
        if (cDb == BDb.b()) {
            return toLocalDate();
        }
        if (cDb == BDb.c()) {
            return toLocalTime();
        }
        if (cDb == BDb.g()) {
            return null;
        }
        return super.a(cDb);
    }

    public C6967nDb a(C6967nDb ndb) {
        return ndb.a((C7381tDb) C6423fDb.EPOCH_DAY, toLocalDate().toEpochDay()).a((C7381tDb) C6423fDb.NANO_OF_DAY, toLocalTime().M()).a((C7381tDb) C6423fDb.OFFSET_SECONDS, (long) getOffset().d());
    }

    /* renamed from: a */
    public int compareTo(BBb bBb) {
        if (getOffset().equals(bBb.getOffset())) {
            return toLocalDateTime().compareTo((ZBb<?>) bBb.toLocalDateTime());
        }
        int a2 = C6355eDb.a(toEpochSecond(), bBb.toEpochSecond());
        if (a2 == 0) {
            a2 = toLocalTime().K() - bBb.toLocalTime().K();
            if (a2 == 0) {
                a2 = toLocalDateTime().compareTo((ZBb<?>) bBb.toLocalDateTime());
            }
        }
        return a2;
    }

    /* access modifiers changed from: 0000 */
    public void a(DataOutput dataOutput) throws IOException {
        this.e.a(dataOutput);
        this.f.b(dataOutput);
    }

    static BBb a(DataInput dataInput) throws IOException {
        return a(C7032oBb.a(dataInput), PBb.a(dataInput));
    }
}
