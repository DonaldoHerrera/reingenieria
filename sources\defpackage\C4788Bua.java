package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;

/* renamed from: Bua reason: default package and case insensitive filesystem */
/* compiled from: PreferenceChangeOnSubscribe */
class C4788Bua implements OnSharedPreferenceChangeListener {
    final /* synthetic */ C4819Cua a;

    C4788Bua(C4819Cua cua) {
        this.a = cua;
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.a.c.a(str);
    }
}
