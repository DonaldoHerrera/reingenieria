package com.soundcloud.android.payments;

import android.app.Activity;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3702d;
import com.soundcloud.android.foundation.events.C3702d.C0096d.c;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.view.Y;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;
import java.util.concurrent.TimeUnit;

/* compiled from: WebCheckoutPresenter */
class Ta extends DefaultActivityLightCycle<AppCompatActivity> implements a, com.soundcloud.android.payments.Va.a {
    private static final long a = TimeUnit.SECONDS.toMillis(15);
    private final Va b;
    private final Y c;
    private final C2526g d;
    private final C5018JHa e;
    private final C4806CMa<_a> f;
    private final C3184oU g;
    private final C4581ija h;
    private final C3700b i;
    private final C7181qKa j;
    private Activity k;
    private VPa l = C4881Eua.a();
    private Handler m = new Handler();

    /* compiled from: WebCheckoutPresenter */
    private class a extends C5068Kua<AvailableWebProducts> {
        private a() {
        }

        /* renamed from: a */
        public void onSuccess(AvailableWebProducts availableWebProducts) {
            C4928GKa c = availableWebProducts.c();
            C4928GKa e = availableWebProducts.e();
            if (Ta.this.a(c)) {
                Ta.this.e((WebProduct) c.b());
            } else if (Ta.this.a(e)) {
                Ta.this.e((WebProduct) e.b());
            } else {
                Ta.this.G();
            }
            super.onSuccess(availableWebProducts);
        }

        /* synthetic */ a(Ta ta, Sa sa) {
            this();
        }

        public void a(Throwable th) {
            super.a(th);
            Ta.this.G();
        }
    }

    Ta(Va va, Y y, C2526g gVar, C5018JHa jHa, C4806CMa<_a> cMa, C3184oU oUVar, C4581ija ija, C3700b bVar, C7181qKa qka) {
        this.b = va;
        this.c = y;
        this.d = gVar;
        this.e = jHa;
        this.f = cMa;
        this.g = oUVar;
        this.h = ija;
        this.i = bVar;
        this.j = qka;
    }

    private void A() {
        IPa a2 = ((_a) this.f.get()).a().a(RPa.a());
        a aVar = new a(this, null);
        a2.c(aVar);
        this.l = aVar;
    }

    private C2455aV B() {
        String str = "checkout_plan";
        if (this.k.getIntent().hasExtra(str)) {
            return (C2455aV) this.k.getIntent().getSerializableExtra(str);
        }
        return C2455aV.UNDEFINED;
    }

    private WebProduct C() {
        return (WebProduct) this.k.getIntent().getParcelableExtra("product_info");
    }

    private void D() {
        this.g.b(C2455aV.a(C().d()));
        this.h.e(this.k);
    }

    private void E() {
        this.b.a(true);
        H();
        WebProduct C = C();
        if (C == null) {
            A();
        } else {
            d(C);
        }
    }

    private void F() {
        this.i.a((C3702d) c.c);
    }

    /* access modifiers changed from: private */
    public void G() {
        z();
        this.b.h();
    }

    private void H() {
        this.m.postDelayed(new C4273x(this), a);
    }

    private void I() {
        WebProduct C = C();
        if (C == null) {
            SDb.b("Dropping purchase tracking event: no product found in Intent!?", new Object[0]);
            return;
        }
        int i2 = Sa.a[C2455aV.a(C.d()).ordinal()];
        if (i2 == 1) {
            this.i.a((J) Raa.b(C.e().b(), C.e().a()));
        } else if (i2 != 2) {
            C7316sHa.d(new IllegalStateException("Dropping purchase tracking event: failed to resolve tier from product"));
        } else {
            this.i.a((J) Raa.a(C.e().b(), C.e().a()));
        }
    }

    private void c(WebProduct webProduct, Builder builder) {
        if (webProduct.h() != null) {
            builder.appendQueryParameter("prorated_price", webProduct.h().c());
        }
    }

    private void d(WebProduct webProduct) {
        String a2 = a(this.d.e().a(), webProduct, this.j.n(), this.j.c());
        this.b.a("AndroidApp", new Ra(this));
        this.b.a(a2);
    }

    /* access modifiers changed from: private */
    public void e(WebProduct webProduct) {
        f(webProduct);
        d(webProduct);
    }

    private void f(WebProduct webProduct) {
        this.k.getIntent().putExtra("product_info", webProduct);
    }

    private void z() {
        this.m.removeCallbacksAndMessages(null);
    }

    /* renamed from: b */
    public void onCreate(AppCompatActivity appCompatActivity, Bundle bundle) {
        this.k = appCompatActivity;
        this.b.a(appCompatActivity, this, this.c);
        E();
    }

    public void o() {
        z();
        this.k.runOnUiThread(new C4271w(this));
    }

    public void p() {
        E();
    }

    public void u() {
        this.i.a((J) Waa.P());
        F();
        I();
        D();
        this.k.finish();
    }

    /* access modifiers changed from: 0000 */
    public boolean x() {
        return this.b.f();
    }

    public /* synthetic */ void y() {
        this.b.a(false);
    }

    private void b(WebProduct webProduct, Builder builder) {
        if (webProduct.j()) {
            builder.appendQueryParameter("promo_days", Integer.toString(webProduct.f()));
            builder.appendQueryParameter("promo_price", webProduct.g().c());
        }
    }

    public void a(String str) {
        this.i.a((J) new C4231ba(str));
    }

    /* renamed from: a */
    public void onDestroy(AppCompatActivity appCompatActivity) {
        this.l.dispose();
        z();
        this.b.g();
        this.k = null;
    }

    /* access modifiers changed from: 0000 */
    public String a(String str, WebProduct webProduct, String str2, String str3) {
        String str4 = "trial_days";
        String str5 = "expiry_date";
        String str6 = "package_urn";
        String str7 = "tier";
        String str8 = "hq_available";
        Builder appendQueryParameter = Uri.parse("https://soundcloud.com/android_payment.html").buildUpon().appendQueryParameter("oauth_token", str).appendQueryParameter("price", webProduct.e().c()).appendQueryParameter(str4, Integer.toString(webProduct.i())).appendQueryParameter(str5, webProduct.b()).appendQueryParameter(str6, webProduct.c()).appendQueryParameter(str7, webProduct.d()).appendQueryParameter("env", str2).appendQueryParameter("stage", str3).appendQueryParameter(str8, Boolean.TRUE.toString());
        a(webProduct, appendQueryParameter);
        b(webProduct, appendQueryParameter);
        c(webProduct, appendQueryParameter);
        a(appendQueryParameter);
        return appendQueryParameter.toString();
    }

    private void a(WebProduct webProduct, Builder builder) {
        if (webProduct.a() != null) {
            builder.appendQueryParameter("discount_price", webProduct.a().c());
        }
    }

    private void a(Builder builder) {
        C4928GKa b2 = this.e.b();
        if (b2.c()) {
            builder.appendQueryParameter("locale", (String) b2.b());
        }
    }

    /* access modifiers changed from: private */
    public boolean a(C4928GKa<WebProduct> gKa) {
        return gKa.c() && C2455aV.a(((WebProduct) gKa.b()).d()) == B();
    }
}
