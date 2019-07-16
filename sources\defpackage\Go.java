package defpackage;

import com.google.android.exoplayer2.Format;
import java.util.List;

/* renamed from: Go reason: default package */
/* compiled from: UserDataReader */
final class Go {
    private final List<Format> a;
    private final C1424jn[] b;

    public Go(List<Format> list) {
        this.a = list;
        this.b = new C1424jn[list.size()];
    }

    public void a(C0498bn bnVar, d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            dVar.a();
            C1424jn a2 = bnVar.a(dVar.c(), 3);
            Format format = (Format) this.a.get(i);
            String str = format.i;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid closed caption mime type provided: ");
            sb.append(str);
            C1852xq.a(z, sb.toString());
            a2.a(Format.a(dVar.b(), str, null, -1, format.c, format.A, format.B, null, Long.MAX_VALUE, format.k));
            this.b[i] = a2;
        }
    }

    public void a(long j, Pq pq) {
        if (pq.a() >= 9) {
            int h = pq.h();
            int h2 = pq.h();
            int t = pq.t();
            if (h == 434 && h2 == C1519mp.a && t == 3) {
                C1519mp.b(j, pq, this.b);
            }
        }
    }
}
