package com.soundcloud.android.payments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.B;
import androidx.fragment.app.C0361c;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.payments.Fa.p;
import com.soundcloud.android.payments.H.b;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0001>B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0016H\u0012J\b\u0010\u001f\u001a\u00020 H\u0012J\b\u0010!\u001a\u00020\u001dH\u0012J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0016H\u0012J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0016H\u0012J\b\u0010$\u001a\u00020\u001dH\u0012J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0016H\u0016J\b\u0010&\u001a\u00020\u001dH\u0012J\b\u0010'\u001a\u00020\u001dH\u0012J\b\u0010(\u001a\u00020 H\u0012J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0016H\u0012J\b\u0010*\u001a\u00020\u001dH\u0012J\b\u0010+\u001a\u00020\u001dH\u0012J\b\u0010,\u001a\u00020\u001dH\u0016J\u001a\u0010-\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0010\u00100\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u00101\u001a\u00020\u001dH\u0016J\b\u00102\u001a\u00020\u001dH\u0016J\u0018\u00103\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010.\u001a\u00020/H\u0016J\u0012\u00104\u001a\u00020\u001d2\b\u0010.\u001a\u0004\u0018\u00010/H\u0012J\u0010\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u000207H\u0012J\b\u00108\u001a\u00020\u001dH\u0012J\u0010\u00109\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0016H\u0012J\u0010\u0010:\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u0019H\u0012J\u0010\u0010<\u001a\u00020=2\u0006\u0010\u001e\u001a\u00020\u0016H\u0012R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R2\u0010\u0014\u001a&\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u0016 \u0017*\u0012\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u0016\u0018\u00010\u00150\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/soundcloud/android/payments/RelaunchConversionPresenter;", "Lcom/soundcloud/android/payments/ConversionPresenter;", "Lcom/soundcloud/android/payments/ConversionView$Listener;", "operations", "Lcom/soundcloud/android/payments/WebPaymentOperations;", "view", "Lcom/soundcloud/android/payments/ConversionView;", "analytics", "Lcom/soundcloud/android/foundation/events/Analytics;", "featureOperations", "Lcom/soundcloud/android/configuration/plans/FeatureOperations;", "navigator", "Lcom/soundcloud/android/navigation/Navigator;", "scheduler", "Lio/reactivex/Scheduler;", "(Lcom/soundcloud/android/payments/WebPaymentOperations;Lcom/soundcloud/android/payments/ConversionView;Lcom/soundcloud/android/foundation/events/Analytics;Lcom/soundcloud/android/configuration/plans/FeatureOperations;Lcom/soundcloud/android/navigation/Navigator;Lio/reactivex/Scheduler;)V", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "disposable", "Lio/reactivex/disposables/Disposable;", "primaryProduct", "Lcom/soundcloud/java/optional/Optional;", "Lcom/soundcloud/android/payments/WebProduct;", "kotlin.jvm.PlatformType", "products", "Lcom/soundcloud/android/payments/AvailableWebProducts;", "upsellContext", "Lcom/soundcloud/android/foundation/upsell/UpsellContext;", "attemptWebCheckout", "", "product", "canPurchaseMidTier", "", "configureCopy", "displayDefault", "displayPrimaryProduct", "displayProducts", "displayPromo", "enableHighTierPurchase", "enableMidTierPurchase", "isMidTierUser", "launchCheckout", "launchProductChoice", "loadProducts", "onClose", "onCreate", "bundle", "Landroid/os/Bundle;", "onDestroy", "onMoreProducts", "onPurchasePrimary", "onSaveInstanceState", "setupProducts", "showDialog", "dialogFragment", "Landroidx/appcompat/app/AppCompatDialogFragment;", "showPlanConversionErrorDialog", "startWebCheckout", "updateProducts", "it", "upgradeFunnelEvent", "Lcom/soundcloud/android/events/UpgradeFunnelEvent;", "Companion", "payments_release"}, mv = {1, 1, 15})
/* compiled from: RelaunchConversionPresenter.kt */
public class Ga implements E, b {
    private static final String a = a;
    public static final a b = new a(null);
    private VPa c = C4881Eua.a();
    private AvailableWebProducts d = AvailableWebProducts.a.a();
    private AppCompatActivity e;
    private C3920yea f = C3920yea.GENERAL;
    private C4928GKa<WebProduct> g = C4928GKa.a();
    private final _a h;
    /* access modifiers changed from: private */
    public final H i;
    private final C3700b j;
    private final C2436_U k;
    private final C4655rja l;
    private final HPa m;

