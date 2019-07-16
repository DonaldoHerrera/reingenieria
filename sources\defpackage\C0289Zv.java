package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: Zv reason: default package and case insensitive filesystem */
public abstract class C0289Zv implements Serializable, Iterable<Byte> {
    public static final C0289Zv a = new C1372hw(C0209Gw.c);
    private static final C1279ew b = (C0275Wv.a() ? new C1464kw(null) : new C1218cw(null));
    private static final Comparator<C0289Zv> c = new C0293_v();
    private int d = 0;

    C0289Zv() {
    }

    public static C0289Zv a(byte[] bArr, int i, int i2) {
        b(i, i + i2, bArr.length);
        return new C1372hw(b.a(bArr, i, i2));
    }

    /* access modifiers changed from: private */
    public static int b(byte b2) {
        return b2 & 255;
    }

    static C0289Zv b(byte[] bArr) {
        return new C1372hw(bArr);
    }

    /* access modifiers changed from: protected */
    public abstract int a(int i, int i2, int i3);

    public abstract C0289Zv a(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract String b(Charset charset);

    public abstract byte c(int i);

    public abstract boolean equals(Object obj);

    public abstract boolean f();

    /* access modifiers changed from: protected */
    public final int g() {
        return this.d;
    }

    public final int hashCode() {
        int i = this.d;
        if (i == 0) {
            int size = size();
            i = a(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.d = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new C0507bw(this);
    }

    /* access modifiers changed from: 0000 */
    public abstract byte m(int i);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    static int b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public static C0289Zv a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static C0289Zv a(String str) {
        return new C1372hw(str.getBytes(C0209Gw.a));
    }

    public final String a(Charset charset) {
        return size() == 0 ? "" : b(charset);
    }
}
