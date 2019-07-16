package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: Jh reason: default package */
/* compiled from: ByteString */
final class Jh {
    public static final Jh a = new Jh(new byte[0]);
    private final byte[] b;
    private volatile int c = 0;

    private Jh(byte[] bArr) {
        this.b = bArr;
    }

    public static Jh a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new Jh(bArr2);
    }

    public int b() {
        return this.b.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Jh)) {
            return false;
        }
        Jh jh = (Jh) obj;
        byte[] bArr = this.b;
        int length = bArr.length;
        byte[] bArr2 = jh.b;
        if (length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.c;
        if (i == 0) {
            int i2 = r1;
            for (byte b2 : this.b) {
                i2 = (i2 * 31) + b2;
            }
            i = i2 == 0 ? 1 : i2;
            this.c = i;
        }
        return i;
    }

    public static Jh a(String str) {
        try {
            return new Jh(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    public void a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.b, i, bArr, i2, i3);
    }

    public InputStream a() {
        return new ByteArrayInputStream(this.b);
    }
}
