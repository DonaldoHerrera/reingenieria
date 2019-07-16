package com.soundcloud.android.ads;

import android.annotation.SuppressLint;
import android.view.Surface;
import com.soundcloud.android.foundation.ads.C3676c;
import com.soundcloud.android.foundation.ads.C3678e;
import com.soundcloud.android.foundation.ads.U;
import com.soundcloud.android.foundation.ads.aa;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.playback.Ba;
import com.soundcloud.android.playback.C4412qb;
import com.soundcloud.android.playback.C4431ub;
import com.soundcloud.android.playback.C4519wc;
import com.soundcloud.android.playback.Ca;
import com.soundcloud.android.playback.Ub;
import com.soundcloud.android.playback.VideoAdPlaybackItem;
import com.soundcloud.android.playback.core.PlaybackItem;
import com.soundcloud.android.playback.core.k;
import com.soundcloud.android.playback.core.k.b;
import com.soundcloud.android.playback.core.k.c;
import com.soundcloud.android.playback.ke;
import com.soundcloud.android.playback.ke.a;

/* renamed from: com.soundcloud.android.ads.ya reason: case insensitive filesystem */
/* compiled from: AdPlayer */
class C2645ya implements c, b, a {
    private final C5327TLa a;
    private final C3700b b;
    private final C3678e c;
    private final C2649za d;
    private final Ga e;
    private final C4412qb f;
    private final k g;
    private final C5694cGa h;
    private final Ub i;
    private final Yaa j;
    private C4928GKa<aa> k = C4928GKa.a();
    private boolean l;
    private boolean m;
    private boolean n;
    private Ba o = Ba.a;
    private C4928GKa<Ila> p = C4928GKa.a();
    private VPa q = C4881Eua.b();

