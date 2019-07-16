package defpackage;

import com.google.android.exoplayer2.H;
import java.io.IOException;

/* renamed from: Ko reason: default package */
/* compiled from: WavHeaderReader */
final class Ko {

    /* renamed from: Ko$a */
    /* compiled from: WavHeaderReader */
    private static final class a {
        public final int a;
        public final long b;

        private a(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public static a a(C0313an anVar, Pq pq) throws IOException, InterruptedException {
            anVar.a(pq.a, 0, 8);
            pq.e(0);
            return new a(pq.h(), pq.m());
        }
    }

    public static Jo a(C0313an anVar) throws IOException, InterruptedException {
        C1852xq.a(anVar);
        Pq pq = new Pq(16);
        if (a.a(anVar, pq).a != Km.a) {
            return null;
        }
        anVar.a(pq.a, 0, 4);
        pq.e(0);
        int h = pq.h();
        String str = "WavHeaderReader";
        if (h != Km.b) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported RIFF format: ");
            sb.append(h);
            Iq.b(str, sb.toString());
            return null;
        }
        a a2 = a.a(anVar, pq);
        while (a2.a != Km.c) {
            anVar.a((int) a2.b);
            a2 = a.a(anVar, pq);
        }
        C1852xq.b(a2.b >= 16);
        anVar.a(pq.a, 0, 16);
        pq.e(0);
        int o = pq.o();
        int o2 = pq.o();
        int n = pq.n();
        int n2 = pq.n();
        int o3 = pq.o();
        int o4 = pq.o();
        int i = (o2 * o4) / 8;
        if (o3 == i) {
            int a3 = Km.a(o, o4);
            if (a3 == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unsupported WAV format: ");
                sb2.append(o4);
                sb2.append(" bit/sample, type ");
                sb2.append(o);
                Iq.b(str, sb2.toString());
                return null;
            }
            anVar.a(((int) a2.b) - 16);
            Jo jo = new Jo(o2, n, n2, o3, o4, a3);
            return jo;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Expected block alignment: ");
        sb3.append(i);
        sb3.append("; got: ");
        sb3.append(o3);
        throw new H(sb3.toString());
    }

    public static void a(C0313an anVar, Jo jo) throws IOException, InterruptedException {
        C1852xq.a(anVar);
        C1852xq.a(jo);
        anVar.a();
        Pq pq = new Pq(8);
        a a2 = a.a(anVar, pq);
        while (a2.a != C0471ar.b("data")) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring unknown WAV chunk: ");
            sb.append(a2.a);
            Iq.d("WavHeaderReader", sb.toString());
            long j = a2.b + 8;
            if (a2.a == C0471ar.b("RIFF")) {
                j = 12;
            }
            if (j <= 2147483647L) {
                anVar.c((int) j);
                a2 = a.a(anVar, pq);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Chunk is too large (~2GB+) to skip; id: ");
                sb2.append(a2.a);
                throw new H(sb2.toString());
            }
        }
        anVar.c(8);
        jo.a(anVar.getPosition(), a2.b);
    }
}
