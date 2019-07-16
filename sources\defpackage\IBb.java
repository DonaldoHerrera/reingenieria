package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* renamed from: IBb reason: default package */
/* compiled from: Year */
public final class IBb extends C6287dDb implements C6967nDb, C7105pDb, Comparable<IBb>, Serializable {
    public static final CDb<IBb> a = new GBb();
    private static final JCb b;
    private final int c;

    static {
        OCb oCb = new OCb();
        oCb.a((C7381tDb) C6423fDb.YEAR, 4, 10, YCb.EXCEEDS_PAD);
        b = oCb.j();
    }

    private IBb(int i) {
        this.c = i;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new FBb(67, this);
    }

    public int c(C7381tDb tdb) {
        return a(tdb).a(d(tdb), tdb);
    }

    public long d(C7381tDb tdb) {
        if (!(tdb instanceof C6423fDb)) {
            return tdb.c(this);
        }
        int i = HBb.a[((C6423fDb) tdb).ordinal()];
        int i2 = 1;
        if (i == 1) {
            int i3 = this.c;
            if (i3 < 1) {
                i3 = 1 - i3;
            }
            return (long) i3;
        } else if (i == 2) {
            return (long) this.c;
        } else {
            if (i == 3) {
                if (this.c < 1) {
                    i2 = 0;
                }
                return (long) i2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported field: ");
            sb.append(tdb);
            throw new EDb(sb.toString());
        }
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IBb)) {
            return false;
        }
        if (this.c != ((IBb) obj).c) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.c;
    }

    public String toString() {
        return Integer.toString(this.c);
    }

    public boolean b(C7381tDb tdb) {
        boolean z = true;
        if (tdb instanceof C6423fDb) {
            if (!(tdb == C6423fDb.YEAR || tdb == C6423fDb.YEAR_OF_ERA || tdb == C6423fDb.ERA)) {
                z = false;
            }
            return z;
        }
        if (tdb == null || !tdb.a(this)) {
            z = false;
        }
        return z;
    }

    public static IBb a(int i) {
        C6423fDb.YEAR.b((long) i);
        return new IBb(i);
    }

    public IBb b(long j, DDb dDb) {
        if (!(dDb instanceof C6491gDb)) {
            return (IBb) dDb.a(this, j);
        }
        int i = HBb.b[((C6491gDb) dDb).ordinal()];
        if (i == 1) {
            return b(j);
        }
        if (i == 2) {
            return b(C6355eDb.b(j, 10));
        }
        if (i == 3) {
            return b(C6355eDb.b(j, 100));
        }
        if (i == 4) {
            return b(C6355eDb.b(j, 1000));
        }
        if (i == 5) {
            C6423fDb fdb = C6423fDb.ERA;
            return a((C7381tDb) fdb, C6355eDb.d(d(fdb), j));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported unit: ");
        sb.append(dDb);
        throw new EDb(sb.toString());
    }

    public static IBb a(C7036oDb odb) {
        if (odb instanceof IBb) {
            return (IBb) odb;
        }
        try {
            if (!C7034oCb.e.equals(C6625iCb.b(odb))) {
                odb = C6827lBb.a(odb);
            }
            return a(odb.c(C6423fDb.YEAR));
        } catch (C5687cBb unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to obtain Year from TemporalAccessor: ");
            sb.append(odb);
            sb.append(", type ");
            sb.append(odb.getClass().getName());
            throw new C5687cBb(sb.toString());
        }
    }

    public static boolean a(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }

    public FDb a(C7381tDb tdb) {
        if (tdb != C6423fDb.YEAR_OF_ERA) {
            return super.a(tdb);
        }
        return FDb.a(1, this.c <= 0 ? 1000000000 : 999999999);
    }

    public IBb b(long j) {
        return j == 0 ? this : a(C6423fDb.YEAR.a(((long) this.c) + j));
    }

    public IBb a(C7105pDb pdb) {
        return (IBb) pdb.a(this);
    }

    public IBb a(C7381tDb tdb, long j) {
        if (!(tdb instanceof C6423fDb)) {
            return (IBb) tdb.a(this, j);
        }
        C6423fDb fdb = (C6423fDb) tdb;
        fdb.b(j);
        int i = HBb.a[fdb.ordinal()];
        if (i == 1) {
            if (this.c < 1) {
                j = 1 - j;
            }
            return a((int) j);
        } else if (i == 2) {
            return a((int) j);
        } else {
            if (i == 3) {
                return d(C6423fDb.ERA) == j ? this : a(1 - this.c);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported field: ");
            sb.append(tdb);
            throw new EDb(sb.toString());
        }
    }

    public IBb a(long j, DDb dDb) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, dDb).b(1, dDb) : b(-j, dDb);
    }

    public <R> R a(CDb<R> cDb) {
        if (cDb == BDb.a()) {
            return C7034oCb.e;
        }
        if (cDb == BDb.e()) {
            return C6491gDb.YEARS;
        }
        if (cDb == BDb.b() || cDb == BDb.c() || cDb == BDb.f() || cDb == BDb.g() || cDb == BDb.d()) {
            return null;
        }
        return super.a(cDb);
    }

    public C6967nDb a(C6967nDb ndb) {
        if (C6625iCb.b((C7036oDb) ndb).equals(C7034oCb.e)) {
            return ndb.a((C7381tDb) C6423fDb.YEAR, (long) this.c);
        }
        throw new C5687cBb("Adjustment only supported on ISO date-time");
    }

    /* renamed from: a */
    public int compareTo(IBb iBb) {
        return this.c - iBb.c;
    }

    /* access modifiers changed from: 0000 */
    public void a(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.c);
    }

    static IBb a(DataInput dataInput) throws IOException {
        return a(dataInput.readInt());
    }
}
