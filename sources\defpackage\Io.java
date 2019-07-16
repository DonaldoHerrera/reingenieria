package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.H;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.io.IOException;

/* renamed from: Io reason: default package */
/* compiled from: WavExtractor */
public final class Io implements _m {
    public static final C0529cn a = Ho.a;
    private C0498bn b;
    private C1424jn c;
    private Jo d;
    private int e;
    private int f;

    static /* synthetic */ _m[] a() {
        return new _m[]{new Io()};
    }

    public void release() {
    }

    public boolean a(C0313an anVar) throws IOException, InterruptedException {
        return Ko.a(anVar) != null;
    }

    public void a(C0498bn bnVar) {
        this.b = bnVar;
        this.c = bnVar.a(0, 1);
        this.d = null;
        bnVar.g();
    }

    public void a(long j, long j2) {
        this.f = 0;
    }

    public int a(C0313an anVar, C1332gn gnVar) throws IOException, InterruptedException {
        if (this.d == null) {
            this.d = Ko.a(anVar);
            Jo jo = this.d;
            if (jo != null) {
                this.c.a(Format.a((String) null, "audio/raw", (String) null, jo.d(), 32768, this.d.h(), this.d.i(), this.d.g(), null, (DrmInitData) null, 0, (String) null));
                this.e = this.d.e();
            } else {
                throw new H("Unsupported or unrecognized wav header.");
            }
        }
        if (!this.d.j()) {
            Ko.a(anVar, this.d);
            this.b.a(this.d);
        }
        long f2 = this.d.f();
        int i = 0;
        C1852xq.b(f2 != -1);
        long position = f2 - anVar.getPosition();
        if (position <= 0) {
            return -1;
        }
        int a2 = this.c.a(anVar, (int) Math.min((long) (32768 - this.f), position), true);
        if (a2 != -1) {
            this.f += a2;
        }
        int i2 = this.f / this.e;
        if (i2 > 0) {
            long b2 = this.d.b(anVar.getPosition() - ((long) this.f));
            int i3 = i2 * this.e;
            this.f -= i3;
            this.c.a(b2, 1, i3, this.f, null);
        }
        if (a2 == -1) {
            i = -1;
        }
        return i;
    }
}
