package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;

/* renamed from: fBb reason: default package and case insensitive filesystem */
/* compiled from: Duration */
public final class C6419fBb implements C7312sDb, Comparable<C6419fBb>, Serializable {
    public static final C6419fBb a = new C6419fBb(0, 0);
    private static final BigInteger b = BigInteger.valueOf(1000000000);
    private static final Pattern c = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    private final long d;
    private final int e;

    private C6419fBb(long j, int i) {
        this.d = j;
        this.e = i;
    }

    public static C6419fBb a(long j, long j2) {
        return a(C6355eDb.d(j, C6355eDb.b(j2, 1000000000)), C6355eDb.a(j2, 1000000000));
    }

    public static C6419fBb b(long j) {
        return a(j, 0);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new FBb(1, this);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6419fBb)) {
            return false;
        }
        C6419fBb fbb = (C6419fBb) obj;
        if (!(this.d == fbb.d && this.e == fbb.e)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        long j = this.d;
        return ((int) (j ^ (j >>> 32))) + (this.e * 51);
    }

    public String toString() {
        if (this == a) {
            return "PT0S";
        }
        long j = this.d;
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j2 != 0) {
            sb.append(j2);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        if (i2 == 0 && this.e == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (i2 >= 0 || this.e <= 0) {
            sb.append(i2);
        } else if (i2 == -1) {
            sb.append("-0");
        } else {
            sb.append(i2 + 1);
        }
        if (this.e > 0) {
            int length = sb.length();
            if (i2 < 0) {
                sb.append(2000000000 - this.e);
            } else {
                sb.append(this.e + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    public static C6419fBb a(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i += 1000000000;
            j2--;
        }
        return a(j2, i);
    }

    private static C6419fBb a(long j, int i) {
        if ((((long) i) | j) == 0) {
            return a;
        }
        return new C6419fBb(j, i);
    }

    public long a() {
        return this.d;
    }

    public C6967nDb a(C6967nDb ndb) {
        long j = this.d;
        if (j != 0) {
            ndb = ndb.b(j, C6491gDb.SECONDS);
        }
        int i = this.e;
        return i != 0 ? ndb.b((long) i, C6491gDb.NANOS) : ndb;
    }

    /* renamed from: a */
    public int compareTo(C6419fBb fbb) {
        int a2 = C6355eDb.a(this.d, fbb.d);
        if (a2 != 0) {
            return a2;
        }
        return this.e - fbb.e;
    }

    /* access modifiers changed from: 0000 */
    public void a(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.d);
        dataOutput.writeInt(this.e);
    }

    static C6419fBb a(DataInput dataInput) throws IOException {
        return a(dataInput.readLong(), (long) dataInput.readInt());
    }
}
