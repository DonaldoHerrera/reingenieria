package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.B;
import com.google.android.exoplayer2.C0614n;
import com.google.android.exoplayer2.C0618s;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;

/* compiled from: MetadataRenderer */
public final class g extends C0614n implements Callback {
    private final d j;
    private final f k;
    private final Handler l;
    private final B m;
    private final e n;
    private final Metadata[] o;
    private final long[] p;
    private int q;
    private int r;
    private b s;
    private boolean t;

    public g(f fVar, Looper looper) {
        this(fVar, looper, d.a);
    }

    private void b(Metadata metadata) {
        this.k.a(metadata);
    }

    private void x() {
        Arrays.fill(this.o, null);
        this.q = 0;
        this.r = 0;
    }

    public int a(Format format) {
        if (!this.j.a(format)) {
            return 0;
        }
        return C0614n.a(null, format.l) ? 4 : 2;
    }

    public boolean b() {
        return true;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            b((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    public void t() {
        x();
        this.s = null;
    }

    public g(f fVar, Looper looper, d dVar) {
        Handler handler;
        super(4);
        C1852xq.a(fVar);
        this.k = fVar;
        if (looper == null) {
            handler = null;
        } else {
            handler = C0471ar.a(looper, (Callback) this);
        }
        this.l = handler;
        C1852xq.a(dVar);
        this.j = dVar;
        this.m = new B();
        this.n = new e();
        this.o = new Metadata[5];
        this.p = new long[5];
    }

    /* access modifiers changed from: protected */
    public void a(Format[] formatArr, long j2) throws C0618s {
        this.s = this.j.b(formatArr[0]);
    }

    /* access modifiers changed from: protected */
    public void a(long j2, boolean z) {
        x();
        this.t = false;
    }

    public void a(long j2, long j3) throws C0618s {
        if (!this.t && this.r < 5) {
            this.n.b();
            if (a(this.m, (Qm) this.n, false) == -4) {
                if (this.n.d()) {
                    this.t = true;
                } else if (!this.n.c()) {
                    e eVar = this.n;
                    eVar.f = this.m.a.m;
                    eVar.f();
                    int i = (this.q + this.r) % 5;
                    Metadata a = this.s.a(this.n);
                    if (a != null) {
                        this.o[i] = a;
                        this.p[i] = this.n.d;
                        this.r++;
                    }
                }
            }
        }
        if (this.r > 0) {
            long[] jArr = this.p;
            int i2 = this.q;
            if (jArr[i2] <= j2) {
                a(this.o[i2]);
                Metadata[] metadataArr = this.o;
                int i3 = this.q;
                metadataArr[i3] = null;
                this.q = (i3 + 1) % 5;
                this.r--;
            }
        }
    }

    public boolean a() {
        return this.t;
    }

    private void a(Metadata metadata) {
        Handler handler = this.l;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            b(metadata);
        }
    }
}
