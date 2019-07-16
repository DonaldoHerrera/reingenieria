package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: So reason: default package */
/* compiled from: AdPlaybackState */
public final class So {
    public static final So a = new So(new long[0]);
    public final int b;
    public final long[] c;
    public final a[] d;
    public final long e;
    public final long f;

    /* renamed from: So$a */
    /* compiled from: AdPlaybackState */
    public static final class a {
        public final int a;
        public final Uri[] b;
        public final int[] c;
        public final long[] d;

        public a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        public int a() {
            return a(-1);
        }

        public boolean b() {
            return this.a == -1 || a() < this.a;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a != aVar.a || !Arrays.equals(this.b, aVar.b) || !Arrays.equals(this.c, aVar.c) || !Arrays.equals(this.d, aVar.d)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (((((this.a * 31) + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d);
        }

        private a(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
            C1852xq.a(iArr.length == uriArr.length);
            this.a = i;
            this.c = iArr;
            this.b = uriArr;
            this.d = jArr;
        }

        public int a(int i) {
            int i2 = i + 1;
            while (true) {
                int[] iArr = this.c;
                if (i2 >= iArr.length || iArr[i2] == 0 || iArr[i2] == 1) {
                    return i2;
                }
                i2++;
            }
            return i2;
        }
    }

    public So(long... jArr) {
        int length = jArr.length;
        this.b = length;
        this.c = Arrays.copyOf(jArr, length);
        this.d = new a[length];
        for (int i = 0; i < length; i++) {
            this.d[i] = new a();
        }
        this.e = 0;
        this.f = -9223372036854775807L;
    }

    public int a(long j) {
        int length = this.c.length - 1;
        while (length >= 0 && a(j, length)) {
            length--;
        }
        if (length < 0 || !this.d[length].b()) {
            return -1;
        }
        return length;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || So.class != obj.getClass()) {
            return false;
        }
        So so = (So) obj;
        if (!(this.b == so.b && this.e == so.e && this.f == so.f && Arrays.equals(this.c, so.c) && Arrays.equals(this.d, so.d))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (((((((this.b * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d);
    }

    public int a(long j, long j2) {
        if (j == Long.MIN_VALUE || (j2 != -9223372036854775807L && j >= j2)) {
            return -1;
        }
        int i = 0;
        while (true) {
            long[] jArr = this.c;
            if (i < jArr.length && jArr[i] != Long.MIN_VALUE && (j >= jArr[i] || !this.d[i].b())) {
                i++;
            }
        }
        if (i >= this.c.length) {
            i = -1;
        }
        return i;
    }

    private boolean a(long j, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        long j2 = this.c[i];
        boolean z = true;
        if (j2 == Long.MIN_VALUE) {
            long j3 = this.f;
            if (j3 != -9223372036854775807L && j >= j3) {
                z = false;
            }
            return z;
        }
        if (j >= j2) {
            z = false;
        }
        return z;
    }
}
