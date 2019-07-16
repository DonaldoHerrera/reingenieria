package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;

/* renamed from: EK reason: default package and case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C2010EK implements C6708jQa {
    private final /* synthetic */ SharedPreferences a;
    private final /* synthetic */ OnSharedPreferenceChangeListener b;

    public /* synthetic */ C2010EK(SharedPreferences sharedPreferences, OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.a = sharedPreferences;
        this.b = onSharedPreferenceChangeListener;
    }

    public final void cancel() {
        this.a.unregisterOnSharedPreferenceChangeListener(this.b);
    }
}
