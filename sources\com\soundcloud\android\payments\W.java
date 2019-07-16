package com.soundcloud.android.payments;

import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.A;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

/* compiled from: NativeConversionPresenter */
class W extends DefaultActivityLightCycle<AppCompatActivity> implements a {
    private final Z a;
    /* access modifiers changed from: private */
    public final C4235da b;
    /* access modifiers changed from: private */
    public final S c;
    private final C4581ija d;
    /* access modifiers changed from: private */
    public final C3700b e;
    private IPa<String> f;
    private IPa<Ea> g;
    private final UPa h = new UPa();
    private Oa i;
    private AppCompatActivity j;
    /* access modifiers changed from: private */
    public Aa k;

    /* compiled from: NativeConversionPresenter */
    private class a extends C5037Jua<C> {
        private a() {
        }

        /* synthetic */ a(W w, V v) {
            this();
        }

        public void a(C c) {
            if (c.a()) {
                W.this.A();
            } else if (c.b()) {
                W.this.b.a();
            }
        }
    }

    /* compiled from: NativeConversionPresenter */
    private class b extends C5068Kua<Da> {
        private b() {
        }

        /* renamed from: a */
        public void onSuccess(Da da) {
            if (da.c()) {
                W.this.k = da.b();
                W.this.c.b(W.this.k.b());
                W.this.e.a((J) Waa.x());
            } else {
                W.this.b.c();
            }
            super.onSuccess(da);
        }

        /* synthetic */ b(W w, V v) {
            this();
        }

        public void a(Throwable th) {
            super.a(th);
            W.this.b.a(th);
        }
    }

    /* compiled from: NativeConversionPresenter */
    private class c extends C5068Kua<String> {
        private c() {
        }

        public void a(Throwable th) {
            super.a(th);
            W.this.b.a(th);
            W.this.c.a();
        }

        /* synthetic */ c(W w, V v) {
            this();
        }
    }

    /* compiled from: NativeConversionPresenter */
    private class d extends C5068Kua<Ea> {
        private d() {
        }

        /* renamed from: a */
        public void onSuccess(Ea ea) {
            int i = V.a[ea.ordinal()];
            if (i == 1) {
                W.this.B();
            } else if (i == 2) {
                W.this.b.d();
            } else if (i == 3) {
                W.this.b.e();
            } else if (i == 4) {
                W.this.z();
            }
            super.onSuccess(ea);
        }

        /* synthetic */ d(W w, V v) {
            this();
        }

        public void a(Throwable th) {
            super.a(th);
            W.this.b.a(th);
        }
    }

    W(Z z, C4235da daVar, S s, C4581ija ija, C3700b bVar) {
        this.a = z;
        this.b = daVar;
        this.c = s;
        this.d = ija;
        this.e = bVar;
    }

    /* access modifiers changed from: private */
    public void A() {
        Oa oa = this.i;
        if (oa == null || !oa.b()) {
            b(this.a.c().c());
        } else {
            a(this.i);
        }
    }

    /* access modifiers changed from: private */
    public void B() {
        this.d.e((Activity) this.j);
        this.e.a((J) Waa.P());
    }

    private void y() {
        this.h.b((VPa) this.a.a((Activity) this.j).c(new a(this, null)));
    }

    /* access modifiers changed from: private */
    public void z() {
        UPa uPa = this.h;
        IPa b2 = this.a.b();
        b bVar = new b(this, null);
        b2.c(bVar);
        uPa.b(bVar);
    }

    public void h() {
        a(this.a.b(this.k.a()).c());
        this.c.c();
        this.e.a((J) Waa.w());
    }

    public void i() {
    }

    public Oa x() {
        return new Oa(this.f, this.g);
    }

    /* renamed from: b */
    public void onCreate(AppCompatActivity appCompatActivity, Bundle bundle) {
        this.j = appCompatActivity;
        this.c.a(appCompatActivity, (a) this);
        this.b.a((FragmentActivity) appCompatActivity);
        this.i = (Oa) appCompatActivity.getLastCustomNonConfigurationInstance();
        b(appCompatActivity);
        y();
    }

    /* renamed from: a */
    public void onDestroy(AppCompatActivity appCompatActivity) {
        this.h.b();
        this.a.a();
    }

    /* access modifiers changed from: 0000 */
    public void a(C4575hla hla) {
        if (!hla.c()) {
            return;
        }
        if (hla.d()) {
            this.i = null;
            this.c.c();
            b(this.a.a(hla.b()).c());
            return;
        }
        this.b.b();
        this.a.a(hla.a()).c(new C5068Kua());
        if (this.k == null) {
            y();
        } else {
            this.c.a();
        }
    }

    private void b(AppCompatActivity appCompatActivity) {
        Fragment a2 = appCompatActivity.getSupportFragmentManager().a("payment_error");
        if (a2 != null) {
            A a3 = appCompatActivity.getSupportFragmentManager().a();
            a3.d(a2);
            a3.a();
        }
    }

    private void b(IPa<Ea> iPa) {
        this.g = iPa;
        UPa uPa = this.h;
        IPa<Ea> iPa2 = this.g;
        d dVar = new d(this, null);
        iPa2.c(dVar);
        uPa.b(dVar);
    }

    private void a(IPa<String> iPa) {
        this.g = null;
        this.f = iPa;
        UPa uPa = this.h;
        IPa<String> iPa2 = this.f;
        c cVar = new c(this, null);
        iPa2.c(cVar);
        uPa.b(cVar);
    }

    private void a(Oa oa) {
        if (oa.a()) {
            b(oa.d());
        } else {
            a(oa.c());
        }
        this.i = null;
    }
}
