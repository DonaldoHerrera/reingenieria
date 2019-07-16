package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: Lzb reason: default package */
/* compiled from: Http2ExchangeCodec */
public final class Lzb implements C6755jzb {
    private static final List<String> a = Kyb.a((T[]) new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    private static final List<String> b = Kyb.a((T[]) new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    private final a c;
    private final C5615azb d;
    private final Gzb e;
    private volatile Nzb f;
    private final C7509uyb g;
    private volatile boolean h;

    public Lzb(C7440tyb tyb, C5615azb azb, a aVar, Gzb gzb) {
        C7509uyb uyb;
        this.d = azb;
        this.c = aVar;
        this.e = gzb;
        if (tyb.G().contains(C7509uyb.H2_PRIOR_KNOWLEDGE)) {
            uyb = C7509uyb.H2_PRIOR_KNOWLEDGE;
        } else {
            uyb = C7509uyb.HTTP_2;
        }
        this.g = uyb;
    }

    public C5615azb a() {
        return this.d;
    }

    public void b() throws IOException {
        this.f.d().close();
    }

    public void c() throws IOException {
        this.e.flush();
    }

    public void cancel() {
        this.h = true;
        if (this.f != null) {
            this.f.a(C7649wzb.CANCEL);
        }
    }

    public static List<C7718xzb> b(C7647wyb wyb) {
        C7026nyb c2 = wyb.c();
        ArrayList arrayList = new ArrayList(c2.c() + 4);
        arrayList.add(new C7718xzb(C7718xzb.c, wyb.e()));
        arrayList.add(new C7718xzb(C7718xzb.d, C7235qzb.a(wyb.g())));
        String a2 = wyb.a("Host");
        if (a2 != null) {
            arrayList.add(new C7718xzb(C7718xzb.f, a2));
        }
        arrayList.add(new C7718xzb(C7718xzb.e, wyb.g().m()));
        int c3 = c2.c();
        for (int i = 0; i < c3; i++) {
            String lowerCase = c2.a(i).toLowerCase(Locale.US);
            if (!a.contains(lowerCase) || (lowerCase.equals("te") && c2.b(i).equals("trailers"))) {
                arrayList.add(new C7718xzb(lowerCase, c2.b(i)));
            }
        }
        return arrayList;
    }

    public GAb a(C7647wyb wyb, long j) {
        return this.f.d();
    }

    public void a(C7647wyb wyb) throws IOException {
        if (this.f == null) {
            this.f = this.e.a(b(wyb), wyb.a() != null);
            if (!this.h) {
                this.f.h().a((long) this.c.b(), TimeUnit.MILLISECONDS);
                this.f.k().a((long) this.c.c(), TimeUnit.MILLISECONDS);
                return;
            }
            this.f.a(C7649wzb.CANCEL);
            throw new IOException("Canceled");
        }
    }

    public a a(boolean z) throws IOException {
        a a2 = a(this.f.i(), this.g);
        if (!z || Iyb.a.a(a2) != 100) {
            return a2;
        }
        return null;
    }

    public long b(Ayb ayb) {
        return C6959mzb.a(ayb);
    }

    public static a a(C7026nyb nyb, C7509uyb uyb) throws IOException {
        a aVar = new a();
        int c2 = nyb.c();
        C7373szb szb = null;
        for (int i = 0; i < c2; i++) {
            String a2 = nyb.a(i);
            String b2 = nyb.b(i);
            if (a2.equals(":status")) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP/1.1 ");
                sb.append(b2);
                szb = C7373szb.a(sb.toString());
            } else if (!b.contains(a2)) {
                Iyb.a.a(aVar, a2, b2);
            }
        }
        if (szb != null) {
            a aVar2 = new a();
            aVar2.a(uyb);
            aVar2.a(szb.b);
            aVar2.a(szb.c);
            aVar2.a(aVar.a());
            return aVar2;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public HAb a(Ayb ayb) {
        return this.f.e();
    }
}
