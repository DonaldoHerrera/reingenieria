package defpackage;

import com.google.common.base.Ascii;
import com.soundcloud.flippernative.BuildConfig;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* renamed from: rBb reason: default package and case insensitive filesystem */
/* compiled from: LocalTime */
public final class C7239rBb extends C6287dDb implements C6967nDb, C7105pDb, Comparable<C7239rBb>, Serializable {
    public static final C7239rBb a;
    public static final C7239rBb b = new C7239rBb(23, 59, 59, 999999999);
    public static final C7239rBb c;
    public static final C7239rBb d;
    public static final CDb<C7239rBb> e = new C7101pBb();
    private static final C7239rBb[] f = new C7239rBb[24];
    private final byte g;
    private final byte h;
    private final byte i;
    private final int j;

    static {
        int i2 = 0;
        while (true) {
            C7239rBb[] rbbArr = f;
            if (i2 < rbbArr.length) {
                rbbArr[i2] = new C7239rBb(i2, 0, 0, 0);
                i2++;
            } else {
                c = rbbArr[0];
                d = rbbArr[12];
                a = rbbArr[0];
                return;
            }
        }
    }

    private C7239rBb(int i2, int i3, int i4, int i5) {
        this.g = (byte) i2;
        this.h = (byte) i3;
        this.i = (byte) i4;
        this.j = i5;
    }

