package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* renamed from: LBb reason: default package */
/* compiled from: YearMonth */
public final class LBb extends C6287dDb implements C6967nDb, C7105pDb, Comparable<LBb>, Serializable {
    public static final CDb<LBb> a = new JBb();
    private static final JCb b;
    private final int c;
    private final int d;

    static {
        OCb oCb = new OCb();
        oCb.a((C7381tDb) C6423fDb.YEAR, 4, 10, YCb.EXCEEDS_PAD);
        oCb.a('-');
        oCb.a((C7381tDb) C6423fDb.MONTH_OF_YEAR, 2);
        b = oCb.j();
    }

    private LBb(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    private long K() {
        return (((long) this.c) * 12) + ((long) (this.d - 1));
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new FBb(68, this);
    }

    public int J() {
        return this.c;
    }

    public int c(C7381tDb tdb) {
        return a(tdb).a(d(tdb), tdb);
    }

    public long d(C7381tDb tdb) {
        int i;
        if (!(tdb instanceof C6423fDb)) {
            return tdb.c(this);
        }
        int i2 = KBb.a[((C6423fDb) tdb).ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            i = this.d;
        } else if (i2 == 2) {
            return K();
        } else {
            if (i2 == 3) {
                int i4 = this.c;
                if (i4 < 1) {
                    i4 = 1 - i4;
                }
                return (long) i4;
            } else if (i2 == 4) {
                i = this.c;
            } else if (i2 == 5) {
                if (this.c < 1) {
                    i3 = 0;
                }
                return (long) i3;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported field: ");
                sb.append(tdb);
                throw new EDb(sb.toString());
            }
        }
        return (long) i;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LBb)) {
            return false;
        }
        LBb lBb = (LBb) obj;
        if (!(this.c == lBb.c && this.d == lBb.d)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.c ^ (this.d << 27);
    }

    public String toString() {
        int abs = Math.abs(this.c);
        StringBuilder sb = new StringBuilder(9);
        if (abs < 1000) {
            int i = this.c;
            if (i < 0) {
                sb.append(i - 10000);
                sb.deleteCharAt(1);
            } else {
                sb.append(i + 10000);
                sb.deleteCharAt(0);
            }
        } else {
            sb.append(this.c);
        }
        sb.append(this.d < 10 ? "-0" : "-");
        sb.append(this.d);
        return sb.toString();
    }

    private LBb b(int i, int i2) {
        if (this.c == i && this.d == i2) {
            return this;
        }
        return new LBb(i, i2);
    }

    public static LBb a(int i, int i2) {
        C6423fDb.YEAR.b((long) i);
        C6423fDb.MONTH_OF_YEAR.b((long) i2);
        return new LBb(i, i2);
    }

    public boolean b(C7381tDb tdb) {
        boolean z = true;
        if (tdb instanceof C6423fDb) {
            if (!(tdb == C6423fDb.YEAR || tdb == C6423fDb.MONTH_OF_YEAR || tdb == C6423fDb.PROLEPTIC_MONTH || tdb == C6423fDb.YEAR_OF_ERA || tdb == C6423fDb.ERA)) {
                z = false;
            }
            return z;
        }
        if (tdb == null || !tdb.a(this)) {
            z = false;
        }
        return z;
    }

    public static LBb a(C7036oDb odb) {
        if (odb instanceof LBb) {
            return (LBb) odb;
        }
        try {
            if (!C7034oCb.e.equals(C6625iCb.b(odb))) {
                odb = C6827lBb.a(odb);
            }
            return a(odb.c(C6423fDb.YEAR), odb.c(C6423fDb.MONTH_OF_YEAR));
        } catch (C5687cBb unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to obtain YearMonth from TemporalAccessor: ");
            sb.append(odb);
            sb.append(", type ");
            sb.append(odb.getClass().getName());
            throw new C5687cBb(sb.toString());
        }
    }

