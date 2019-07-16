package defpackage;

import com.facebook.stetho.server.http.HttpHeaders;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: Nyb reason: default package */
/* compiled from: CacheInterceptor */
public final class Nyb implements C7164pyb {
    final Vyb a;

    public Nyb(Vyb vyb) {
        this.a = vyb;
    }

    private static Ayb a(Ayb ayb) {
        if (ayb == null || ayb.a() == null) {
            return ayb;
        }
        a G = ayb.G();
        G.a((Cyb) null);
        return G.a();
    }

    static boolean b(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    public Ayb intercept(a aVar) throws IOException {
        Vyb vyb = this.a;
        Ayb b = vyb != null ? vyb.b(aVar.x()) : null;
        Pyb a2 = new a(System.currentTimeMillis(), aVar.x(), b).a();
        C7647wyb wyb = a2.a;
        Ayb ayb = a2.b;
        Vyb vyb2 = this.a;
        if (vyb2 != null) {
            vyb2.a(a2);
        }
        if (b != null && ayb == null) {
            Kyb.a((Closeable) b.a());
        }
        if (wyb == null && ayb == null) {
            a aVar2 = new a();
            aVar2.a(aVar.x());
            aVar2.a(C7509uyb.HTTP_1_1);
            aVar2.a(504);
            aVar2.a("Unsatisfiable Request (only-if-cached)");
            aVar2.a(Kyb.d);
            aVar2.b(-1);
            aVar2.a(System.currentTimeMillis());
            return aVar2.a();
        } else if (wyb == null) {
            a G = ayb.G();
            G.a(a(ayb));
            return G.a();
        } else {
            try {
                Ayb a3 = aVar.a(wyb);
                if (a3 == null && b != null) {
                }
                if (ayb != null) {
                    if (a3.d() == 304) {
                        a G2 = ayb.G();
                        G2.a(a(ayb.f(), a3.f()));
                        G2.b(a3.L());
                        G2.a(a3.J());
                        G2.a(a(ayb));
                        G2.b(a(a3));
                        Ayb a4 = G2.a();
                        a3.a().close();
                        this.a.a();
                        this.a.a(ayb, a4);
                        return a4;
                    }
                    Kyb.a((Closeable) ayb.a());
                }
                a G3 = a3.G();
                G3.a(a(ayb));
                G3.b(a(a3));
                Ayb a5 = G3.a();
                if (this.a != null) {
                    if (C6959mzb.b(a5) && Pyb.a(a5, wyb)) {
                        return a(this.a.a(a5), a5);
                    }
                    if (C7028nzb.a(wyb.e())) {
                        try {
                            this.a.a(wyb);
                        } catch (IOException unused) {
                        }
                    }
                }
                return a5;
            } finally {
                if (b != null) {
                    Kyb.a((Closeable) b.a());
                }
            }
        }
    }

    private Ayb a(Oyb oyb, Ayb ayb) throws IOException {
        if (oyb == null) {
            return ayb;
        }
        GAb body = oyb.body();
        if (body == null) {
            return ayb;
        }
        Myb myb = new Myb(this, ayb.a().source(), oyb, C7720yAb.a(body));
        String a2 = ayb.a(HttpHeaders.CONTENT_TYPE);
        long contentLength = ayb.a().contentLength();
        a G = ayb.G();
        G.a((Cyb) new C7166pzb(a2, contentLength, C7720yAb.a((HAb) myb)));
        return G.a();
    }

    private static C7026nyb a(C7026nyb nyb, C7026nyb nyb2) {
        a aVar = new a();
        int c = nyb.c();
        for (int i = 0; i < c; i++) {
            String a2 = nyb.a(i);
            String b = nyb.b(i);
            if ((!"Warning".equalsIgnoreCase(a2) || !b.startsWith("1")) && (a(a2) || !b(a2) || nyb2.b(a2) == null)) {
                Iyb.a.a(aVar, a2, b);
            }
        }
        int c2 = nyb2.c();
        for (int i2 = 0; i2 < c2; i2++) {
            String a3 = nyb2.a(i2);
            if (!a(a3) && b(a3)) {
                Iyb.a.a(aVar, a3, nyb2.b(i2));
            }
        }
        return aVar.a();
    }

    static boolean a(String str) {
        return HttpHeaders.CONTENT_LENGTH.equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(str);
    }
}
