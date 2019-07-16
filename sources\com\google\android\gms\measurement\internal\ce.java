package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources.NotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

public final class ce extends C1125ic {
    private Boolean b;
    private ee c = fe.a;
    private Boolean d;

    ce(Mb mb) {
        super(mb);
        C1127j.a(mb);
    }

    static String n() {
        return (String) C1127j.l.a(null);
    }

    public static long s() {
        return ((Long) C1127j.O.a(null)).longValue();
    }

    public static long t() {
        return ((Long) C1127j.o.a(null)).longValue();
    }

    public static boolean v() {
        return ((Boolean) C1127j.k.a(null)).booleanValue();
    }

    static boolean x() {
        return ((Boolean) C1127j.ea.a(null)).booleanValue();
    }

    @VisibleForTesting
    private final Bundle y() {
        try {
            if (getContext().getPackageManager() == null) {
                e().s().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(getContext()).getApplicationInfo(getContext().getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            e().s().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (NameNotFoundException e) {
            e().s().a("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(ee eeVar) {
        this.c = eeVar;
    }

    public final int b(String str, Xa<Integer> xa) {
        if (str == null) {
            return ((Integer) xa.a(null)).intValue();
        }
        String a = this.c.a(str, xa.a());
        if (TextUtils.isEmpty(a)) {
            return ((Integer) xa.a(null)).intValue();
        }
        try {
            return ((Integer) xa.a(Integer.valueOf(Integer.parseInt(a)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) xa.a(null)).intValue();
        }
    }

    public final double c(String str, Xa<Double> xa) {
        if (str == null) {
            return ((Double) xa.a(null)).doubleValue();
        }
        String a = this.c.a(str, xa.a());
        if (TextUtils.isEmpty(a)) {
            return ((Double) xa.a(null)).doubleValue();
        }
        try {
            return ((Double) xa.a(Double.valueOf(Double.parseDouble(a)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) xa.a(null)).doubleValue();
        }
    }

    public final boolean d(String str, Xa<Boolean> xa) {
        if (str == null) {
            return ((Boolean) xa.a(null)).booleanValue();
        }
        String a = this.c.a(str, xa.a());
        if (TextUtils.isEmpty(a)) {
            return ((Boolean) xa.a(null)).booleanValue();
        }
        return ((Boolean) xa.a(Boolean.valueOf(Boolean.parseBoolean(a)))).booleanValue();
    }

    public final boolean e(String str, Xa<Boolean> xa) {
        return d(str, xa);
    }

    /* access modifiers changed from: 0000 */
    public final boolean f(String str) {
        return d(str, C1127j.Y);
    }

    /* access modifiers changed from: 0000 */
    public final boolean g(String str) {
        return d(str, C1127j.S);
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    /* access modifiers changed from: 0000 */
    public final String h(String str) {
        Xa<String> xa = C1127j.T;
        if (str == null) {
            return (String) xa.a(null);
        }
        return (String) xa.a(this.c.a(str, xa.a()));
    }

    /* access modifiers changed from: 0000 */
    public final boolean i(String str) {
        return d(str, C1127j.Z);
    }

    /* access modifiers changed from: 0000 */
    public final boolean j(String str) {
        return d(str, C1127j.aa);
    }

    /* access modifiers changed from: 0000 */
    public final boolean k(String str) {
        return d(str, C1127j.ba);
    }

    /* access modifiers changed from: 0000 */
    public final boolean l(String str) {
        return d(str, C1127j.da);
    }

    public final long m() {
        a();
        return 16250;
    }

    public final boolean o() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    ApplicationInfo applicationInfo = getContext().getApplicationInfo();
                    String myProcessName = ProcessUtils.getMyProcessName();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.d = Boolean.valueOf(str != null && str.equals(myProcessName));
                    }
                    if (this.d == null) {
                        this.d = Boolean.TRUE;
                        e().s().a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.d.booleanValue();
    }

    public final boolean p() {
        a();
        Boolean b2 = b("firebase_analytics_collection_deactivated");
        return b2 != null && b2.booleanValue();
    }

    public final Boolean q() {
        a();
        return b("firebase_analytics_collection_enabled");
    }

    public final Boolean r() {
        g();
        Boolean b2 = b("google_analytics_adid_collection_enabled");
        return Boolean.valueOf(b2 == null || b2.booleanValue());
    }

    public final String u() {
        String str = "";
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{"debug.firebase.analytics.app", str});
        } catch (ClassNotFoundException e) {
            e().s().a("Could not find SystemProperties class", e);
            return str;
        } catch (NoSuchMethodException e2) {
            e().s().a("Could not find SystemProperties.get() method", e2);
            return str;
        } catch (IllegalAccessException e3) {
            e().s().a("Could not access SystemProperties.get()", e3);
            return str;
        } catch (InvocationTargetException e4) {
            e().s().a("SystemProperties.get() threw an exception", e4);
            return str;
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean w() {
        if (this.b == null) {
            this.b = b("app_measurement_lite");
            if (this.b == null) {
                this.b = Boolean.valueOf(false);
            }
        }
        if (this.b.booleanValue() || !this.a.p()) {
            return true;
        }
        return false;
    }

    public final int a(String str) {
        return b(str, C1127j.z);
    }

    public final boolean e(String str) {
        return "1".equals(this.c.a(str, "measurement.event_sampling_enabled"));
    }

    public final /* bridge */ /* synthetic */ ce f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ void g() {
        super.g();
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

    /* access modifiers changed from: 0000 */
    public final boolean m(String str) {
        return d(str, C1127j.ca);
    }

    public final long a(String str, Xa<Long> xa) {
        if (str == null) {
            return ((Long) xa.a(null)).longValue();
        }
        String a = this.c.a(str, xa.a());
        if (TextUtils.isEmpty(a)) {
            return ((Long) xa.a(null)).longValue();
        }
        try {
            return ((Long) xa.a(Long.valueOf(Long.parseLong(a)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) xa.a(null)).longValue();
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean q(String str) {
        return d(str, C1127j.ia);
    }

    public final /* bridge */ /* synthetic */ C1124ib e() {
        return super.e();
    }

    /* access modifiers changed from: 0000 */
    public final boolean n(String str) {
        return d(str, C1127j.fa);
    }

    /* access modifiers changed from: 0000 */
    public final boolean p(String str) {
        return d(str, C1127j.ha);
    }

    /* access modifiers changed from: 0000 */
    public final boolean r(String str) {
        return d(str, C1127j.na);
    }

    public final boolean d(String str) {
        return "1".equals(this.c.a(str, "gaia_collection_enabled"));
    }

    public final /* bridge */ /* synthetic */ Gb d() {
        return super.d();
    }

    /* access modifiers changed from: 0000 */
    @VisibleForTesting
    public final Boolean b(String str) {
        Preconditions.checkNotEmpty(str);
        Bundle y = y();
        if (y == null) {
            e().s().a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!y.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(y.getBoolean(str));
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b A[SYNTHETIC, Splitter:B:9:0x002b] */
    @VisibleForTesting
    public final List<String> c(String str) {
        Integer num;
        Preconditions.checkNotEmpty(str);
        Bundle y = y();
        if (y == null) {
            e().s().a("Failed to load metadata: Metadata bundle is null");
        } else if (y.containsKey(str)) {
            num = Integer.valueOf(y.getInt(str));
            if (num != null) {
                return null;
            }
            try {
                String[] stringArray = getContext().getResources().getStringArray(num.intValue());
                if (stringArray == null) {
                    return null;
                }
                return Arrays.asList(stringArray);
            } catch (NotFoundException e) {
                e().s().a("Failed to load string array from metadata: resource not found", e);
                return null;
            }
        }
        num = null;
        if (num != null) {
        }
    }

    public final boolean a(Xa<Boolean> xa) {
        return d(null, xa);
    }

    /* access modifiers changed from: 0000 */
    public final boolean o(String str) {
        return d(str, C1127j.ga);
    }

    public final /* bridge */ /* synthetic */ be a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ C1168rb b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ Clock c() {
        return super.c();
    }
}
