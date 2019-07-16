package com.soundcloud.android.more;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C0361c;
import androidx.fragment.app.C0370l;
import androidx.fragment.app.Fragment;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.u;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;
import com.soundcloud.android.main.ja;
import com.soundcloud.android.offline.C4197yd;
import com.soundcloud.android.playback.ui.C4436ab;
import com.soundcloud.android.properties.j;
import com.soundcloud.android.properties.m.x;
import com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle;

/* compiled from: MoreTabPresenter */
public class B extends DefaultSupportFragmentLightCycle<Fragment> implements a, com.soundcloud.android.main.W.b, com.soundcloud.android.main.W.a {
    private final E a;
    private final C3792iea b;
    private final C2526g c;
    private final N d;
    private final Resources e;
    private final C3700b f;
    /* access modifiers changed from: private */
    public final C2436_U g;
    private final C4197yd h;
    private final C4655rja i;
    private final C5322TGa j;
    private final j k;
    private final C2325UT l;
    /* access modifiers changed from: private */
    public final C5052KJa m;
    private final C2014EO n;
    private final C3137mV o;
    private final UPa p = new UPa();
    private final com.soundcloud.android.properties.a q;
    private C4928GKa<D> r = C4928GKa.a();
    /* access modifiers changed from: private */
    public C4928GKa<x> s = C4928GKa.a();

    /* compiled from: MoreTabPresenter */
    private class a extends C4974Hua {
        private a() {
        }

        public void a(Throwable th) {
            super.a(th);
            B.this.m.a(new Fca(p.more_subscription_check_error));
            B.this.a(true);
        }

        public void onComplete() {
            if (!B.this.g.q().b()) {
                B.this.m.a(new Fca(p.more_subscription_check_not_subscribed));
            }
            B.this.a(true);
            super.onComplete();
        }

        /* synthetic */ a(B b, A a) {
            this();
        }
    }

    /* compiled from: MoreTabPresenter */
    private class b extends C5005Iua<C3784hea> {
        private b() {
        }

        /* renamed from: a */
        public void onSuccess(C3784hea hea) {
            B.this.s = C4928GKa.c(new x(hea));
            B.this.h();
        }

        /* synthetic */ b(B b, A a) {
            this();
        }

        public void a(Throwable th) {
            super.a(th);
            B.this.s = C4928GKa.a();
        }
    }

    B(E e2, C3792iea iea, C2526g gVar, N n2, Resources resources, C3700b bVar, C2436_U _u, C4197yd ydVar, C4655rja rja, C5322TGa tGa, j jVar, com.soundcloud.android.properties.a aVar, C2325UT ut, C5052KJa kJa, C2014EO eo, C3137mV mVVar) {
        this.a = e2;
        this.b = iea;
        this.c = gVar;
        this.d = n2;
        this.e = resources;
        this.q = aVar;
        this.f = bVar;
        this.g = _u;
        this.h = ydVar;
        this.i = rja;
        this.j = tGa;
        this.k = jVar;
        this.l = ut;
        this.m = kJa;
        this.n = eo;
        this.o = mVVar;
    }

    private void d(D d2) {
        if (this.g.q().b()) {
            d2.h();
        }
    }

    private void e(D d2) {
        d2.a(a(this.g.q()));
    }

    private void f(D d2) {
        if (this.g.s()) {
            d2.a(p.more_upsell, this.q.a((defpackage.C3821mba.a) x.a));
        }
    }

    /* access modifiers changed from: private */
    public void h() {
        if (this.r.c() && this.s.c()) {
            a((D) this.r.b(), (x) this.s.b());
        }
    }

    private boolean i() {
        return this.g.q().b() || this.g.s();
    }

    public void g() {
        this.r.a((C7733yKa<? super T>) u.a);
    }

    private void b(D d2) {
        d2.c(this.g.p());
    }

    public void c(boolean z) {
        if (z && this.r.c() && ((D) this.r.b()).b()) {
            this.f.a((J) Waa.N());
        }
    }

    public void e() {
        this.i.a(C4621nja.c(this.c.c()));
    }

    public void g(View view) {
        this.i.a(C4621nja.d(this.c.e().a()));
        this.f.a((J) Waa.O());
    }

    /* renamed from: b */
    public void onDestroyView(Fragment fragment) {
        if (this.r.c()) {
            ((D) this.r.b()).i();
            this.r = C4928GKa.a();
        }
        this.p.b();
        super.onDestroyView(fragment);
    }

