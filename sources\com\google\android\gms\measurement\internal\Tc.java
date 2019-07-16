package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;

public final class Tc extends C1095cc {
    @VisibleForTesting
    protected Uc c;
    private volatile Uc d;
    private Uc e;
    private final Map<Activity, Uc> f = new T();
    private Uc g;
    private String h;

    public Tc(Mb mb) {
        super(mb);
    }

    private final Uc d(Activity activity) {
        Preconditions.checkNotNull(activity);
        Uc uc = (Uc) this.f.get(activity);
        if (uc != null) {
            return uc;
        }
        Uc uc2 = new Uc(null, a(activity.getClass().getCanonicalName()), l().t());
        this.f.put(activity, uc2);
        return uc2;
    }

    public final Uc A() {
        w();
        i();
        return this.c;
    }

    public final Uc B() {
        g();
        return this.d;
    }

    public final void a(Activity activity, String str, String str2) {
        if (this.d == null) {
            e().x().a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f.get(activity) == null) {
            e().x().a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = a(activity.getClass().getCanonicalName());
            }
            boolean equals = this.d.b.equals(str2);
            boolean e2 = Vd.e(this.d.a, str);
            if (equals && e2) {
                e().x().a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                e().x().a("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                e().A().a("Setting current screen to name, class", str == null ? "null" : str, str2);
                Uc uc = new Uc(str, str2, l().t());
                this.f.put(activity, uc);
                a(activity, uc, true);
            } else {
                e().x().a("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    public final void b(Activity activity) {
        Uc d2 = d(activity);
        this.e = this.d;
        this.d = null;
        d().a((Runnable) new Vc(this, d2));
    }

    public final void c(Activity activity) {
        a(activity, d(activity), false);
        C1082a n = n();
        n.d().a((Runnable) new C1094cb(n, n.c().elapsedRealtime()));
    }

    public final /* bridge */ /* synthetic */ C1124ib e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ ce f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final /* bridge */ /* synthetic */ C1097d j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ C1114gb k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ Vd l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ C1082a n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ C1174sc o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ C1084ab p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ Yc q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ C1210zd t() {
        return super.t();
    }

    /* access modifiers changed from: protected */
    public final boolean y() {
        return false;
    }

    public final void b(Activity activity, Bundle bundle) {
        if (bundle != null) {
            Uc uc = (Uc) this.f.get(activity);
            if (uc != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("id", uc.c);
                bundle2.putString("name", uc.a);
                bundle2.putString("referrer_name", uc.b);
                bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
            }
        }
    }

    public final /* bridge */ /* synthetic */ Gb d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ Clock c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ C1168rb b() {
        return super.b();
    }

    private final void a(Activity activity, Uc uc, boolean z) {
        Uc uc2 = this.d == null ? this.e : this.d;
        if (uc.b == null) {
            uc = new Uc(uc.a, a(activity.getClass().getCanonicalName()), uc.c);
        }
        this.e = this.d;
        this.d = uc;
        d().a((Runnable) new Wc(this, z, uc2, uc));
    }

    /* access modifiers changed from: private */
    public final void a(Uc uc, boolean z) {
        n().a(c().elapsedRealtime());
        if (t().a(uc.d, z)) {
            uc.d = false;
        }
    }

    public static void a(Uc uc, Bundle bundle, boolean z) {
        String str = "_si";
        String str2 = "_sn";
        String str3 = "_sc";
        if (bundle == null || uc == null || (bundle.containsKey(str3) && !z)) {
            if (bundle != null && uc == null && z) {
                bundle.remove(str2);
                bundle.remove(str3);
                bundle.remove(str);
            }
            return;
        }
        String str4 = uc.a;
        if (str4 != null) {
            bundle.putString(str2, str4);
        } else {
            bundle.remove(str2);
        }
        bundle.putString(str3, uc.b);
        bundle.putLong(str, uc.c);
    }

    public final void a(String str, Uc uc) {
        i();
        synchronized (this) {
            if (this.h == null || this.h.equals(str) || uc != null) {
                this.h = str;
                this.g = uc;
            }
        }
    }

    @VisibleForTesting
    private static String a(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    public final void a(Activity activity, Bundle bundle) {
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("com.google.app_measurement.screen_service");
            if (bundle2 != null) {
                this.f.put(activity, new Uc(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
            }
        }
    }

    public final void a(Activity activity) {
        this.f.remove(activity);
    }

    public final /* bridge */ /* synthetic */ be a() {
        return super.a();
    }
}
