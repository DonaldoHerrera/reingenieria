package com.google.android.exoplayer2;

/* compiled from: RendererConfiguration */
public final class Q {
    public static final Q a = new Q(0);
    public final int b;

    public Q(int i) {
        this.b = i;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || Q.class != obj.getClass()) {
            return false;
        }
        if (this.b != ((Q) obj).b) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.b;
    }
}
