package defpackage;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: mM reason: default package and case insensitive filesystem */
/* compiled from: PrivacySettingsOperations.kt */
public class C3129mM {
    /* access modifiers changed from: private */
    public final C3177oM a;
    private final HPa b;
    private final efa c;
    private final C2248QR d;

    public C3129mM(C3177oM oMVar, HPa hPa, efa efa, C2248QR qr) {
        C7471uYa.b(oMVar, "privacySettingsStorage");
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(efa, "apiClientRx");
        C7471uYa.b(qr, "backgroundJobManager");
        this.a = oMVar;
        this.b = hPa;
        this.c = efa;
        this.d = qr;
    }

    private C6979nPa f() {
        C6979nPa b2 = this.c.a(hfa.d(C2226PO.PRIVACY_SETTINGS.a()).c().a((Object) c()).b()).a((C6368eQa) new C2996fM(this)).b(this.b);
        C7471uYa.a((Object) b2, "apiClientRx.ignoreResult…  .subscribeOn(scheduler)");
        return b2;
    }

    /* access modifiers changed from: private */
    public void g() {
        C2248QR.a(this.d, C2286SR.CONFIGURATION_SYNC, (Bundle) null, 2, (Object) null);
    }

    public C2155LT c() {
        return new C2155LT(this.a.b(), this.a.c(), this.a.d());
    }

    public C6979nPa d() {
        if (this.a.e()) {
            return f();
        }
        C6979nPa e = C6979nPa.e();
        C7471uYa.a((Object) e, "Completable.complete()");
        return e;
    }

    public IPa<Boolean> e() {
        IPa<Boolean> c2 = IPa.c((Callable<? extends T>) new C3110lM<Object>(this));
        C7471uYa.a((Object) c2, "Single.fromCallable { pr…getedAdvertisingOptIn() }");
        return c2;
    }

    public void a(C2155LT lt) {
        C7471uYa.b(lt, "privacySettings");
        this.a.a(lt.a());
        this.a.c(lt.c());
        this.a.b(lt.b());
    }

    public IPa<Boolean> b() {
        IPa<Boolean> c2 = IPa.c((Callable<? extends T>) new C2977eM<Object>(this));
        C7471uYa.a((Object) c2, "Single.fromCallable { pr…asCommunicationsOptIn() }");
        return c2;
    }

    public C6979nPa c(boolean z) {
        C6979nPa a2 = C6979nPa.b((C6368eQa) new C3053iM(this, this, z)).a((C6368eQa) new C3091kM(this));
        C7471uYa.a((Object) a2, "Completable.fromAction {…cheduleUpdate()\n        }");
        return a2;
    }

    public C6979nPa b(boolean z) {
        C6979nPa a2 = C6979nPa.b((C6368eQa) new C3034hM(this, this, z)).a((C6368eQa) new C3091kM(this));
        C7471uYa.a((Object) a2, "Completable.fromAction {…cheduleUpdate()\n        }");
        return a2;
    }

    public IPa<Boolean> a() {
        IPa<Boolean> c2 = IPa.c((Callable<? extends T>) new C2958dM<Object>(this));
        C7471uYa.a((Object) c2, "Single.fromCallable { pr…age.hasAnalyticsOptIn() }");
        return c2;
    }

    public C6979nPa a(boolean z) {
        C6979nPa a2 = C6979nPa.b((C6368eQa) new C3015gM(this, this, z)).a((C6368eQa) new C3091kM(this));
        C7471uYa.a((Object) a2, "Completable.fromAction {…cheduleUpdate()\n        }");
        return a2;
    }
}
