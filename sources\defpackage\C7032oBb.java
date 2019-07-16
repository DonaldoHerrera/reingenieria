package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* renamed from: oBb reason: default package and case insensitive filesystem */
/* compiled from: LocalDateTime */
public final class C7032oBb extends ZBb<C6827lBb> implements C6967nDb, C7105pDb, Serializable {
    public static final C7032oBb b = a(C6827lBb.b, C7239rBb.a);
    public static final C7032oBb c = a(C6827lBb.c, C7239rBb.b);
    public static final CDb<C7032oBb> d = new C6895mBb();
    private final C6827lBb e;
    private final C7239rBb f;

    private C7032oBb(C6827lBb lbb, C7239rBb rbb) {
        this.e = lbb;
        this.f = rbb;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new FBb(4, this);
    }

    public int J() {
        return this.f.K();
    }

    public int K() {
        return this.f.L();
    }

    public int L() {
        return this.e.O();
    }

    public int c(C7381tDb tdb) {
        if (!(tdb instanceof C6423fDb)) {
            return super.c(tdb);
        }
        return tdb.isTimeBased() ? this.f.c(tdb) : this.e.c(tdb);
    }

    public long d(C7381tDb tdb) {
        if (!(tdb instanceof C6423fDb)) {
            return tdb.c(this);
        }
        return tdb.isTimeBased() ? this.f.d(tdb) : this.e.d(tdb);
    }