    private int e(C7381tDb tdb) {
        String str = "Field too large for an int: ";
        switch (C7170qBb.a[((C6423fDb) tdb).ordinal()]) {
            case 1:
                return this.j;
            case 2:
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(tdb);
                throw new C5687cBb(sb.toString());
            case 3:
                return this.j / 1000;
            case 4:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(tdb);
                throw new C5687cBb(sb2.toString());
            case 5:
                return this.j / 1000000;
            case 6:
                return (int) (M() / 1000000);
            case 7:
                return this.i;
            case 8:
                return N();
            case 9:
                return this.h;
            case 10:
                return (this.g * 60) + this.h;
            case 11:
                return this.g % Ascii.FF;
            case 12:
                int i2 = this.g % Ascii.FF;
                if (i2 % 12 == 0) {
                    i2 = 12;
                }
                return i2;
            case 13:
                return this.g;
            case 14:
                byte b2 = this.g;
                if (b2 == 0) {
                    b2 = Ascii.CAN;
                }
                return b2;
            case 15:
                return this.g / Ascii.FF;
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
        return new FBb(5, this);
    }

    public int J() {
        return this.g;
    }

    public int K() {
        return this.j;
    }

    public int L() {
        return this.i;
    }

    public long M() {
        return (((long) this.g) * 3600000000000L) + (((long) this.h) * 60000000000L) + (((long) this.i) * 1000000000) + ((long) this.j);
    }

    public int N() {
        return (this.g * Ascii.DLE) + (this.h * 60) + this.i;
    }

    public int c(C7381tDb tdb) {
        if (tdb instanceof C6423fDb) {
            return e(tdb);
        }
        return super.c(tdb);
    }

    public long d(C7381tDb tdb) {
        if (!(tdb instanceof C6423fDb)) {
            return tdb.c(this);
        }
        if (tdb == C6423fDb.NANO_OF_DAY) {
            return M();
        }
        if (tdb == C6423fDb.MICRO_OF_DAY) {
            return M() / 1000;
        }
        return (long) e(tdb);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7239rBb)) {
            return false;
        }
        C7239rBb rbb = (C7239rBb) obj;
        if (!(this.g == rbb.g && this.h == rbb.h && this.i == rbb.i && this.j == rbb.j)) {
            z = false;
        }
        return z;
    }

    public C7239rBb f(long j2) {
        if (j2 == 0) {
            return this;
        }
        int i2 = (this.g * Ascii.DLE) + (this.h * 60) + this.i;
        int i3 = ((((int) (j2 % 86400)) + i2) + 86400) % 86400;
        if (i2 == i3) {
            return this;
        }
        return b(i3 / 3600, (i3 / 60) % 60, i3 % 60, this.j);
    }

    public int hashCode() {
        long M = M();
        return (int) (M ^ (M >>> 32));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b2 = this.g;
        byte b3 = this.h;
        byte b4 = this.i;
        int i2 = this.j;
        sb.append(b2 < 10 ? BuildConfig.VERSION_NAME : "");
        sb.append(b2);
        String str = ":0";
        String str2 = ":";
        sb.append(b3 < 10 ? str : str2);
        sb.append(b3);
        if (b4 > 0 || i2 > 0) {
            if (b4 >= 10) {
                str = str2;
            }
            sb.append(str);
            sb.append(b4);
            if (i2 > 0) {
                sb.append('.');
                if (i2 % 1000000 == 0) {
                    sb.append(Integer.toString((i2 / 1000000) + 1000).substring(1));
                } else if (i2 % 1000 == 0) {
                    sb.append(Integer.toString((i2 / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i2 + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    public static C7239rBb b(long j2) {
        C6423fDb.SECOND_OF_DAY.b(j2);
        int i2 = (int) (j2 / 3600);
        long j3 = j2 - ((long) (i2 * 3600));
        int i3 = (int) (j3 / 60);
        return b(i2, i3, (int) (j3 - ((long) (i3 * 60))), 0);
    }

    public static C7239rBb a(int i2, int i3) {
        C6423fDb.HOUR_OF_DAY.b((long) i2);
        if (i3 == 0) {
            return f[i2];
        }
        C6423fDb.MINUTE_OF_HOUR.b((long) i3);
        return new C7239rBb(i2, i3, 0, 0);
    }

    public C7239rBb c(int i2) {
        if (this.j == i2) {
            return this;
        }
        C6423fDb.NANO_OF_SECOND.b((long) i2);
        return b(this.g, this.h, this.i, i2);
    }

    private static C7239rBb b(int i2, int i3, int i4, int i5) {
        if ((i3 | i4 | i5) == 0) {
            return f[i2];
        }
        return new C7239rBb(i2, i3, i4, i5);
    }

    public C7239rBb c(long j2) {
        if (j2 == 0) {
            return this;
        }
        return b(((((int) (j2 % 24)) + this.g) + 24) % 24, this.h, this.i, this.j);
    }

    public static C7239rBb a(int i2, int i3, int i4) {
        C6423fDb.HOUR_OF_DAY.b((long) i2);
        if ((i3 | i4) == 0) {
            return f[i2];
        }
        C6423fDb.MINUTE_OF_HOUR.b((long) i3);
        C6423fDb.SECOND_OF_MINUTE.b((long) i4);
        return new C7239rBb(i2, i3, i4, 0);
    }

    public boolean b(C7381tDb tdb) {
        if (tdb instanceof C6423fDb) {
            return tdb.isTimeBased();
        }
        return tdb != null && tdb.a(this);
    }

    public C7239rBb d(int i2) {
        if (this.i == i2) {
            return this;
        }
        C6423fDb.SECOND_OF_MINUTE.b((long) i2);
        return b(this.g, this.h, i2, this.j);
    }

    public C7239rBb b(int i2) {
        if (this.h == i2) {
            return this;
        }
        C6423fDb.MINUTE_OF_HOUR.b((long) i2);
        return b(this.g, i2, this.i, this.j);
    }

    public C7239rBb d(long j2) {
        if (j2 == 0) {
            return this;
        }
        int i2 = (this.g * 60) + this.h;
        int i3 = ((((int) (j2 % 1440)) + i2) + 1440) % 1440;
        if (i2 == i3) {
            return this;
        }
        return b(i3 / 60, i3 % 60, this.i, this.j);
    }

    public static C7239rBb a(int i2, int i3, int i4, int i5) {
        C6423fDb.HOUR_OF_DAY.b((long) i2);
        C6423fDb.MINUTE_OF_HOUR.b((long) i3);
        C6423fDb.SECOND_OF_MINUTE.b((long) i4);
        C6423fDb.NANO_OF_SECOND.b((long) i5);
        return b(i2, i3, i4, i5);
    }

    public C7239rBb b(long j2, DDb dDb) {
        if (!(dDb instanceof C6491gDb)) {
            return (C7239rBb) dDb.a(this, j2);
        }
        switch (C7170qBb.b[((C6491gDb) dDb).ordinal()]) {
            case 1:
                return e(j2);
            case 2:
                return e((j2 % 86400000000L) * 1000);
            case 3:
                return e((j2 % 86400000) * 1000000);
            case 4:
                return f(j2);
            case 5:
                return d(j2);
            case 6:
                return c(j2);
            case 7:
                return c((j2 % 2) * 12);
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported unit: ");
                sb.append(dDb);
                throw new EDb(sb.toString());
        }
    }

    static C7239rBb a(long j2, int i2) {
        C6423fDb.SECOND_OF_DAY.b(j2);
        C6423fDb.NANO_OF_SECOND.b((long) i2);
        int i3 = (int) (j2 / 3600);
        long j3 = j2 - ((long) (i3 * 3600));
        int i4 = (int) (j3 / 60);
        return b(i3, i4, (int) (j3 - ((long) (i4 * 60))), i2);
    }

    public C7239rBb e(long j2) {
        if (j2 == 0) {
            return this;
        }
        long M = M();
        long j3 = (((j2 % 86400000000000L) + M) + 86400000000000L) % 86400000000000L;
        if (M == j3) {
            return this;
        }
        return b((int) (j3 / 3600000000000L), (int) ((j3 / 60000000000L) % 60), (int) ((j3 / 1000000000) % 60), (int) (j3 % 1000000000));
    }

    public static C7239rBb a(long j2) {
        C6423fDb.NANO_OF_DAY.b(j2);
        int i2 = (int) (j2 / 3600000000000L);
        long j3 = j2 - (((long) i2) * 3600000000000L);
        int i3 = (int) (j3 / 60000000000L);
        long j4 = j3 - (((long) i3) * 60000000000L);
        int i4 = (int) (j4 / 1000000000);
        return b(i2, i3, i4, (int) (j4 - (((long) i4) * 1000000000)));
    }

    public static C7239rBb a(C7036oDb odb) {
        C7239rBb rbb = (C7239rBb) odb.a(BDb.c());
        if (rbb != null) {
            return rbb;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to obtain LocalTime from TemporalAccessor: ");
        sb.append(odb);
        sb.append(", type ");
        sb.append(odb.getClass().getName());
        throw new C5687cBb(sb.toString());
    }

    public FDb a(C7381tDb tdb) {
        return super.a(tdb);
    }

    public C7239rBb a(C7105pDb pdb) {
        if (pdb instanceof C7239rBb) {
            return (C7239rBb) pdb;
        }
        return (C7239rBb) pdb.a(this);
    }

    public C7239rBb a(C7381tDb tdb, long j2) {
        if (!(tdb instanceof C6423fDb)) {
            return (C7239rBb) tdb.a(this, j2);
        }
        C6423fDb fdb = (C6423fDb) tdb;
        fdb.b(j2);
        switch (C7170qBb.a[fdb.ordinal()]) {
            case 1:
                return c((int) j2);
            case 2:
                return a(j2);
            case 3:
                return c(((int) j2) * 1000);
            case 4:
                return a(j2 * 1000);
            case 5:
                return c(((int) j2) * 1000000);
            case 6:
                return a(j2 * 1000000);
            case 7:
                return d((int) j2);
            case 8:
                return f(j2 - ((long) N()));
            case 9:
                return b((int) j2);
            case 10:
                return d(j2 - ((long) ((this.g * 60) + this.h)));
            case 11:
                return c(j2 - ((long) (this.g % Ascii.FF)));
            case 12:
                if (j2 == 12) {
                    j2 = 0;
                }
                return c(j2 - ((long) (this.g % Ascii.FF)));
            case 13:
                return a((int) j2);
            case 14:
                if (j2 == 24) {
                    j2 = 0;
                }
                return a((int) j2);
            case 15:
                return c((j2 - ((long) (this.g / Ascii.FF))) * 12);
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported field: ");
                sb.append(tdb);
                throw new EDb(sb.toString());
        }
    }

    public C7239rBb a(int i2) {
        if (this.g == i2) {
            return this;
        }
        C6423fDb.HOUR_OF_DAY.b((long) i2);
        return b(i2, this.h, this.i, this.j);
    }

    public C7239rBb a(long j2, DDb dDb) {
        return j2 == Long.MIN_VALUE ? b(Long.MAX_VALUE, dDb).b(1, dDb) : b(-j2, dDb);
    }

    public <R> R a(CDb<R> cDb) {
        if (cDb == BDb.e()) {
            return C6491gDb.NANOS;
        }
        if (cDb == BDb.c()) {
            return this;
        }
        if (cDb == BDb.a() || cDb == BDb.g() || cDb == BDb.f() || cDb == BDb.d() || cDb == BDb.b()) {
            return null;
        }
        return cDb.a(this);
    }

    public C6967nDb a(C6967nDb ndb) {
        return ndb.a((C7381tDb) C6423fDb.NANO_OF_DAY, M());
    }

    public DBb a(PBb pBb) {
        return DBb.a(this, pBb);
    }

    /* renamed from: a */
    public int compareTo(C7239rBb rbb) {
        int a2 = C6355eDb.a((int) this.g, (int) rbb.g);
        if (a2 != 0) {
            return a2;
        }
        int a3 = C6355eDb.a((int) this.h, (int) rbb.h);
        if (a3 != 0) {
            return a3;
        }
        int a4 = C6355eDb.a((int) this.i, (int) rbb.i);
        return a4 == 0 ? C6355eDb.a(this.j, rbb.j) : a4;
    }

    /* access modifiers changed from: 0000 */
    public void a(DataOutput dataOutput) throws IOException {
        if (this.j != 0) {
            dataOutput.writeByte(this.g);
            dataOutput.writeByte(this.h);
            dataOutput.writeByte(this.i);
            dataOutput.writeInt(this.j);
        } else if (this.i != 0) {
            dataOutput.writeByte(this.g);
            dataOutput.writeByte(this.h);
            dataOutput.writeByte(~this.i);
        } else if (this.h == 0) {
            dataOutput.writeByte(~this.g);
        } else {
            dataOutput.writeByte(this.g);
            dataOutput.writeByte(~this.h);
        }
    }

    static C7239rBb a(DataInput dataInput) throws IOException {
        int i2;
        int i3;
        int readByte = dataInput.readByte();
        int i4 = 0;
        if (readByte < 0) {
            readByte = ~readByte;
            i2 = 0;
            i3 = 0;
        } else {
            i3 = dataInput.readByte();
            if (i3 < 0) {
                i3 = ~i3;
            } else {
                byte readByte2 = dataInput.readByte();
                if (readByte2 < 0) {
                    i4 = ~readByte2;
                } else {
                    i2 = dataInput.readInt();
                    i4 = readByte2;
                }
            }
            i2 = 0;
        }
        return a(readByte, i3, i4, i2);
    }
}
