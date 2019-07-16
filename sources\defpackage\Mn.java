package defpackage;

import com.google.android.exoplayer2.H;
import java.io.IOException;

/* renamed from: Mn reason: default package */
/* compiled from: OggExtractor */
public class Mn implements _m {
    public static final C0529cn a = In.a;
    private C0498bn b;
    private Sn c;
    private boolean d;

    static /* synthetic */ _m[] a() {
        return new _m[]{new Mn()};
    }

    private boolean b(C0313an anVar) throws IOException, InterruptedException {
        On on = new On();
        if (on.a(anVar, true) && (on.c & 2) == 2) {
            int min = Math.min(on.j, 8);
            Pq pq = new Pq(min);
            anVar.a(pq.a, 0, min);
            a(pq);
            if (Ln.b(pq)) {
                this.c = new Ln();
            } else {
                a(pq);
                if (Un.c(pq)) {
                    this.c = new Un();
                } else {
                    a(pq);
                    if (Qn.b(pq)) {
                        this.c = new Qn();
                    }
                }
            }
            return true;
        }
        return false;
    }

    public void release() {
    }

    public boolean a(C0313an anVar) throws IOException, InterruptedException {
        try {
            return b(anVar);
        } catch (H unused) {
            return false;
        }
    }

    public void a(C0498bn bnVar) {
        this.b = bnVar;
    }

    public void a(long j, long j2) {
        Sn sn = this.c;
        if (sn != null) {
            sn.a(j, j2);
        }
    }

    public int a(C0313an anVar, C1332gn gnVar) throws IOException, InterruptedException {
        if (this.c == null) {
            if (b(anVar)) {
                anVar.a();
            } else {
                throw new H("Failed to determine bitstream type");
            }
        }
        if (!this.d) {
            C1424jn a2 = this.b.a(0, 1);
            this.b.g();
            this.c.a(this.b, a2);
            this.d = true;
        }
        return this.c.a(anVar, gnVar);
    }

    private static Pq a(Pq pq) {
        pq.e(0);
        return pq;
    }
}
