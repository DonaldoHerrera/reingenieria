package defpackage;

import com.adjust.sdk.Constants;
import com.google.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: oAb reason: default package and case insensitive filesystem */
/* compiled from: ByteString */
public class C7030oAb implements Serializable, Comparable<C7030oAb> {
    static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final C7030oAb b = a(new byte[0]);
    final byte[] c;
    transient int d;
    transient String e;

    C7030oAb(byte[] bArr) {
        this.c = bArr;
    }

    public static C7030oAb a(byte... bArr) {
        if (bArr != null) {
            return new C7030oAb((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static C7030oAb c(String str) {
        if (str != null) {
            C7030oAb oab = new C7030oAb(str.getBytes(KAb.a));
            oab.e = str;
            return oab;
        }
        throw new IllegalArgumentException("s == null");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        C7030oAb a2 = a((InputStream) objectInputStream, objectInputStream.readInt());
        try {
            Field declaredField = C7030oAb.class.getDeclaredField("c");
            declaredField.setAccessible(true);
            declaredField.set(this, a2.c);
        } catch (NoSuchFieldException unused) {
            throw new AssertionError();
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.c.length);
        objectOutputStream.write(this.c);
    }

    public String b() {
        byte[] bArr = this.c;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = a;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & Ascii.SI];
        }
        return new String(cArr);
    }

    public C7030oAb d() {
        return d(Constants.SHA1);
    }

    public C7030oAb e() {
        return d(Constants.SHA256);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r6.a(0, r3, 0, r3.length) != false) goto L_0x001d;
     */
    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7030oAb) {
            C7030oAb oab = (C7030oAb) obj;
            int f = oab.f();
            byte[] bArr = this.c;
            if (f == bArr.length) {
            }
        }
        z = false;
        return z;
    }

    public int f() {
        return this.c.length;
    }

    public C7030oAb g() {
        int i = 0;
        while (true) {
            byte[] bArr = this.c;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            if (b2 < 65 || b2 > 90) {
                i++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b3 = bArr2[i2];
                    if (b3 >= 65 && b3 <= 90) {
                        bArr2[i2] = (byte) (b3 + 32);
                    }
                }
                return new C7030oAb(bArr2);
            }
        }
    }

    public int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.c);
        this.d = hashCode;
        return hashCode;
    }

    public String toString() {
        String str;
        String str2;
        if (this.c.length == 0) {
            return "[size=0]";
        }
        String v = v();
        int a2 = a(v, 64);
        String str3 = "…]";
        String str4 = "[size=";
        String str5 = "]";
        if (a2 == -1) {
            if (this.c.length <= 64) {
                StringBuilder sb = new StringBuilder();
                sb.append("[hex=");
                sb.append(b());
                sb.append(str5);
                str2 = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str4);
                sb2.append(this.c.length);
                sb2.append(" hex=");
                sb2.append(a(0, 64).b());
                sb2.append(str3);
                str2 = sb2.toString();
            }
            return str2;
        }
        String replace = v.substring(0, a2).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (a2 < v.length()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str4);
            sb3.append(this.c.length);
            sb3.append(" text=");
            sb3.append(replace);
            sb3.append(str3);
            str = sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("[text=");
            sb4.append(replace);
            sb4.append(str5);
            str = sb4.toString();
        }
        return str;
    }

    public byte[] u() {
        return (byte[]) this.c.clone();
    }

    public String v() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.c, KAb.a);
        this.e = str2;
        return str2;
    }

    private C7030oAb d(String str) {
        try {
            return a(MessageDigest.getInstance(str).digest(this.c));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public String a() {
        return C6689jAb.a(this.c);
    }

    public static C7030oAb a(String str) {
        if (str != null) {
            byte[] a2 = C6689jAb.a(str);
            if (a2 != null) {
                return new C7030oAb(a2);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    public C7030oAb c() {
        return d(Constants.MD5);
    }

    public static C7030oAb b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        } else if (str.length() % 2 == 0) {
            byte[] bArr = new byte[(str.length() / 2)];
            for (int i = 0; i < bArr.length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((a(str.charAt(i2)) << 4) + a(str.charAt(i2 + 1)));
            }
            return a(bArr);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected hex string: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (c2 < 'a' || c2 > 'f') {
            c3 = 'A';
            if (c2 < 'A' || c2 > 'F') {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected hex digit: ");
                sb.append(c2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return (c2 - c3) + 10;
    }

    public static C7030oAb a(InputStream inputStream, int i) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (i >= 0) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read != -1) {
                    i2 += read;
                } else {
                    throw new EOFException();
                }
            }
            return new C7030oAb(bArr);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public C7030oAb a(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.c;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i == 0 && i2 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(this.c, i, bArr2, 0, i3);
                    return new C7030oAb(bArr2);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("endIndex > length(");
                sb.append(this.c.length);
                sb.append(")");
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    public final boolean b(C7030oAb oab) {
        return a(0, oab, 0, oab.f());
    }

    public byte a(int i) {
        return this.c[i];
    }

    /* access modifiers changed from: 0000 */
    public void a(C6825lAb lab) {
        byte[] bArr = this.c;
        lab.write(bArr, 0, bArr.length);
    }

    public boolean a(int i, C7030oAb oab, int i2, int i3) {
        return oab.a(i2, this.c, i, i3);
    }

    public boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.c;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && KAb.a(bArr2, i, bArr, i2, i3)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public int compareTo(C7030oAb oab) {
        int f = f();
        int f2 = oab.f();
        int min = Math.min(f, f2);
        int i = 0;
        while (true) {
            int i2 = -1;
            if (i < min) {
                byte a2 = a(i) & 255;
                byte a3 = oab.a(i) & 255;
                if (a2 == a3) {
                    i++;
                } else {
                    if (a2 >= a3) {
                        i2 = 1;
                    }
                    return i2;
                }
            } else if (f == f2) {
                return 0;
            } else {
                if (f >= f2) {
                    i2 = 1;
                }
                return i2;
            }
        }
    }

    static int a(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }
}
