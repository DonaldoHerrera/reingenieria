package defpackage;

import com.google.android.exoplayer2.Format;
import java.util.Collections;
import java.util.List;

/* renamed from: io reason: default package and case insensitive filesystem */
/* compiled from: DvbSubtitleReader */
public final class C1394io implements C1425jo {
    private final List<a> a;
    private final C1424jn[] b;
    private boolean c;
    private int d;
    private int e;
    private long f;

    public C1394io(List<a> list) {
        this.a = list;
        this.b = new C1424jn[list.size()];
    }

    public void a() {
        this.c = false;
    }

    public void b() {
        if (this.c) {
            for (C1424jn a2 : this.b) {
                a2.a(this.f, 1, this.e, 0, null);
            }
            this.c = false;
        }
    }

    public void a(C0498bn bnVar, d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            a aVar = (a) this.a.get(i);
            dVar.a();
            C1424jn a2 = bnVar.a(dVar.c(), 3);
            a2.a(Format.a(dVar.b(), "application/dvbsubs", null, -1, 0, Collections.singletonList(aVar.c), aVar.a, null));
            this.b[i] = a2;
        }
    }

    public void a(long j, int i) {
        if ((i & 4) != 0) {
            this.c = true;
            this.f = j;
            this.e = 0;
            this.d = 2;
        }
    }

    public void a(Pq pq) {
        C1424jn[] jnVarArr;
        if (this.c && (this.d != 2 || a(pq, 32))) {
            if (this.d != 1 || a(pq, 0)) {
                int c2 = pq.c();
                int a2 = pq.a();
                for (C1424jn jnVar : this.b) {
                    pq.e(c2);
                    jnVar.a(pq, a2);
                }
                this.e += a2;
            }
        }
    }

    private boolean a(Pq pq, int i) {
        if (pq.a() == 0) {
            return false;
        }
        if (pq.t() != i) {
            this.c = false;
        }
        this.d--;
        return this.c;
    }
}
