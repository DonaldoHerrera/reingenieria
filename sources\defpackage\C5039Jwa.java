package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.soundcloud.android.settings.w;

@EVa(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/soundcloud/android/settings/player/PlayerSettings;", "", "playerSettingsPrefs", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "clear", "", "liveWaveformCommentsEnabled", "Lio/reactivex/Observable;", "", "saveWaveformCommentsEnabled", "show", "waveformCommentsEnabled", "Companion", "settings_release"}, mv = {1, 1, 15})
/* renamed from: Jwa reason: default package and case insensitive filesystem */
/* compiled from: PlayerSettings.kt */
public class C5039Jwa {
    public static final a a = new a(null);
    /* access modifiers changed from: private */
    public final SharedPreferences b;

    /* renamed from: Jwa$a */
    /* compiled from: PlayerSettings.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C5039Jwa(@w SharedPreferences sharedPreferences) {
        C7471uYa.b(sharedPreferences, "playerSettingsPrefs");
        this.b = sharedPreferences;
    }

    public boolean b() {
        return this.b.getBoolean("player_popup_comments", true);
    }

    public void a(boolean z) {
        Editor edit = this.b.edit();
        C7471uYa.a((Object) edit, "editor");
        edit.putBoolean("player_popup_comments", z);
        edit.apply();
    }

    public APa<Boolean> a() {
        APa<Boolean> a2 = APa.a((CPa<T>) new C5132Mwa<T>(this));
        C7471uYa.a((Object) a2, "Observable.create<Boolea…rencesListener)\n        }");
        return a2;
    }
}
