package com.google.android.exoplayer2;

import com.google.android.exoplayer2.X.b;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.r.a;
import com.google.android.exoplayer2.trackselection.p;

/* compiled from: PlaybackInfo */
final class I {
    private static final a a = new a(new Object());
    public final X b;
    public final Object c;
    public final a d;
    public final long e;
    public final long f;
    public final int g;
    public final boolean h;
    public final TrackGroupArray i;
    public final p j;
    public final a k;
    public volatile long l;
    public volatile long m;
    public volatile long n;

    public I(X x, Object obj, a aVar, long j2, long j3, int i2, boolean z, TrackGroupArray trackGroupArray, p pVar, a aVar2, long j4, long j5, long j6) {
        this.b = x;
        this.c = obj;
        this.d = aVar;
        this.e = j2;
        this.f = j3;
        this.g = i2;
        this.h = z;
        this.i = trackGroupArray;
        this.j = pVar;
        this.k = aVar2;
        this.l = j4;
        this.m = j5;
        this.n = j6;
    }

    public static I a(long j2, p pVar) {
        p pVar2 = pVar;
        I i2 = new I(X.a, null, a, j2, -9223372036854775807L, 1, false, TrackGroupArray.a, pVar2, a, j2, 0, j2);
        return i2;
    }

    public a a(boolean z, b bVar) {
        if (this.b.c()) {
            return a;
        }
        X x = this.b;
        return new a(this.b.a(x.a(x.a(z), bVar).f));
    }

    public I a(a aVar, long j2, long j3) {
        I i2 = new I(this.b, this.c, aVar, j2, aVar.a() ? j3 : -9223372036854775807L, this.g, this.h, this.i, this.j, aVar, j2, 0, j2);
        return i2;
    }

    public I a(a aVar, long j2, long j3, long j4) {
        I i2 = new I(this.b, this.c, aVar, j2, aVar.a() ? j3 : -9223372036854775807L, this.g, this.h, this.i, this.j, this.k, this.l, j4, j2);
        return i2;
    }

    public I a(X x, Object obj) {
        X x2 = x;
        I i2 = new I(x, obj, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
        return i2;
    }

    public I a(int i2) {
        int i3 = i2;
        I i4 = new I(this.b, this.c, this.d, this.e, this.f, i3, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
        return i4;
    }

    public I a(boolean z) {
        boolean z2 = z;
        I i2 = new I(this.b, this.c, this.d, this.e, this.f, this.g, z2, this.i, this.j, this.k, this.l, this.m, this.n);
        return i2;
    }

    public I a(TrackGroupArray trackGroupArray, p pVar) {
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        p pVar2 = pVar;
        I i2 = new I(this.b, this.c, this.d, this.e, this.f, this.g, this.h, trackGroupArray2, pVar2, this.k, this.l, this.m, this.n);
        return i2;
    }

    public I a(a aVar) {
        a aVar2 = aVar;
        I i2 = new I(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, aVar2, this.l, this.m, this.n);
        return i2;
    }
}
