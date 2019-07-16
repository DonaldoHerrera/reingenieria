package com.soundcloud.android.payments;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.B;
import androidx.fragment.app.C0361c;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.payments.Fa.p;

@Deprecated
/* compiled from: LegacyConversionPresenter */
class P implements a, E {
    private final _a a;
    /* access modifiers changed from: private */
    public final S b;
    private final C3700b c;
    private final C2436_U d;
    private VPa e = C4881Eua.a();
    /* access modifiers changed from: private */
    public AvailableWebProducts f = AvailableWebProducts.a();
    private AppCompatActivity g;
    private C3920yea h = C3920yea.GENERAL;
    private C4928GKa<WebProduct> i = C4928GKa.a();

    /* compiled from: LegacyConversionPresenter */
    private class a extends C5068Kua<AvailableWebProducts> {
        private a() {
        }

        /* renamed from: a */
        public void onSuccess(AvailableWebProducts availableWebProducts) {
            P.this.f = availableWebProducts;
            P.this.c();
            super.onSuccess(availableWebProducts);
        }

        /* synthetic */ a(P p, O o) {
            this();
        }

        public void a(Throwable th) {
            super.a(th);
            P.this.b.d();
        }
    }

    P(_a _aVar, S s, C3700b bVar, C2436_U _u) {
        this.a = _aVar;
        this.b = s;
        this.c = bVar;
        this.d = _u;
    }

    /* access modifiers changed from: private */
    public void c() {
        if (this.f.c().c()) {
            d();
        } else if (a()) {
            e();
        } else {
            this.b.d();
        }
    }

    private void d() {
        c((WebProduct) this.f.c().b());
        if (a()) {
            this.b.a(((WebProduct) this.f.e().b()).e().c());
        }
    }

    private void e() {
        c((WebProduct) this.f.e().b());
        this.b.b();
    }

    private boolean f() {
        return this.d.q().b();
    }

    private void g() {
        this.b.c();
        IPa a2 = this.a.a().a(RPa.a());
        a aVar = new a(this, null);
        a2.c(aVar);
        this.e = aVar;
    }

    private void j() {
        if (this.d.u()) {
            a((B) _ka.c(this.g.getString(p.plan_conversion_error_message_apple)));
        } else {
            a((B) _ka.c(this.g.getString(p.plan_conversion_error_message_generic)));
        }
    }

    public void h() {
        if (this.i.c()) {
            a((WebProduct) this.i.b());
        } else {
            g();
        }
    }

    public void i() {
        Intent intent = new Intent(this.g, ProductChoiceActivity.class);
        intent.putExtra("available_products", this.f);
        intent.putExtra("product_choice_plan", C2455aV.MID_TIER);
        this.g.startActivity(intent);
        this.g.finish();
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    public void b(AppCompatActivity appCompatActivity, Bundle bundle) {
        this.g = appCompatActivity;
        this.h = C3920yea.b(appCompatActivity.getIntent());
        this.b.a(appCompatActivity, (a) this);
        b();
        if (bundle != null) {
            String str = "available_products";
            if (bundle.getParcelable(str) != null) {
                this.f = (AvailableWebProducts) bundle.getParcelable(str);
                c();
                if (bundle != null) {
                    F.a(this.c);
                    return;
                }
                return;
            }
        }
        g();
        if (bundle != null) {
        }
    }

    private void e(WebProduct webProduct) {
        Waa waa;
        C3700b bVar = this.c;
        if (webProduct.j()) {
            waa = Waa.y();
        } else {
            waa = Waa.w();
        }
        bVar.a((J) waa);
        Intent intent = new Intent(this.g, WebCheckoutActivity.class);
        intent.putExtra("product_info", webProduct);
        this.g.startActivity(intent);
        this.g.finish();
    }

    public void a(AppCompatActivity appCompatActivity) {
        this.e.dispose();
        this.g = null;
    }

    private void d(WebProduct webProduct) {
        this.b.a(webProduct.g().c(), webProduct.f(), webProduct.e().c());
        this.c.a((J) Waa.z());
    }

    public void a(AppCompatActivity appCompatActivity, Bundle bundle) {
        bundle.putParcelable("available_products", this.f);
    }

    private boolean a() {
        return this.f.e().c() && this.f.c().c() && !f();
    }

    private void c(WebProduct webProduct) {
        this.i = C4928GKa.c(webProduct);
        if (webProduct.j()) {
            d(webProduct);
        } else {
            b(webProduct);
        }
    }

    private void a(WebProduct webProduct) {
        if (this.d.n()) {
            e(webProduct);
        } else {
            j();
        }
    }

    private void b() {
        if (f()) {
            this.h = C3920yea.GENERAL;
        }
        int i2 = O.a[this.h.ordinal()];
        if (i2 == 1) {
            this.b.a(p.tier_plus, p.conversion_title_upgrade, p.conversion_description_upgrade);
        } else if (i2 == 2) {
            this.b.a(p.tier_plus, p.conversion_title_ads_focus, p.conversion_description_ht);
        } else if (i2 == 3) {
            this.b.a(p.tier_plus, p.conversion_title_offline_focus, p.conversion_description_ht);
        } else if (i2 == 4) {
            this.b.a(p.tier_plus, p.conversion_title_high_quality_streaming_focus, p.conversion_description_ht);
        } else if (i2 == 5) {
            this.b.a(p.tier_plus, p.conversion_title_premium_content_focus, p.conversion_description_ht);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected upsellcontext");
            sb.append(this.h);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private void a(B b2) {
        C5232QGa.a((C0361c) b2, this.g.getSupportFragmentManager(), "plan_conversion_error_dialog");
    }

    private void b(WebProduct webProduct) {
        if (webProduct.a() != null) {
            this.b.a(webProduct.a().c(), webProduct.i());
        } else {
            this.b.a(webProduct.e().c(), webProduct.i());
        }
        this.c.a((J) Waa.x());
    }
}
