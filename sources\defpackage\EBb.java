package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: EBb reason: default package */
/* compiled from: Period */
public final class EBb extends C5621bCb implements Serializable {
    public static final EBb a = new EBb(0, 0, 0);
    private static final Pattern b = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
    private final int c;
    private final int d;
    private final int e;

    private EBb(int i, int i2, int i3) {
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public static EBb a(int i) {
        return b(0, 0, i);
    }

    private static EBb b(int i, int i2, int i3) {
        if ((i | i2 | i3) == 0) {
            return a;
        }
        return new EBb(i, i2, i3);
    }

    private Object readResolve() {
        return ((this.c | this.d) | this.e) == 0 ? a : this;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EBb)) {
            return false;
        }
        EBb eBb = (EBb) obj;
        if (!(this.c == eBb.c && this.d == eBb.d && this.e == eBb.e)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.c + Integer.rotateLeft(this.d, 8) + Integer.rotateLeft(this.e, 16);
    }

    public String toString() {
        if (this == a) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('P');
        int i = this.c;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.d;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.e;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    public static EBb a(int i, int i2, int i3) {
        return b(i, i2, i3);
    }

    public static EBb a(C6827lBb lbb, C6827lBb lbb2) {
        return lbb.c((XBb) lbb2);
    }

    public long b() {
        return (((long) this.c) * 12) + ((long) this.d);
    }

    public long a(DDb dDb) {
        int i;
        if (dDb == C6491gDb.YEARS) {
            i = this.c;
        } else if (dDb == C6491gDb.MONTHS) {
            i = this.d;
        } else if (dDb == C6491gDb.DAYS) {
            i = this.e;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported unit: ");
            sb.append(dDb);
            throw new EDb(sb.toString());
        }
        return (long) i;
    }

    public boolean a() {
        return this == a;
    }

    public C6967nDb a(C6967nDb ndb) {
        C6355eDb.a(ndb, "temporal");
        int i = this.c;
        if (i == 0) {
            int i2 = this.d;
            if (i2 != 0) {
                ndb = ndb.b((long) i2, C6491gDb.MONTHS);
            }
        } else if (this.d != 0) {
            ndb = ndb.b(b(), C6491gDb.MONTHS);
        } else {
            ndb = ndb.b((long) i, C6491gDb.YEARS);
        }
        int i3 = this.e;
        return i3 != 0 ? ndb.b((long) i3, C6491gDb.DAYS) : ndb;
    }
}
