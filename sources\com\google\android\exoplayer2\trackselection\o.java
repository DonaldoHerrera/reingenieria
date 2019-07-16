package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.C0618s;
import com.google.android.exoplayer2.P;
import com.google.android.exoplayer2.X;
import com.google.android.exoplayer2.source.TrackGroupArray;

/* compiled from: TrackSelector */
public abstract class o {
    private a a;
    private Up b;

    /* compiled from: TrackSelector */
    public interface a {
    }

    public abstract p a(P[] pArr, TrackGroupArray trackGroupArray, com.google.android.exoplayer2.source.r.a aVar, X x) throws C0618s;

    public final void a(a aVar, Up up) {
        this.a = aVar;
        this.b = up;
    }

    public abstract void a(Object obj);

    /* access modifiers changed from: protected */
    public final Up a() {
        Up up = this.b;
        C1852xq.a(up);
        return up;
    }
}
