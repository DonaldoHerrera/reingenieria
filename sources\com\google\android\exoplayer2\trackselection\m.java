package com.google.android.exoplayer2.trackselection;

import java.util.Arrays;

/* compiled from: TrackSelectionArray */
public final class m {
    public final int a;
    private final l[] b;
    private int c;

    public m(l... lVarArr) {
        this.b = lVarArr;
        this.a = lVarArr.length;
    }

    public l a(int i) {
        return this.b[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.b, ((m) obj).b);
    }

    public int hashCode() {
        if (this.c == 0) {
            this.c = 527 + Arrays.hashCode(this.b);
        }
        return this.c;
    }

    public l[] a() {
        return (l[]) this.b.clone();
    }
}
