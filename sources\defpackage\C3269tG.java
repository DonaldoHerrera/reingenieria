package defpackage;

import java.lang.reflect.Array;

/* renamed from: tG reason: default package and case insensitive filesystem */
/* compiled from: ByteMatrix */
public final class C3269tG {
    private final byte[][] a;
    private final int b;
    private final int c;

    public C3269tG(int i, int i2) {
        this.a = (byte[][]) Array.newInstance(byte.class, new int[]{i2, i});
        this.b = i;
        this.c = i2;
    }

    public byte a(int i, int i2) {
        return this.a[i2][i];
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.b * 2 * this.c) + 2);
        for (int i = 0; i < this.c; i++) {
            for (int i2 = 0; i2 < this.b; i2++) {
                byte b2 = this.a[i][i2];
                if (b2 == 0) {
                    sb.append(" 0");
                } else if (b2 != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append(10);
        }
        return sb.toString();
    }

    public byte[][] a() {
        return this.a;
    }

    public void a(int i, int i2, int i3) {
        this.a[i2][i] = (byte) i3;
    }

    public void a(int i, int i2, boolean z) {
        this.a[i2][i] = z ? (byte) 1 : 0;
    }

    public void a(byte b2) {
        for (int i = 0; i < this.c; i++) {
            for (int i2 = 0; i2 < this.b; i2++) {
                this.a[i][i2] = b2;
            }
        }
    }
}
