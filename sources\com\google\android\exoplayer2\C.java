package com.google.android.exoplayer2;

/* compiled from: IllegalSeekPositionException */
public final class C extends IllegalStateException {
    public final X a;
    public final int b;
    public final long c;

    public C(X x, int i, long j) {
        this.a = x;
        this.b = i;
        this.c = j;
    }
}
