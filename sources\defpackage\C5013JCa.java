package defpackage;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: JCa reason: default package and case insensitive filesystem */
/* compiled from: SoundStreamInsertTransaction */
class C5013JCa extends a {
    private final Iterable<C2227PP> b;
    private final C6332dsa c;
    private final C3800jea d;
    private final C3768fea e;

    C5013JCa(Iterable<C2227PP> iterable, C3800jea jea, C3768fea fea, C6332dsa dsa) {
        this.b = iterable;
        this.d = jea;
        this.e = fea;
        this.c = dsa;
    }

    private C5296SKa a(C2227PP pp, long j) {
        C5296SKa b2 = b(pp);
        b2.a("promoted_id", j);
        return b2;
    }

    private int d(C2227PP pp) {
        return pp.f().c() ^ true ? 1 : 0;
    }

    public void b(C5500ZKa zKa) {
        c(zKa);
        b();
        for (C2227PP pp : this.b) {
            if (pp.l()) {
                a(zKa.a((C5116MLa) _ea.SoundStream, a(pp, ((C5413WKa) a(zKa.a((C5116MLa) _ea.PromotedTracks, a(pp)))).c()).a()));
            } else {
                a(zKa.a((C5116MLa) _ea.SoundStream, b(pp).a()));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void c(C5500ZKa zKa) {
        String str = "promoted_id";
        List b2 = zKa.a((C6975nLa) C6975nLa.a(_ea.SoundStream.name()).a(str).b(str)).b(C6363eLa.a(Long.class));
        a(zKa.a((C5116MLa) _ea.SoundStream, C6907mLa.a().b(str)));
        a(zKa.a((C5116MLa) _ea.PromotedTracks, C6907mLa.a().b("_id", (Collection<?>) b2)));
    }

    private ContentValues a(C2227PP pp) {
        C5176OKa a = C5206PKa.a(" ");
        String str = "created_at";
        String str2 = "tracking_profile_clicked_urls";
        String str3 = "tracking_promoter_clicked_urls";
        String str4 = "tracking_track_clicked_urls";
        String str5 = "tracking_track_impression_urls";
        C5296SKa a2 = C5296SKa.b().a("ad_urn", (String) pp.a().b()).a(str, System.currentTimeMillis()).a(str2, a.a((Iterable<?>) pp.i())).a(str3, a.a((Iterable<?>) pp.j())).a(str4, a.a((Iterable<?>) pp.g())).a(str5, a.a((Iterable<?>) pp.h())).a("tracking_track_played_urls", a.a((Iterable<?>) pp.k()));
        C4928GKa d2 = pp.d();
        if (d2.c()) {
            a2.a("promoter_id", ((C3776gea) d2.b()).l().c());
            a2.a("promoter_name", ((C3776gea) d2.b()).m());
        }
        return a2.a();
    }

    private long c(C2227PP pp) {
        C4928GKa f = pp.f();
        return (f.c() ? ((Yda) f.b()).w() : ((C3927zda) pp.c().b()).a()).c();
    }

    private void b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (C2227PP pp : this.b) {
            C4928GKa f = pp.f();
            if (f.c()) {
                Yda yda = (Yda) f.b();
                arrayList2.add(yda);
                arrayList.add(yda.n().b());
            } else {
                C3927zda zda = (C3927zda) pp.c().b();
                arrayList3.add(zda);
                arrayList.add(zda.s());
            }
            C4928GKa e2 = pp.e();
            if (e2.c()) {
                arrayList.add(e2.b());
            }
            if (pp.l()) {
                C4928GKa d2 = pp.d();
                if (d2.c()) {
                    arrayList.add(d2.b());
                }
            }
        }
        this.d.b(arrayList);
        this.e.a(arrayList2);
        a(this.c.b((Iterable<C3927zda>) arrayList3));
    }

    private C5296SKa b(C2227PP pp) {
        String str = "sound_type";
        String str2 = "created_at";
        C5296SKa a = C5296SKa.b().a("sound_id", c(pp)).a(str, d(pp)).a(str2, pp.b());
        C4928GKa e2 = pp.e();
        if (e2.c()) {
            a.a("reposter_id", ((C3776gea) e2.b()).l().c());
        }
        return a;
    }
}
