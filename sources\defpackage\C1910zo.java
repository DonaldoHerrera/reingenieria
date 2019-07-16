package defpackage;

import com.google.android.exoplayer2.Format;
import java.util.List;

/* renamed from: zo reason: default package and case insensitive filesystem */
/* compiled from: SeiReader */
final class C1910zo {
    private final List<Format> a;
    private final C1424jn[] b;

    public C1910zo(List<Format> list) {
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
            String str2 = format.a;
            if (str2 == null) {
                str2 = dVar.b();
            }
            a2.a(Format.a(str2, str, null, -1, format.c, format.A, format.B, null, Long.MAX_VALUE, format.k));
            this.b[i] = a2;
        }
    }

    public void a(long j, Pq pq) {
        C1519mp.a(j, pq, this.b);
    }
}
