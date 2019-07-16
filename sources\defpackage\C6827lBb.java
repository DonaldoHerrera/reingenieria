package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* renamed from: lBb reason: default package and case insensitive filesystem */
/* compiled from: LocalDate */
public final class C6827lBb extends XBb implements C6967nDb, C7105pDb, Serializable {
    public static final C6827lBb b = a(-999999999, 1, 1);
    public static final C6827lBb c = a(999999999, 12, 31);
    public static final CDb<C6827lBb> d = new C6691jBb();
    private final int e;
    private final short f;
    private final short g;

    private C6827lBb(int i, int i2, int i3) {
        this.e = i;
        this.f = (short) i2;
        this.g = (short) i3;
    }

    private long P() {
        return (((long) this.e) * 12) + ((long) (this.f - 1));
    }

    public static C6827lBb c(long j) {
        long j2;
        long j3 = j;
        C6423fDb.EPOCH_DAY.b(j3);
        long j4 = (j3 + 719528) - 60;
        if (j4 < 0) {
            long j5 = ((j4 + 1) / 146097) - 1;
            j2 = j5 * 400;
            j4 += (-j5) * 146097;
        } else {
            j2 = 0;
        }
        long j6 = ((j4 * 400) + 591) / 146097;
        long j7 = j4 - ((((j6 * 365) + (j6 / 4)) - (j6 / 100)) + (j6 / 400));
        if (j7 < 0) {
            j6--;
            j7 = j4 - ((((365 * j6) + (j6 / 4)) - (j6 / 100)) + (j6 / 400));
        }
        int i = (int) j7;
        int i2 = ((i * 5) + 2) / 153;
        return new C6827lBb(C6423fDb.YEAR.a(j6 + j2 + ((long) (i2 / 10))), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    private int e(C7381tDb tdb) {
        String str = "Field too large for an int: ";
        int i = 1;
        switch (C6759kBb.a[((C6423fDb) tdb).ordinal()]) {
            case 1:
                return this.g;
            case 2:
                return L();
            case 3:
                return ((this.g - 1) / 7) + 1;
            case 4:
                int i2 = this.e;
                if (i2 < 1) {
                    i2 = 1 - i2;
                }
                return i2;
            case 5:
                return K().getValue();
            case 6:
                return ((this.g - 1) % 7) + 1;
            case 7:
                return ((L() - 1) % 7) + 1;
            case 8:
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(tdb);
                throw new C5687cBb(sb.toString());
            case 9:
                return ((L() - 1) / 7) + 1;
            case 10:
                return this.f;
            case 11:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(tdb);
                throw new C5687cBb(sb2.toString());
            case 12:
                return this.e;
            case 13:
                if (this.e < 1) {
                    i = 0;
                }
                return i;
            default:
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unsupported field: ");
                sb3.append(tdb);
                throw new EDb(sb3.toString());
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new FBb(3, this);
    }

    public int J() {
        return this.g;
    }

    public C6351eBb K() {
        return C6351eBb.a(C6355eDb.a(toEpochDay() + 3, 7) + 1);
    }

    public int L() {
        return (M().a(isLeapYear()) + this.g) - 1;
    }

    public C7446uBb M() {
        return C7446uBb.a((int) this.f);
    }

    public int N() {
        return this.f;
    }

    public int O() {
        return this.e;
    }

    public long d(C7381tDb tdb) {
        if (!(tdb instanceof C6423fDb)) {
            return tdb.c(this);
        }
        if (tdb == C6423fDb.EPOCH_DAY) {
            return toEpochDay();
        }
        if (tdb == C6423fDb.PROLEPTIC_MONTH) {
            return P();
        }
        return (long) e(tdb);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6827lBb)) {
            return false;
        }
        if (a((C6827lBb) obj) != 0) {
            z = false;
        }
        return z;
    }

    public C6827lBb f(long j) {
        return d(C6355eDb.b(j, 7));
    }

    public C6827lBb g(long j) {
        if (j == 0) {
            return this;
        }
        return b(C6423fDb.YEAR.a(((long) this.e) + j), (int) this.f, (int) this.g);
    }

    public C6693jCb getEra() {
        return super.getEra();
    }

    public int hashCode() {
        int i = this.e;
        return (((i << 11) + (this.f << 6)) + this.g) ^ (i & -2048);
    }

    public boolean isLeapYear() {
        return C7034oCb.e.isLeapYear((long) this.e);
    }

    public int lengthOfMonth() {
        short s = this.f;
        if (s != 2) {
            return (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31;
        }
        return isLeapYear() ? 29 : 28;
    }

    public int lengthOfYear() {
        return isLeapYear() ? 366 : 365;
    }

    public long toEpochDay() {
        long j;
        long j2 = (long) this.e;
        long j3 = (long) this.f;
        long j4 = (365 * j2) + 0;
        if (j2 >= 0) {
            j = j4 + (((3 + j2) / 4) - ((99 + j2) / 100)) + ((j2 + 399) / 400);
        } else {
            j = j4 - (((j2 / -4) - (j2 / -100)) + (j2 / -400));
        }
        long j5 = j + (((367 * j3) - 362) / 12) + ((long) (this.g - 1));
        if (j3 > 2) {
            j5--;
            if (!isLeapYear()) {
                j5--;
            }
        }
        return j5 - 719528;
    }

    public String toString() {
        int i = this.e;
        short s = this.f;
        short s2 = this.g;
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (abs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        String str = "-0";
        String str2 = "-";
        sb.append(s < 10 ? str : str2);
        sb.append(s);
        if (s2 >= 10) {
            str = str2;
        }
        sb.append(str);
        sb.append(s2);
        return sb.toString();
    }

    public C7034oCb getChronology() {
        return C7034oCb.e;
    }

    private static C6827lBb b(int i, C7446uBb ubb, int i2) {
        if (i2 <= 28 || i2 <= ubb.b(C7034oCb.e.isLeapYear((long) i))) {
            return new C6827lBb(i, ubb.getValue(), i2);
        }
        if (i2 == 29) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid date 'February 29' as '");
            sb.append(i);
            sb.append("' is not a leap year");
            throw new C5687cBb(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid date '");
        sb2.append(ubb.name());
        sb2.append(" ");
        sb2.append(i2);
        sb2.append("'");
        throw new C5687cBb(sb2.toString());
    }

    private static C6827lBb b(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, C7034oCb.e.isLeapYear((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return a(i, i2, i3);
    }

    public C6827lBb d(int i) {
        if (this.e == i) {
            return this;
        }
        C6423fDb.YEAR.b((long) i);
        return b(i, (int) this.f, (int) this.g);
    }

    public static C6827lBb a(int i, C7446uBb ubb, int i2) {
        C6423fDb.YEAR.b((long) i);
        C6355eDb.a(ubb, "month");
        C6423fDb.DAY_OF_MONTH.b((long) i2);
        return b(i, ubb, i2);
    }

    public boolean b(C7381tDb tdb) {
        return super.b(tdb);
    }

    public C6827lBb b(int i) {
        if (L() == i) {
            return this;
        }
        return a(this.e, i);
    }

    public C6827lBb d(long j) {
        if (j == 0) {
            return this;
        }
        return c(C6355eDb.d(toEpochDay(), j));
    }

    public int c(C7381tDb tdb) {
        if (tdb instanceof C6423fDb) {
            return e(tdb);
        }
        return super.c(tdb);
    }

    public static C6827lBb a(int i, int i2, int i3) {
        C6423fDb.YEAR.b((long) i);
        C6423fDb.MONTH_OF_YEAR.b((long) i2);
        C6423fDb.DAY_OF_MONTH.b((long) i3);
        return b(i, C7446uBb.a(i2), i3);
    }

    public C6827lBb b(long j, DDb dDb) {
        if (!(dDb instanceof C6491gDb)) {
            return (C6827lBb) dDb.a(this, j);
        }
        switch (C6759kBb.b[((C6491gDb) dDb).ordinal()]) {
            case 1:
                return d(j);
            case 2:
                return f(j);
            case 3:
                return e(j);
            case 4:
                return g(j);
            case 5:
                return g(C6355eDb.b(j, 10));
            case 6:
                return g(C6355eDb.b(j, 100));
            case 7:
                return g(C6355eDb.b(j, 1000));
            case 8:
                C6423fDb fdb = C6423fDb.ERA;
                return a((C7381tDb) fdb, C6355eDb.d(d((C7381tDb) fdb), j));
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported unit: ");
                sb.append(dDb);
                throw new EDb(sb.toString());
        }
    }

    public C6827lBb c(int i) {
        if (this.f == i) {
            return this;
        }
        C6423fDb.MONTH_OF_YEAR.b((long) i);
        return b(this.e, i, (int) this.g);
    }

    public C6827lBb e(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.e) * 12) + ((long) (this.f - 1)) + j;
        return b(C6423fDb.YEAR.a(C6355eDb.b(j2, 12)), C6355eDb.a(j2, 12) + 1, (int) this.g);
    }

    public static C6827lBb a(int i, int i2) {
        long j = (long) i;
        C6423fDb.YEAR.b(j);
        C6423fDb.DAY_OF_YEAR.b((long) i2);
        boolean isLeapYear = C7034oCb.e.isLeapYear(j);
        if (i2 != 366 || isLeapYear) {
            C7446uBb a = C7446uBb.a(((i2 - 1) / 31) + 1);
            if (i2 > (a.a(isLeapYear) + a.b(isLeapYear)) - 1) {
                a = a.a(1);
            }
            return b(i, a, (i2 - a.a(isLeapYear)) + 1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid date 'DayOfYear 366' as '");
        sb.append(i);
        sb.append("' is not a leap year");
        throw new C5687cBb(sb.toString());
    }

    public EBb c(XBb xBb) {
        C6827lBb a = a((C7036oDb) xBb);
        long P = a.P() - P();
        int i = a.g - this.g;
        int i2 = (P > 0 ? 1 : (P == 0 ? 0 : -1));
        if (i2 > 0 && i < 0) {
            P--;
            i = (int) (a.toEpochDay() - e(P).toEpochDay());
        } else if (i2 < 0 && i > 0) {
            P++;
            i -= a.lengthOfMonth();
        }
        return EBb.a(C6355eDb.a(P / 12), (int) (P % 12), i);
    }

    public static C6827lBb a(C7036oDb odb) {
        C6827lBb lbb = (C6827lBb) odb.a(BDb.b());
        if (lbb != null) {
            return lbb;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to obtain LocalDate from TemporalAccessor: ");
        sb.append(odb);
        sb.append(", type ");
        sb.append(odb.getClass().getName());
        throw new C5687cBb(sb.toString());
    }

    public C6827lBb b(long j) {
        return j == Long.MIN_VALUE ? g(Long.MAX_VALUE).g(1) : g(-j);
    }

    public boolean b(XBb xBb) {
        if (!(xBb instanceof C6827lBb)) {
            return super.b(xBb);
        }
        return a((C6827lBb) xBb) < 0;
    }

    public static C6827lBb a(CharSequence charSequence, JCb jCb) {
        C6355eDb.a(jCb, "formatter");
        return (C6827lBb) jCb.a(charSequence, d);
    }

    public FDb a(C7381tDb tdb) {
        if (!(tdb instanceof C6423fDb)) {
            return tdb.b(this);
        }
        C6423fDb fdb = (C6423fDb) tdb;
        if (fdb.isDateBased()) {
            int i = C6759kBb.a[fdb.ordinal()];
            if (i == 1) {
                return FDb.a(1, (long) lengthOfMonth());
            }
            if (i == 2) {
                return FDb.a(1, (long) lengthOfYear());
            }
            if (i == 3) {
                return FDb.a(1, (M() != C7446uBb.FEBRUARY || isLeapYear()) ? 5 : 4);
            } else if (i != 4) {
                return tdb.range();
            } else {
                return FDb.a(1, O() <= 0 ? 1000000000 : 999999999);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported field: ");
            sb.append(tdb);
            throw new EDb(sb.toString());
        }
    }

    public C6827lBb a(C7105pDb pdb) {
        if (pdb instanceof C6827lBb) {
            return (C6827lBb) pdb;
        }
        return (C6827lBb) pdb.a(this);
    }

    public C6827lBb a(C7381tDb tdb, long j) {
        if (!(tdb instanceof C6423fDb)) {
            return (C6827lBb) tdb.a(this, j);
        }
        C6423fDb fdb = (C6423fDb) tdb;
        fdb.b(j);
        switch (C6759kBb.a[fdb.ordinal()]) {
            case 1:
                return a((int) j);
            case 2:
                return b((int) j);
            case 3:
                return f(j - d((C7381tDb) C6423fDb.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.e < 1) {
                    j = 1 - j;
                }
                return d((int) j);
            case 5:
                return d(j - ((long) K().getValue()));
            case 6:
                return d(j - d((C7381tDb) C6423fDb.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return d(j - d((C7381tDb) C6423fDb.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return c(j);
            case 9:
                return f(j - d((C7381tDb) C6423fDb.ALIGNED_WEEK_OF_YEAR));
            case 10:
                return c((int) j);
            case 11:
                return e(j - d((C7381tDb) C6423fDb.PROLEPTIC_MONTH));
            case 12:
                return d((int) j);
            case 13:
                return d((C7381tDb) C6423fDb.ERA) == j ? this : d(1 - this.e);
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported field: ");
                sb.append(tdb);
                throw new EDb(sb.toString());
        }
    }

    public C6827lBb a(int i) {
        if (this.g == i) {
            return this;
        }
        return a(this.e, (int) this.f, i);
    }

    public C6827lBb a(C7312sDb sdb) {
        return (C6827lBb) sdb.a(this);
    }

    public C6827lBb a(long j, DDb dDb) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, dDb).b(1, dDb) : b(-j, dDb);
    }

    public C6827lBb a(long j) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE).d(1) : d(-j);
    }

    public <R> R a(CDb<R> cDb) {
        if (cDb == BDb.b()) {
            return this;
        }
        return super.a(cDb);
    }

    public C6967nDb a(C6967nDb ndb) {
        return super.a(ndb);
    }

    public C7032oBb a(C7239rBb rbb) {
        return C7032oBb.a(this, rbb);
    }

    /* renamed from: a */
    public int compareTo(XBb xBb) {
        if (xBb instanceof C6827lBb) {
            return a((C6827lBb) xBb);
        }
        return super.compareTo(xBb);
    }

    /* access modifiers changed from: 0000 */
    public int a(C6827lBb lbb) {
        int i = this.e - lbb.e;
        if (i != 0) {
            return i;
        }
        int i2 = this.f - lbb.f;
        return i2 == 0 ? this.g - lbb.g : i2;
    }

    /* access modifiers changed from: 0000 */
    public void a(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.e);
        dataOutput.writeByte(this.f);
        dataOutput.writeByte(this.g);
    }

    static C6827lBb a(DataInput dataInput) throws IOException {
        return a(dataInput.readInt(), (int) dataInput.readByte(), (int) dataInput.readByte());
    }
}
