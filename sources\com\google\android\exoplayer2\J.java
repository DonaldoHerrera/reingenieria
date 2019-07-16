package com.google.android.exoplayer2;

/* compiled from: PlaybackParameters */
public final class J {
    public static final J a = new J(1.0f);
    public final float b;
    public final float c;
    public final boolean d;
    private final int e;

    public J(float f) {
        this(f, 1.0f, false);
    }

    public long a(long j) {
        return j * ((long) this.e);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || J.class != obj.getClass()) {
            return false;
        }
        J j = (J) obj;
        if (!(this.b == j.b && this.c == j.c && this.d == j.d)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((527 + Float.floatToRawIntBits(this.b)) * 31) + Float.floatToRawIntBits(this.c)) * 31) + (this.d ? 1 : 0);
    }

    public J(float f, float f2, boolean z) {
        boolean z2 = true;
        C1852xq.a(f > 0.0f);
        if (f2 <= 0.0f) {
            z2 = false;
        }
        C1852xq.a(z2);
        this.b = f;
        this.c = f2;
        this.d = z;
        this.e = Math.round(f * 1000.0f);
    }
}
