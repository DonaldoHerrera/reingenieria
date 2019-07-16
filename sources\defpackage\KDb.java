package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: KDb reason: default package */
/* compiled from: ZoneOffsetTransition */
public final class KDb implements Comparable<KDb>, Serializable {
    private final C7032oBb a;
    private final PBb b;
    private final PBb c;

    KDb(C7032oBb obb, PBb pBb, PBb pBb2) {
        this.a = obb;
        this.b = pBb;
        this.c = pBb2;
    }

    private int v() {
        return e().d() - f().d();
    }

    private Object writeReplace() {
        return new HDb(2, this);
    }

    /* access modifiers changed from: 0000 */
    public void a(DataOutput dataOutput) throws IOException {
        HDb.a(toEpochSecond(), dataOutput);
        HDb.a(this.b, dataOutput);
        HDb.a(this.c, dataOutput);
    }

    public C7032oBb b() {
        return this.a;
    }

    public C6419fBb c() {
        return C6419fBb.b((long) v());
    }

    public C6623iBb d() {
        return this.a.b(this.b);
    }

    public PBb e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KDb)) {
            return false;
        }
        KDb kDb = (KDb) obj;
        if (!this.a.equals(kDb.a) || !this.b.equals(kDb.b) || !this.c.equals(kDb.c)) {
            z = false;
        }
        return z;
    }

    public PBb f() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public List<PBb> g() {
        if (u()) {
            return Collections.emptyList();
        }
        return Arrays.asList(new PBb[]{f(), e()});
    }

    public int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 16);
    }

    public long toEpochSecond() {
        return this.a.a(this.b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transition[");
        sb.append(u() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.a);
        sb.append(this.b);
        sb.append(" to ");
        sb.append(this.c);
        sb.append(']');
        return sb.toString();
    }

    public boolean u() {
        return e().d() > f().d();
    }

    static KDb a(DataInput dataInput) throws IOException {
        long b2 = HDb.b(dataInput);
        PBb c2 = HDb.c(dataInput);
        PBb c3 = HDb.c(dataInput);
        if (!c2.equals(c3)) {
            return new KDb(b2, c2, c3);
        }
        throw new IllegalArgumentException("Offsets must not be equal");
    }

    KDb(long j, PBb pBb, PBb pBb2) {
        this.a = C7032oBb.a(j, 0, pBb);
        this.b = pBb;
        this.c = pBb2;
    }

    public C7032oBb a() {
        return this.a.e((long) v());
    }

    /* renamed from: a */
    public int compareTo(KDb kDb) {
        return d().compareTo(kDb.d());
    }
}
