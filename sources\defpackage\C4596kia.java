package defpackage;

import android.content.SharedPreferences;
import com.soundcloud.android.cast.l.a;
import com.soundcloud.android.playback.Kc.b;

/* renamed from: kia reason: default package and case insensitive filesystem */
/* compiled from: DevSettingsStore.kt */
public class C4596kia {
    private final SharedPreferences a;
    private final C7648wza<Boolean> b;
    private final C7648wza<Boolean> c;
    private final C7648wza<Boolean> d;
    private final C7648wza<String> e;
    private final C7648wza<Boolean> f;

    public C4596kia(@a SharedPreferences sharedPreferences, @e C7648wza<Boolean> wza, @d C7648wza<Boolean> wza2, @c C7648wza<Boolean> wza3, @a C7648wza<String> wza4, @b C7648wza<Boolean> wza5) {
        C7471uYa.b(sharedPreferences, "devPrefs");
        C7471uYa.b(wza, "flushEventLoggerPref");
        C7471uYa.b(wza2, "eventLoggerMute");
        C7471uYa.b(wza3, "eventLoggerMonitor");
        C7471uYa.b(wza4, "receiverOverrideIdPref");
        C7471uYa.b(wza5, "immediatelySkippableAds");
        this.a = sharedPreferences;
        this.b = wza;
        this.c = wza2;
        this.d = wza3;
        this.e = wza4;
        this.f = wza5;
    }

    public void a() {
        this.b.clear();
        this.e.clear();
        this.c.clear();
        this.d.clear();
        this.f.clear();
    }
}
