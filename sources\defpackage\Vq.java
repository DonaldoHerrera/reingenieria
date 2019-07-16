package defpackage;

import com.google.android.exoplayer2.C0615o;
import com.google.android.exoplayer2.J;

/* renamed from: Vq reason: default package */
/* compiled from: StandaloneMediaClock */
public final class Vq implements Kq {
    private final C1882yq a;
    private boolean b;
    private long c;
    private long d;
    private J e = J.a;

    public Vq(C1882yq yqVar) {
        this.a = yqVar;
    }

    public void a() {
        if (!this.b) {
            this.d = this.a.elapsedRealtime();
            this.b = true;
        }
    }

    public void b() {
        if (this.b) {
            a(f());
            this.b = false;
        }
    }

    public J c() {
        return this.e;
    }

    public long f() {
        long j;
        long j2 = this.c;
        if (!this.b) {
            return j2;
        }
        long elapsedRealtime = this.a.elapsedRealtime() - this.d;
        J j3 = this.e;
        if (j3.b == 1.0f) {
            j = C0615o.a(elapsedRealtime);
        } else {
            j = j3.a(elapsedRealtime);
        }
        return j2 + j;
    }

    public void a(long j) {
        this.c = j;
        if (this.b) {
            this.d = this.a.elapsedRealtime();
        }
    }

    public J a(J j) {
        if (this.b) {
            a(f());
        }
        this.e = j;
        return j;
    }
}
