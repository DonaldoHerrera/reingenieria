package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;

/* renamed from: tCb reason: default package and case insensitive filesystem */
/* compiled from: JapaneseDate */
public final class C7379tCb extends VBb<C7379tCb> implements Serializable {
    static final C6827lBb b = C6827lBb.a(1873, 1, 1);
    private final C6827lBb c;
    private transient C7448uCb d;
    private transient int e;

    C7379tCb(C6827lBb lbb) {
        if (!lbb.b((XBb) b)) {
            this.d = C7448uCb.a(lbb);
            this.e = lbb.O() - (this.d.K().O() - 1);
            this.c = lbb;
            return;
        }
        throw new C5687cBb("Minimum supported date is January 1st Meiji 6");
    }

    private long J() {
        int L;
        if (this.e == 1) {
            L = (this.c.L() - this.d.K().L()) + 1;
        } else {
            L = this.c.L();
        }
        return (long) L;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.d = C7448uCb.a(this.c);
        this.e = this.c.O() - (this.d.K().O() - 1);
    }

    private Object writeReplace() {
        return new ACb(1, this);
    }

    public long d(C7381tDb tdb) {
        if (!(tdb instanceof C6423fDb)) {
            return tdb.c(this);
        }
        switch (C7310sCb.a[((C6423fDb) tdb).ordinal()]) {
            case 1:
                return J();
            case 2:
                return (long) this.e;
            case 3:
            case 4:
            case 5:
            case 6:
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported field: ");
                sb.append(tdb);
                throw new EDb(sb.toString());
            case 7:
                return (long) this.d.getValue();
            default:
                return this.c.d(tdb);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7379tCb)) {
            return false;
        }
        return this.c.equals(((C7379tCb) obj).c);
    }

    public int hashCode() {
        return getChronology().getId().hashCode() ^ this.c.hashCode();
    }

    public long toEpochDay() {
        return this.c.toEpochDay();
    }

    /* access modifiers changed from: 0000 */
    public C7379tCb c(long j) {
        return a(this.c.g(j));
    }

    public C7241rCb getChronology() {
        return C7241rCb.f;
    }

    public C7448uCb getEra() {
        return this.d;
    }

    public boolean b(C7381tDb tdb) {
        if (tdb == C6423fDb.ALIGNED_DAY_OF_WEEK_IN_MONTH || tdb == C6423fDb.ALIGNED_DAY_OF_WEEK_IN_YEAR || tdb == C6423fDb.ALIGNED_WEEK_OF_MONTH || tdb == C6423fDb.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return super.b(tdb);
    }

    public C7379tCb b(long j, DDb dDb) {
        return (C7379tCb) super.b(j, dDb);
    }

    private C7379tCb b(int i) {
        return a(getEra(), i);
    }

    public FDb a(C7381tDb tdb) {
        if (!(tdb instanceof C6423fDb)) {
            return tdb.b(this);
        }
        if (b(tdb)) {
            C6423fDb fdb = (C6423fDb) tdb;
            int i = C7310sCb.a[fdb.ordinal()];
            if (i == 1) {
                return a(6);
            }
            if (i != 2) {
                return getChronology().a(fdb);
            }
            return a(1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported field: ");
        sb.append(tdb);
        throw new EDb(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public C7379tCb b(long j) {
        return a(this.c.e(j));
    }

    private FDb a(int i) {
        Calendar instance = Calendar.getInstance(C7241rCb.e);
        instance.set(0, this.d.getValue() + 2);
        instance.set(this.e, this.c.N() - 1, this.c.J());
        return FDb.a((long) instance.getActualMinimum(i), (long) instance.getActualMaximum(i));
    }

    public C7379tCb a(C7105pDb pdb) {
        return (C7379tCb) super.a(pdb);
    }

    public C7379tCb a(C7381tDb tdb, long j) {
        if (!(tdb instanceof C6423fDb)) {
            return (C7379tCb) tdb.a(this, j);
        }
        C6423fDb fdb = (C6423fDb) tdb;
        if (d(fdb) == j) {
            return this;
        }
        int i = C7310sCb.a[fdb.ordinal()];
        if (i == 1 || i == 2 || i == 7) {
            int a = getChronology().a(fdb).a(j, (C7381tDb) fdb);
            int i2 = C7310sCb.a[fdb.ordinal()];
            if (i2 == 1) {
                return a(this.c.d(((long) a) - J()));
            }
            if (i2 == 2) {
                return b(a);
            }
            if (i2 == 7) {
                return a(C7448uCb.a(a), this.e);
            }
        }
        return a(this.c.a(tdb, j));
    }

    public C7379tCb a(C7312sDb sdb) {
        return (C7379tCb) super.a(sdb);
    }

    public C7379tCb a(long j, DDb dDb) {
        return (C7379tCb) super.a(j, dDb);
    }

    private C7379tCb a(C7448uCb ucb, int i) {
        return a(this.c.d(C7241rCb.f.a((C6693jCb) ucb, i)));
    }

    /* access modifiers changed from: 0000 */
    public C7379tCb a(long j) {
        return a(this.c.d(j));
    }

    private C7379tCb a(C6827lBb lbb) {
        return lbb.equals(this.c) ? this : new C7379tCb(lbb);
    }

    public final ZBb<C7379tCb> a(C7239rBb rbb) {
        return super.a(rbb);
    }

    /* access modifiers changed from: 0000 */
    public void a(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(c(C6423fDb.YEAR));
        dataOutput.writeByte(c(C6423fDb.MONTH_OF_YEAR));
        dataOutput.writeByte(c(C6423fDb.DAY_OF_MONTH));
    }

    static XBb a(DataInput dataInput) throws IOException {
        return C7241rCb.f.date(dataInput.readInt(), (int) dataInput.readByte(), (int) dataInput.readByte());
    }
}