    public LBb b(int i) {
        C6423fDb.YEAR.b((long) i);
        return b(i, this.d);
    }

    public LBb b(long j, DDb dDb) {
        if (!(dDb instanceof C6491gDb)) {
            return (LBb) dDb.a(this, j);
        }
        switch (KBb.b[((C6491gDb) dDb).ordinal()]) {
            case 1:
                return a(j);
            case 2:
                return b(j);
            case 3:
                return b(C6355eDb.b(j, 10));
            case 4:
                return b(C6355eDb.b(j, 100));
            case 5:
                return b(C6355eDb.b(j, 1000));
            case 6:
                C6423fDb fdb = C6423fDb.ERA;
                return a((C7381tDb) fdb, C6355eDb.d(d(fdb), j));
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported unit: ");
                sb.append(dDb);
                throw new EDb(sb.toString());
        }
    }

    public FDb a(C7381tDb tdb) {
        if (tdb != C6423fDb.YEAR_OF_ERA) {
            return super.a(tdb);
        }
        return FDb.a(1, J() <= 0 ? 1000000000 : 999999999);
    }

    public LBb a(C7105pDb pdb) {
        return (LBb) pdb.a(this);
    }

    public LBb a(C7381tDb tdb, long j) {
        if (!(tdb instanceof C6423fDb)) {
            return (LBb) tdb.a(this, j);
        }
        C6423fDb fdb = (C6423fDb) tdb;
        fdb.b(j);
        int i = KBb.a[fdb.ordinal()];
        if (i == 1) {
            return a((int) j);
        }
        if (i == 2) {
            return a(j - d(C6423fDb.PROLEPTIC_MONTH));
        }
        if (i == 3) {
            if (this.c < 1) {
                j = 1 - j;
            }
            return b((int) j);
        } else if (i == 4) {
            return b((int) j);
        } else {
            if (i == 5) {
                return d(C6423fDb.ERA) == j ? this : b(1 - this.c);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported field: ");
            sb.append(tdb);
            throw new EDb(sb.toString());
        }
    }

    public LBb b(long j) {
        if (j == 0) {
            return this;
        }
        return b(C6423fDb.YEAR.a(((long) this.c) + j), this.d);
    }

    public LBb a(int i) {
        C6423fDb.MONTH_OF_YEAR.b((long) i);
        return b(this.c, i);
    }

    public LBb a(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.c) * 12) + ((long) (this.d - 1)) + j;
        return b(C6423fDb.YEAR.a(C6355eDb.b(j2, 12)), C6355eDb.a(j2, 12) + 1);
    }

    public LBb a(long j, DDb dDb) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, dDb).b(1, dDb) : b(-j, dDb);
    }

    public <R> R a(CDb<R> cDb) {
        if (cDb == BDb.a()) {
            return C7034oCb.e;
        }
        if (cDb == BDb.e()) {
            return C6491gDb.MONTHS;
        }
        if (cDb == BDb.b() || cDb == BDb.c() || cDb == BDb.f() || cDb == BDb.g() || cDb == BDb.d()) {
            return null;
        }
        return super.a(cDb);
    }

    public C6967nDb a(C6967nDb ndb) {
        if (C6625iCb.b((C7036oDb) ndb).equals(C7034oCb.e)) {
            return ndb.a((C7381tDb) C6423fDb.PROLEPTIC_MONTH, K());
        }
        throw new C5687cBb("Adjustment only supported on ISO date-time");
    }

    /* renamed from: a */
    public int compareTo(LBb lBb) {
        int i = this.c - lBb.c;
        return i == 0 ? this.d - lBb.d : i;
    }

    /* access modifiers changed from: 0000 */
    public void a(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.c);
        dataOutput.writeByte(this.d);
    }

    static LBb a(DataInput dataInput) throws IOException {
        return a(dataInput.readInt(), (int) dataInput.readByte());
    }
}
