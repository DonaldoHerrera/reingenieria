package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;

/* renamed from: MDb reason: default package */
/* compiled from: ZoneOffsetTransitionRule */
public final class MDb implements Serializable {
    private final C7446uBb a;
    private final byte b;
    private final C6351eBb c;
    private final C7239rBb d;
    private final int e;
    private final a f;
    private final PBb g;
    private final PBb h;
    private final PBb i;

    /* renamed from: MDb$a */
    /* compiled from: ZoneOffsetTransitionRule */
    public enum a {
        UTC,
        WALL,
        STANDARD;

        public C7032oBb a(C7032oBb obb, PBb pBb, PBb pBb2) {
            int i = LDb.a[ordinal()];
            if (i == 1) {
                return obb.e((long) (pBb2.d() - PBb.f.d()));
            }
            if (i != 2) {
                return obb;
            }
            return obb.e((long) (pBb2.d() - pBb.d()));
        }
    }

    MDb(C7446uBb ubb, int i2, C6351eBb ebb, C7239rBb rbb, int i3, a aVar, PBb pBb, PBb pBb2, PBb pBb3) {
        this.a = ubb;
        this.b = (byte) i2;
        this.c = ebb;
        this.d = rbb;
        this.e = i3;
        this.f = aVar;
        this.g = pBb;
        this.h = pBb2;
        this.i = pBb3;
    }

    private Object writeReplace() {
        return new HDb(3, this);
    }

    /* access modifiers changed from: 0000 */
    public void a(DataOutput dataOutput) throws IOException {
        int i2;
        int i3;
        int N = this.d.N() + (this.e * 86400);
        int d2 = this.g.d();
        int d3 = this.h.d() - d2;
        int d4 = this.i.d() - d2;
        int i4 = (N % 3600 != 0 || N > 86400) ? 31 : N == 86400 ? 24 : this.d.J();
        int i5 = d2 % 900 == 0 ? (d2 / 900) + 128 : 255;
        if (d3 == 0 || d3 == 1800 || d3 == 3600) {
            i2 = d3 / 1800;
        } else {
            i2 = 3;
        }
        if (d4 == 0 || d4 == 1800 || d4 == 3600) {
            i3 = d4 / 1800;
        } else {
            i3 = 3;
        }
        C6351eBb ebb = this.c;
        dataOutput.writeInt((this.a.getValue() << 28) + ((this.b + 32) << 22) + ((ebb == null ? 0 : ebb.getValue()) << 19) + (i4 << 14) + (this.f.ordinal() << 12) + (i5 << 4) + (i2 << 2) + i3);
        if (i4 == 31) {
            dataOutput.writeInt(N);
        }
        if (i5 == 255) {
            dataOutput.writeInt(d2);
        }
        if (i2 == 3) {
            dataOutput.writeInt(this.h.d());
        }
        if (i3 == 3) {
            dataOutput.writeInt(this.i.d());
        }
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MDb)) {
            return false;
        }
        MDb mDb = (MDb) obj;
        if (!(this.a == mDb.a && this.b == mDb.b && this.c == mDb.c && this.f == mDb.f && this.e == mDb.e && this.d.equals(mDb.d) && this.g.equals(mDb.g) && this.h.equals(mDb.h) && this.i.equals(mDb.i))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int N = ((this.d.N() + this.e) << 15) + (this.a.ordinal() << 11) + ((this.b + 32) << 5);
        C6351eBb ebb = this.c;
        return ((((N + ((ebb == null ? 7 : ebb.ordinal()) << 2)) + this.f.ordinal()) ^ this.g.hashCode()) ^ this.h.hashCode()) ^ this.i.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransitionRule[");
        sb.append(this.h.compareTo(this.i) > 0 ? "Gap " : "Overlap ");
        sb.append(this.h);
        sb.append(" to ");
        sb.append(this.i);
        sb.append(", ");
        C6351eBb ebb = this.c;
        if (ebb != null) {
            byte b2 = this.b;
            if (b2 == -1) {
                sb.append(ebb.name());
                sb.append(" on or before last day of ");
                sb.append(this.a.name());
            } else if (b2 < 0) {
                sb.append(ebb.name());
                sb.append(" on or before last day minus ");
                sb.append((-this.b) - 1);
                sb.append(" of ");
                sb.append(this.a.name());
            } else {
                sb.append(ebb.name());
                sb.append(" on or after ");
                sb.append(this.a.name());
                sb.append(' ');
                sb.append(this.b);
            }
        } else {
            sb.append(this.a.name());
            sb.append(' ');
            sb.append(this.b);
        }
        sb.append(" at ");
        if (this.e == 0) {
            sb.append(this.d);
        } else {
            long N = (long) ((this.d.N() / 60) + (this.e * 24 * 60));
            a(sb, C6355eDb.b(N, 60));
            sb.append(':');
            a(sb, (long) C6355eDb.a(N, 60));
        }
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }

    static MDb a(DataInput dataInput) throws IOException {
        C6351eBb ebb;
        int readInt = dataInput.readInt();
        C7446uBb a2 = C7446uBb.a(readInt >>> 28);
        int i2 = ((264241152 & readInt) >>> 22) - 32;
        int i3 = (3670016 & readInt) >>> 19;
        if (i3 == 0) {
            ebb = null;
        } else {
            ebb = C6351eBb.a(i3);
        }
        C6351eBb ebb2 = ebb;
        int i4 = (507904 & readInt) >>> 14;
        a aVar = a.values()[(readInt & 12288) >>> 12];
        int i5 = (readInt & 4080) >>> 4;
        int i6 = (readInt & 12) >>> 2;
        int i7 = readInt & 3;
        int readInt2 = i4 == 31 ? dataInput.readInt() : i4 * 3600;
        PBb a3 = PBb.a(i5 == 255 ? dataInput.readInt() : (i5 - 128) * 900);
        PBb a4 = PBb.a(i6 == 3 ? dataInput.readInt() : a3.d() + (i6 * 1800));
        PBb a5 = PBb.a(i7 == 3 ? dataInput.readInt() : a3.d() + (i7 * 1800));
        if (i2 < -28 || i2 > 31 || i2 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        MDb mDb = new MDb(a2, i2, ebb2, C7239rBb.b((long) C6355eDb.c(readInt2, 86400)), C6355eDb.b(readInt2, 86400), aVar, a3, a4, a5);
        return mDb;
    }

    public KDb a(int i2) {
        C6827lBb lbb;
        byte b2 = this.b;
        if (b2 < 0) {
            C7446uBb ubb = this.a;
            lbb = C6827lBb.a(i2, ubb, ubb.b(C7034oCb.e.isLeapYear((long) i2)) + 1 + this.b);
            C6351eBb ebb = this.c;
            if (ebb != null) {
                lbb = lbb.a(C7243rDb.b(ebb));
            }
        } else {
            lbb = C6827lBb.a(i2, this.a, (int) b2);
            C6351eBb ebb2 = this.c;
            if (ebb2 != null) {
                lbb = lbb.a(C7243rDb.a(ebb2));
            }
        }
        return new KDb(this.f.a(C7032oBb.a(lbb.d((long) this.e), this.d), this.g, this.h), this.h, this.i);
    }

    private void a(StringBuilder sb, long j) {
        if (j < 10) {
            sb.append(0);
        }
        sb.append(j);
    }
}
