package defpackage;

import java.util.Arrays;

/* renamed from: Jq reason: default package */
/* compiled from: LongArray */
public final class Jq {
    private int a;
    private long[] b;

    public Jq() {
        this(32);
    }

    public void a(long j) {
        int i = this.a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        jArr2[i2] = j;
    }

    public long[] b() {
        return Arrays.copyOf(this.b, this.a);
    }

    public Jq(int i) {
        this.b = new long[i];
    }

    public long a(int i) {
        if (i >= 0 && i < this.a) {
            return this.b[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(this.a);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public int a() {
        return this.a;
    }
}
