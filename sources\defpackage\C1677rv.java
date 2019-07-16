package defpackage;

import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings.Builder;
import java.util.Date;

/* renamed from: rv reason: default package and case insensitive filesystem */
public final class C1677rv {
    static final Date a = new Date(-1);
    static final Date b = new Date(-1);
    private final SharedPreferences c;
    private final Object d = new Object();
    private final Object e = new Object();

    public C1677rv(SharedPreferences sharedPreferences) {
        this.c = sharedPreferences;
    }

    public final void a(int i) {
        synchronized (this.d) {
            this.c.edit().putInt("last_fetch_status", i).apply();
        }
    }

    public final long b() {
        return this.c.getLong("fetch_timeout_in_seconds", 5);
    }

    public final FirebaseRemoteConfigInfo c() {
        C1797vv a2;
        synchronized (this.d) {
            long j = this.c.getLong("last_fetch_time_in_millis", -1);
            int i = this.c.getInt("last_fetch_status", 0);
            FirebaseRemoteConfigSettings build = new Builder().setDeveloperModeEnabled(this.c.getBoolean("is_developer_mode_enabled", false)).setFetchTimeoutInSeconds(this.c.getLong("fetch_timeout_in_seconds", 5)).setMinimumFetchIntervalInSeconds(this.c.getLong("minimum_fetch_interval_in_seconds", C1587ov.a)).build();
            C1887yv yvVar = new C1887yv();
            yvVar.a(i);
            yvVar.a(j);
            yvVar.a(build);
            a2 = yvVar.a();
        }
        return a2;
    }

    public final long d() {
        return this.c.getLong("minimum_fetch_interval_in_seconds", C1587ov.a);
    }

    public final boolean e() {
        return this.c.getBoolean("is_developer_mode_enabled", false);
    }

    /* access modifiers changed from: 0000 */
    public final Date f() {
        return new Date(this.c.getLong("last_fetch_time_in_millis", -1));
    }

    /* access modifiers changed from: 0000 */
    public final String g() {
        return this.c.getString("last_fetch_etag", null);
    }

    /* access modifiers changed from: 0000 */
    public final C1767uv h() {
        C1767uv uvVar;
        synchronized (this.e) {
            uvVar = new C1767uv(this.c.getInt("num_failed_fetches", 0), new Date(this.c.getLong("backoff_end_time_in_millis", -1)));
        }
        return uvVar;
    }

    public final void b(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        synchronized (this.d) {
            this.c.edit().putBoolean("is_developer_mode_enabled", firebaseRemoteConfigSettings.isDeveloperModeEnabled()).putLong("fetch_timeout_in_seconds", firebaseRemoteConfigSettings.getFetchTimeoutInSeconds()).putLong("minimum_fetch_interval_in_seconds", firebaseRemoteConfigSettings.getMinimumFetchIntervalInSeconds()).apply();
        }
    }

    public final void a(Date date) {
        synchronized (this.d) {
            this.c.edit().putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    public final void a() {
        synchronized (this.d) {
            this.c.edit().clear().commit();
        }
    }

    public final void a(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        synchronized (this.d) {
            this.c.edit().putBoolean("is_developer_mode_enabled", firebaseRemoteConfigSettings.isDeveloperModeEnabled()).putLong("fetch_timeout_in_seconds", firebaseRemoteConfigSettings.getFetchTimeoutInSeconds()).putLong("minimum_fetch_interval_in_seconds", firebaseRemoteConfigSettings.getMinimumFetchIntervalInSeconds()).commit();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str) {
        synchronized (this.d) {
            this.c.edit().putString("last_fetch_etag", str).apply();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i, Date date) {
        synchronized (this.e) {
            this.c.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
