package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.X;
import com.google.android.exoplayer2.source.r.a;
import java.io.IOException;

/* compiled from: ProgressiveMediaSource */
public final class u extends k implements c {
    private final Uri f;
    private final a g;
    private final C0529cn h;
    private final C1520mq i;
    private final String j;
    private final int k;
    private final Object l;
    private long m = -9223372036854775807L;
    private boolean n;
    private C1702sq o;

    u(Uri uri, a aVar, C0529cn cnVar, C1520mq mqVar, String str, int i2, Object obj) {
        this.f = uri;
        this.g = aVar;
        this.h = cnVar;
        this.i = mqVar;
        this.j = str;
        this.k = i2;
        this.l = obj;
    }

    private void b(long j2, boolean z) {
        this.m = j2;
        this.n = z;
        z zVar = new z(this.m, this.n, false, this.l);
        a((X) zVar, (Object) null);
    }

    public void a() throws IOException {
    }

    public void a(C1702sq sqVar) {
        this.o = sqVar;
        b(this.m, this.n);
    }

    public void b() {
    }

    public q a(a aVar, Sp sp, long j2) {
        Zp a = this.g.a();
        C1702sq sqVar = this.o;
        if (sqVar != null) {
            a.a(sqVar);
        }
        t tVar = new t(this.f, a, this.h.a(), this.i, a(aVar), this, sp, this.j, this.k);
        return tVar;
    }

    public void a(q qVar) {
        ((t) qVar).l();
    }

    public void a(long j2, boolean z) {
        if (j2 == -9223372036854775807L) {
            j2 = this.m;
        }
        if (this.m != j2 || this.n != z) {
            b(j2, z);
        }
    }
}
