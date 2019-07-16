package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

@EVa(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068P@PX\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8P@PX\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/soundcloud/android/main/inappupdates/InAppUpdatesSettings;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "value", "", "lastTimeUserRejectedAppUpdate", "getLastTimeUserRejectedAppUpdate$base_release", "()J", "setLastTimeUserRejectedAppUpdate$base_release", "(J)V", "", "shouldSkipCompleteUpdateMessage", "getShouldSkipCompleteUpdateMessage$base_release", "()Z", "setShouldSkipCompleteUpdateMessage$base_release", "(Z)V", "resetSkipCompleteUpdateMessageValue", "", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: zia reason: default package and case insensitive filesystem */
/* compiled from: InAppUpdatesSettings.kt */
public class C4726zia {
    public static final a a = new a(null);
    private final SharedPreferences b;

    /* renamed from: zia$a */
    /* compiled from: InAppUpdatesSettings.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C4726zia(SharedPreferences sharedPreferences) {
        C7471uYa.b(sharedPreferences, "sharedPreferences");
        this.b = sharedPreferences;
    }

    public long a() {
        return this.b.getLong("last_time_user_rejected_app_update", 0);
    }

    public boolean b() {
        return this.b.getBoolean("should_skip_app_update_complete_message", false);
    }

    public void c() {
        a(false);
    }

    public void a(long j) {
        Editor edit = this.b.edit();
        C7471uYa.a((Object) edit, "editor");
        edit.putLong("last_time_user_rejected_app_update", j);
        edit.apply();
    }

    public void a(boolean z) {
        Editor edit = this.b.edit();
        C7471uYa.a((Object) edit, "editor");
        edit.putBoolean("should_skip_app_update_complete_message", z);
        edit.apply();
    }
}
