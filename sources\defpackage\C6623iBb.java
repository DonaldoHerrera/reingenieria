package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* renamed from: iBb reason: default package and case insensitive filesystem */
/* compiled from: Instant */
public final class C6623iBb extends C6287dDb implements C6967nDb, C7105pDb, Comparable<C6623iBb>, Serializable {
    public static final C6623iBb a = new C6623iBb(0, 0);
    public static final C6623iBb b = a(-31557014167219200L, 0);
    public static final C6623iBb c = a(31556889864403199L, 999999999);
    public static final CDb<C6623iBb> d = new C6487gBb();
    private final long e;
    private final int f;

    private C6623iBb(long j, int i) {
        this.e = j;
        this.f = i;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new FBb(2, this);
    }

    public long J() {
        return this.e;
    }

    public int K() {
        return this.f;
    }

    public int c(C7381tDb tdb) {
        if (!(tdb instanceof C6423fDb)) {
            return a(tdb).a(tdb.c(this), tdb);
        }
        int i = C6555hBb.a[((C6423fDb) tdb).ordinal()];
        if (i == 1) {
            return this.f;
        }
        if (i == 2) {
            return this.f / 1000;
        }
        if (i == 3) {
            return this.f / 1000000;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported field: ");
        sb.append(tdb);
        throw new EDb(sb.toString());
    }

    public long d(C7381tDb tdb) {
        int i;
        if (!(tdb instanceof C6423fDb)) {
            return tdb.c(this);
        }
        int i2 = C6555hBb.a[((C6423fDb) tdb).ordinal()];
        if (i2 == 1) {
            i = this.f;
        } else if (i2 == 2) {
            i = this.f / 1000;
        } else if (i2 == 3) {
            i = this.f / 1000000;
        } else if (i2 == 4) {
            return this.e;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported field: ");
            sb.append(tdb);
            throw new EDb(sb.toString());
        }
        return (long) i;
    }

    public C6623iBb e(long j) {
        return b(j, 0);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6623iBb)) {
            return false;
        }
        C6623iBb ibb = (C6623iBb) obj;
        if (!(this.e == ibb.e && this.f == ibb.f)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        long j = this.e;
        return ((int) (j ^ (j >>> 32))) + (this.f * 51);
    }

    public String toString() {
        return JCb.m.a((C7036oDb) this);
    }

    public static C6623iBb b(long j) {
        return a(j, 0);
    }

    public boolean b(C7381tDb tdb) {
        boolean z = true;
        if (tdb instanceof C6423fDb) {
            if (!(tdb == C6423fDb.INSTANT_SECONDS || tdb == C6423fDb.NANO_OF_SECOND || tdb == C6423fDb.MICRO_OF_SECOND || tdb == C6423fDb.MILLI_OF_SECOND)) {
                z = false;
            }
            return z;
        }
        if (tdb == null || !tdb.a(this)) {
            z = false;
        }
        return z;
    }

    public static C6623iBb a(long j, long j2) {
        return a(C6355eDb.d(j, C6355eDb.b(j2, 1000000000)), C6355eDb.a(j2, 1000000000));
    }

    public C6623iBb b(long j, DDb dDb) {
        if (!(dDb instanceof C6491gDb)) {
            return (C6623iBb) dDb.a(this, j);
        }
        switch (C6555hBb.b[((C6491gDb) dDb).ordinal()]) {
            case 1:
                return d(j);
            case 2:
                return b(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return c(j);
            case 4:
                return e(j);
            case 5:
                return e(C6355eDb.b(j, 60));
            case 6:
                return e(C6355eDb.b(j, 3600));
            case 7:
                return e(C6355eDb.b(j, 43200));
            case 8:
                return e(C6355eDb.b(j, 86400));
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported unit: ");
                sb.append(dDb);
                throw new EDb(sb.toString());
        }
    }

    public static C6623iBb a(long j) {
        return a(C6355eDb.b(j, 1000), C6355eDb.a(j, 1000) * 1000000);
    }

    public C6623iBb c(long j) {
        return b(j / 1000, (j % 1000) * 1000000);
    }

    public C6623iBb d(long j) {
        return b(0, j);
    }

    public static C6623iBb a(C7036oDb odb) {
        try {
            return a(odb.d(C6423fDb.INSTANT_SECONDS), (long) odb.c(C6423fDb.NANO_OF_SECOND));
        } catch (C5687cBb e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to obtain Instant from TemporalAccessor: ");
            sb.append(odb);
            sb.append(", type ");
            sb.append(odb.getClass().getName());
            throw new C5687cBb(sb.toString(), e2);
        }
    }

    private static C6623iBb a(long j, int i) {
        if ((((long) i) | j) == 0) {
            return a;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new C6623iBb(j, i);
        }
        throw new C5687cBb("Instant exceeds minimum or maximum instant");
    }

    private C6623iBb b(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return a(C6355eDb.d(C6355eDb.d(this.e, j), j2 / 1000000000), ((long) this.f) + (j2 % 1000000000));
    }

    public FDb a(C7381tDb tdb) {
        return super.a(tdb);
    }

    public C6623iBb a(C7105pDb pdb) {
        return (C6623iBb) pdb.a(this);
    }

    public C6623iBb a(C7381tDb tdb, long j) {
        if (!(tdb instanceof C6423fDb)) {
            return (C6623iBb) tdb.a(this, j);
        }
        C6423fDb fdb = (C6423fDb) tdb;
        fdb.b(j);
        int i = C6555hBb.a[fdb.ordinal()];
        if (i == 1) {
            return j != ((long) this.f) ? a(this.e, (int) j) : this;
        } else if (i == 2) {
            int i2 = ((int) j) * 1000;
            return i2 != this.f ? a(this.e, i2) : this;
        } else if (i == 3) {
            int i3 = ((int) j) * 1000000;
            return i3 != this.f ? a(this.e, i3) : this;
        } else if (i == 4) {
            return j != this.e ? a(j, this.f) : this;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported field: ");
            sb.append(tdb);
            throw new EDb(sb.toString());
        }
    }

    public C6623iBb a(long j, DDb dDb) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, dDb).b(1, dDb) : b(-j, dDb);
    }

    public <R> R a(CDb<R> cDb) {
        if (cDb == BDb.e()) {
            return C6491gDb.NANOS;
        }
        if (cDb == BDb.b() || cDb == BDb.c() || cDb == BDb.a() || cDb == BDb.g() || cDb == BDb.f() || cDb == BDb.d()) {
            return null;
        }
        return cDb.a(this);
    }

    public C6967nDb a(C6967nDb ndb) {
        return ndb.a((C7381tDb) C6423fDb.INSTANT_SECONDS, this.e).a((C7381tDb) C6423fDb.NANO_OF_SECOND, (long) this.f);
    }

    public TBb a(NBb nBb) {
        return TBb.a(this, nBb);
    }

    /* renamed from: a */
    public int compareTo(C6623iBb ibb) {
        int a2 = C6355eDb.a(this.e, ibb.e);
        if (a2 != 0) {
            return a2;
        }
        return this.f - ibb.f;
    }

    /* access modifiers changed from: 0000 */
    public void a(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.e);
        dataOutput.writeInt(this.f);
    }

    static C6623iBb a(DataInput dataInput) throws IOException {
        return a(dataInput.readLong(), (long) dataInput.readInt());
    }
}
