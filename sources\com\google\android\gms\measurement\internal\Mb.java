package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.C1047ua;
import com.google.android.gms.internal.measurement.zf;
import com.google.android.gms.internal.measurement.zzx;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

public class Mb implements C1135kc {
    private static volatile Mb a;
    private long A;
    private volatile Boolean B;
    @VisibleForTesting
    private Boolean C;
    @VisibleForTesting
    private Boolean D;
    private int E;
    private AtomicInteger F = new AtomicInteger(0);
    private final long G;
    private final Context b;
    private final String c;
    private final String d;
    private final String e;
    private final boolean f;
    private final be g;
    private final ce h;
    private final C1168rb i;
    private final C1124ib j;
    private final Gb k;
    private final C1210zd l;
    private final Vd m;
    private final C1114gb n;
    private final Clock o;
    private final Tc p;
    private final C1174sc q;
    private final C1082a r;
    private final Oc s;
    private C1104eb t;
    private Yc u;
    private C1097d v;
    private C1084ab w;
    private C1198xb x;
    private boolean y = false;
    private Boolean z;

    private Mb(C1160pc pcVar) {
        boolean z2 = false;
        Preconditions.checkNotNull(pcVar);
        this.g = new be(pcVar.a);
        C1127j.a(this.g);
        this.b = pcVar.a;
        this.c = pcVar.b;
        this.d = pcVar.c;
        this.e = pcVar.d;
        this.f = pcVar.h;
        this.B = pcVar.e;
        zzx zzx = pcVar.g;
        if (zzx != null) {
            Bundle bundle = zzx.g;
            if (bundle != null) {
                Object obj = bundle.get("measurementEnabled");
                if (obj instanceof Boolean) {
                    this.C = (Boolean) obj;
                }
                Object obj2 = zzx.g.get("measurementDeactivated");
                if (obj2 instanceof Boolean) {
                    this.D = (Boolean) obj2;
                }
            }
        }
        C1047ua.a(this.b);
        this.o = DefaultClock.getInstance();
        this.G = this.o.currentTimeMillis();
        this.h = new ce(this);
        C1168rb rbVar = new C1168rb(this);
        rbVar.m();
        this.i = rbVar;
        C1124ib ibVar = new C1124ib(this);
        ibVar.m();
        this.j = ibVar;
        Vd vd = new Vd(this);
        vd.m();
        this.m = vd;
        C1114gb gbVar = new C1114gb(this);
        gbVar.m();
        this.n = gbVar;
        this.r = new C1082a(this);
        Tc tc = new Tc(this);
        tc.u();
        this.p = tc;
        C1174sc scVar = new C1174sc(this);
        scVar.u();
        this.q = scVar;
        C1210zd zdVar = new C1210zd(this);
        zdVar.u();
        this.l = zdVar;
        Oc oc = new Oc(this);
        oc.m();
        this.s = oc;
        Gb gb = new Gb(this);
        gb.m();
        this.k = gb;
        zzx zzx2 = pcVar.g;
        if (!(zzx2 == null || zzx2.b == 0)) {
            z2 = true;
        }
        boolean z3 = !z2;
        be beVar = this.g;
        if (this.b.getApplicationContext() instanceof Application) {
            C1174sc x2 = x();
            if (x2.getContext().getApplicationContext() instanceof Application) {
                Application application = (Application) x2.getContext().getApplicationContext();
                if (x2.c == null) {
                    x2.c = new Mc(x2, null);
                }
                if (z3) {
                    application.unregisterActivityLifecycleCallbacks(x2.c);
                    application.registerActivityLifecycleCallbacks(x2.c);
                    x2.e().A().a("Registered activity lifecycle callback");
                }
            }
        } else {
            e().v().a("Application context is not an Application");
        }
        this.k.a((Runnable) new Ob(this, pcVar));
    }

