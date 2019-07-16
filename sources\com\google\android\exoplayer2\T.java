package com.google.android.exoplayer2;

/* compiled from: SeekParameters */
public final class T {
    public static final T a = new T(0, 0);
    public static final T b = new T(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final T c = new T(Long.MAX_VALUE, 0);
    public static final T d = new T(0, Long.MAX_VALUE);
    public static final T e = a;
    public final long f;
    public final long g;

    public T(long j, long j2) {
        boolean z = true;
        C1852xq.a(j >= 0);
        if (j2 < 0) {
            z = false;
        }
        C1852xq.a(z);
        this.f = j;
        this.g = j2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || T.class != obj.getClass()) {
            return false;
        }
        T t = (T) obj;
        if (!(this.f == t.f && this.g == t.g)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (((int) this.f) * 31) + ((int) this.g);
    }
}
