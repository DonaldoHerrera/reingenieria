package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.android.gms.internal.firebase-perf.C0899v;
import com.google.android.gms.internal.firebase-perf.zzbg;
import com.google.firebase.perf.internal.c;
import java.io.IOException;

public class FirebasePerfOkHttpClient {
    private FirebasePerfOkHttpClient() {
    }

    static void a(Ayb ayb, C0899v vVar, long j, long j2) throws IOException {
        C7647wyb K = ayb.K();
        if (K != null) {
            vVar.a(K.g().o().toString());
            vVar.b(K.e());
            if (K.a() != null) {
                long a = K.a().a();
                if (a != -1) {
                    vVar.a(a);
                }
            }
            Cyb a2 = ayb.a();
            if (a2 != null) {
                long contentLength = a2.contentLength();
                if (contentLength != -1) {
                    vVar.f(contentLength);
                }
                C7233qyb contentType = a2.contentType();
                if (contentType != null) {
                    vVar.c(contentType.toString());
                }
            }
            vVar.a(ayb.d());
            vVar.b(j);
            vVar.e(j2);
            vVar.d();
        }
    }

    @Keep
    public static void enqueue(Yxb yxb, Zxb zxb) {
        zzbg zzbg = new zzbg();
        Zxb zxb2 = zxb;
        f fVar = new f(zxb2, c.a(), zzbg, zzbg.b());
        yxb.a(fVar);
    }

    @Keep
    public static Ayb execute(Yxb yxb) throws IOException {
        C0899v a = C0899v.a(c.a());
        zzbg zzbg = new zzbg();
        long b = zzbg.b();
        try {
            Ayb execute = yxb.execute();
            a(execute, a, b, zzbg.c());
            return execute;
        } catch (IOException e) {
            C7647wyb x = yxb.x();
            if (x != null) {
                C7095oyb g = x.g();
                if (g != null) {
                    a.a(g.o().toString());
                }
                if (x.e() != null) {
                    a.b(x.e());
                }
            }
            a.b(b);
            a.e(zzbg.c());
            h.a(a);
            throw e;
        }
    }
}