    public C7032oBb e(long j) {
        return a(this.e, 0, 0, j, 0, 1);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7032oBb)) {
            return false;
        }
        C7032oBb obb = (C7032oBb) obj;
        if (!this.e.equals(obb.e) || !this.f.equals(obb.f)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.e.hashCode() ^ this.f.hashCode();
    }

    public C7239rBb toLocalTime() {
        return this.f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.e.toString());
        sb.append('T');
        sb.append(this.f.toString());
        return sb.toString();
    }

    public C6827lBb toLocalDate() {
        return this.e;
    }

    private C7032oBb b(C6827lBb lbb, C7239rBb rbb) {
        if (this.e == lbb && this.f == rbb) {
            return this;
        }
        return new C7032oBb(lbb, rbb);
    }

    public C7032oBb c(long j) {
        return a(this.e, 0, j, 0, 0, 1);
    }

    public C7032oBb d(long j) {
        return a(this.e, 0, 0, 0, j, 1);
    }

    public boolean b(C7381tDb tdb) {
        boolean z = true;
        if (tdb instanceof C6423fDb) {
            if (!tdb.isDateBased() && !tdb.isTimeBased()) {
                z = false;
            }
            return z;
        }
        if (tdb == null || !tdb.a(this)) {
            z = false;
        }
        return z;
    }

    public BBb c(PBb pBb) {
        return BBb.a(this, pBb);
    }

    public boolean c(ZBb<?> zBb) {
        if (!(zBb instanceof C7032oBb)) {
            return super.c(zBb);
        }
        return a((C7032oBb) zBb) < 0;
    }

    public static C7032oBb a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new C7032oBb(C6827lBb.a(i, i2, i3), C7239rBb.a(i4, i5, i6, i7));
    }

    public C7032oBb b(long j, DDb dDb) {
        if (!(dDb instanceof C6491gDb)) {
            return (C7032oBb) dDb.a(this, j);
        }
        switch (C6963nBb.a[((C6491gDb) dDb).ordinal()]) {
            case 1:
                return d(j);
            case 2:
                return a(j / 86400000000L).d((j % 86400000000L) * 1000);
            case 3:
                return a(j / 86400000).d((j % 86400000) * 1000000);
            case 4:
                return e(j);
            case 5:
                return c(j);
            case 6:
                return b(j);
            case 7:
                return a(j / 256).b((j % 256) * 12);
            default:
                return b(this.e.b(j, dDb), this.f);
        }
    }

    public static C7032oBb a(C6827lBb lbb, C7239rBb rbb) {
        C6355eDb.a(lbb, "date");
        C6355eDb.a(rbb, "time");
        return new C7032oBb(lbb, rbb);
    }

    public static C7032oBb a(long j, int i, PBb pBb) {
        C6355eDb.a(pBb, "offset");
        long d2 = j + ((long) pBb.d());
        return new C7032oBb(C6827lBb.c(C6355eDb.b(d2, 86400)), C7239rBb.a((long) C6355eDb.a(d2, 86400), i));
    }

    public C7032oBb b(long j) {
        return a(this.e, j, 0, 0, 0, 1);
    }

    public static C7032oBb a(C7036oDb odb) {
        if (odb instanceof C7032oBb) {
            return (C7032oBb) odb;
        }
        if (odb instanceof TBb) {
            return ((TBb) odb).toLocalDateTime();
        }
        try {
            return new C7032oBb(C6827lBb.a(odb), C7239rBb.a(odb));
        } catch (C5687cBb unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to obtain LocalDateTime from TemporalAccessor: ");
            sb.append(odb);
            sb.append(", type ");
            sb.append(odb.getClass().getName());
            throw new C5687cBb(sb.toString());
        }
    }

    public boolean b(ZBb<?> zBb) {
        if (!(zBb instanceof C7032oBb)) {
            return super.b(zBb);
        }
        return a((C7032oBb) zBb) > 0;
    }

    public FDb a(C7381tDb tdb) {
        if (!(tdb instanceof C6423fDb)) {
            return tdb.b(this);
        }
        return tdb.isTimeBased() ? this.f.a(tdb) : this.e.a(tdb);
    }

    public C7032oBb a(C7105pDb pdb) {
        if (pdb instanceof C6827lBb) {
            return b((C6827lBb) pdb, this.f);
        }
        if (pdb instanceof C7239rBb) {
            return b(this.e, (C7239rBb) pdb);
        }
        if (pdb instanceof C7032oBb) {
            return (C7032oBb) pdb;
        }
        return (C7032oBb) pdb.a(this);
    }

    public C7032oBb a(C7381tDb tdb, long j) {
        if (!(tdb instanceof C6423fDb)) {
            return (C7032oBb) tdb.a(this, j);
        }
        if (tdb.isTimeBased()) {
            return b(this.e, this.f.a(tdb, j));
        }
        return b(this.e.a(tdb, j), this.f);
    }

    public C7032oBb a(long j) {
        return b(this.e.d(j), this.f);
    }

    public C7032oBb a(long j, DDb dDb) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, dDb).b(1, dDb) : b(-j, dDb);
    }

    private C7032oBb a(C6827lBb lbb, long j, long j2, long j3, long j4, int i) {
        C6827lBb lbb2 = lbb;
        if ((j | j2 | j3 | j4) == 0) {
            return b(lbb2, this.f);
        }
        long j5 = (long) i;
        long j6 = ((j4 / 86400000000000L) + (j3 / 86400) + (j2 / 1440) + (j / 24)) * j5;
        long j7 = (j4 % 86400000000000L) + ((j3 % 86400) * 1000000000) + ((j2 % 1440) * 60000000000L) + ((j % 24) * 3600000000000L);
        long M = this.f.M();
        long j8 = (j7 * j5) + M;
        long b2 = j6 + C6355eDb.b(j8, 86400000000000L);
        long c2 = C6355eDb.c(j8, 86400000000000L);
        return b(lbb2.d(b2), c2 == M ? this.f : C7239rBb.a(c2));
    }

    public <R> R a(CDb<R> cDb) {
        if (cDb == BDb.b()) {
            return toLocalDate();
        }
        return super.a(cDb);
    }

    public C6967nDb a(C6967nDb ndb) {
        return super.a(ndb);
    }

    public TBb a(NBb nBb) {
        return TBb.a(this, nBb);
    }

    /* renamed from: a */
    public int compareTo(ZBb<?> zBb) {
        if (zBb instanceof C7032oBb) {
            return a((C7032oBb) zBb);
        }
        return super.compareTo(zBb);
    }

    private int a(C7032oBb obb) {
        int a = this.e.a(obb.toLocalDate());
        return a == 0 ? this.f.compareTo(obb.toLocalTime()) : a;
    }

    /* access modifiers changed from: 0000 */
    public void a(DataOutput dataOutput) throws IOException {
        this.e.a(dataOutput);
        this.f.a(dataOutput);
    }

    static C7032oBb a(DataInput dataInput) throws IOException {
        return a(C6827lBb.a(dataInput), C7239rBb.a(dataInput));
    }
}
