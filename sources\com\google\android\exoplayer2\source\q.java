package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.T;
import com.google.android.exoplayer2.trackselection.l;
import java.io.IOException;

/* compiled from: MediaPeriod */
public interface q extends y {

    /* compiled from: MediaPeriod */
    public interface a extends com.google.android.exoplayer2.source.y.a<q> {
        void a(q qVar);
    }

    long a();

    long a(long j);

    long a(long j, T t);

    long a(l[] lVarArr, boolean[] zArr, x[] xVarArr, boolean[] zArr2, long j);

    void a(long j, boolean z);

    void a(a aVar, long j);

    long b();

    boolean b(long j);

    void c() throws IOException;

    void c(long j);

    TrackGroupArray d();

    long e();
}
