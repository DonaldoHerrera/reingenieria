package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;

/* renamed from: FK reason: default package and case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C2030FK implements OnSharedPreferenceChangeListener {
    private final /* synthetic */ BPa a;
    private final /* synthetic */ C3274tL b;

    public /* synthetic */ C2030FK(BPa bPa, C3274tL tLVar) {
        this.a = bPa;
        this.b = tLVar;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        C2995fL.a(this.a, this.b, sharedPreferences, str);
    }
}
