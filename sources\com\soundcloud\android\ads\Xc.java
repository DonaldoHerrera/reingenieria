package com.soundcloud.android.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.e;
import androidx.viewpager.widget.ViewPager.h;
import com.soundcloud.android.foundation.ads.C3676c;
import com.soundcloud.android.foundation.ads.C3678e;
import com.soundcloud.android.foundation.ads.V;
import com.soundcloud.android.foundation.ads.X;
import com.soundcloud.android.foundation.ads.aa;
import com.soundcloud.android.foundation.ads.ca;
import com.soundcloud.android.foundation.ads.ea;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.playback.C4431ub;
import com.soundcloud.android.playback.ke;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PrestitialPresenter */
class Xc extends DefaultActivityLightCycle<AppCompatActivity> implements com.soundcloud.android.ads.Zc.a {
    /* access modifiers changed from: private */
    public final PrestitialAdsController a;
    private final C3678e b;
    private final Tc c;
    private final C4806CMa<md> d;
    /* access modifiers changed from: private */
    public final C4806CMa<dd> e;
    private final ke f;
    private final od g;
    /* access modifiers changed from: private */
    public final C2645ya h;
    private final C4655rja i;
    /* access modifiers changed from: private */
    public final C5327TLa j;
    /* access modifiers changed from: private */
    public final C3700b k;
    private final Yaa l;
    private WeakReference<Activity> m;
    private WeakReference<ViewPager> n;
    /* access modifiers changed from: private */
    public VPa o = C4881Eua.b();
    /* access modifiers changed from: private */
    public C4928GKa<a> p = C4928GKa.a();
    private C4928GKa<b> q = C4928GKa.a();

    /* compiled from: PrestitialPresenter */
    private class a extends C5037Jua<C3431IZ> {
        private a() {
        }

        public void a(C3431IZ iz) {
            dd ddVar = (dd) Xc.this.e.get();
            if (iz.a()) {
                defpackage.C3431IZ.b bVar = (defpackage.C3431IZ.b) iz;
                ddVar.a(Long.valueOf(bVar.k()), Long.valueOf(bVar.i()));
            } else if (iz.c()) {
                C4431ub j = ((defpackage.C3431IZ.a) iz).j();
                ddVar.a(j);
                if (j.m() || j.l()) {
                    Xc.this.x();
                }
            }
        }
    }

    /* compiled from: PrestitialPresenter */
    private class b extends h {
        private final Sc a;
        private final X b;
        Map<a, J> c = new HashMap(a.values().length);

        b(Sc sc, X x) {
            this.a = sc;
            this.b = x;
        }

        static /* synthetic */ boolean a(C3431IZ iz) throws Exception {
            return iz.c() || iz.a();
        }

