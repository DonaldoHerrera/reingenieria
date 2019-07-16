package com.soundcloud.android.payments;

import android.app.Activity;
import com.soundcloud.android.payments.C4277z.a;
import java.util.concurrent.TimeUnit;

/* compiled from: NativePaymentOperations */
class Z {
    private final HPa a;
    private final efa b;
    private final C4591jla c;
    /* access modifiers changed from: private */
    public final Ma d;
    private final C7118pQa<C4657rla, IPa<Ea>> e = new Y(this);

    Z(HPa hPa, efa efa, C4591jla jla, Ma ma) {
        this.a = hPa;
        this.b = efa;
        this.c = jla;
        this.d = ma;
    }

    private IPa<C4277z> d() {
        return this.b.a(hfa.b(C2226PO.NATIVE_PRODUCTS.a()).c().b(), C4277z.class).b(this.a);
    }

    private IPa<Ea> e() {
        SDb.a("ScBilling").a("About to send getStatus request to API mobile with checkout token: %s", this.d.b());
        return this.b.a(hfa.b(C2226PO.CHECKOUT_URN.a(this.d.b())).c().b(), B.class).b(this.a).e(B.a);
    }

    private IPa<a> f() {
        SDb.a("ScBilling").a("About to execute fetch native products from mobile API", new Object[0]);
        return d().e(C4277z.a).c((C6776kQa<? super T>) C4256o.a);
    }

    private IPa<Ea> g() {
        SDb.a("ScBilling").a("About to poll status every 4 seconds -> get status from API mobile will follow", new Object[0]);
        return APa.b(2, TimeUnit.SECONDS, this.a).d(4).c((C7118pQa<? super T, ? extends EPa<? extends R>>) new C4244i<Object,Object>(this)).a((C7256rQa<? super T>) r.a).b(Ea.VERIFY_TIMEOUT);
    }

    /* access modifiers changed from: 0000 */
    public IPa<Da> b() {
        SDb.a("ScBilling").a("About to check available products", new Object[0]);
        return f().a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C4254n<Object,Object>(this)).a(RPa.a());
    }

    /* access modifiers changed from: 0000 */
    public IPa<Ea> c() {
        SDb.a("ScBilling").a("About to check Google Play status", new Object[0]);
        return this.c.b().c((C6776kQa<? super T>) C4263s.a).b(this.a).a(this.e).a(RPa.a());
    }

    /* access modifiers changed from: 0000 */
    public APa<C> a(Activity activity) {
        return this.c.a(activity);
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        SDb.a("ScBilling").a("Connection closed", new Object[0]);
        this.c.a();
    }

    public /* synthetic */ MPa b(a aVar) throws Exception {
        if (aVar.b()) {
            return IPa.a(Da.a());
        }
        return c(aVar.a).e(C4232c.a);
    }

    public /* synthetic */ void a(String str, String str2) throws Exception {
        String str3 = "ScBilling";
        SDb.a(str3).a("Received successful response for start checkout from API mobile", new Object[0]);
        SDb.a(str3).a("About to start purchase with Google play with id: %s and token: %s", str, str2);
        this.d.a(str2);
        this.c.a(str, str2);
    }

    public /* synthetic */ void c(Ea ea) throws Exception {
        this.d.a();
    }

    private IPa<Aa> c(String str) {
        SDb.a("ScBilling").a("About to query product with id: %s", str);
        return this.c.a(str).c((C6776kQa<? super T>) C4265t.a).b(this.a);
    }

    /* access modifiers changed from: 0000 */
    public IPa<String> b(String str) {
        SDb.a("ScBilling").a("About to send purchase request to API mobile with start checkout for id: %s", str);
        return this.b.a(hfa.c(C2226PO.CHECKOUT.a()).c().a((Object) new La(str)).b(), A.class).b(this.a).e(C4242h.a).c((C6776kQa<? super T>) new C4260q<Object>(this, str)).a(RPa.a());
    }

    /* access modifiers changed from: 0000 */
    public IPa<Ea> a(C4631ola ola) {
        SDb.a("ScBilling").a("About to try to verify purchase status with API mobile, update will follow", new Object[0]);
        return b(ola).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C4250l<Object,Object>(this)).c((C6776kQa<? super T>) new C4248k<Object>(this)).a((C6776kQa<? super Throwable>) new C4240g<Object>(this)).a(RPa.a());
    }

    public /* synthetic */ EPa a(Long l) throws Exception {
        return e().j();
    }

    static /* synthetic */ boolean a(Ea ea) throws Exception {
        return !ea.a();
    }

    public /* synthetic */ MPa b(Ea ea) throws Exception {
        if (ea.a()) {
            return g();
        }
        return IPa.a(Ea.UPDATE_FAIL);
    }

    public IPa<jfa> a(String str) {
        SDb.a("ScBilling").a("About to cancel because of checkout failure: %s update request will follow", str);
        return this.b.b(a(Pa.a(str))).c((C6776kQa<? super T>) new C4258p<Object>(this)).a((C6776kQa<? super Throwable>) new C4246j<Object>(this)).b(this.a);
    }

    public /* synthetic */ void b(Throwable th) throws Exception {
        this.d.a();
    }

    private IPa<Ea> b(C4631ola ola) {
        SDb.a("ScBilling").a("About to send update request to API mobile with successful payload %s", ola);
        return this.b.b(a(Pa.a(ola))).b(this.a).e(C4252m.a);
    }

    public /* synthetic */ void a(jfa jfa) throws Exception {
        this.d.a();
    }

    public /* synthetic */ void a(Throwable th) throws Exception {
        this.d.a();
    }

    private hfa a(Pa pa) {
        SDb.a("ScBilling").a("About to send update request with %s state to API mobile", pa.a());
        return hfa.c(C2226PO.CHECKOUT_URN.a(this.d.b())).c().a((Object) pa).b();
    }

    static /* synthetic */ Ea b(jfa jfa) throws Exception {
        return jfa.g() ? Ea.PENDING : Ea.UPDATE_FAIL;
    }
}
