package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: Myb reason: default package */
/* compiled from: CacheInterceptor */
class Myb implements HAb {
    boolean a;
    final /* synthetic */ C6961nAb b;
    final /* synthetic */ Oyb c;
    final /* synthetic */ C6893mAb d;
    final /* synthetic */ Nyb e;

    Myb(Nyb nyb, C6961nAb nab, Oyb oyb, C6893mAb mab) {
        this.e = nyb;
        this.b = nab;
        this.c = oyb;
        this.d = mab;
    }

    public long b(C6825lAb lab, long j) throws IOException {
        try {
            long b2 = this.b.b(lab, j);
            if (b2 == -1) {
                if (!this.a) {
                    this.a = true;
                    this.d.close();
                }
                return -1;
            }
            lab.a(this.d.j(), lab.size() - b2, b2);
            this.d.l();
            return b2;
        } catch (IOException e2) {
            if (!this.a) {
                this.a = true;
                this.c.abort();
            }
            throw e2;
        }
    }

    public void close() throws IOException {
        if (!this.a && !Kyb.a((HAb) this, 100, TimeUnit.MILLISECONDS)) {
            this.a = true;
            this.c.abort();
        }
        this.b.close();
    }

    public JAb k() {
        return this.b.k();
    }
}
