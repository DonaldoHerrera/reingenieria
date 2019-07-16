package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;

/* renamed from: Lwa reason: default package and case insensitive filesystem */
/* compiled from: PlayerSettings.kt */
final class C5101Lwa implements OnSharedPreferenceChangeListener {
    final /* synthetic */ C5132Mwa a;
    final /* synthetic */ BPa b;

    C5101Lwa(C5132Mwa mwa, BPa bPa) {
        this.a = mwa;
        this.b = bPa;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (C7471uYa.a((Object) str, (Object) "player_popup_comments")) {
            this.b.a(Boolean.valueOf(this.a.a.b()));
        }
    }
}
