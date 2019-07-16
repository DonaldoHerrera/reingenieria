package com.soundcloud.android.stream;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.foundation.events.p;
import com.soundcloud.android.ia;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;
import com.soundcloud.android.image.va;
import com.soundcloud.android.tracks.C6158da;
import com.soundcloud.android.tracks.C6185ma;
import com.soundcloud.android.view.L;
import java.util.Date;

/* compiled from: StreamCardViewPresenter */
class A {
    private final C3700b a;
    private final F b;
    private final Resources c;
    private final N d;
    /* access modifiers changed from: private */
    public final C4655rja e;

    /* compiled from: StreamCardViewPresenter */
    private class a implements OnClickListener {
        private final C3508cda a;
        private final C3508cda b;
        private final C3710l c;

        a(C3508cda cda, C3508cda cda2, C3710l lVar) {
            this.a = cda;
            this.b = cda2;
            this.c = lVar;
        }

        public void onClick(View view) {
            A.this.e.a(C4621nja.a(this.a, C4928GKa.c(K.d(this.b, this.c)), C4928GKa.a(), C4928GKa.a()));
        }
    }

    A(C3700b bVar, F f, Resources resources, N n, C4655rja rja) {
        this.a = bVar;
        this.b = f;
        this.c = resources;
        this.d = n;
        this.e = rja;
    }

    private void b(C6111wa waVar, C3855qda qda) {
        this.d.a(qda.a(), qda.b(), C3721b.b(this.c), waVar.b(), false);
    }

