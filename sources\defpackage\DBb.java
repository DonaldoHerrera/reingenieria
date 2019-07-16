package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* renamed from: DBb reason: default package */
/* compiled from: OffsetTime */
public final class DBb extends C6287dDb implements C6967nDb, C7105pDb, Comparable<DBb>, Serializable {
    public static final DBb a = C7239rBb.a.a(PBb.h);
    public static final DBb b = C7239rBb.b.a(PBb.g);
    public static final CDb<DBb> c = new CBb();
    private final C7239rBb d;
    private final PBb e;

    private DBb(C7239rBb rbb, PBb pBb) {
        C6355eDb.a(rbb, "time");
        this.d = rbb;
        C6355eDb.a(pBb, "offset");
        this.e = pBb;
    }

    private long J() {
        return this.d.M() - (((long) this.e.d()) * 1000000000);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new FBb(66, this);
    }

    public int c(C7381tDb tdb) {
        return super.c(tdb);
    }

    public long d(C7381tDb tdb) {
        if (!(tdb instanceof C6423fDb)) {
            return tdb.c(this);
        }
        if (tdb == C6423fDb.OFFSET_SECONDS) {
            return (long) getOffset().d();
        }
        return this.d.d(tdb);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DBb)) {
            return false;
        }
        DBb dBb = (DBb) obj;
        if (!this.d.equals(dBb.d) || !this.e.equals(dBb.e)) {
            z = false;
        }
        return z;
    }

    public PBb getOffset() {
        return this.e;
    }

    public int hashCode() {
        return this.d.hashCode() ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.toString());
        sb.append(this.e.toString());
        return sb.toString();
    }

    private DBb b(C7239rBb rbb, PBb pBb) {
        if (this.d != rbb || !this.e.equals(pBb)) {
            return new DBb(rbb, pBb);
        }
        return this;
    }

    public static DBb a(C7239rBb rbb, PBb pBb) {
        return new DBb(rbb, pBb);
    }

    public boolean b(C7381tDb tdb) {
        boolean z = true;
        if (tdb instanceof C6423fDb) {
            if (!tdb.isTimeBased() && tdb != C6423fDb.OFFSET_SECONDS) {
                z = false;
            }
            return z;
        }
        if (tdb == null || !tdb.a(this)) {
            z = false;
        }
        return z;
    }

    public static DBb a(C7036oDb odb) {
        if (odb instanceof DBb) {
            return (DBb) odb;
        }
        try {
            return new DBb(C7239rBb.a(odb), PBb.a(odb));
        } catch (C5687cBb unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to obtain OffsetTime from TemporalAccessor: ");
            sb.append(odb);
            sb.append(", type ");
            sb.append(odb.getClass().getName());
            throw new C5687cBb(sb.toString());
        }
    }

    public DBb b(long j, DDb dDb) {
        if (dDb instanceof C6491gDb) {
            return b(this.d.b(j, dDb), this.e);
        }
        return (DBb) dDb.a(this, j);
    }

    public FDb a(C7381tDb tdb) {
        if (!(tdb instanceof C6423fDb)) {
            return tdb.b(this);
        }
        if (tdb == C6423fDb.OFFSET_SECONDS) {
            return tdb.range();
        }
        return this.d.a(tdb);
    }

    public DBb a(C7105pDb pdb) {
        if (pdb instanceof C7239rBb) {
            return b((C7239rBb) pdb, this.e);
        }
        if (pdb instanceof PBb) {
            return b(this.d, (PBb) pdb);
        }
        if (pdb instanceof DBb) {
            return (DBb) pdb;
        }
        return (DBb) pdb.a(this);
    }

    public DBb a(C7381tDb tdb, long j) {
        if (!(tdb instanceof C6423fDb)) {
            return (DBb) tdb.a(this, j);
        }
        if (tdb != C6423fDb.OFFSET_SECONDS) {
            return b(this.d.a(tdb, j), this.e);
        }
        return b(this.d, PBb.a(((C6423fDb) tdb).a(j)));
    }

    public DBb a(long j, DDb dDb) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, dDb).b(1, dDb) : b(-j, dDb);
    }

    public <R> R a(CDb<R> cDb) {
        if (cDb == BDb.e()) {
            return C6491gDb.NANOS;
        }
        if (cDb == BDb.d() || cDb == BDb.f()) {
            return getOffset();
        }
        if (cDb == BDb.c()) {
            return this.d;
        }
        if (cDb == BDb.a() || cDb == BDb.b() || cDb == BDb.g()) {
            return null;
        }
        return super.a(cDb);
    }

    public C6967nDb a(C6967nDb ndb) {
        return ndb.a((C7381tDb) C6423fDb.NANO_OF_DAY, this.d.M()).a((C7381tDb) C6423fDb.OFFSET_SECONDS, (long) getOffset().d());
    }

    /* renamed from: a */
    public int compareTo(DBb dBb) {
        if (this.e.equals(dBb.e)) {
            return this.d.compareTo(dBb.d);
        }
        int a2 = C6355eDb.a(J(), dBb.J());
        if (a2 == 0) {
            a2 = this.d.compareTo(dBb.d);
        }
        return a2;
    }

    /* access modifiers changed from: 0000 */
    public void a(DataOutput dataOutput) throws IOException {
        this.d.a(dataOutput);
        this.e.b(dataOutput);
    }

    static DBb a(DataInput dataInput) throws IOException {
        return a(C7239rBb.a(dataInput), PBb.a(dataInput));
    }
}
