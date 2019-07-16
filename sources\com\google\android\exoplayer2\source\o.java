package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.X;
import com.google.android.exoplayer2.source.r.b;
import java.io.IOException;

@Deprecated
/* compiled from: ExtractorMediaSource */
public final class o extends k implements b {
    private final u f;

    @Deprecated
    /* compiled from: ExtractorMediaSource */
    public static final class a implements To {
        private final defpackage.Zp.a a;
        private C0529cn b;
        private String c;
        private Object d;
        private C1520mq e = new C1396iq();
        private int f = 1048576;
        private boolean g;

        public a(defpackage.Zp.a aVar) {
            this.a = aVar;
        }

        public o a(Uri uri) {
            this.g = true;
            if (this.b == null) {
                this.b = new Ym();
            }
            o oVar = new o(uri, this.a, this.b, this.e, this.c, this.f, this.d);
            return oVar;
        }
    }

    public void a(C1702sq sqVar) {
        this.f.a((b) this, sqVar);
    }

    public void b() {
        this.f.a((b) this);
    }

    private o(Uri uri, defpackage.Zp.a aVar, C0529cn cnVar, C1520mq mqVar, String str, int i, Object obj) {
        u uVar = new u(uri, aVar, cnVar, mqVar, str, i, obj);
        this.f = uVar;
    }

    public void a() throws IOException {
        this.f.a();
    }

    public q a(com.google.android.exoplayer2.source.r.a aVar, Sp sp, long j) {
        return this.f.a(aVar, sp, j);
    }

    public void a(q qVar) {
        this.f.a(qVar);
    }

    public void a(r rVar, X x, Object obj) {
        a(x, obj);
    }
}
