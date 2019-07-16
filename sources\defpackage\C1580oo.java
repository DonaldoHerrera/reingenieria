package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;

/* renamed from: oo reason: default package and case insensitive filesystem */
/* compiled from: Id3Reader */
public final class C1580oo implements C1425jo {
    private final Pq a = new Pq(10);
    private C1424jn b;
    private boolean c;
    private long d;
    private int e;
    private int f;

    public void a() {
        this.c = false;
    }

    public void b() {
        if (this.c) {
            int i = this.e;
            if (i != 0 && this.f == i) {
                this.b.a(this.d, 1, i, 0, null);
                this.c = false;
            }
        }
    }

    public void a(C0498bn bnVar, d dVar) {
        dVar.a();
        this.b = bnVar.a(dVar.c(), 4);
        this.b.a(Format.a(dVar.b(), "application/id3", (String) null, -1, (DrmInitData) null));
    }

    public void a(long j, int i) {
        if ((i & 4) != 0) {
            this.c = true;
            this.d = j;
            this.e = 0;
            this.f = 0;
        }
    }

    public void a(Pq pq) {
        if (this.c) {
            int a2 = pq.a();
            int i = this.f;
            if (i < 10) {
                int min = Math.min(a2, 10 - i);
                System.arraycopy(pq.a, pq.c(), this.a.a, this.f, min);
                if (this.f + min == 10) {
                    this.a.e(0);
                    if (73 == this.a.t() && 68 == this.a.t() && 51 == this.a.t()) {
                        this.a.f(3);
                        this.e = this.a.s() + 10;
                    } else {
                        Iq.d("Id3Reader", "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a2, this.e - this.f);
            this.b.a(pq, min2);
            this.f += min2;
        }
    }
}
