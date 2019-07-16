package defpackage;

import java.io.IOException;

/* renamed from: ao reason: default package and case insensitive filesystem */
/* compiled from: Ac3Extractor */
public final class C0468ao implements _m {
    public static final C0529cn a = Wn.a;
    private static final int b = C0471ar.b("ID3");
    private final long c;
    private final C0499bo d;
    private final Pq e;
    private boolean f;

    public C0468ao() {
        this(0);
    }

    static /* synthetic */ _m[] a() {
        return new _m[]{new C0468ao()};
    }

    public void release() {
    }

    public C0468ao(long j) {
        this.c = j;
        this.d = new C0499bo();
        this.e = new Pq(2786);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        r8.a();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003b, code lost:
        if ((r4 - r3) < 8192) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        return false;
     */
    public boolean a(C0313an anVar) throws IOException, InterruptedException {
        Pq pq = new Pq(10);
        int i = 0;
        while (true) {
            anVar.a(pq.a, 0, 10);
            pq.e(0);
            if (pq.w() != b) {
                break;
            }
            pq.f(3);
            int s = pq.s();
            i += s + 10;
            anVar.a(s);
        }
        anVar.a();
        anVar.a(i);
        int i2 = i;
        while (true) {
            int i3 = 0;
            while (true) {
                anVar.a(pq.a, 0, 6);
                pq.e(0);
                if (pq.z() != 2935) {
                    break;
                }
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                int a2 = C1362hm.a(pq.a);
                if (a2 == -1) {
                    return false;
                }
                anVar.a(a2 - 6);
            }
            anVar.a(i2);
        }
    }

    public void a(C0498bn bnVar) {
        this.d.a(bnVar, new d(0, 1));
        bnVar.g();
        bnVar.a(new b(-9223372036854775807L));
    }

    public void a(long j, long j2) {
        this.f = false;
        this.d.a();
    }

    public int a(C0313an anVar, C1332gn gnVar) throws IOException, InterruptedException {
        int read = anVar.read(this.e.a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.e.e(0);
        this.e.d(read);
        if (!this.f) {
            this.d.a(this.c, 4);
            this.f = true;
        }
        this.d.a(this.e);
        return 0;
    }
}
