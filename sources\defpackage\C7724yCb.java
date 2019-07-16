package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;

/* renamed from: yCb reason: default package and case insensitive filesystem */
/* compiled from: MinguoDate */
public final class C7724yCb extends VBb<C7724yCb> implements Serializable {
    private final C6827lBb b;

    C7724yCb(C6827lBb lbb) {
        C6355eDb.a(lbb, "date");
        this.b = lbb;
    }

    private long J() {
        return ((((long) K()) * 12) + ((long) this.b.N())) - 1;
    }

    private int K() {
        return this.b.O() - 1911;
    }

    private Object writeReplace() {
        return new ACb(5, this);
    }

    public long d(C7381tDb tdb) {
        if (!(tdb instanceof C6423fDb)) {
            return tdb.c(this);
        }
        int i = C7655xCb.a[((C6423fDb) tdb).ordinal()];
        int i2 = 1;
        if (i == 4) {
            int K = K();
            if (K < 1) {
                K = 1 - K;
            }
            return (long) K;
        } else if (i == 5) {
            return J();
        } else {
            if (i == 6) {
                return (long) K();
            }
            if (i != 7) {
                return this.b.d(tdb);
            }
            if (K() < 1) {
                i2 = 0;
            }
            return (long) i2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7724yCb)) {
            return false;
        }
        return this.b.equals(((C7724yCb) obj).b);
    }

    public int hashCode() {
        return getChronology().getId().hashCode() ^ this.b.hashCode();
    }

    public long toEpochDay() {
        return this.b.toEpochDay();
    }

    /* access modifiers changed from: 0000 */
    public C7724yCb c(long j) {
        return a(this.b.g(j));
    }

    public C7586wCb getChronology() {
        return C7586wCb.e;
    }

    public C7793zCb getEra() {
        return (C7793zCb) super.getEra();
    }

    public C7724yCb b(long j, DDb dDb) {
        return (C7724yCb) super.b(j, dDb);
    }

    /* access modifiers changed from: 0000 */
    public C7724yCb b(long j) {
        return a(this.b.e(j));
    }

    public FDb a(C7381tDb tdb) {
        if (!(tdb instanceof C6423fDb)) {
            return tdb.b(this);
        }
        if (b(tdb)) {
            C6423fDb fdb = (C6423fDb) tdb;
            int i = C7655xCb.a[fdb.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                return this.b.a(tdb);
            }
            if (i != 4) {
                return getChronology().a(fdb);
            }
            FDb range = C6423fDb.YEAR.range();
            return FDb.a(1, K() <= 0 ? (-range.b()) + 1 + 1911 : range.a() - 1911);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported field: ");
        sb.append(tdb);
        throw new EDb(sb.toString());
    }

    public C7724yCb a(C7105pDb pdb) {
        return (C7724yCb) super.a(pdb);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r1 != 7) goto L_0x0055;
     */
    public C7724yCb a(C7381tDb tdb, long j) {
        if (!(tdb instanceof C6423fDb)) {
            return (C7724yCb) tdb.a(this, j);
        }
        C6423fDb fdb = (C6423fDb) tdb;
        if (d(fdb) == j) {
            return this;
        }
        int i = C7655xCb.a[fdb.ordinal()];
        if (i != 4) {
            if (i == 5) {
                getChronology().a(fdb).b(j, fdb);
                return b(j - J());
            } else if (i != 6) {
            }
        }
        int a = getChronology().a(fdb).a(j, (C7381tDb) fdb);
        int i2 = C7655xCb.a[fdb.ordinal()];
        if (i2 == 4) {
            return a(this.b.d(K() >= 1 ? a + 1911 : (1 - a) + 1911));
        } else if (i2 == 6) {
            return a(this.b.d(a + 1911));
        } else {
            if (i2 == 7) {
                return a(this.b.d((1 - K()) + 1911));
            }
            return a(this.b.a(tdb, j));
        }
    }

    public C7724yCb a(C7312sDb sdb) {
        return (C7724yCb) super.a(sdb);
    }

    public C7724yCb a(long j, DDb dDb) {
        return (C7724yCb) super.a(j, dDb);
    }

    /* access modifiers changed from: 0000 */
    public C7724yCb a(long j) {
        return a(this.b.d(j));
    }

    private C7724yCb a(C6827lBb lbb) {
        return lbb.equals(this.b) ? this : new C7724yCb(lbb);
    }

    public final ZBb<C7724yCb> a(C7239rBb rbb) {
        return super.a(rbb);
    }

    /* access modifiers changed from: 0000 */
    public void a(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(c(C6423fDb.YEAR));
        dataOutput.writeByte(c(C6423fDb.MONTH_OF_YEAR));
        dataOutput.writeByte(c(C6423fDb.DAY_OF_MONTH));
    }

    static XBb a(DataInput dataInput) throws IOException {
        return C7586wCb.e.date(dataInput.readInt(), (int) dataInput.readByte(), (int) dataInput.readByte());
    }
}
