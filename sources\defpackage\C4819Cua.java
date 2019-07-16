package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;

/* renamed from: Cua reason: default package and case insensitive filesystem */
/* compiled from: PreferenceChangeOnSubscribe */
public class C4819Cua implements CPa<String> {
    private final SharedPreferences a;
    private final OnSharedPreferenceChangeListener b = new C4788Bua(this);
    /* access modifiers changed from: private */
    public C7324sPa<? super String> c;

    public C4819Cua(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public void a(BPa<String> bPa) {
        this.c = bPa;
        this.a.registerOnSharedPreferenceChangeListener(this.b);
        bPa.a((C6708jQa) new C7293rua(this));
    }

    public /* synthetic */ void a() throws Exception {
        this.a.unregisterOnSharedPreferenceChangeListener(this.b);
    }
}
