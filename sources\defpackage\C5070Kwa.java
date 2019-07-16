package defpackage;

import android.content.SharedPreferences.OnSharedPreferenceChangeListener;

/* renamed from: Kwa reason: default package and case insensitive filesystem */
/* compiled from: PlayerSettings.kt */
final class C5070Kwa implements C6708jQa {
    final /* synthetic */ C5132Mwa a;
    final /* synthetic */ OnSharedPreferenceChangeListener b;

    C5070Kwa(C5132Mwa mwa, OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.a = mwa;
        this.b = onSharedPreferenceChangeListener;
    }

    public final void cancel() {
        this.a.a.b.unregisterOnSharedPreferenceChangeListener(this.b);
    }
}
