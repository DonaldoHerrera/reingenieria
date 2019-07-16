package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* renamed from: com.google.android.gms.measurement.internal.rb reason: case insensitive filesystem */
final class C1168rb extends C1120hc {
    @VisibleForTesting
    static final Pair<String, Long> c = new Pair<>("", Long.valueOf(0));
    public C1193wb A = new C1193wb(this, "deep_link_last_retrieved", -1);
    private SharedPreferences d;
    public C1188vb e;
    public final C1193wb f = new C1193wb(this, "last_upload", 0);
    public final C1193wb g = new C1193wb(this, "last_upload_attempt", 0);
    public final C1193wb h = new C1193wb(this, "backoff", 0);
    public final C1193wb i = new C1193wb(this, "last_delete_stale", 0);
    public final C1193wb j = new C1193wb(this, "midnight_offset", 0);
    public final C1193wb k = new C1193wb(this, "first_open_time", 0);
    public final C1193wb l = new C1193wb(this, "app_install_time", 0);
    public final C1203yb m = new C1203yb(this, "app_instance_id", null);
    private String n;
    private boolean o;
    private long p;
    public final C1193wb q = new C1193wb(this, "time_before_start", 10000);
    public final C1193wb r = new C1193wb(this, "session_timeout", 1800000);
    public final C1178tb s = new C1178tb(this, "start_new_session", true);
    public final C1203yb t = new C1203yb(this, "non_personalized_ads", null);
    public final C1178tb u = new C1178tb(this, "use_dynamite_api", false);
    public final C1178tb v = new C1178tb(this, "allow_remote_dynamite", false);
    public final C1193wb w = new C1193wb(this, "last_pause_time", 0);
    public final C1193wb x = new C1193wb(this, "time_active", 0);
    public boolean y;
    public C1178tb z = new C1178tb(this, "app_backgrounded", false);

    C1168rb(Mb mb) {
        super(mb);
    }

    /* access modifiers changed from: private */
    public final SharedPreferences A() {
        i();
        o();
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public final Pair<String, Boolean> a(String str) {
        String str2 = "";
        i();
        long elapsedRealtime = c().elapsedRealtime();
        String str3 = this.n;
        if (str3 != null && elapsedRealtime < this.p) {
            return new Pair<>(str3, Boolean.valueOf(this.o));
        }
        this.p = elapsedRealtime + f().a(str, C1127j.m);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(getContext());
            if (advertisingIdInfo != null) {
                this.n = advertisingIdInfo.getId();
                this.o = advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            if (this.n == null) {
                this.n = str2;
            }
        } catch (Exception e2) {
            e().z().a("Unable to get advertising id", e2);
            this.n = str2;
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.n, Boolean.valueOf(this.o));
    }

    /* access modifiers changed from: 0000 */
    public final String b(String str) {
        i();
        String str2 = (String) a(str).first;
        MessageDigest s2 = Vd.s();
        if (s2 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, s2.digest(str2.getBytes()))});
    }

    /* access modifiers changed from: 0000 */
    public final void c(String str) {
        i();
        Editor edit = A().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    public final void d(String str) {
        i();
        Editor edit = A().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: protected */
    public final boolean q() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void r() {
        this.d = getContext().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        String str = "has_been_opened";
        this.y = this.d.getBoolean(str, false);
        if (!this.y) {
            Editor edit = this.d.edit();
            edit.putBoolean(str, true);
            edit.apply();
        }
        C1188vb vbVar = new C1188vb(this, "health_monitor", Math.max(0, ((Long) C1127j.n.a(null)).longValue()));
        this.e = vbVar;
    }

    /* access modifiers changed from: 0000 */
    public final String s() {
        i();
        return A().getString("gmp_app_id", null);
    }

    /* access modifiers changed from: 0000 */
    public final String t() {
        i();
        return A().getString("admob_app_id", null);
    }

    /* access modifiers changed from: 0000 */
    public final Boolean u() {
        i();
        String str = "use_service";
        if (!A().contains(str)) {
            return null;
        }
        return Boolean.valueOf(A().getBoolean(str, false));
    }

    /* access modifiers changed from: 0000 */
    public final void v() {
        i();
        e().A().a("Clearing collection preferences.");
        if (f().a(C1127j.ra)) {
            Boolean w2 = w();
            Editor edit = A().edit();
            edit.clear();
            edit.apply();
            if (w2 != null) {
                a(w2.booleanValue());
            }
            return;
        }
        boolean contains = A().contains("measurement_enabled");
        boolean z2 = true;
        if (contains) {
            z2 = c(true);
        }
        Editor edit2 = A().edit();
        edit2.clear();
        edit2.apply();
        if (contains) {
            a(z2);
        }
    }

    /* access modifiers changed from: 0000 */
    public final Boolean w() {
        i();
        String str = "measurement_enabled";
        if (A().contains(str)) {
            return Boolean.valueOf(A().getBoolean(str, true));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final String x() {
        i();
        String str = "previous_os_version";
        String string = A().getString(str, null);
        j().o();
        String str2 = VERSION.RELEASE;
        if (!TextUtils.isEmpty(str2) && !str2.equals(string)) {
            Editor edit = A().edit();
            edit.putString(str, str2);
            edit.apply();
        }
        return string;
    }

    /* access modifiers changed from: 0000 */
    public final boolean y() {
        i();
        return A().getBoolean("deferred_analytics_collection", false);
    }

    /* access modifiers changed from: 0000 */
    public final boolean z() {
        return this.d.contains("deferred_analytics_collection");
    }

    /* access modifiers changed from: 0000 */
    public final void b(boolean z2) {
        i();
        e().A().a("Setting useService", Boolean.valueOf(z2));
        Editor edit = A().edit();
        edit.putBoolean("use_service", z2);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    public final boolean c(boolean z2) {
        i();
        return A().getBoolean("measurement_enabled", z2);
    }

    /* access modifiers changed from: 0000 */
    public final void d(boolean z2) {
        i();
        e().A().a("Updating deferred analytics collection", Boolean.valueOf(z2));
        Editor edit = A().edit();
        edit.putBoolean("deferred_analytics_collection", z2);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean z2) {
        i();
        e().A().a("Setting measurementEnabled", Boolean.valueOf(z2));
        Editor edit = A().edit();
        edit.putBoolean("measurement_enabled", z2);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(long j2) {
        return j2 - this.r.a() > this.w.a();
    }
}
