package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.s.a;
import com.google.android.exoplayer2.source.s.b;
import com.google.android.exoplayer2.source.s.c;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.source.a reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C0619a implements Runnable {
    private final /* synthetic */ a a;
    private final /* synthetic */ s b;
    private final /* synthetic */ b c;
    private final /* synthetic */ c d;
    private final /* synthetic */ IOException e;
    private final /* synthetic */ boolean f;

    public /* synthetic */ C0619a(a aVar, s sVar, b bVar, c cVar, IOException iOException, boolean z) {
        this.a = aVar;
        this.b = sVar;
        this.c = bVar;
        this.d = cVar;
        this.e = iOException;
        this.f = z;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.d, this.e, this.f);
    }
}
