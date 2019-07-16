package com.squareup.picasso;

import android.net.NetworkInfo;
import com.adjust.sdk.Constants;
import com.squareup.picasso.E.d;
import java.io.IOException;

/* compiled from: NetworkRequestHandler */
class B extends M {
    private final r a;
    private final P b;

    /* compiled from: NetworkRequestHandler */
    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    /* compiled from: NetworkRequestHandler */
    static final class b extends IOException {
        final int a;
        final int b;

        b(int i, int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append("HTTP ");
            sb.append(i);
            super(sb.toString());
            this.a = i;
            this.b = i2;
        }
    }

    B(r rVar, P p) {
        this.a = rVar;
        this.b = p;
    }

    private static C7647wyb b(K k, int i) {
        Xxb xxb;
        if (i == 0) {
            xxb = null;
        } else if (A.a(i)) {
            xxb = Xxb.b;
        } else {
            defpackage.Xxb.a aVar = new defpackage.Xxb.a();
            if (!A.b(i)) {
                aVar.b();
            }
            if (!A.c(i)) {
                aVar.c();
            }
            xxb = aVar.a();
        }
        defpackage.C7647wyb.a aVar2 = new defpackage.C7647wyb.a();
        aVar2.b(k.e.toString());
        if (xxb != null) {
            aVar2.a(xxb);
        }
        return aVar2.a();
    }

    /* access modifiers changed from: 0000 */
    public int a() {
        return 2;
    }

    public boolean a(K k) {
        String scheme = k.e.getScheme();
        return "http".equals(scheme) || Constants.SCHEME.equals(scheme);
    }

    /* access modifiers changed from: 0000 */
    public boolean b() {
        return true;
    }

    public com.squareup.picasso.M.a a(K k, int i) throws IOException {
        Ayb a2 = this.a.a(b(k, i));
        Cyb a3 = a2.a();
        if (a2.h()) {
            d dVar = a2.c() == null ? d.NETWORK : d.DISK;
            if (dVar == d.DISK && a3.contentLength() == 0) {
                a3.close();
                throw new a("Received response with 0 content-length header.");
            }
            if (dVar == d.NETWORK && a3.contentLength() > 0) {
                this.b.a(a3.contentLength());
            }
            return new com.squareup.picasso.M.a((HAb) a3.source(), dVar);
        }
        a3.close();
        throw new b(a2.d(), k.d);
    }

    /* access modifiers changed from: 0000 */
    public boolean a(boolean z, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }
}