    public void d() {
        this.i.a(C4621nja.v());
    }

    public void e(View view) {
        ((ja) C6768kIa.c(view)).i();
    }

    public void f() {
        this.i.a(C4621nja.a(C4928GKa.a(), C4928GKa.c(Yca.MORE)));
    }

    public void h(View view) {
        this.i.a(C4621nja.b("com.soundcloud.creators"));
    }

    private void c(D d2) {
        if (!this.g.q().b()) {
            d2.g();
        }
    }

    /* renamed from: a */
    public void onCreate(Fragment fragment, Bundle bundle) {
        super.onCreate(fragment, bundle);
        UPa uPa = this.p;
        C7531vPa a2 = this.b.b(this.c.c()).a(RPa.a());
        b bVar = new b(this, null);
        a2.c(bVar);
        uPa.b(bVar);
    }

    public void d(View view) {
        c(view.getContext());
    }

    public void f(View view) {
        this.j.a(view.getContext());
    }

    public void c() {
        this.n.a(u.ACTIVITIES_LOAD);
        this.i.a(C4621nja.g());
    }

    public void b() {
        this.i.a(C4621nja.o());
    }

    public void c(View view) {
        this.i.a(C4621nja.a(C3920yea.GENERAL));
        this.f.a((J) Waa.M());
    }

    /* renamed from: a */
    public void onViewCreated(Fragment fragment, View view, Bundle bundle) {
        super.onViewCreated(fragment, view, bundle);
        D a2 = this.a.a(view, (a) this);
        this.r = C4928GKa.c(a2);
        if (i()) {
            e(a2);
            d(a2);
            f(a2);
            c(a2);
        }
        a(a2);
        a(fragment.getContext(), a2);
        b(a2);
        h();
    }

    public void b(View view) {
        C0370l supportFragmentManager = C6768kIa.a(view.getContext()).getSupportFragmentManager();
        if (supportFragmentManager != null) {
            C5232QGa.a((C0361c) new C4436ab(), supportFragmentManager, "ForceAdTestingDialogFragment");
        }
    }

    private void c(Context context) {
        if (this.h.h()) {
            b(context);
        } else {
            a(context);
        }
    }

    private void b(Context context) {
        View a2 = new com.soundcloud.android.view.customfontviews.b(context).c(p.sign_out_title_offline).b(p.sign_out_description_offline).a();
        androidx.appcompat.app.C0325l.a aVar = new androidx.appcompat.app.C0325l.a(context);
        aVar.b(a2);
        aVar.c(p.ok_got_it, (OnClickListener) new C4052f(context));
        aVar.a(17039360, (OnClickListener) null);
        aVar.c();
    }

    private String a(C2455aV aVVar) {
        int i2 = A.a[aVVar.ordinal()];
        if (i2 == 1 || i2 == 2) {
            return this.e.getString(p.tier_free);
        }
        if (i2 == 3) {
            return this.e.getString(p.tier_go);
        }
        if (i2 != 4) {
            return this.e.getString(p.tier_free);
        }
        return this.e.getString(p.tier_plus);
    }

    private void a(D d2) {
        if (this.k.m()) {
            d2.f();
        }
    }

    private void a(Context context, D d2) {
        if (this.o.a(context)) {
            d2.d();
        } else {
            d2.e();
        }
    }

    /* renamed from: a */
    public void onDestroy(Fragment fragment) {
        this.p.b();
        super.onDestroy(fragment);
    }

    private void a(D d2, x xVar) {
        d2.b(xVar.f());
        this.d.a(xVar.a(), xVar.b(), C3721b.b(this.e), d2.a());
        d2.b(xVar.g());
    }

    public void a() {
        this.i.a(C4621nja.n());
    }

    public void a(View view) {
        UPa uPa = this.p;
        C6979nPa a2 = this.l.f().a(RPa.a());
        a aVar = new a(this, null);
        a2.c(aVar);
        uPa.b(aVar);
        a(false);
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        if (this.r.c()) {
            ((D) this.r.b()).a(z);
        }
    }

    private void a(Context context) {
        View a2 = new com.soundcloud.android.view.customfontviews.b(context).c(p.sign_out_title).b(p.sign_out_description).a();
        androidx.appcompat.app.C0325l.a aVar = new androidx.appcompat.app.C0325l.a(context);
        aVar.b(a2);
        aVar.c(17039370, (OnClickListener) new C4051e(context));
        aVar.c();
    }
}
