package com.google.android.exoplayer2.video;

import android.view.Surface;
import com.google.android.exoplayer2.video.r.a;

/* compiled from: lambda */
public final /* synthetic */ class b implements Runnable {
    private final /* synthetic */ a a;
    private final /* synthetic */ Surface b;

    public /* synthetic */ b(a aVar, Surface surface) {
        this.a = aVar;
        this.b = surface;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
