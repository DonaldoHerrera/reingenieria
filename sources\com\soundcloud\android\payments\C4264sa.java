package com.soundcloud.android.payments;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.B;
import androidx.fragment.app.C0361c;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.payments.Fa.i;
import com.soundcloud.android.payments.Fa.p;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

@Deprecated
/* renamed from: com.soundcloud.android.payments.sa reason: case insensitive filesystem */
/* compiled from: ProductChoicePresenter */
class C4264sa extends DefaultActivityLightCycle<AppCompatActivity> implements a {
    private final _a a;
    private final C4806CMa<C4259pa> b;
    private final C4806CMa<C4274xa> c;
    private final Ba d;
    private final C3700b e;
    private final C4655rja f;
    private final C2526g g;
    private VPa h = C4881Eua.a();
    private AppCompatActivity i;

    /* renamed from: com.soundcloud.android.payments.sa$a */
    /* compiled from: ProductChoicePresenter */
    private class a extends C5068Kua<AvailableWebProducts> {
        private a() {
        }

        /* renamed from: a */
        public void onSuccess(AvailableWebProducts availableWebProducts) {
            if (!availableWebProducts.c().c() || !availableWebProducts.e().c()) {
                C4264sa.this.A();
            } else {
                C4264sa.this.b(availableWebProducts);
                C4264sa.this.a(availableWebProducts);
            }
            super.onSuccess(availableWebProducts);
        }

        /* synthetic */ a(C4264sa saVar, C4262ra raVar) {
            this();
        }

        public void a(Throwable th) {
            super.a(th);
            C4264sa.this.A();
        }
    }

    C4264sa(_a _aVar, C4655rja rja, C2526g gVar, C4806CMa<C4259pa> cMa, C4806CMa<C4274xa> cMa2, Ba ba, C3700b bVar) {
        this.a = _aVar;
        this.f = rja;
        this.g = gVar;
        this.b = cMa;
        this.c = cMa2;
        this.d = ba;
        this.e = bVar;
    }

    /* access modifiers changed from: private */
    public void A() {
        Toast.makeText(this.i, p.product_choice_error_unavailable, 0).show();
        this.i.finish();
    }

    private void B() {
        this.f.a(C4621nja.c(this.g.e().a()));
    }

    private void d(WebProduct webProduct) {
        Intent intent = new Intent(this.i, WebCheckoutActivity.class);
        intent.putExtra("product_info", webProduct);
        this.i.startActivity(intent);
        this.i.finish();
    }

    private void e(WebProduct webProduct) {
        int i2 = C4262ra.a[C2455aV.a(webProduct.d()).ordinal()];
        if (i2 == 1) {
            this.e.a((J) Waa.q());
        } else if (i2 == 2) {
            this.e.a((J) Waa.o());
        } else if (i2 != 3) {
            z();
        } else {
            this.e.a((J) Waa.s());
        }
    }

    private C2455aV x() {
        String str = "product_choice_plan";
        if (this.i.getIntent().hasExtra(str)) {
            return (C2455aV) this.i.getIntent().getSerializableExtra(str);
        }
        return C2455aV.HIGH_TIER;
    }

    private void y() {
        IPa a2 = this.a.a().a(RPa.a());
        a aVar = new a(this, null);
        a2.c(aVar);
        this.h = aVar;
    }

    private void z() {
        C7316sHa.d(new IllegalStateException("Dropping funnel tracking event: failed to resolve tier from product"));
    }

    public void c(WebProduct webProduct) {
        if (C2455aV.a(webProduct.d()) == C2455aV.STUDENT_TIER) {
            B();
        } else {
            d(webProduct);
        }
        e(webProduct);
        this.i.finish();
    }

    /* renamed from: b */
    public void onCreate(AppCompatActivity appCompatActivity, Bundle bundle) {
        this.i = appCompatActivity;
        String str = "available_products";
        if (appCompatActivity.getIntent().hasExtra(str)) {
            a((AvailableWebProducts) appCompatActivity.getIntent().getParcelableExtra(str));
        } else {
            y();
        }
    }

    /* access modifiers changed from: private */
    public void a(AvailableWebProducts availableWebProducts) {
        C4278za zaVar;
        View findViewById = this.i.findViewById(16908290);
        if (findViewById.findViewById(i.product_choice_pager) == null) {
            zaVar = (C4278za) this.c.get();
        } else {
            zaVar = (C4278za) this.b.get();
        }
        zaVar.a(findViewById, availableWebProducts, this, x());
    }

    public void b(WebProduct webProduct) {
        int i2 = C4262ra.a[C2455aV.a(webProduct.d()).ordinal()];
        if (i2 == 1) {
            this.e.a((J) Waa.r());
        } else if (i2 == 2) {
            this.e.a((J) Waa.p());
        } else if (i2 != 3) {
            z();
        } else {
            this.e.a((J) Waa.t());
        }
    }

    /* renamed from: a */
    public void onDestroy(AppCompatActivity appCompatActivity) {
        this.h.dispose();
        this.i = null;
    }

    public void a(WebProduct webProduct) {
        if (webProduct.j()) {
            a((B) G.a(this.d.c(webProduct.f()), webProduct.g().c(), webProduct.e().c()));
        } else if (webProduct.i() > 0) {
            a((B) G.c(webProduct.i()));
        } else {
            a((B) G.Qb());
        }
    }

    /* access modifiers changed from: private */
    public void b(AvailableWebProducts availableWebProducts) {
        this.i.getIntent().putExtra("available_products", availableWebProducts);
    }

    private void a(B b2) {
        C5232QGa.a((C0361c) b2, this.i.getSupportFragmentManager(), "restrictions_dialog");
    }
}
