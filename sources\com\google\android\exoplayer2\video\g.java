package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.video.r.a;

/* compiled from: lambda */
public final /* synthetic */ class g implements Runnable {
    private final /* synthetic */ a a;
    private final /* synthetic */ int b;
    private final /* synthetic */ long c;

    public /* synthetic */ g(a aVar, int i, long j) {
        this.a = aVar;
        this.b = i;
        this.c = j;
    }

    public final void run() {
        this.a.b(this.b, this.c);
    }
}
