package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.Format;

/* compiled from: lambda */
public final /* synthetic */ class a implements Runnable {
    private final /* synthetic */ com.google.android.exoplayer2.video.r.a a;
    private final /* synthetic */ Format b;

    public /* synthetic */ a(com.google.android.exoplayer2.video.r.a aVar, Format format) {
        this.a = aVar;
        this.b = format;
    }

    public final void run() {
        this.a.b(this.b);
    }
}
