package defpackage;

import com.soundcloud.flippernative.BuildConfig;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* renamed from: xBb reason: default package and case insensitive filesystem */
/* compiled from: MonthDay */
public final class C7653xBb extends C6287dDb implements C7036oDb, C7105pDb, Comparable<C7653xBb>, Serializable {
    public static final CDb<C7653xBb> a = new C7515vBb();
    private static final JCb b;
    private final int c;
    private final int d;

    static {
        OCb oCb = new OCb();
        oCb.a("--");
        oCb.a((C7381tDb) C6423fDb.MONTH_OF_YEAR, 2);
        oCb.a('-');
        oCb.a((C7381tDb) C6423fDb.DAY_OF_MONTH, 2);
        b = oCb.j();
    }

    private C7653xBb(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    public static C7653xBb a(C7446uBb ubb, int i) {
        C6355eDb.a(ubb, "month");
        C6423fDb.DAY_OF_MONTH.b((long) i);
        if (i <= ubb.a()) {
            return new C7653xBb(ubb.getValue(), i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal value for DayOfMonth field, value ");
        sb.append(i);
        sb.append(" is not valid for month ");
        sb.append(ubb.name());
        throw new C5687cBb(sb.toString());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new FBb(64, this);
    }

    public C7446uBb J() {
        return C7446uBb.a(this.c);
    }

    public boolean b(C7381tDb tdb) {
        boolean z = true;
        if (tdb instanceof C6423fDb) {
            if (!(tdb == C6423fDb.MONTH_OF_YEAR || tdb == C6423fDb.DAY_OF_MONTH)) {
                z = false;
            }
            return z;
        }
        if (tdb == null || !tdb.a(this)) {
            z = false;
        }
        return z;
    }

    public int c(C7381tDb tdb) {
        return a(tdb).a(d(tdb), tdb);
    }

    public long d(C7381tDb tdb) {
        int i;
        if (!(tdb instanceof C6423fDb)) {
            return tdb.c(this);
        }
        int i2 = C7584wBb.a[((C6423fDb) tdb).ordinal()];
        if (i2 == 1) {
            i = this.d;
        } else if (i2 == 2) {
            i = this.c;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported field: ");
            sb.append(tdb);
            throw new EDb(sb.toString());
        }
        return (long) i;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7653xBb)) {
            return false;
        }
        C7653xBb xbb = (C7653xBb) obj;
        if (!(this.c == xbb.c && this.d == xbb.d)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (this.c << 6) + this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        sb.append(this.c < 10 ? BuildConfig.VERSION_NAME : "");
        sb.append(this.c);
        sb.append(this.d < 10 ? "-0" : "-");
        sb.append(this.d);
        return sb.toString();
    }

    public static C7653xBb a(int i, int i2) {
        return a(C7446uBb.a(i), i2);
    }

    public static C7653xBb a(C7036oDb odb) {
        if (odb instanceof C7653xBb) {
            return (C7653xBb) odb;
        }
        try {
            if (!C7034oCb.e.equals(C6625iCb.b(odb))) {
                odb = C6827lBb.a(odb);
            }
            return a(odb.c(C6423fDb.MONTH_OF_YEAR), odb.c(C6423fDb.DAY_OF_MONTH));
        } catch (C5687cBb unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to obtain MonthDay from TemporalAccessor: ");
            sb.append(odb);
            sb.append(", type ");
            sb.append(odb.getClass().getName());
            throw new C5687cBb(sb.toString());
        }
    }

    public FDb a(C7381tDb tdb) {
        if (tdb == C6423fDb.MONTH_OF_YEAR) {
            return tdb.range();
        }
        if (tdb == C6423fDb.DAY_OF_MONTH) {
            return FDb.a(1, (long) J().b(), (long) J().a());
        }
        return super.a(tdb);
    }

    public <R> R a(CDb<R> cDb) {
        if (cDb == BDb.a()) {
            return C7034oCb.e;
        }
        return super.a(cDb);
    }

    public C6967nDb a(C6967nDb ndb) {
        if (C6625iCb.b((C7036oDb) ndb).equals(C7034oCb.e)) {
            C6967nDb a2 = ndb.a((C7381tDb) C6423fDb.MONTH_OF_YEAR, (long) this.c);
            C6423fDb fdb = C6423fDb.DAY_OF_MONTH;
            return a2.a((C7381tDb) fdb, Math.min(a2.a((C7381tDb) fdb).a(), (long) this.d));
        }
        throw new C5687cBb("Adjustment only supported on ISO date-time");
    }

    /* renamed from: a */
    public int compareTo(C7653xBb xbb) {
        int i = this.c - xbb.c;
        return i == 0 ? this.d - xbb.d : i;
    }

    /* access modifiers changed from: 0000 */
    public void a(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(this.c);
        dataOutput.writeByte(this.d);
    }

    static C7653xBb a(DataInput dataInput) throws IOException {
        return a((int) dataInput.readByte(), (int) dataInput.readByte());
    }
}
