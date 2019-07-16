package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.s.a;
import com.google.android.exoplayer2.source.s.b;
import com.google.android.exoplayer2.source.s.c;

/* compiled from: lambda */
public final /* synthetic */ class d implements Runnable {
    private final /* synthetic */ a a;
    private final /* synthetic */ s b;
    private final /* synthetic */ b c;
    private final /* synthetic */ c d;

    public /* synthetic */ d(a aVar, s sVar, b bVar, c cVar) {
        this.a = aVar;
        this.b = sVar;
        this.c = bVar;
        this.d = cVar;
    }

    public final void run() {
        this.a.b(this.b, this.c, this.d);
    }
}