    private void c(C6111wa waVar, C3855qda qda) {
        if (qda.l()) {
            waVar.c(qda.x(), c(qda));
        } else {
            waVar.a(qda.d(), a(qda));
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(C6111wa waVar, C3855qda qda, C3710l lVar, Date date, C4928GKa<String> gKa) {
        a(waVar, qda, qda.a(), lVar, date, gKa);
        a(waVar, qda, lVar);
    }

    private void a(C6111wa waVar, C3855qda qda, C3508cda cda, C3710l lVar, Date date, C4928GKa<String> gKa) {
        waVar.f();
        lVar.a(p.ATTRIBUTOR);
        if (qda.n()) {
            a(waVar, qda, qda.h(), cda, lVar, gKa);
            return;
        }
        a(waVar, qda.i(), gKa, cda, lVar);
        c(waVar, qda);
        a(waVar, date);
        waVar.a(qda.m());
    }

    private String c(C3855qda qda) {
        char c2;
        String h = qda.h();
        switch (h.hashCode()) {
            case -2076770877:
                if (h.equals("compilation")) {
                    c2 = 5;
                    break;
                }
            case -902265784:
                if (h.equals("single")) {
                    c2 = 4;
                    break;
                }
            case 3243:
                if (h.equals("ep")) {
                    c2 = 3;
                    break;
                }
            case 92896879:
                if (h.equals("album")) {
                    c2 = 2;
                    break;
                }
            case 110621003:
                if (h.equals("track")) {
                    c2 = 0;
                    break;
                }
            case 1879474642:
                if (h.equals("playlist")) {
                    c2 = 1;
                    break;
                }
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            return this.c.getString(ia.p.stream_reposted_a_track);
        }
        if (c2 == 1) {
            return this.c.getString(ia.p.stream_reposted_a_playlist);
        }
        if (c2 == 2) {
            return this.c.getString(ia.p.stream_reposted_a_album);
        }
        if (c2 == 3) {
            return this.c.getString(ia.p.stream_reposted_a_ep);
        }
        if (c2 == 4) {
            return this.c.getString(ia.p.stream_reposted_a_single);
        }
        if (c2 != 5) {
            return this.c.getString(ia.p.stream_reposted_a_track);
        }
        return this.c.getString(ia.p.stream_reposted_a_compilation);
    }

    private String b(C3855qda qda) {
        char c2;
        String h = qda.h();
        switch (h.hashCode()) {
            case -2076770877:
                if (h.equals("compilation")) {
                    c2 = 5;
                    break;
                }
            case -902265784:
                if (h.equals("single")) {
                    c2 = 4;
                    break;
                }
            case 3243:
                if (h.equals("ep")) {
                    c2 = 3;
                    break;
                }
            case 92896879:
                if (h.equals("album")) {
                    c2 = 2;
                    break;
                }
            case 110621003:
                if (h.equals("track")) {
                    c2 = 0;
                    break;
                }
            case 1879474642:
                if (h.equals("playlist")) {
                    c2 = 1;
                    break;
                }
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            return this.c.getString(ia.p.stream_promoted_a_track);
        }
        if (c2 == 1) {
            return this.c.getString(ia.p.stream_promoted_a_playlist);
        }
        if (c2 == 2) {
            return this.c.getString(ia.p.stream_promoted_a_album);
        }
        if (c2 == 3) {
            return this.c.getString(ia.p.stream_promoted_a_ep);
        }
        if (c2 == 4) {
            return this.c.getString(ia.p.stream_promoted_a_single);
        }
        if (c2 != 5) {
            return this.c.getString(ia.p.stream_promoted_a_track);
        }
        return this.c.getString(ia.p.stream_promoted_a_compilation);
    }

    private void a(C6111wa waVar, C3855qda qda, C3710l lVar) {
        lVar.a(p.OWNER);
        b(waVar, qda);
        waVar.f(qda.B());
        waVar.c(qda.d());
        waVar.a((OnClickListener) new a(qda.e(), qda.a(), lVar));
        a(waVar, qda);
    }

    private void a(C6111wa waVar, C3855qda qda) {
        waVar.g();
        if (qda instanceof C6185ma) {
            C6185ma maVar = (C6185ma) qda;
            if (C6158da.a(maVar) || C6158da.b(maVar)) {
                waVar.h();
            }
        }
    }

    private String a(C3855qda qda) {
        char c2;
        String h = qda.h();
        switch (h.hashCode()) {
            case -2076770877:
                if (h.equals("compilation")) {
                    c2 = 5;
                    break;
                }
            case -902265784:
                if (h.equals("single")) {
                    c2 = 4;
                    break;
                }
            case 3243:
                if (h.equals("ep")) {
                    c2 = 3;
                    break;
                }
            case 92896879:
                if (h.equals("album")) {
                    c2 = 2;
                    break;
                }
            case 110621003:
                if (h.equals("track")) {
                    c2 = 0;
                    break;
                }
            case 1879474642:
                if (h.equals("playlist")) {
                    c2 = 1;
                    break;
                }
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            return this.c.getString(ia.p.stream_posted_a_track);
        }
        if (c2 == 1) {
            return this.c.getString(ia.p.stream_posted_a_playlist);
        }
        if (c2 == 2) {
            return this.c.getString(ia.p.stream_posted_a_album);
        }
        if (c2 == 3) {
            return this.c.getString(ia.p.stream_posted_a_ep);
        }
        if (c2 == 4) {
            return this.c.getString(ia.p.stream_posted_a_single);
        }
        if (c2 != 5) {
            return this.c.getString(ia.p.stream_posted_a_track);
        }
        return this.c.getString(ia.p.stream_posted_a_compilation);
    }

    private String a(String str) {
        char c2;
        switch (str.hashCode()) {
            case -2076770877:
                if (str.equals("compilation")) {
                    c2 = 5;
                    break;
                }
            case -902265784:
                if (str.equals("single")) {
                    c2 = 4;
                    break;
                }
            case 3243:
                if (str.equals("ep")) {
                    c2 = 3;
                    break;
                }
            case 92896879:
                if (str.equals("album")) {
                    c2 = 2;
                    break;
                }
            case 110621003:
                if (str.equals("track")) {
                    c2 = 0;
                    break;
                }
            case 1879474642:
                if (str.equals("playlist")) {
                    c2 = 1;
                    break;
                }
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            return this.c.getString(ia.p.promoted_track);
        }
        if (c2 == 1) {
            return this.c.getString(ia.p.stream_promoted_playlist);
        }
        if (c2 == 2) {
            return this.c.getString(ia.p.stream_promoted_album);
        }
        if (c2 == 3) {
            return this.c.getString(ia.p.stream_promoted_ep);
        }
        if (c2 == 4) {
            return this.c.getString(ia.p.stream_promoted_single);
        }
        if (c2 != 5) {
            return this.c.getString(ia.p.stream_promoted_playlist);
        }
        return this.c.getString(ia.p.stream_promoted_compilation);
    }

    private void a(C6111wa waVar, C3855qda qda, String str, C3508cda cda, C3710l lVar, C4928GKa<String> gKa) {
        if (!qda.n() || !qda.k()) {
            waVar.d();
            waVar.e(a(str));
            return;
        }
        C3879tda t = qda.t();
        a(waVar, t.b().c(), gKa, cda, lVar);
        waVar.b(t.b().b(), b(qda));
        waVar.c((OnClickListener) new L(qda, this.a, this.b, this.e));
    }

    private void a(C6111wa waVar, Date date) {
        waVar.d(C7315sGa.a(this.c, date.getTime(), true));
    }

    private void a(C6111wa waVar, C3508cda cda, C4928GKa<String> gKa, C3508cda cda2, C3710l lVar) {
        va a2 = va.a(cda, gKa);
        waVar.b((OnClickListener) new a(cda, cda2, lVar));
        this.d.a(a2.a(), a2.b(), C3721b.c(this.c), waVar.c(), true);
    }
}
