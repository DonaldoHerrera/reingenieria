package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

@EVa(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\u001a\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\bH\u0012J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\bH\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\bH\u0016J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\bH\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/soundcloud/android/analytics/PrivacySettingsStorage;", "", "privacySettingsPrefs", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "clear", "", "hasAnalyticsOptIn", "", "hasCommunicationsOptIn", "hasTargetedAdvertisingOptIn", "isContentStale", "markContentAsStale", "markContentAsUpdated", "readValue", "key", "", "defaultValue", "saveAnalyticsOptIn", "enabled", "saveCommunicationsOptIn", "saveTargetedAdvertisingOptIn", "saveValue", "value", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: oM reason: default package and case insensitive filesystem */
/* compiled from: PrivacySettingsStorage.kt */
public class C3177oM {
    public static final a a = new a(null);
    private final SharedPreferences b;

    /* renamed from: oM$a */
    /* compiled from: PrivacySettingsStorage.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C3177oM(SharedPreferences sharedPreferences) {
        C7471uYa.b(sharedPreferences, "privacySettingsPrefs");
        this.b = sharedPreferences;
    }

    public void a(boolean z) {
        b("analytics_opt_in", z);
    }

    public boolean b() {
        return a(this, "analytics_opt_in", false, 2, null);
    }

    public boolean c() {
        return a(this, "communication_opt_in", false, 2, null);
    }

    public boolean d() {
        return a(this, "targeted_advertising_opt_in", false, 2, null);
    }

    public boolean e() {
        return a("is_content_stale", false);
    }

    public void f() {
        b("is_content_stale", true);
    }

    public void g() {
        b("is_content_stale", false);
    }

    public void a() {
        this.b.edit().clear().apply();
    }

    public void b(boolean z) {
        b("communication_opt_in", z);
    }

    public void c(boolean z) {
        b("targeted_advertising_opt_in", z);
    }

    private boolean a(String str, boolean z) {
        return this.b.getBoolean(str, z);
    }

    private void b(String str, boolean z) {
        Editor edit = this.b.edit();
        C7471uYa.a((Object) edit, "editor");
        edit.putBoolean(str, z);
        edit.apply();
    }

    static /* synthetic */ boolean a(C3177oM oMVar, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            return oMVar.a(str, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readValue");
    }
}
