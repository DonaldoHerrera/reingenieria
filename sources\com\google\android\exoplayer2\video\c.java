package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.video.r.a;

/* compiled from: lambda */
public final /* synthetic */ class c implements Runnable {
    private final /* synthetic */ a a;
    private final /* synthetic */ int b;
    private final /* synthetic */ int c;
    private final /* synthetic */ int d;
    private final /* synthetic */ float e;

    public /* synthetic */ c(a aVar, int i, int i2, int i3, float f) {
        this.a = aVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.d, this.e);
    }
}
