package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

public abstract class Ya implements Serializable, Iterable<Byte> {
    public static final Ya a = new C0970hb(Hb.c);
    private static final C0942db b = (Ra.a() ? new C0963gb(null) : new C0928bb(null));
    private static final Comparator<Ya> c = new _a();
    private int d = 0;

    Ya() {
    }

    public static Ya a(byte[] bArr, int i, int i2) {
        b(i, i + i2, bArr.length);
        return new C0970hb(b.a(bArr, i, i2));
    }

    /* access modifiers changed from: private */
    public static int b(byte b2) {
        return b2 & 255;
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

    static C0956fb n(int i) {
        return new C0956fb(i, null);
    }

    /* access modifiers changed from: protected */
    public abstract int a(int i, int i2, int i3);

    public abstract Ya a(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract String a(Charset charset);

    /* access modifiers changed from: 0000 */
    public abstract void a(Va va) throws IOException;

    public abstract byte c(int i);

    public abstract boolean equals(Object obj);

    public final String f() {
        return size() == 0 ? "" : a(Hb.a);
    }

    public abstract boolean g();

    /* access modifiers changed from: protected */
    public final int h() {
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
        return new Xa(this);
    }

    /* access modifiers changed from: 0000 */
    public abstract byte m(int i);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    static Ya a(byte[] bArr) {
        return new C0970hb(bArr);
    }

    public static Ya a(String str) {
        return new C0970hb(str.getBytes(Hb.a));
    }
}
