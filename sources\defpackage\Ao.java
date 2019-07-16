package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;

/* renamed from: Ao reason: default package */
/* compiled from: SpliceInfoSectionReader */
public final class Ao implements C1850xo {
    private Zq a;
    private C1424jn b;
    private boolean c;

    public void a(Zq zq, C0498bn bnVar, d dVar) {
        this.a = zq;
        dVar.a();
        this.b = bnVar.a(dVar.c(), 4);
        this.b.a(Format.a(dVar.b(), "application/x-scte35", (String) null, -1, (DrmInitData) null));
    }

    public void a(Pq pq) {
        if (!this.c) {
            if (this.a.c() != -9223372036854775807L) {
                this.b.a(Format.a(null, "application/x-scte35", this.a.c()));
                this.c = true;
            } else {
                return;
            }
        }
        int a2 = pq.a();
        this.b.a(pq, a2);
        this.b.a(this.a.b(), 1, a2, 0, null);
    }
}
