package com.soundcloud.android.playback.ui;

import android.content.Context;
import android.net.Uri;
import com.soundcloud.android.ads.C2586ja;
import com.soundcloud.android.ads.Na;
import com.soundcloud.android.ads.od;
import com.soundcloud.android.deeplinks.e;
import com.soundcloud.android.foundation.ads.C3675b.C0090b;
import com.soundcloud.android.foundation.ads.C3676c;
import com.soundcloud.android.foundation.ads.C3678e;
import com.soundcloud.android.foundation.ads.C3689p;
import com.soundcloud.android.foundation.ads.C3693u;
import com.soundcloud.android.foundation.ads.O;
import com.soundcloud.android.foundation.ads.U;
import com.soundcloud.android.foundation.ads.Y;
import com.soundcloud.android.foundation.ads.aa;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.playback.C4412qb;
import com.soundcloud.android.playback.Ic;
import java.util.List;

/* compiled from: AdPageListener */
public class Aa extends C4469lb {
    private final C3814lca e;
    private final Na f;
    private final od g;
    private final C4655rja h;
    private final C2586ja i;
    private final C3678e j;
    private final Yaa k;

    public Aa(C4412qb qbVar, C3814lca lca, C5327TLa tLa, Na na, od odVar, Yaa yaa, C4655rja rja, Ic ic, C2586ja jaVar, C3678e eVar, C3700b bVar) {
        super(qbVar, tLa, ic, bVar);
        this.h = rja;
        this.e = lca;
        this.k = yaa;
        this.f = na;
        this.g = odVar;
        this.i = jaVar;
        this.j = eVar;
    }

    private String b(U u) {
        if (u instanceof C3693u) {
            return C3689p.a(((C3693u) u).A());
        }
        return ((aa) u).c();
    }

    private void l() {
        C4928GKa b = C4928GKa.b(this.f.c());
        if (b.c() && (b.b() instanceof O)) {
            ((O) b.b()).s();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        C3676c a = this.f.a();
        if (a instanceof C3693u) {
            this.h.a(C4621nja.a(str));
            this.d.a((J) C3416DZ.a((C3693u) a, this.k, this.e.l(), str));
            l();
            return;
        }
        throw new IllegalStateException("Visual HTML companions are only supported by Audio ads.");
    }

    public void f() {
        C4928GKa b = C4928GKa.b(this.f.a());
        if (b.c()) {
            a((U) b.b());
        }
        l();
    }

    public void g() {
        this.b.c(C3876taa.f, Haa.e());
    }

    public void h() {
        b("onNext() is called due to clicking the next button or swiping to the next track.");
        this.a.h();
    }

    public void i() {
        b("onPrevious() is called due to clicking the previous button or swiping back to the previous track.");
        this.a.k();
    }

    public void j() {
        this.b.c(C3876taa.f, Haa.f());
    }

    public void k() {
        b("onSkipAd() is called due to clicking the skip button.");
        this.a.h();
    }

    private void b(e eVar, Uri uri) {
        if (this.e.h().e()) {
            this.e.A();
        }
        this.b.a(C3876taa.d).a(Iaa.a).f().a((C7600wPa<? super T>) C5190Oua.a(new C4443d(this, eVar, uri)));
        e();
    }

    /* access modifiers changed from: 0000 */
    public void a(List<Y> list) {
        this.i.a(C0090b.GENERAL_COMPANION_FAIL, list);
    }

    private void a(U u) {
        K k2;
        if (u instanceof aa) {
            this.j.a();
        }
        String b = b(u);
        if (b != null) {
            Uri parse = Uri.parse(b);
            e b2 = e.b(parse);
            int i2 = C4509za.a[b2.ordinal()];
            if (i2 == 1 || i2 == 2) {
                b(b2, parse);
            } else {
                this.h.a(C4621nja.a(parse.toString()));
            }
        }
        if (u instanceof C3693u) {
            k2 = C3416DZ.a((C3693u) u, this.k, this.e.l());
        } else {
            k2 = C3416DZ.a((aa) u, this.k, this.e.l());
        }
        this.d.a((J) k2);
    }

    private void b(String str) {
        SDb.a("AD_PAGE_LISTENER").d(str, new Object[0]);
    }

    public /* synthetic */ void a(e eVar, Uri uri, Iaa iaa) throws Exception {
        a(a(eVar, uri));
    }

    private C3508cda a(e eVar, Uri uri) {
        long a = a(uri);
        if (a == -1) {
            return C3508cda.a;
        }
        int i2 = C4509za.a[eVar.ordinal()];
        if (i2 == 1) {
            return C3508cda.f(a);
        }
        if (i2 != 2) {
            return C3508cda.a;
        }
        return C3508cda.c(a);
    }

    private long a(Uri uri) {
        try {
            return Long.valueOf(uri.getLastPathSegment()).longValue();
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public void a(Context context) {
        this.g.a(context);
    }

    private void a(C3508cda cda) {
        if (cda.u()) {
            this.h.a(C4621nja.a(cda, Yca.a(this.e.r())));
        } else if (cda.J()) {
            this.h.a(C4621nja.c(cda));
        }
    }
}
