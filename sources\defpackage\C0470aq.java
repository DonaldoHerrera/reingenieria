package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: aq reason: default package and case insensitive filesystem */
/* compiled from: DataSpec */
public final class C0470aq {
    public final Uri a;
    public final int b;
    public final byte[] c;
    @Deprecated
    public final byte[] d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;

    public C0470aq(Uri uri, long j, long j2, String str, int i2) {
        this(uri, j, j, j2, str, i2);
    }

    public final String a() {
        return a(this.b);
    }

    public boolean b(int i2) {
        return (this.i & i2) == i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataSpec[");
        sb.append(a());
        sb.append(" ");
        sb.append(this.a);
        String str = ", ";
        sb.append(str);
        sb.append(Arrays.toString(this.c));
        sb.append(str);
        sb.append(this.e);
        sb.append(str);
        sb.append(this.f);
        sb.append(str);
        sb.append(this.g);
        sb.append(str);
        sb.append(this.h);
        sb.append(str);
        sb.append(this.i);
        sb.append("]");
        return sb.toString();
    }

    public C0470aq(Uri uri, long j, long j2, long j3, String str, int i2) {
        this(uri, null, j, j2, j3, str, i2);
    }

    public static String a(int i2) {
        if (i2 == 1) {
            return "GET";
        }
        if (i2 == 2) {
            return "POST";
        }
        if (i2 == 3) {
            return "HEAD";
        }
        throw new AssertionError(i2);
    }

    public C0470aq(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i2) {
        this(uri, bArr != null ? 2 : 1, bArr, j, j2, j3, str, i2);
    }

    public C0470aq(Uri uri, int i2, byte[] bArr, long j, long j2, long j3, String str, int i3) {
        byte[] bArr2 = bArr;
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        boolean z = true;
        C1852xq.a(j4 >= 0);
        C1852xq.a(j5 >= 0);
        if (j6 <= 0 && j6 != -1) {
            z = false;
        }
        C1852xq.a(z);
        this.a = uri;
        this.b = i2;
        if (bArr2 == null || bArr2.length == 0) {
            bArr2 = null;
        }
        this.c = bArr2;
        this.d = this.c;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = str;
        this.i = i3;
    }
}
