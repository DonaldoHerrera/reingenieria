package com.google.firebase.perf.network;

import com.google.android.gms.internal.firebase-perf.C0899v;
import com.google.android.gms.internal.firebase-perf.zzbg;
import com.google.firebase.perf.internal.c;
import java.io.IOException;

public final class f implements Zxb {
    private final Zxb a;
    private final C0899v b;
    private final long c;
    private final zzbg d;

    public f(Zxb zxb, c cVar, zzbg zzbg, long j) {
        this.a = zxb;
        this.b = C0899v.a(cVar);
        this.c = j;
        this.d = zzbg;
    }

    public final void a(Yxb yxb, IOException iOException) {
        C7647wyb x = yxb.x();
        if (x != null) {
            C7095oyb g = x.g();
            if (g != null) {
                this.b.a(g.o().toString());
            }
            if (x.e() != null) {
                this.b.b(x.e());
            }
        }
        this.b.b(this.c);
        this.b.e(this.d.c());
        h.a(this.b);
        this.a.a(yxb, iOException);
    }

    public final void a(Yxb yxb, Ayb ayb) throws IOException {
        Ayb ayb2 = ayb;
        FirebasePerfOkHttpClient.a(ayb2, this.b, this.c, this.d.c());
        this.a.a(yxb, ayb);
    }
}
