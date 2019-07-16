package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.InstantApps;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.ab reason: case insensitive filesystem */
public final class C1084ab extends C1095cc {
    private String c;
    private String d;
    private int e;
    private String f;
    private String g;
    private long h;
    private long i;
    private long j;
    private List<String> k;
    private int l;
    private String m;
    private String n;

    C1084ab(Mb mb, long j2) {
        super(mb);
        this.j = j2;
    }

    @VisibleForTesting
    private final String G() {
        try {
            Class loadClass = getContext().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(null, new Object[]{getContext()});
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                } catch (Exception unused) {
                    e().x().a("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                e().w().a("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public final String A() {
        w();
        return this.m;
    }

    /* access modifiers changed from: 0000 */
    public final String B() {
        w();
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public final String C() {
        w();
        return this.n;
    }

    /* access modifiers changed from: 0000 */
    public final List<String> D() {
        return this.k;
    }

    /* access modifiers changed from: 0000 */
    public final int E() {
        w();
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public final int F() {
        w();
        return this.l;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0107  */
    public final zzn a(String str) {
        String str2;
        Boolean bool;
        i();
        g();
        String B = B();
        String A = A();
        w();
        String str3 = this.d;
        long E = (long) E();
        w();
        String str4 = this.f;
        long m2 = f().m();
        w();
        i();
        if (this.h == 0) {
            this.h = this.a.F().a(getContext(), getContext().getPackageName());
        }
        long j2 = this.h;
        boolean b = this.a.b();
        boolean z = !b().y;
        i();
        g();
        if (!this.a.b()) {
            str2 = null;
        } else {
            str2 = G();
        }
        w();
        boolean z2 = b;
        long j3 = this.i;
        long r = this.a.r();
        int F = F();
        boolean booleanValue = f().r().booleanValue();
        ce f2 = f();
        f2.g();
        Boolean b2 = f2.b("google_analytics_ssaid_collection_enabled");
        boolean booleanValue2 = Boolean.valueOf(b2 == null || b2.booleanValue()).booleanValue();
        boolean y = b().y();
        String C = C();
        long j4 = j3;
        if (f().e(B(), C1127j.pa)) {
            Boolean b3 = f().b("google_analytics_default_allow_ad_personalization_signals");
            if (b3 != null) {
                bool = Boolean.valueOf(!b3.booleanValue());
                zzn zzn = new zzn(B, A, str3, E, str4, m2, j2, str, z2, z, str2, j4, r, F, booleanValue, booleanValue2, y, C, bool, this.j, !f().e(B(), C1127j.Da) ? this.k : null);
                return zzn;
            }
        }
        bool = null;
        zzn zzn2 = new zzn(B, A, str3, E, str4, m2, j2, str, z2, z, str2, j4, r, F, booleanValue, booleanValue2, y, C, bool, this.j, !f().e(B(), C1127j.Da) ? this.k : null);
        return zzn2;
    }

    public final /* bridge */ /* synthetic */ C1168rb b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ Clock c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ Gb d() {
        return super.d();
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

    /* access modifiers changed from: protected */
    public final boolean y() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x019d A[Catch:{ IllegalStateException -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x019e A[Catch:{ IllegalStateException -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01a7 A[Catch:{ IllegalStateException -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01ba A[Catch:{ IllegalStateException -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x023a  */
    public final void z() {
        String str;
        boolean z;
        boolean z2;
        String googleAppId;
        String str2;
        String packageName = getContext().getPackageName();
        PackageManager packageManager = getContext().getPackageManager();
        String str3 = "Unknown";
        String str4 = "";
        String str5 = "unknown";
        int i2 = Integer.MIN_VALUE;
        if (packageManager == null) {
            e().s().a("PackageManager is null, app identity information might be inaccurate. appId", C1124ib.a(packageName));
        } else {
            try {
                str5 = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                e().s().a("Error retrieving app installer package name. appId", C1124ib.a(packageName));
            }
            if (str5 == null) {
                str5 = "manual_install";
            } else if ("com.android.vending".equals(str5)) {
                str5 = str4;
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(getContext().getPackageName(), 0);
                if (packageInfo != null) {
                    CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                    str = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : str3;
                    try {
                        str3 = packageInfo.versionName;
                        i2 = packageInfo.versionCode;
                    } catch (NameNotFoundException unused2) {
                        str2 = str3;
                        str3 = str;
                    }
                    this.c = packageName;
                    this.f = str5;
                    this.d = str3;
                    this.e = i2;
                    this.g = str;
                    this.h = 0;
                    a();
                    Status initialize = GoogleServices.initialize(getContext());
                    boolean z3 = true;
                    String str6 = "am";
                    z = (initialize == null && initialize.isSuccess()) | (TextUtils.isEmpty(this.a.m()) && str6.equals(this.a.n()));
                    if (!z) {
                        if (initialize == null) {
                            e().s().a("GoogleService failed to initialize (no status)");
                        } else {
                            e().s().a("GoogleService failed to initialize, status", Integer.valueOf(initialize.getStatusCode()), initialize.getStatusMessage());
                        }
                    }
                    if (z) {
                        Boolean q = f().q();
                        if (f().p()) {
                            if (this.a.l()) {
                                e().y().a("Collection disabled with firebase_analytics_collection_deactivated=1");
                            }
                        } else if (q == null || q.booleanValue()) {
                            if (q != null || !GoogleServices.isMeasurementExplicitlyDisabled()) {
                                e().A().a("Collection enabled");
                                z2 = true;
                                this.m = str4;
                                this.n = str4;
                                this.i = 0;
                                a();
                                if (!TextUtils.isEmpty(this.a.m()) && str6.equals(this.a.n())) {
                                    this.n = this.a.m();
                                }
                                googleAppId = GoogleServices.getGoogleAppId();
                                if (TextUtils.isEmpty(googleAppId)) {
                                    str4 = googleAppId;
                                }
                                this.m = str4;
                                if (!TextUtils.isEmpty(googleAppId)) {
                                    this.n = new StringResourceValueReader(getContext()).getString("admob_app_id");
                                }
                                if (z2) {
                                    e().A().a("App package, google app id", this.c, this.m);
                                }
                                this.k = null;
                                if (f().e(this.c, C1127j.Da)) {
                                    a();
                                    List<String> c2 = f().c("analytics.safelisted_events");
                                    if (c2 != null) {
                                        if (c2.size() != 0) {
                                            Iterator it = c2.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    break;
                                                }
                                                if (!l().c("safelisted event", (String) it.next())) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            e().v().a("Safelisted event list cannot be empty. Ignoring");
                                        }
                                        z3 = false;
                                    }
                                    if (z3) {
                                        this.k = c2;
                                    }
                                }
                                if (VERSION.SDK_INT >= 16) {
                                    this.l = 0;
                                    return;
                                } else if (packageManager != null) {
                                    this.l = InstantApps.isInstantApp(getContext()) ? 1 : 0;
                                    return;
                                } else {
                                    this.l = 0;
                                    return;
                                }
                            } else {
                                e().y().a("Collection disabled with google_app_measurement_enable=0");
                            }
                        } else if (this.a.l()) {
                            e().y().a("Collection disabled with firebase_analytics_collection_enabled=0");
                        }
                    }
                    z2 = false;
                    this.m = str4;
                    this.n = str4;
                    this.i = 0;
                    a();
                    this.n = this.a.m();
                    googleAppId = GoogleServices.getGoogleAppId();
                    if (TextUtils.isEmpty(googleAppId)) {
                    }
                    this.m = str4;
                    if (!TextUtils.isEmpty(googleAppId)) {
                    }
                    if (z2) {
                    }
                    this.k = null;
                    if (f().e(this.c, C1127j.Da)) {
                    }
                    if (VERSION.SDK_INT >= 16) {
                    }
                }
            } catch (NameNotFoundException unused3) {
                str2 = str3;
                e().s().a("Error retrieving package info. appId, appName", C1124ib.a(packageName), str3);
                str = str3;
                str3 = str2;
                this.c = packageName;
                this.f = str5;
                this.d = str3;
                this.e = i2;
                this.g = str;
                this.h = 0;
                a();
                Status initialize2 = GoogleServices.initialize(getContext());
                boolean z32 = true;
                String str62 = "am";
                z = (initialize2 == null && initialize2.isSuccess()) | (TextUtils.isEmpty(this.a.m()) && str62.equals(this.a.n()));
                if (!z) {
                }
                if (z) {
                }
                z2 = false;
                this.m = str4;
                this.n = str4;
                this.i = 0;
                a();
                this.n = this.a.m();
                googleAppId = GoogleServices.getGoogleAppId();
                if (TextUtils.isEmpty(googleAppId)) {
                }
                this.m = str4;
                if (!TextUtils.isEmpty(googleAppId)) {
                }
                if (z2) {
                }
                this.k = null;
                if (f().e(this.c, C1127j.Da)) {
                }
                if (VERSION.SDK_INT >= 16) {
                }
            }
        }
        str = str3;
        this.c = packageName;
        this.f = str5;
        this.d = str3;
        this.e = i2;
        this.g = str;
        this.h = 0;
        a();
        Status initialize22 = GoogleServices.initialize(getContext());
        boolean z322 = true;
        String str622 = "am";
        z = (initialize22 == null && initialize22.isSuccess()) | (TextUtils.isEmpty(this.a.m()) && str622.equals(this.a.n()));
        if (!z) {
        }
        if (z) {
        }
        z2 = false;
        this.m = str4;
        this.n = str4;
        this.i = 0;
        a();
        this.n = this.a.m();
        try {
            googleAppId = GoogleServices.getGoogleAppId();
            if (TextUtils.isEmpty(googleAppId)) {
            }
            this.m = str4;
            if (!TextUtils.isEmpty(googleAppId)) {
            }
            if (z2) {
            }
        } catch (IllegalStateException e2) {
            e().s().a("getGoogleAppId or isMeasurementEnabled failed with exception. appId", C1124ib.a(packageName), e2);
        }
        this.k = null;
        if (f().e(this.c, C1127j.Da)) {
        }
        if (VERSION.SDK_INT >= 16) {
        }
    }

    public final /* bridge */ /* synthetic */ be a() {
        return super.a();
    }
}
