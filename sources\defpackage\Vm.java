package defpackage;

import java.util.Arrays;

/* renamed from: Vm reason: default package */
/* compiled from: ChunkIndex */
public final class Vm implements C1363hn {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    private final long f;

    public Vm(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        this.a = iArr.length;
        int i = this.a;
        if (i > 0) {
            this.f = jArr2[i - 1] + jArr3[i - 1];
        } else {
            this.f = 0;
        }
    }

    public a a(long j) {
        int c2 = c(j);
        C1393in inVar = new C1393in(this.e[c2], this.c[c2]);
        if (inVar.b >= j || c2 == this.a - 1) {
            return new a(inVar);
        }
        int i = c2 + 1;
        return new a(inVar, new C1393in(this.e[i], this.c[i]));
    }

    public boolean b() {
        return true;
    }

    public int c(long j) {
        return C0471ar.b(this.e, j, true, true);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChunkIndex(length=");
        sb.append(this.a);
        sb.append(", sizes=");
        sb.append(Arrays.toString(this.b));
        sb.append(", offsets=");
        sb.append(Arrays.toString(this.c));
        sb.append(", timeUs=");
        sb.append(Arrays.toString(this.e));
        sb.append(", durationsUs=");
        sb.append(Arrays.toString(this.d));
        sb.append(")");
        return sb.toString();
    }

    public long c() {
        return this.f;
    }
}
