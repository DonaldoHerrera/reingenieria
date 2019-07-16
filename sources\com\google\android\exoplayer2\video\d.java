package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.video.r.a;

/* compiled from: lambda */
public final /* synthetic */ class d implements Runnable {
    private final /* synthetic */ a a;
    private final /* synthetic */ String b;
    private final /* synthetic */ long c;
    private final /* synthetic */ long d;

    public /* synthetic */ d(a aVar, String str, long j, long j2) {
        this.a = aVar;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    public final void run() {
        this.a.b(this.b, this.c, this.d);
    }
}
