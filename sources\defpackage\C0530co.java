package defpackage;

import java.io.IOException;

/* renamed from: co reason: default package and case insensitive filesystem */
/* compiled from: Ac4Extractor */
public final class C0530co implements _m {
    public static final C0529cn a = Xn.a;
    private static final int b = C0471ar.b("ID3");
    private final long c;
    private final Cdo d;
    private final Pq e;
    private boolean f;

    public C0530co() {
        this(0);
    }

    static /* synthetic */ _m[] a() {
        return new _m[]{new C0530co()};
    }

    public void release() {
    }

    public C0530co(long j) {
        this.c = j;
        this.d = new Cdo();
        this.e = new Pq(16384);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
        if ((r4 - r3) < 8192) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        r9.a();
        r4 = r4 + 1;
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
                anVar.a(pq.a, 0, 7);
                pq.e(0);
                int z = pq.z();
                if (z != 44096 && z != 44097) {
                    break;
                }
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                int a2 = C1423jm.a(pq.a, z);
                if (a2 == -1) {
                    return false;
                }
                anVar.a(a2 - 7);
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
        int read = anVar.read(this.e.a, 0, 16384);
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
