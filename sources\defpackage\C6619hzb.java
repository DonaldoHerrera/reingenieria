package defpackage;

import com.facebook.stetho.server.http.HttpHeaders;
import java.io.IOException;
import java.util.List;

/* renamed from: hzb reason: default package and case insensitive filesystem */
/* compiled from: BridgeInterceptor */
public final class C6619hzb implements C7164pyb {
    private final C6549gyb a;

    public C6619hzb(C6549gyb gyb) {
        this.a = gyb;
    }

    private String a(List<C6413eyb> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            C6413eyb eyb = (C6413eyb) list.get(i);
            sb.append(eyb.a());
            sb.append('=');
            sb.append(eyb.b());
        }
        return sb.toString();
    }

    public Ayb intercept(a aVar) throws IOException {
        C7647wyb x = aVar.x();
        a f = x.f();
        C7854zyb a2 = x.a();
        String str = HttpHeaders.CONTENT_TYPE;
        String str2 = HttpHeaders.CONTENT_LENGTH;
        if (a2 != null) {
            C7233qyb b = a2.b();
            if (b != null) {
                f.b(str, b.toString());
            }
            long a3 = a2.a();
            String str3 = "Transfer-Encoding";
            if (a3 != -1) {
                f.b(str2, Long.toString(a3));
                f.a(str3);
            } else {
                f.b(str3, "chunked");
                f.a(str2);
            }
        }
        String str4 = "Host";
        boolean z = false;
        if (x.a(str4) == null) {
            f.b(str4, Kyb.a(x.g(), false));
        }
        String str5 = "Connection";
        if (x.a(str5) == null) {
            f.b(str5, "Keep-Alive");
        }
        String str6 = "Accept-Encoding";
        String str7 = "gzip";
        if (x.a(str6) == null && x.a("Range") == null) {
            z = true;
            f.b(str6, str7);
        }
        List a4 = this.a.a(x.g());
        if (!a4.isEmpty()) {
            f.b("Cookie", a(a4));
        }
        String str8 = "User-Agent";
        if (x.a(str8) == null) {
            f.b(str8, Lyb.a());
        }
        Ayb a5 = aVar.a(f.a());
        C6959mzb.a(this.a, x.g(), a5.f());
        a G = a5.G();
        G.a(x);
        if (z) {
            String str9 = "Content-Encoding";
            if (str7.equalsIgnoreCase(a5.a(str9)) && C6959mzb.b(a5)) {
                C7306sAb sab = new C7306sAb(a5.a().source());
                a b2 = a5.f().b();
                b2.c(str9);
                b2.c(str2);
                G.a(b2.a());
                G.a((Cyb) new C7166pzb(a5.a(str), -1, C7720yAb.a((HAb) sab)));
            }
        }
        return G.a();
    }
}
