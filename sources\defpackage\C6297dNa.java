package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.soundcloud.flippernative.BuildConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: dNa reason: default package and case insensitive filesystem */
/* compiled from: Onboarding */
class C6297dNa extends C5531_Ma<Boolean> {
    private final C4839DOa g = new C7737yOa();
    private PackageManager h;
    private String i;
    private PackageInfo j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private final Future<Map<String, C5633bNa>> p;
    private final Collection<C5531_Ma> q;

    public C6297dNa(Future<Map<String, C5633bNa>> future, Collection<C5531_Ma> collection) {
        this.p = future;
        this.q = collection;
    }

    private C6503gPa M() {
        try {
            C6299dPa b = C6299dPa.b();
            b.a(this, this.e, this.g, this.k, this.l, L(), C7598wNa.a(e()));
            b.c();
            return C6299dPa.b().a();
        } catch (Exception e) {
            C5328TMa.e().e("Fabric", "Error dealing with settings", e);
            return null;
        }
    }

    private boolean b(String str, QOa qOa, Collection<C5633bNa> collection) {
        return new UOa(this, L(), qOa.c, this.g).a(a(_Oa.a(e(), str), collection));
    }

    private boolean c(String str, QOa qOa, Collection<C5633bNa> collection) {
        return a(qOa, _Oa.a(e(), str), collection);
    }

    /* access modifiers changed from: protected */
    public boolean K() {
        try {
            this.m = u().f();
            this.h = e().getPackageManager();
            this.i = e().getPackageName();
            this.j = this.h.getPackageInfo(this.i, 0);
            this.k = Integer.toString(this.j.versionCode);
            this.l = this.j.versionName == null ? "0.0" : this.j.versionName;
            this.n = this.h.getApplicationLabel(e().getApplicationInfo()).toString();
            this.o = Integer.toString(e().getApplicationInfo().targetSdkVersion);
            return true;
        } catch (NameNotFoundException e) {
            C5328TMa.e().e("Fabric", "Failed init", e);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public String L() {
        return C7391tNa.b(e(), "com.crashlytics.ApiEndpoint");
    }

    /* access modifiers changed from: 0000 */
    public Map<String, C5633bNa> a(Map<String, C5633bNa> map, Collection<C5531_Ma> collection) {
        for (C5531_Ma _ma : collection) {
            if (!map.containsKey(_ma.v())) {
                map.put(_ma.v(), new C5633bNa(_ma.v(), _ma.x(), "binary"));
            }
        }
        return map;
    }

    public String v() {
        return "io.fabric.sdk.android:fabric";
    }

    public String x() {
        return "1.4.8.32";
    }

    /* access modifiers changed from: protected */
    public Boolean d() {
        boolean z;
        Map map;
        String c = C7391tNa.c(e());
        C6503gPa M = M();
        if (M != null) {
            try {
                if (this.p != null) {
                    map = (Map) this.p.get();
                } else {
                    map = new HashMap();
                }
                a(map, this.q);
                z = a(c, M.a, map.values());
            } catch (Exception e) {
                C5328TMa.e().e("Fabric", "Error performing auto configuration.", e);
            }
            return Boolean.valueOf(z);
        }
        z = false;
        return Boolean.valueOf(z);
    }

    private boolean a(String str, QOa qOa, Collection<C5633bNa> collection) {
        String str2 = "Fabric";
        if (!"new".equals(qOa.b)) {
            if ("configured".equals(qOa.b)) {
                return C6299dPa.b().d();
            }
            if (qOa.f) {
                C5328TMa.e().d(str2, "Server says an update is required - forcing a full App update.");
                c(str, qOa, collection);
            }
            return true;
        } else if (b(str, qOa, collection)) {
            return C6299dPa.b().d();
        } else {
            C5328TMa.e().e(str2, "Failed to create app with Crashlytics service.", null);
            return false;
        }
    }

    private boolean a(QOa qOa, _Oa _oa, Collection<C5633bNa> collection) {
        return new C6843lPa(this, L(), qOa.c, this.g).a(a(_oa, collection));
    }

    private POa a(_Oa _oa, Collection<C5633bNa> collection) {
        Context e = e();
        POa pOa = new POa(new C7184qNa().d(e), u().c(), this.l, this.k, C7391tNa.a(C7391tNa.n(e)), this.n, C7667xNa.a(this.m).getId(), this.o, BuildConfig.VERSION_NAME, _oa, collection);
        return pOa;
    }
}