    private final void G() {
        if (!this.y) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    private final Oc H() {
        b((C1120hc) this.s);
        return this.s;
    }

    /* access modifiers changed from: private */
    public final void a(C1160pc pcVar) {
        String str;
        C1134kb kbVar;
        d().i();
        ce.n();
        C1097d dVar = new C1097d(this);
        dVar.m();
        this.v = dVar;
        C1084ab abVar = new C1084ab(this, pcVar.f);
        abVar.u();
        this.w = abVar;
        C1104eb ebVar = new C1104eb(this);
        ebVar.u();
        this.t = ebVar;
        Yc yc = new Yc(this);
        yc.u();
        this.u = yc;
        this.m.p();
        this.i.p();
        this.x = new C1198xb(this);
        this.w.x();
        e().y().a("App measurement is starting up, version", Long.valueOf(this.h.m()));
        be beVar = this.g;
        e().y().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        be beVar2 = this.g;
        String B2 = abVar.B();
        if (TextUtils.isEmpty(this.c)) {
            if (F().f(B2)) {
                kbVar = e().y();
                str = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                kbVar = e().y();
                String str2 = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ";
                String valueOf = String.valueOf(B2);
                str = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
            }
            kbVar.a(str);
        }
        e().z().a("Debug-level message logging enabled");
        if (this.E != this.F.get()) {
            e().s().a("Not all components initialized", Integer.valueOf(this.E), Integer.valueOf(this.F.get()));
        }
        this.y = true;
    }

    private static void b(C1120hc hcVar) {
        if (hcVar == null) {
            throw new IllegalStateException("Component not created");
        } else if (!hcVar.n()) {
            String valueOf = String.valueOf(hcVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final Tc A() {
        b((C1095cc) this.p);
        return this.p;
    }

    public final C1104eb B() {
        b((C1095cc) this.t);
        return this.t;
    }

    public final C1210zd C() {
        b((C1095cc) this.l);
        return this.l;
    }

    public final C1097d D() {
        b((C1120hc) this.v);
        return this.v;
    }

    public final C1114gb E() {
        a((C1125ic) this.n);
        return this.n;
    }

    public final Vd F() {
        a((C1125ic) this.m);
        return this.m;
    }

    public final Clock c() {
        return this.o;
    }

    public final Gb d() {
        b((C1120hc) this.k);
        return this.k;
    }

    public final C1124ib e() {
        b((C1120hc) this.j);
        return this.j;
    }

    /* access modifiers changed from: protected */
    public final void f() {
        d().i();
        if (g().f.a() == 0) {
            g().f.a(this.o.currentTimeMillis());
        }
        if (Long.valueOf(g().k.a()).longValue() == 0) {
            e().A().a("Persisting first open", Long.valueOf(this.G));
            g().k.a(this.G);
        }
        if (t()) {
            be beVar = this.g;
            if (!TextUtils.isEmpty(y().A()) || !TextUtils.isEmpty(y().C())) {
                F();
                if (Vd.a(y().A(), g().s(), y().C(), g().t())) {
                    e().y().a("Rechecking which service to use due to a GMP App Id change");
                    g().v();
                    B().A();
                    this.u.A();
                    this.u.F();
                    g().k.a(this.G);
                    g().m.a(null);
                }
                g().c(y().A());
                g().d(y().C());
            }
            x().a(g().m.a());
            be beVar2 = this.g;
            if (!TextUtils.isEmpty(y().A()) || !TextUtils.isEmpty(y().C())) {
                boolean b2 = b();
                if (!g().z() && !this.h.p()) {
                    g().d(!b2);
                }
                if (b2) {
                    x().K();
                }
                z().a(new AtomicReference<>());
            }
        } else if (b()) {
            if (!F().d("android.permission.INTERNET")) {
                e().s().a("App is missing INTERNET permission");
            }
            if (!F().d("android.permission.ACCESS_NETWORK_STATE")) {
                e().s().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            be beVar3 = this.g;
            if (!Wrappers.packageManager(this.b).isCallerInstantApp() && !this.h.w()) {
                if (!Cb.a(this.b)) {
                    e().s().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!Vd.a(this.b, false)) {
                    e().s().a("AppMeasurementService not registered/enabled");
                }
            }
            e().s().a("Uploading is not possible. App measurement disabled");
        }
        g().u.a(this.h.a(C1127j.Aa));
        g().v.a(this.h.a(C1127j.Ba));
    }

    public final C1168rb g() {
        a((C1125ic) this.i);
        return this.i;
    }

    public final Context getContext() {
        return this.b;
    }

    public final ce h() {
        return this.h;
    }

    public final C1124ib i() {
        C1124ib ibVar = this.j;
        if (ibVar == null || !ibVar.n()) {
            return null;
        }
        return this.j;
    }

    public final C1198xb j() {
        return this.x;
    }

    /* access modifiers changed from: 0000 */
    public final Gb k() {
        return this.k;
    }

    public final boolean l() {
        return TextUtils.isEmpty(this.c);
    }

    public final String m() {
        return this.c;
    }

    public final String n() {
        return this.d;
    }

    public final String o() {
        return this.e;
    }

    public final boolean p() {
        return this.f;
    }

    public final boolean q() {
        return this.B != null && this.B.booleanValue();
    }

    /* access modifiers changed from: 0000 */
    public final long r() {
        Long valueOf = Long.valueOf(g().k.a());
        if (valueOf.longValue() == 0) {
            return this.G;
        }
        return Math.min(this.G, valueOf.longValue());
    }

    /* access modifiers changed from: 0000 */
    public final void s() {
        this.F.incrementAndGet();
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        G();
        d().i();
        Boolean bool = this.z;
        if (bool == null || this.A == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.o.elapsedRealtime() - this.A) > 1000)) {
            this.A = this.o.elapsedRealtime();
            be beVar = this.g;
            boolean z2 = true;
            this.z = Boolean.valueOf(F().d("android.permission.INTERNET") && F().d("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.b).isCallerInstantApp() || this.h.w() || (Cb.a(this.b) && Vd.a(this.b, false))));
            if (this.z.booleanValue()) {
                if (!F().d(y().A(), y().C()) && TextUtils.isEmpty(y().C())) {
                    z2 = false;
                }
                this.z = Boolean.valueOf(z2);
            }
        }
        return this.z.booleanValue();
    }

    /* access modifiers changed from: 0000 */
    public final void u() {
        be beVar = this.g;
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* access modifiers changed from: 0000 */
    public final void v() {
        be beVar = this.g;
    }

    public final C1082a w() {
        C1082a aVar = this.r;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final C1174sc x() {
        b((C1095cc) this.q);
        return this.q;
    }

    public final C1084ab y() {
        b((C1095cc) this.w);
        return this.w;
    }

    public final Yc z() {
        b((C1095cc) this.u);
        return this.u;
    }

    private static void b(C1095cc ccVar) {
        if (ccVar == null) {
            throw new IllegalStateException("Component not created");
        } else if (!ccVar.v()) {
            String valueOf = String.valueOf(ccVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final boolean b() {
        boolean z2;
        d().i();
        G();
        if (this.h.a(C1127j.ra)) {
            if (this.h.p()) {
                return false;
            }
            Boolean bool = this.D;
            if (bool != null && bool.booleanValue()) {
                return false;
            }
            Boolean w2 = g().w();
            if (w2 != null) {
                return w2.booleanValue();
            }
            Boolean q2 = this.h.q();
            if (q2 != null) {
                return q2.booleanValue();
            }
            Boolean bool2 = this.C;
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            if (GoogleServices.isMeasurementExplicitlyDisabled()) {
                return false;
            }
            if (!this.h.a(C1127j.ma) || this.B == null) {
                return true;
            }
            return this.B.booleanValue();
        } else if (this.h.p()) {
            return false;
        } else {
            Boolean q3 = this.h.q();
            if (q3 != null) {
                z2 = q3.booleanValue();
            } else {
                z2 = !GoogleServices.isMeasurementExplicitlyDisabled();
                if (z2 && this.B != null && ((Boolean) C1127j.ma.a(null)).booleanValue()) {
                    z2 = this.B.booleanValue();
                }
            }
            return g().c(z2);
        }
    }

    public final be a() {
        return this.g;
    }

    @VisibleForTesting
    public static Mb a(Context context, String str, String str2, Bundle bundle) {
        zzx zzx = new zzx(0, 0, true, null, null, null, bundle);
        return a(context, zzx);
    }

    public static Mb a(Context context, zzx zzx) {
        if (zzx != null && (zzx.e == null || zzx.f == null)) {
            zzx zzx2 = new zzx(zzx.a, zzx.b, zzx.c, zzx.d, null, null, zzx.g);
            zzx = zzx2;
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (a == null) {
            synchronized (Mb.class) {
                if (a == null) {
                    a = new Mb(new C1160pc(context, zzx));
                }
            }
        } else if (zzx != null) {
            Bundle bundle = zzx.g;
            if (bundle != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
                a.a(zzx.g.getBoolean("dataCollectionDefaultEnabled"));
            }
        }
        return a;
    }

    private static void a(C1125ic icVar) {
        if (icVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean z2) {
        this.B = Boolean.valueOf(z2);
    }

    /* access modifiers changed from: 0000 */
    public final void a(C1120hc hcVar) {
        this.E++;
    }

    /* access modifiers changed from: 0000 */
    public final void a(C1095cc ccVar) {
        this.E++;
    }

    public final void a(zf zfVar) {
        d().i();
        b((C1120hc) H());
        String B2 = y().B();
        Pair a2 = g().a(B2);
        String str = "";
        if (!this.h.r().booleanValue() || ((Boolean) a2.second).booleanValue()) {
            e().z().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            F().a(zfVar, str);
        } else if (!H().s()) {
            e().v().a("Network is not available for Deferred Deep Link request. Skipping");
            F().a(zfVar, str);
        } else {
            URL a3 = F().a(y().f().m(), B2, (String) a2.first);
            Oc H = H();
            Lb lb = new Lb(this, zfVar);
            H.i();
            H.o();
            Preconditions.checkNotNull(a3);
            Preconditions.checkNotNull(lb);
            Gb d2 = H.d();
            Qc qc = new Qc(H, B2, a3, null, null, lb);
            d2.b((Runnable) qc);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0081 A[Catch:{ JSONException -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0096 A[Catch:{ JSONException -> 0x00b2 }] */
    public final /* synthetic */ void a(zf zfVar, String str, int i2, Throwable th, byte[] bArr, Map map) {
        String str2 = "gclid";
        String str3 = Constants.DEEPLINK;
        boolean z2 = true;
        String str4 = "";
        if (!((i2 == 200 || i2 == 204 || i2 == 304) && th == null)) {
            e().v().a("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th);
            F().a(zfVar, str4);
        } else if (bArr.length == 0) {
            F().a(zfVar, str4);
        } else {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString(str3, str4);
                String optString2 = jSONObject.optString(str2, str4);
                Vd F2 = F();
                F2.g();
                if (!TextUtils.isEmpty(optString)) {
                    List queryIntentActivities = F2.getContext().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        if (z2) {
                            e().v().a("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                            F().a(zfVar, str4);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString(str3, optString);
                        bundle.putString(str2, optString2);
                        this.q.b("auto", "_cmp", bundle);
                        F().a(zfVar, optString);
                        return;
                    }
                }
                z2 = false;
                if (z2) {
                }
            } catch (JSONException e2) {
                e().s().a("Failed to parse the Deferred Deep Link response. exception", e2);
                F().a(zfVar, str4);
            }
        }
    }
}