        public void b(int i) {
            Xc.this.p = C4928GKa.c(this.a.e(i));
            a((a) Xc.this.p.b());
            if (Xc.this.p.a(a.VIDEO_CARD)) {
                b();
            } else if (Xc.this.p.a(a.END_CARD)) {
                a();
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(a aVar, J j) {
            this.c.put(aVar, j);
        }

        private void a(a aVar) {
            if (this.c.containsKey(aVar)) {
                Xc.this.a((J) this.c.get(aVar));
                this.c.remove(aVar);
            }
        }

        private void a() {
            Xc.this.k.a((J) Taa.a(this.b, Yca.PRESTITIAL));
            Xc.this.a.l();
        }

        private void b() {
            ((dd) Xc.this.e.get()).a(this.b.p());
            Xc.this.h.a(this.b.p(), true);
            Xc xc = Xc.this;
            xc.o = (VPa) xc.j.a(C3876taa.h).a((C7256rQa<? super T>) D.a).c(new a());
        }
    }

    Xc(PrestitialAdsController prestitialAdsController, C3678e eVar, Tc tc, C4806CMa<md> cMa, Yaa yaa, C4806CMa<dd> cMa2, ke keVar, od odVar, C2645ya yaVar, C4655rja rja, C5327TLa tLa, C3700b bVar) {
        this.a = prestitialAdsController;
        this.b = eVar;
        this.l = yaa;
        this.c = tc;
        this.d = cMa;
        this.e = cMa2;
        this.f = keVar;
        this.g = odVar;
        this.h = yaVar;
        this.i = rja;
        this.j = tLa;
        this.k = bVar;
    }

    /* access modifiers changed from: private */
    public void x() {
        a(this.n, (C7733yKa<T>) B.a);
    }

    private void y() {
        a(this.m, (C7733yKa<T>) A.a);
    }

    public void n() {
        y();
    }

    public void q() {
        this.h.c();
        x();
    }

    public void v() {
        C4928GKa a2 = this.h.a();
        C2645ya yaVar = this.h;
        yaVar.getClass();
        a2.a((C7733yKa<? super T>) new C2570fa<Object>(yaVar));
    }

    private void d(AppCompatActivity appCompatActivity) {
        if (appCompatActivity.isChangingConfigurations()) {
            this.f.a(com.soundcloud.android.playback.ke.b.PRESTITIAL);
            return;
        }
        this.o.dispose();
        this.f.b(com.soundcloud.android.playback.ke.b.PRESTITIAL);
        this.h.d();
    }

    /* renamed from: b */
    public void onCreate(AppCompatActivity appCompatActivity, Bundle bundle) {
        C4928GKa m2 = this.a.m();
        if (m2.c()) {
            this.m = new WeakReference<>(appCompatActivity);
            a((C3676c) m2.b(), appCompatActivity);
            return;
        }
        appCompatActivity.finish();
    }

    /* renamed from: c */
    public void onResume(AppCompatActivity appCompatActivity) {
        this.h.a().a((C7733yKa<? super T>) new E<Object>(this));
    }

    private void a(C3676c cVar, AppCompatActivity appCompatActivity) {
        if (cVar instanceof X) {
            appCompatActivity.setContentView(l.sponsored_session_prestitial);
            a((X) cVar, appCompatActivity);
        } else if (cVar instanceof ea) {
            appCompatActivity.setContentView(l.visual_prestitial);
            ((md) this.d.get()).a(appCompatActivity, (ea) cVar, (com.soundcloud.android.ads.Zc.a) this);
        } else {
            appCompatActivity.finish();
        }
    }

    /* renamed from: b */
    public void onPause(AppCompatActivity appCompatActivity) {
        if (this.h.b()) {
            this.h.c();
        }
    }

    private void a(X x, AppCompatActivity appCompatActivity) {
        Sc a2 = this.c.a(x, this, (dd) this.e.get());
        ViewPager viewPager = (ViewPager) appCompatActivity.findViewById(i.prestitial_pager);
        b bVar = new b(a2, x);
        viewPager.a((e) bVar);
        viewPager.setAdapter(a2);
        this.n = new WeakReference<>(viewPager);
        this.p = C4928GKa.c(a.OPT_IN_CARD);
        this.q = C4928GKa.c(bVar);
        this.k.a((J) Paa.a(x, this.l));
    }

    public /* synthetic */ void a(aa aaVar) {
        if (aaVar.k() == com.soundcloud.android.foundation.ads.C3676c.a.SPONSORED_SESSION) {
            dd ddVar = (dd) this.e.get();
            a(ddVar.b, ddVar.d, aaVar);
        }
    }

    /* renamed from: a */
    public void onDestroy(AppCompatActivity appCompatActivity) {
        d(appCompatActivity);
        this.b.e();
        this.p = C4928GKa.a();
        this.q = C4928GKa.a();
    }

    static /* synthetic */ void a(ViewPager viewPager) {
        int currentItem = viewPager.getCurrentItem() + 1;
        if (currentItem < viewPager.getAdapter().a()) {
            viewPager.setCurrentItem(currentItem);
        }
    }

    public void a(Context context, C3676c cVar, C4928GKa<a> gKa) {
        if (gKa.a(a.OPT_IN_CARD)) {
            x();
        } else {
            a(((V) cVar).c(), cVar);
        }
    }

    private void a(String str, C3676c cVar) {
        K k2;
        if (cVar instanceof X) {
            k2 = C3416DZ.a((X) cVar, this.l);
        } else {
            k2 = C3416DZ.a((ea) cVar, this.l);
        }
        this.k.a((J) k2);
        this.i.a(C4621nja.a(str));
        y();
    }

    public void a(C3676c cVar, View view, C4928GKa<a> gKa) {
        if (cVar instanceof ea) {
            ea eaVar = (ea) cVar;
            this.b.a(view, (ca) eaVar);
            a((J) Paa.a(eaVar, this.l));
        } else if ((cVar instanceof X) && gKa.c()) {
            a((X) cVar, (a) gKa.b());
        }
    }

    private void a(X x, a aVar) {
        Paa a2 = Paa.a(x, aVar.a(a.END_CARD), this.l);
        if (this.p.a(aVar)) {
            a((J) a2);
        } else {
            this.q.a((C7733yKa<? super T>) new C<Object>(aVar, a2));
        }
    }

    public void a(a aVar, X x, Context context) {
        if (aVar.a(a.OPT_IN_CARD)) {
            y();
        } else if (aVar.a(a.END_CARD)) {
            a(x.c(), (C3676c) x);
        }
    }

    public void a(a aVar, X x) {
        if (aVar.a(a.OPT_IN_CARD)) {
            x();
        } else if (aVar.a(a.END_CARD)) {
            y();
        }
    }

    public void a(TextureView textureView, View view, aa aaVar) {
        this.f.a(aaVar.I(), com.soundcloud.android.playback.ke.b.PRESTITIAL, textureView, view);
    }

    public void a(Context context) {
        this.g.a(context);
    }

    /* access modifiers changed from: private */
    public void a(J j2) {
        this.k.a(j2);
    }

    private <T> void a(WeakReference<T> weakReference, C7733yKa<T> yka) {
        if (weakReference != null && weakReference.get() != null) {
            yka.accept(weakReference.get());
        }
    }
}