    C2645ya(C4685uma uma, C5327TLa tLa, C3678e eVar, C2649za zaVar, Ga ga, Yaa yaa, C4412qb qbVar, C5694cGa cga, Ub ub, ke keVar, C3700b bVar) {
        this.a = tLa;
        this.j = yaa;
        this.c = eVar;
        this.d = zaVar;
        this.e = ga;
        this.f = qbVar;
        this.h = cga;
        this.g = uma;
        this.i = ub;
        this.b = bVar;
        this.g.a((c) this);
        this.g.a((b) this);
        keVar.a((a) this);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void a(aa aaVar, boolean z, boolean z2, VideoAdPlaybackItem videoAdPlaybackItem) {
        if (e(aaVar) && a(Tma.a(videoAdPlaybackItem))) {
            f();
            c(z2);
            this.g.a((PlaybackItem) videoAdPlaybackItem);
        } else if (!e(aaVar)) {
            this.n = z;
            this.k = C4928GKa.c(aaVar);
            c(z2);
            this.g.stop();
            this.g.a((PlaybackItem) videoAdPlaybackItem);
            this.q = (VPa) this.a.a(C3876taa.b).c(C5220Pua.a((C6776kQa<T>) new C2555d<T>(this)));
        }
    }

    private void d(boolean z) {
        this.n = z;
        this.g.a(z ? 0.0f : 1.0f);
        b(z);
        if (z && this.l) {
            g();
        } else if (!z) {
            f();
        }
        a(this.o);
    }

    private void f() {
        if (!this.n && this.f.isPlaying()) {
            this.f.pause();
            this.l = true;
        }
    }

    private void g() {
        this.f.play();
        this.l = false;
    }

    public void a(Ela ela) {
    }

    public void a(Fla fla) {
    }

    public void a(aa aaVar) {
        if (!f(aaVar)) {
            a(aaVar, false);
        }
    }

    public void c(aa aaVar) {
        if (b()) {
            c();
            return;
        }
        if (b(aaVar.f())) {
            this.k = C4928GKa.a();
        }
        a(aaVar, true);
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        d(!this.n);
    }

    private boolean e(aa aaVar) {
        return this.k.c() && ((aa) this.k.b()).equals(aaVar);
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<aa> a() {
        return this.k;
    }

    private boolean f(aa aaVar) {
        return this.k.c() && ((aa) this.k.b()).equals(aaVar) && this.o.k() && this.m;
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"CheckResult"})
    public void a(aa aaVar, boolean z) {
        boolean z2 = aaVar.k() == C3676c.a.INLAY;
        this.i.a(aaVar, 0, z2 ? 0.0f : 1.0f).c(C5250Qua.a(new C2573g(this, aaVar, z2, z)));
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        c(true);
        if (this.l) {
            g();
        }
        this.g.pause();
    }

    public /* synthetic */ void a(C4431ub ubVar) throws Exception {
        if (ubVar.j() && !this.n) {
            d(true);
        }
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = Ba.a;
        this.k = C4928GKa.a();
        this.q.dispose();
        this.g.destroy();
    }

    private void c(boolean z) {
        this.m = z;
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        c(false);
        if (!this.n && z) {
            d(true);
        }
        this.g.pause();
    }

    private void b(boolean z) {
        K k2;
        if (this.k.c()) {
            aa aaVar = (aa) this.k.b();
            if (z) {
                k2 = C3416DZ.c(aaVar, this.j, d(aaVar));
            } else {
                k2 = C3416DZ.e(aaVar, this.j, d(aaVar));
            }
            if (z) {
                this.c.c(aaVar.I());
            } else {
                this.c.b(aaVar.I());
            }
            this.b.a((J) k2);
        }
    }

    private boolean a(C3508cda cda) {
        return this.o.s().equals(cda) && this.o.k();
    }

    private I d(aa aaVar) {
        return new I((aaVar.k() == C3676c.a.INLAY ? Yca.STREAM : Yca.PRESTITIAL).a(), this.m);
    }

    public void a(Hla hla) {
        a(Ca.a.a(hla, false, ""));
    }

    /* access modifiers changed from: 0000 */
    public void a(Ba ba) {
        SDb.a("ScAds").a(String.format("AdPlayer: Muted: %s, %s", new Object[]{Boolean.valueOf(this.n), ba.toString()}), new Object[0]);
        this.o = ba;
        if (this.o.m() || this.o.l()) {
            if (this.l) {
                g();
            }
            this.q.dispose();
        }
        this.k.a((C7733yKa<? super T>) new C2569f<Object>(this, ba));
    }

    /* access modifiers changed from: 0000 */
    public boolean b() {
        return this.o.j();
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<Long> b(aa aaVar) {
        if (!this.p.c() || !aaVar.f().equals(Tma.a(((Ila) this.p.b()).b()))) {
            return C4928GKa.a();
        }
        return C4928GKa.c(Long.valueOf(((Ila) this.p.b()).c()));
    }

    private boolean b(C3508cda cda) {
        return this.o.s().equals(cda) && this.o.m();
    }

    public /* synthetic */ void a(Ba ba, aa aaVar) {
        a aVar = new a(this.h.b(), aaVar, this.o, this.n);
        this.d.a(aaVar.k() == C3676c.a.INLAY ? Yca.STREAM : Yca.PRESTITIAL, this.m, aaVar, ba);
        this.e.a(aaVar.I(), aVar);
        this.a.c(C3876taa.h, aVar);
    }

    public void a(Ila ila) {
        if (this.k.c()) {
            this.p = C4928GKa.c(ila);
            C4519wc wcVar = new C4519wc(ila.c(), ila.a(), Tma.a(ila.b()));
            this.d.a((U) this.k.b(), wcVar);
            b bVar = new b(this.h.b(), ila.c(), ila.a());
            this.a.c(C3876taa.h, bVar);
        }
    }

    public void a(String str, Surface surface) {
        this.k.a((C7733yKa<? super T>) new C2565e<Object>(this, str, surface));
    }

    public /* synthetic */ void a(String str, Surface surface, aa aaVar) {
        if (aaVar.I().equals(str)) {
            VideoAdPlaybackItem a2 = this.i.a(str);
            if (a2 != null) {
                this.g.a(a2.d(), surface);
            }
        }
    }
}
