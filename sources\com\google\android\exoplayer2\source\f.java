package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.s.a;

/* compiled from: lambda */
public final /* synthetic */ class f implements Runnable {
    private final /* synthetic */ a a;
    private final /* synthetic */ s b;
    private final /* synthetic */ r.a c;

    public /* synthetic */ f(a aVar, s sVar, r.a aVar2) {
        this.a = aVar;
        this.b = sVar;
        this.c = aVar2;
    }

    public final void run() {
        this.a.c(this.b, this.c);
    }
}
