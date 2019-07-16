package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;

/* renamed from: TBb reason: default package */
/* compiled from: ZonedDateTime */
public final class TBb extends C6353eCb<C6827lBb> implements C6967nDb, Serializable {
    public static final CDb<TBb> b = new RBb();
    private final C7032oBb c;
    private final PBb d;
    private final NBb e;

    private TBb(C7032oBb obb, PBb pBb, NBb nBb) {
        this.c = obb;
        this.d = pBb;
        this.e = nBb;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new FBb(6, this);
    }

    public int J() {
        return this.c.J();
    }

    public int c(C7381tDb tdb) {
        if (!(tdb instanceof C6423fDb)) {
            return super.c(tdb);
        }
        int i = SBb.a[((C6423fDb) tdb).ordinal()];
        if (i == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Field too large for an int: ");
            sb.append(tdb);
            throw new C5687cBb(sb.toString());
        } else if (i != 2) {
            return this.c.c(tdb);
        } else {
            return getOffset().d();
        }
    }

    public long d(C7381tDb tdb) {
        if (!(tdb instanceof C6423fDb)) {
            return tdb.c(this);
        }
        int i = SBb.a[((C6423fDb) tdb).ordinal()];
        if (i == 1) {
            return toEpochSecond();
        }
        if (i != 2) {
            return this.c.d(tdb);
        }
        return (long) getOffset().d();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TBb)) {
            return false;
        }
        TBb tBb = (TBb) obj;
        if (!this.c.equals(tBb.c) || !this.d.equals(tBb.d) || !this.e.equals(tBb.e)) {
            z = false;
        }
        return z;
    }

    public PBb getOffset() {
        return this.d;
    }

    public NBb getZone() {
        return this.e;
    }

    public int hashCode() {
        return (this.c.hashCode() ^ this.d.hashCode()) ^ Integer.rotateLeft(this.e.hashCode(), 3);
    }

    public C7239rBb toLocalTime() {
        return this.c.toLocalTime();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c.toString());
        sb.append(this.d.toString());
        String sb2 = sb.toString();
        if (this.d == this.e) {
            return sb2;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append('[');
        sb3.append(this.e.toString());
        sb3.append(']');
        return sb3.toString();
    }

    public C6827lBb toLocalDate() {
        return this.c.toLocalDate();
    }

    public C7032oBb toLocalDateTime() {
        return this.c;
    }

    private static TBb b(C7032oBb obb, PBb pBb, NBb nBb) {
        C6355eDb.a(obb, "localDateTime");
        C6355eDb.a(pBb, "offset");
        C6355eDb.a(nBb, "zone");
        if (!(nBb instanceof PBb) || pBb.equals(nBb)) {
            return new TBb(obb, pBb, nBb);
        }
        throw new IllegalArgumentException("ZoneId must match ZoneOffset");
    }

    public static TBb a(C7032oBb obb, NBb nBb) {
        return a(obb, nBb, (PBb) null);
    }

    public static TBb a(C7032oBb obb, NBb nBb, PBb pBb) {
        C6355eDb.a(obb, "localDateTime");
        C6355eDb.a(nBb, "zone");
        if (nBb instanceof PBb) {
            return new TBb(obb, (PBb) nBb, nBb);
        }
        NDb b2 = nBb.b();
        List b3 = b2.b(obb);
        if (b3.size() == 1) {
            pBb = (PBb) b3.get(0);
        } else if (b3.size() == 0) {
            KDb a = b2.a(obb);
            obb = obb.e(a.c().a());
            pBb = a.e();
        } else if (pBb == null || !b3.contains(pBb)) {
            Object obj = b3.get(0);
            C6355eDb.a(obj, "offset");
            pBb = (PBb) obj;
        }
        return new TBb(obb, pBb, nBb);
    }

    private TBb b(C7032oBb obb) {
        return a(obb, this.e, this.d);
    }

    public boolean b(C7381tDb tdb) {
        return (tdb instanceof C6423fDb) || (tdb != null && tdb.a(this));
    }

    public TBb b(long j, DDb dDb) {
        if (!(dDb instanceof C6491gDb)) {
            return (TBb) dDb.a(this, j);
        }
        if (dDb.isDateBased()) {
            return b(this.c.b(j, dDb));
        }
        return a(this.c.b(j, dDb));
    }

    public static TBb a(C6623iBb ibb, NBb nBb) {
        C6355eDb.a(ibb, "instant");
        C6355eDb.a(nBb, "zone");
        return a(ibb.J(), ibb.K(), nBb);
    }

    public static TBb a(C7032oBb obb, PBb pBb, NBb nBb) {
        C6355eDb.a(obb, "localDateTime");
        C6355eDb.a(pBb, "offset");
        C6355eDb.a(nBb, "zone");
        return a(obb.a(pBb), obb.J(), nBb);
    }

    private static TBb a(long j, int i, NBb nBb) {
        PBb a = nBb.b().a(C6623iBb.a(j, (long) i));
        return new TBb(C7032oBb.a(j, i, a), a, nBb);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|5|(3:7|8|9)|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0024 */
    public static TBb a(C7036oDb odb) {
        if (odb instanceof TBb) {
            return (TBb) odb;
        }
        try {
            NBb a = NBb.a(odb);
            if (odb.b(C6423fDb.INSTANT_SECONDS)) {
                return a(odb.d(C6423fDb.INSTANT_SECONDS), odb.c(C6423fDb.NANO_OF_SECOND), a);
            }
            return a(C7032oBb.a(odb), a);
        } catch (C5687cBb unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to obtain ZonedDateTime from TemporalAccessor: ");
            sb.append(odb);
            sb.append(", type ");
            sb.append(odb.getClass().getName());
            throw new C5687cBb(sb.toString());
        }
    }

    private TBb a(C7032oBb obb) {
        return a(obb, this.d, this.e);
    }

    private TBb a(PBb pBb) {
        return (pBb.equals(this.d) || !this.e.b().a(this.c, pBb)) ? this : new TBb(this.c, pBb, this.e);
    }

    public FDb a(C7381tDb tdb) {
        if (!(tdb instanceof C6423fDb)) {
            return tdb.b(this);
        }
        if (tdb == C6423fDb.INSTANT_SECONDS || tdb == C6423fDb.OFFSET_SECONDS) {
            return tdb.range();
        }
        return this.c.a(tdb);
    }

    public TBb a(NBb nBb) {
        C6355eDb.a(nBb, "zone");
        return this.e.equals(nBb) ? this : a(this.c, nBb, this.d);
    }

    public TBb a(C7105pDb pdb) {
        if (pdb instanceof C6827lBb) {
            return b(C7032oBb.a((C6827lBb) pdb, this.c.toLocalTime()));
        }
        if (pdb instanceof C7239rBb) {
            return b(C7032oBb.a(this.c.toLocalDate(), (C7239rBb) pdb));
        }
        if (pdb instanceof C7032oBb) {
            return b((C7032oBb) pdb);
        }
        if (pdb instanceof C6623iBb) {
            C6623iBb ibb = (C6623iBb) pdb;
            return a(ibb.J(), ibb.K(), this.e);
        } else if (pdb instanceof PBb) {
            return a((PBb) pdb);
        } else {
            return (TBb) pdb.a(this);
        }
    }

    public TBb a(C7381tDb tdb, long j) {
        if (!(tdb instanceof C6423fDb)) {
            return (TBb) tdb.a(this, j);
        }
        C6423fDb fdb = (C6423fDb) tdb;
        int i = SBb.a[fdb.ordinal()];
        if (i == 1) {
            return a(j, J(), this.e);
        }
        if (i != 2) {
            return b(this.c.a(tdb, j));
        }
        return a(PBb.a(fdb.a(j)));
    }

    public TBb a(long j, DDb dDb) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, dDb).b(1, dDb) : b(-j, dDb);
    }

    public <R> R a(CDb<R> cDb) {
        if (cDb == BDb.b()) {
            return toLocalDate();
        }
        return super.a(cDb);
    }

    /* access modifiers changed from: 0000 */
    public void a(DataOutput dataOutput) throws IOException {
        this.c.a(dataOutput);
        this.d.b(dataOutput);
        this.e.a(dataOutput);
    }

    static TBb a(DataInput dataInput) throws IOException {
        return b(C7032oBb.a(dataInput), PBb.a(dataInput), (NBb) FBb.a(dataInput));
    }
}