    /* compiled from: RelaunchConversionPresenter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public Ga(_a _aVar, H h2, C3700b bVar, C2436_U _u, C4655rja rja, HPa hPa) {
        C7471uYa.b(_aVar, "operations");
        C7471uYa.b(h2, "view");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(_u, "featureOperations");
        C7471uYa.b(rja, "navigator");
        C7471uYa.b(hPa, "scheduler");
        this.h = _aVar;
        this.i = h2;
        this.j = bVar;
        this.k = _u;
        this.l = rja;
        this.m = hPa;
    }

    private void c() {
        if (this.d.c().c()) {
            d();
        } else if (a()) {
            e();
        } else {
            this.i.c();
        }
    }

    private void d() {
        Object b2 = this.d.c().b();
        C7471uYa.a(b2, "products.highTier().get()");
        d((WebProduct) b2);
        if (a()) {
            this.i.a();
        }
    }

    private void e() {
        Object b2 = this.d.e().b();
        C7471uYa.a(b2, "products.midTier().get()");
        d((WebProduct) b2);
        this.i.a();
    }

    private boolean f() {
        return this.k.q().b();
    }

    private void g() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(a, this.d);
        bundle.putSerializable("product_choice_plan", C2455aV.MID_TIER);
        C4655rja rja = this.l;
        C4621nja a2 = C4621nja.a(bundle);
        C7471uYa.a((Object) a2, "NavigationTarget.forProductChoice(bundle)");
        rja.a(a2);
    }

    private void j() {
        this.i.b();
        VPa a2 = this.h.a().a(this.m).a((C6776kQa<? super T>) new Ia<Object>(this), (C6776kQa<? super Throwable>) new Ja<Object>(this));
        C7471uYa.a((Object) a2, "operations.products()\n  … view.showRetryState() })");
        this.c = a2;
    }

    private void k() {
        String str = "Required value was null.";
        if (this.k.u()) {
            AppCompatActivity appCompatActivity = this.e;
            if (appCompatActivity != null) {
                _ka c2 = _ka.c(appCompatActivity.getString(p.plan_conversion_error_message_apple));
                C7471uYa.a((Object) c2, "createWithMessage(requir…ion_error_message_apple))");
                a((B) c2);
                return;
            }
            throw new IllegalArgumentException(str);
        }
        AppCompatActivity appCompatActivity2 = this.e;
        if (appCompatActivity2 != null) {
            _ka c3 = _ka.c(appCompatActivity2.getString(p.plan_conversion_error_message_generic));
            C7471uYa.a((Object) c3, "createWithMessage(requir…n_error_message_generic))");
            a((B) c3);
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public void b(AppCompatActivity appCompatActivity, Bundle bundle) {
        C7471uYa.b(appCompatActivity, "activity");
        this.e = appCompatActivity;
        this.i.a(appCompatActivity, (b) this);
        C3920yea b2 = C3920yea.b(appCompatActivity.getIntent());
        C7471uYa.a((Object) b2, "UpsellContext.from(activity.intent)");
        this.f = b2;
        b();
        a(bundle);
        if (bundle == null) {
            F.a(this.j);
        }
    }

    public void h() {
        C4928GKa<WebProduct> gKa = this.g;
        C7471uYa.a((Object) gKa, "primaryProduct");
        if (gKa.c()) {
            Object b2 = this.g.b();
            C7471uYa.a(b2, "primaryProduct.get()");
            b((WebProduct) b2);
            return;
        }
        j();
    }

    public void i() {
        g();
        AppCompatActivity appCompatActivity = this.e;
        if (appCompatActivity != null) {
            appCompatActivity.finish();
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public void onClose() {
        AppCompatActivity appCompatActivity = this.e;
        if (appCompatActivity != null) {
            appCompatActivity.finish();
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private void f(WebProduct webProduct) {
        this.j.a((J) g(webProduct));
        e(webProduct);
        AppCompatActivity appCompatActivity = this.e;
        if (appCompatActivity != null) {
            appCompatActivity.finish();
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private void a(Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable(a);
            if (parcelable != null) {
                if (parcelable != null) {
                    this.d = (AvailableWebProducts) parcelable;
                    c();
                    return;
                }
                throw new OVa("null cannot be cast to non-null type com.soundcloud.android.payments.AvailableWebProducts");
            }
        }
        j();
    }

    private void e(WebProduct webProduct) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("product_info", webProduct);
        C4655rja rja = this.l;
        C4621nja b2 = C4621nja.b(bundle);
        C7471uYa.a((Object) b2, "NavigationTarget.forWebCheckout(bundle)");
        rja.a(b2);
    }

    private void c(WebProduct webProduct) {
        if (webProduct.a() != null) {
            this.i.a(webProduct.a().c(), webProduct.i());
        } else {
            this.i.a(webProduct.e().c(), webProduct.i());
        }
        C3700b bVar = this.j;
        Waa x = Waa.x();
        C7471uYa.a((Object) x, "UpgradeFunnelEvent.forCo…sionBuyButtonImpression()");
        bVar.a((J) x);
    }

    private void d(WebProduct webProduct) {
        this.g = C4928GKa.c(webProduct);
        if (webProduct.j()) {
            a(webProduct);
        } else {
            c(webProduct);
        }
    }

    private Waa g(WebProduct webProduct) {
        if (webProduct.j()) {
            Waa y = Waa.y();
            C7471uYa.a((Object) y, "UpgradeFunnelEvent.forConversionPromoClick()");
            return y;
        }
        Waa w = Waa.w();
        C7471uYa.a((Object) w, "UpgradeFunnelEvent.forConversionBuyButtonClick()");
        return w;
    }

    private void b() {
        if (f()) {
            this.f = C3920yea.GENERAL;
        }
        int i2 = Ha.a[this.f.ordinal()];
        if (i2 == 1) {
            this.i.a(p.subs_relaunch_ad_free_focus_title, p.subs_relaunch_ad_free_focus_description);
        } else if (i2 == 2) {
            this.i.a(p.subs_relaunch_offline_focus_title, p.subs_relaunch_offline_focus_description);
        } else if (i2 == 3) {
            this.i.a(p.subs_relaunch_high_quality_focus_title, p.subs_relaunch_high_quality_focus_description);
        } else if (i2 == 4) {
            this.i.a(p.subs_relaunch_content_focus_title, p.subs_relaunch_content_focus_description);
        } else if (i2 == 5) {
            this.i.a(p.subs_relaunch_general_focus_title);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected UpsellContext ");
            sb.append(this.f);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public void a(AppCompatActivity appCompatActivity) {
        C7471uYa.b(appCompatActivity, "activity");
        this.c.dispose();
        this.e = null;
    }

    public void a(AppCompatActivity appCompatActivity, Bundle bundle) {
        C7471uYa.b(appCompatActivity, "activity");
        C7471uYa.b(bundle, "bundle");
        bundle.putParcelable(a, this.d);
    }

    private boolean a() {
        return this.d.e().c() && this.d.c().c() && !f();
    }

    public void a(WebProduct webProduct) {
        C7471uYa.b(webProduct, "product");
        H h2 = this.i;
        WebPrice g2 = webProduct.g();
        if (g2 != null) {
            h2.a(g2.c(), webProduct.f(), webProduct.e().c());
            C3700b bVar = this.j;
            Waa z = Waa.z();
            C7471uYa.a((Object) z, "UpgradeFunnelEvent.forConversionPromoImpression()");
            bVar.a((J) z);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private void b(WebProduct webProduct) {
        if (this.k.n()) {
            f(webProduct);
        } else {
            k();
        }
    }

    /* access modifiers changed from: private */
    public void a(AvailableWebProducts availableWebProducts) {
        this.d = availableWebProducts;
        c();
    }

    private void a(B b2) {
        AppCompatActivity appCompatActivity = this.e;
        if (appCompatActivity != null) {
            C5232QGa.a((C0361c) b2, appCompatActivity.getSupportFragmentManager(), "plan_conversion_error_dialog");
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
