package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.s.a;
import com.google.android.exoplayer2.source.s.b;
import com.google.android.exoplayer2.source.s.c;

/* renamed from: com.google.android.exoplayer2.source.b reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C0620b implements Runnable {
    private final /* synthetic */ a a;
    private final /* synthetic */ s b;
    private final /* synthetic */ b c;
    private final /* synthetic */ c d;

    public /* synthetic */ C0620b(a aVar, s sVar, b bVar, c cVar) {
        this.a = aVar;
        this.b = sVar;
        this.c = bVar;
        this.d = cVar;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.d);
    }
}
